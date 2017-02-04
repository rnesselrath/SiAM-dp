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
package de.dfki.iui.mmds.io.html.util;

import uk.co.wireweb.web.html.Tag;
/**
 * 
 * @author kirill
 *
 */
public class HtmlRenderResult {
	private Tag<?> contents_;
	private Tag<?> style_;
	private String title_ = "";
	public HtmlRenderResult(String title, Tag<?> contents_, Tag<?> style_) {
		this.title_ = title;
		this.contents_ = contents_;
		this.style_ = style_;
	}
	public Tag<?> getContents() {
		return contents_;
	}
	public Tag<?> getStyle() {
		return style_;
	}
	public String getTitle() {
		return title_;
	}
	public void setStyle(Tag<?> style) {
		this.style_ = style;
	}
	public void setContents(Tag<?> contents) {
		this.contents_ = contents;
	}
	public void setTitle(String title){
		this.title_ = title;
	}
	
}
