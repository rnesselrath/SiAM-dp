/*******************************************************************************
 * The Creative Commons CC-BY-NC 4.0 License
 * http://creativecommons.org/licenses/by-nc/4.0/legalcode
 *
 * Creative Commons (CC) by DFKI GmbH
 * - Vanessa Hahn <Vanessa.Hahn@dfki.de>
 * - Robert Nesselrath <rnesselrath@gmail.com>
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES 
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR 
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 *******************************************************************************/
window.onerror = errHandler;
function errHandler(msg, url, line){
   var str = msg+"['"+url+"'] line# "+line;
   alert("An error occured:" + str);
   return true;
}

(function($){
$.extend({
	websocketSettings: {
		open: function(){},
		close: function(){},
		message: function(){},
		options: {},
		events: {}
	},
	websocket: function(url, s) {
		var ws = WebSocket ? new WebSocket( url ) : {
			send: function(m){ return false }
		};
        ws._settings = $.extend($.websocketSettings, s);
		$(ws)
			.bind('open', $.websocketSettings.open)
			.bind('message', $.websocketSettings.message)
			.bind('message', function(e){
				var m = $.parseJSON(e.originalEvent.data);
				var h = $.websocketSettings.events[m.type];
				if (h) h.call(this, m);
			});
		ws._send = ws.send;
		ws.send = function(type, data) {
			var m = {type: type};
			m = $.extend(true, m, $.extend(true, {}, $.websocketSettings.options, m));
			if (data) m['data'] = data;
			return this._send(JSON.stringify(m));
		}
		$(window).unload(function(){ ws.close(); ws = null });
		return ws;
	}
});
})(jQuery);


var userInterface = {
	//Establish webSocket connection
    connect:function (mainElement, onConnectHandler) {
    	this.mainDiv_ = mainElement;
        this.currStyle = "";
        var location = (window.location.protocol+'//'+window.location.host+'/')
            .replace('http://', 'ws://')
            .replace('https://', 'wss://')
            +'userInterface'+'?deviceId=' + DEVICE_ID;
        this._ws = $.websocket(location,{
             events: {
                welcome:function(e) {
                    userInterface.welcome(e);
                    console.log("Calling onConnectHandler after welcome message");
                    try {
                    	onConnectHandler();
					}
					catch(err) {
    					console.log(err.message);
					}
                },
                screen:function(e) {
                    userInterface.screen(e);
                },
                error:function(e) {
                    userInterface.error(e);
                },
                update:function(e) {
                    if(e.data && e.data.length > 0) {
                        for(var i=0; i < e.data.length;++i)
                            if(e.data[i].hasOwnProperty("script"))
                                userInterface.script(e.data[i]);
                            else
                                userInterface.update(e.data[i]); 
                    } else {
                        console.log("Missing update information in the event"+JSON.stringify(e));
                    }
                },
                remove:function(e) {
                	userInterface.remove(e.data);
                },
                add:function(e) {
                	userInterface.add(e.data);
                },
                move:function(e) {
                	userInterface.move(e.data);
                },
                addTableCell:function(e) {
                	userInterface.addTableCell(e.data);
                }
             }
        });
        $(this._ws).bind('close', function(){
            console.log("Reconnect..."); 
            setTimeout(function(){userInterface.connect(mainContainer);}, 5000);
        });
    },

    send:function (type, message) {
        if (this._ws)
            this._ws.send(type, message);
    },

    screen:function (m) {
        if (m.data) {
            if (this.currStyle != m.data.style) {
                this.currStyle = m.data.style;
                $('head').append(m.data.style);
                // $.blockUI({ message: '<h1><img width="390" height="125" src="/html/platform/images/siam_logo.png" /> Just a moment...</h1>' });
                setTimeout(function(){$.unblockUI();},100); 
            }
            if(m.data.title)
                document.title = m.data.title;
            this.mainDiv_.html(m.data.content);
            this.refreshEventListeners($("body"));
        }
    },
    welcome : function(m) {
        console.log("Server said welcome"); 
    },
    error : function(m) {
        alert(m.data);
    },
    urlParam : function (name){
        if(name=(new RegExp('[?&]'+encodeURIComponent(name)+'=([^&]*)')).exec(location.search))
            return decodeURIComponent(name[1]);
    },
    remove : function(args) {
    	if(args.hasOwnProperty("id") && args.id!="") {
    		var el = $("#"+args.id);
            if(el.length == 1) {
            	el.off();
            	el.find("*").off();
            	el.remove();
            } else {
            	console.log("DOM element not found "+args.id);
            }
    	} else {
    		console.log("Missing id attribute to remove element");
    	}
    },
    add : function(args) {
    	if(args.hasOwnProperty("parentId") && args.parentId!="") {
    		var parentElId = "#"+args.parentId;
    		var el = $(parentElId);
    		if(el.length == 1) {
            	if(args.hasOwnProperty("content")) {
                    if(args.hasOwnProperty("position") && args.position > -1 && el.children().length > 0) {
                        var id = args.position;
                        el.children().eq(id).before(args.content);
                        this.refreshEventListeners(el.children().eq(id));
                    } else if(!args.hasOwnProperty("position") || args.position == -1 || el.children().length == 0) {
                        el.append(args.content);
                        this.refreshEventListeners(el.children().last());
                    } else {
                        el.children().eq(el.children().length + parseInt(args.position) + 1).before(args.content);
                        this.refreshEventListeners(el.children().eq(id));
                    } 
            	} else {
            		console.log("No contents to add element");
            	}
            } else {
            	console.log("DOM element not found "+args.parentId);
            }
    	} else {
    		console.log("Missing parentId attribute to add element");
    	}
    },
    move : function(args) {
    	if(args.hasOwnProperty("newParentId") && args.newParentId!="") {
	    	if(args.hasOwnProperty("elementId") && args.elementId!="") {
	    		var newParentElId = "#"+args.newParentId;
	    		var elementId = "#"+args.elementId;
	    		var p = $(newParentElId);
	    		var el = $(elementId);
	    		if(el.length == 1 && p.length == 1) {
            		if(args.hasOwnProperty("position") && args.position > -1) {
            			var pos = args.position;
						p.children().eq(pos).before(el);
                        this.refreshEventListeners(p.children().eq(pos));
            		} else {
                        p.append(el);
                        this.refreshEventListeners(p.children().last());
                    }
	            } else {
	            	console.log("DOM element not found: "+args.parentId+" or "+args.elementId);
	            }
	    	} else {
            	console.log("Missing elementId attribute to move element");
            }
    	} else {
    		console.log("Missing newParentId attribute to move element");
    	}
    },
    addTableCell : function(args) {
    	if(args.hasOwnProperty("tableId") && args.tableId!="") {
    		var tableElId = "#"+args.tableId;
    		var table = $(tableElId);
    		if(table.length == 1) {
    			table = table[0];
            	if(args.hasOwnProperty("content")) {
            		if(args.hasOwnProperty("row") && args.hasOwnProperty("col")) {
            			var row;
            			var rowIdx = args.row;
            			if (rowIdx == -1) {
            				row = table.insertRow(-1);
            			} else {
	            			for (var i = rowIdx - table.rows.length; i >= 0 ; i--) {
								table.insertRow(-1);
							}
            				row = table.rows[rowIdx];
            			}
            			var col;
            			var colIdx = args.col;
            			if (colIdx == -1) {
            				col = row.insertCell(-1);
            			} else {
	            			for (var i = colIdx - row.cells.length; i >= 0 ; i--) {
								row.insertCell(-1);
							}
							col = row[colIdx];
            			}
            			col.innerHTML = args.content;
                        //this.refreshEventListeners(row[-1]);
            		} else {
            			console.log("Row or column index missing");
                    } 
            	} else {
            		console.log("No contents to add");
            	}
            } else {
            	console.log("DOM element not found "+args.tableElId);
            }
    	} else {
    		console.log("Missing tableId attribute to add table cell");
    	}
    },
    script : function(args) {
        try{
            eval(args.script);
        } catch(e) {
            console.log("Error while running script "+args.script+" : "+e.name);
        } 
    },
    update : function(args) {
        args = this.processProps(args);
        var idKey = "id";
        var boolProps = ["checked", "selected","disabled","multiple"];
        var stringProps = ["value", "selectedIndex"];
        var styleNameProps = ["class"];
        var styleProps = ["style"];
        var htmlProp = ["html"];
        if(args.hasOwnProperty("id") && args.id!="") {
            var el = $("#"+args.id);
            if(el.length == 1) {
                for(var key in args) {
                    if(key != idKey) {
                        if($.inArray(key, boolProps) > -1) {
                            console.log("Changing property "+key+ " to "+args[key]);
                            if(args[key]=="true")
                                el.prop(key,args[key]);
                            else
                                el.removeProp(key);
                        } else if($.inArray(key, stringProps) > -1) {
                            console.log("Changing property "+key+ " to "+args[key]);
                            el.prop(key,args[key]);
                        } else if($.inArray(key, styleNameProps) > -1) {
                        	console.log("Changing class property of element #"+args.id + " to "+args["class"]);
                        	el.attr("class","");
                        	el.addClass(args["class"]);
                        } else if($.inArray(key, styleProps) > -1) {
                        	console.log("Changing style property of element #"+args.id + " to "+args["style"]);
                        	el.attr(key, args[key]);
                        } else if($.inArray(key, htmlProp) > -1) {
                            console.log("Changing html "+key+ " to "+args[key]);
                            el.html(args[key]);
                        } else {
                            console.log("Changing attr "+key+ " to "+args[key]);
                            el.attr(key, args[key]);
                        }
                    }
                }
            } else {
                console.log("DOM element not found "+args.id);
            }
        } else {
            console.log("Missing id attribute to update element");
        }
	},
	processProps : function(args) {
		var tmp = {};
		for(var key in args) {
			if(key == "enabled") {
				if(args[key] == "true") 
					tmp["disabled"] = "false";
				else if(args[key] == "false")
					tmp["disabled"] = "true";
				continue;
			}
			tmp[key] = args[key];
		}
		return tmp;
	},
    bindMmmdsEvent : function(jqEle, handler, eventType, namespace){
        if(namespace == undefined){
            jqEle.bind(eventType, handler);
        }else{
            jqEle.unbind(eventType+'.'+namespace).bind(eventType+'.'+namespace, handler);
        }
    }, 
    refreshEventListeners : function(jqObjectParent) {
        jqObjectParent.find(".click").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    userInterface.mmdsEvent(event);
                },"click","mmds")
        });

        jqObjectParent.find(".dblclick").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    userInterface.mmdsEvent(event);
                },"dblclick","mmds")
        });
        jqObjectParent.find(".mousedown").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    userInterface.mmdsEvent(event);
                },"mousedown","mmds")
        });
        jqObjectParent.find(".mousemove").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    userInterface.mmdsEvent(event);
                },"mousemove","mmds")
        });
        jqObjectParent.find(".mouseover").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    userInterface.mmdsEvent(event);
                },"mouseover","mmds")
        });
        jqObjectParent.find(".mouseout").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    userInterface.mmdsEvent(event);
                },"mouseout","mmds")
        });
        jqObjectParent.find(".mouseup").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    userInterface.mmdsEvent(event);
                },"mouseup","mmds")
        });
        jqObjectParent.find(".blur").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    userInterface.mmdsEvent(event);
                },"blur","mmds")
        });
        jqObjectParent.find(".change").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    if ($(event.target).prop("tagName") == "SELECT") {
                        var id = $(event.target).prop("selectedIndex");
                        console.log("Event: target="+event.target.id+" type:"+event.type+" value:"+event.target.value);
                        userInterface.send('event',{target:event.target.id, type:event.type, 
                                value:event.target.value+"@@"+id});  
                        return;     
                    }
                    userInterface.mmdsEvent(event);
                },"change","mmds")
        });
        jqObjectParent.find(".focus").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    userInterface.mmdsEvent(event);
                },"focus","mmds")
        });
        jqObjectParent.find(".select").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    userInterface.mmdsEvent(event);
                },"select","mmds")
        });

        jqObjectParent.find(".keydown").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    userInterface.mmdsEvent(event);
                },"keydown","mmds")
        });
        jqObjectParent.find(".keypress").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    userInterface.mmdsEvent(event);
                },"keypress","mmds")
        });
        jqObjectParent.find(".keyup").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    userInterface.mmdsEvent(event);
                },"keyup","mmds")
        });

        jqObjectParent.find('.change').bind('accepted.keyboard', function(e, keyboard, el){
            e.type="change";
            userInterface.mmdsEvent(e);
        });
        $.datepicker.setDefaults({
          onSelect:function(dateText,inst){
                var e = jQuery.Event("change");
                e.target = this;
                e.value = dateText;
                userInterface.mmdsEvent(e);
          }
        });
        jqObjectParent.find("form").each(function (index, element) {
            userInterface.bindMmmdsEvent($(element), 
                function(event) {
                    event.preventDefault();
                    var data = $(this).serialize();
                    event.value = data;
                    userInterface.mmdsEvent(event);
                },"submit","mmds")
        });

        jqObjectParent.find('.ui-spinner .change').bind('spinchange', function (e, ui) {
            e.type = "change";
            userInterface.mmdsEvent(e);
        });
    },
    mmdsEvent : function(event) {
        if (event.value) {
            console.log("Event: target="+event.target.id+" type:"+event.type+" value:"+event.value);
            userInterface.send('event',{target:event.target.id, type:event.type, value:event.value});   
        } else {
            console.log("Event: target="+event.target.id+" type:"+event.type+" value:"+event.target.value);
            userInterface.send('event',{target:event.target.id, type:event.type, value:event.target.value});
        }       
    },
    handleDialogEvent : function(element, dialogResult) {
        var e = jQuery.Event("dialog");
        e.target = element;
        e.value = dialogResult;
        this.mmdsEvent(e);
    }
};	

// new screen is rendered to this div
var mainContainer; 

$(document).ready(function() {
    mainContainer = $("#mainContainer");
   	userInterface.connect(mainContainer, function(){
        userInterface.send('screen',"getScreen");
    });
});


function loadScripts(urls, commonCallback) {
    fetchPromises = [];
    for (var i=0; i < urls.length;++i) {
      fetchPromises.push(
            $.getScript(urls[i]).fail(function(){
                alert('Script could not load '+url);
            })
        );
    }
    $.when.apply($, fetchPromises).done(commonCallback);
}