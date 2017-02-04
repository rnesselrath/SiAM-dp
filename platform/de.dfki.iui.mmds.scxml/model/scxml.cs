using System;
using System.Collections.Generic;
using System.Runtime.InteropServices;
using System.Xml.Linq;
using System.ComponentModel;
using System.Diagnostics;
using System.Globalization;

namespace @www.@w3.@org.@_2005.@_07.@scxml {
  public enum ExmodeDatatype {
    @lax,
    @strict = 1,
  }
  public enum HistoryTypeDatatype {
    @shallow,
    @deep = 1,
  }
  [CoClass(typeof(CoClasses.StateChart_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface StateChart
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractState, global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractSimpleState, global::@www.@w3.@org.@_2005.@_07.@scxml.DatamodelContainer, global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer
  {
    System.Uri @xmlns { get; set; }
    decimal? @version { get; set; }
    string @profile { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.ExmodeDatatype @exmode { get; set; }
    string @id { get; set; }
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> @script { get; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class StateChart_class : StateChart
  {
    System.Uri StateChart.@xmlns { get; set; }
    decimal? StateChart.@version { get; set; }
    string StateChart.@profile { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.ExmodeDatatype StateChart.@exmode { get; set; }
    string StateChart.@id { get; set; }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> m_script = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> StateChart.@script { [DebuggerStepThrough()] get { return m_script; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState> m_state = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState> global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractState.@state { [DebuggerStepThrough()] get { return m_state; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState> m_parallel = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState> global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractState.@parallel { [DebuggerStepThrough()] get { return m_parallel; } }
    global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractSimpleState.@initial1 { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.InitialState global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractSimpleState.@initial { get; set; }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState> m_final = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState> global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractSimpleState.@final { [DebuggerStepThrough()] get { return m_final; } }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Datamodel global::@www.@w3.@org.@_2005.@_07.@scxml.DatamodelContainer.@datamodel { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    public StateChart_class() {




    }
    public StateChart_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("xmlns", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("xmlns")) != null) ((StateChart)this).@xmlns = new System.Uri((xml.Attribute(XName.Get("xmlns", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("xmlns")).Value);
        if ((xml.Attribute(XName.Get("version", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("version")) != null) ((StateChart)this).@version = decimal.Parse((xml.Attribute(XName.Get("version", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("version")).Value);
        if ((xml.Attribute(XName.Get("profile", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("profile")) != null) ((StateChart)this).@profile = (xml.Attribute(XName.Get("profile", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("profile")).Value;
        if ((xml.Attribute(XName.Get("exmode", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("exmode")) != null) ((StateChart)this).@exmode = (global::@www.@w3.@org.@_2005.@_07.@scxml.ExmodeDatatype)System.Enum.Parse(typeof(global::@www.@w3.@org.@_2005.@_07.@scxml.ExmodeDatatype), (xml.Attribute(XName.Get("exmode", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("exmode")).Value);
        if ((xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")) != null) ((StateChart)this).@id = (xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")).Value;
      foreach (var el in (xml.Element(XName.Get("script", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("script", "http://www.w3.org/2005/07/scxml")) : xml.Elements("script"))) {
        m_script.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Script(el));
      }
      foreach (var el in (xml.Element(XName.Get("state", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("state", "http://www.w3.org/2005/07/scxml")) : xml.Elements("state"))) {
        m_state.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState(el));
      }
      foreach (var el in (xml.Element(XName.Get("parallel", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("parallel", "http://www.w3.org/2005/07/scxml")) : xml.Elements("parallel"))) {
        m_parallel.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState(el));
      }
        if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) 
        switch ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")) == null ? string.Empty : (xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value) {
          case "scxml:State":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((StateChart)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.State((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "scxml:FinalState":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((StateChart)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "scxml:HistoryState":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((StateChart)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "scxml:ParallelState":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((StateChart)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "scxml:SimpleState":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((StateChart)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((StateChart)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          default:
            throw new NotImplementedException("An unknown type \"" + (xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value + "\" derived from \"global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget\" was encountered being assigned to \"initial1\". This type is however not supported in this version of the interface. You may have to recompile the .NET interfaces or add an 'ReferencedBy' annotation to the ecore file if the type is not contained in the same model.");
        }
        if ((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")) != null) 
        switch ((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")) == null ? string.Empty : (xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value) {
          case "scxml:HistoryState":
            if ((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")) != null) ((StateChart)this).@initial = new global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")));
            break;
          case "":
            if ((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")) != null) ((StateChart)this).@initial = new global::@www.@w3.@org.@_2005.@_07.@scxml.InitialState((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")));
            break;
          default:
            throw new NotImplementedException("An unknown type \"" + (xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value + "\" derived from \"global::@www.@w3.@org.@_2005.@_07.@scxml.InitialState\" was encountered being assigned to \"initial\". This type is however not supported in this version of the interface. You may have to recompile the .NET interfaces or add an 'ReferencedBy' annotation to the ecore file if the type is not contained in the same model.");
        }
      foreach (var el in (xml.Element(XName.Get("final", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("final", "http://www.w3.org/2005/07/scxml")) : xml.Elements("final"))) {
        m_final.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState(el));
      }
        if ((xml.Element(XName.Get("datamodel", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("datamodel")) != null) ((StateChart)this).@datamodel = new global::@www.@w3.@org.@_2005.@_07.@scxml.Datamodel((xml.Element(XName.Get("datamodel", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("datamodel")));
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((StateChart)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:StateChart") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:StateChart"));
        if (((StateChart)this).@xmlns != null) xml.Add(new XAttribute(XName.Get("xmlns", "http://www.w3.org/2005/07/scxml"), ((StateChart)this).@xmlns.ToString()));
        if (((StateChart)this).@version != null) xml.Add(new XAttribute(XName.Get("version", "http://www.w3.org/2005/07/scxml"), ((StateChart)this).@version.Value.ToString(CultureInfo.InvariantCulture)));
        if (((StateChart)this).@profile != null) xml.Add(new XAttribute(XName.Get("profile", "http://www.w3.org/2005/07/scxml"), ((StateChart)this).@profile.ToString()));
        if (((StateChart)this).@exmode != null) xml.Add(new XAttribute(XName.Get("exmode", "http://www.w3.org/2005/07/scxml"), ((StateChart)this).@exmode.ToString()));
        if (((StateChart)this).@id != null) xml.Add(new XAttribute(XName.Get("id", "http://www.w3.org/2005/07/scxml"), ((StateChart)this).@id.ToString()));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Script item in m_script) {
        xml.Add(item.ToXml("script", "scxml:Script", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState item in m_state) {
        xml.Add(item.ToXml("state", "scxml:SimpleState", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState item in m_parallel) {
        xml.Add(item.ToXml("parallel", "scxml:ParallelState", "http://www.w3.org/2005/07/scxml"));
      }
        if (((StateChart)this).@initial1 != null) xml.Add(((StateChart)this).@initial1.ToXml("initial1", "scxml:TransitionTarget", "http://www.w3.org/2005/07/scxml"));
        if (((StateChart)this).@initial != null) xml.Add(((StateChart)this).@initial.ToXml("initial", "scxml:InitialState", "http://www.w3.org/2005/07/scxml"));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState item in m_final) {
        xml.Add(item.ToXml("final", "scxml:FinalState", "http://www.w3.org/2005/07/scxml"));
      }
        if (((StateChart)this).@datamodel != null) xml.Add(((StateChart)this).@datamodel.ToXml("datamodel", "scxml:Datamodel", "http://www.w3.org/2005/07/scxml"));
        if (((StateChart)this).@description != null) xml.Add(((StateChart)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("StateChart", null, "");
    }
    public string _ClassName { get { return "StateChart"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:StateChart"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Script_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Script
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    string @value { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Script_class : Script
  {
    string Script.@value { get; set; }
    public Script_class() {
    }
    public Script_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("value", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("value")) != null) ((Script)this).@value = (xml.Attribute(XName.Get("value", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("value")).Value;
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Script") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Script"));
        if (((Script)this).@value != null) xml.Add(new XAttribute(XName.Get("value", "http://www.w3.org/2005/07/scxml"), ((Script)this).@value.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Script", null, "");
    }
    public string _ClassName { get { return "Script"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Script"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Node_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Node
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry @onentry { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit @onexit { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Node_class : Node
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry Node.@onentry { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit Node.@onexit { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    public Node_class() {
    }
    public Node_class(XElement xml) : this() {
        if ((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")) != null) ((Node)this).@onentry = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")));
        if ((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")) != null) ((Node)this).@onexit = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")));
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((Node)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Node") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Node"));
        if (((Node)this).@onentry != null) xml.Add(((Node)this).@onentry.ToXml("onentry", "scxml:OnEntry", "http://www.w3.org/2005/07/scxml"));
        if (((Node)this).@onexit != null) xml.Add(((Node)this).@onexit.ToXml("onexit", "scxml:OnExit", "http://www.w3.org/2005/07/scxml"));
        if (((Node)this).@description != null) xml.Add(((Node)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Node", null, "");
    }
    public string _ClassName { get { return "Node"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Node"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.TransitionSource_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface TransitionSource
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.Node
  {
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition> @transition { get; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class TransitionSource_class : TransitionSource
  {
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition> m_transition = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition> TransitionSource.@transition { [DebuggerStepThrough()] get { return m_transition; } }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onentry { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onexit { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    public TransitionSource_class() {

    }
    public TransitionSource_class(XElement xml) : this() {
      foreach (var el in (xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) : xml.Elements("transition"))) {
        m_transition.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition(el));
      }
        if ((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")) != null) ((TransitionSource)this).@onentry = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")));
        if ((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")) != null) ((TransitionSource)this).@onexit = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")));
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((TransitionSource)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:TransitionSource") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:TransitionSource"));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition item in m_transition) {
        xml.Add(item.ToXml("transition", "scxml:CondEventTransition", "http://www.w3.org/2005/07/scxml"));
      }
        if (((TransitionSource)this).@onentry != null) xml.Add(((TransitionSource)this).@onentry.ToXml("onentry", "scxml:OnEntry", "http://www.w3.org/2005/07/scxml"));
        if (((TransitionSource)this).@onexit != null) xml.Add(((TransitionSource)this).@onexit.ToXml("onexit", "scxml:OnExit", "http://www.w3.org/2005/07/scxml"));
        if (((TransitionSource)this).@description != null) xml.Add(((TransitionSource)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("TransitionSource", null, "");
    }
    public string _ClassName { get { return "TransitionSource"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:TransitionSource"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.TransitionTarget_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface TransitionTarget
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.Node
  {
    string @id { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class TransitionTarget_class : TransitionTarget
  {
    string TransitionTarget.@id { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onentry { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onexit { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    public TransitionTarget_class() {
    }
    public TransitionTarget_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")) != null) ((TransitionTarget)this).@id = (xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")).Value;
        if ((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")) != null) ((TransitionTarget)this).@onentry = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")));
        if ((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")) != null) ((TransitionTarget)this).@onexit = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")));
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((TransitionTarget)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:TransitionTarget") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:TransitionTarget"));
        if (((TransitionTarget)this).@id != null) xml.Add(new XAttribute(XName.Get("id", "http://www.w3.org/2005/07/scxml"), ((TransitionTarget)this).@id.ToString()));
        if (((TransitionTarget)this).@onentry != null) xml.Add(((TransitionTarget)this).@onentry.ToXml("onentry", "scxml:OnEntry", "http://www.w3.org/2005/07/scxml"));
        if (((TransitionTarget)this).@onexit != null) xml.Add(((TransitionTarget)this).@onexit.ToXml("onexit", "scxml:OnExit", "http://www.w3.org/2005/07/scxml"));
        if (((TransitionTarget)this).@description != null) xml.Add(((TransitionTarget)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("TransitionTarget", null, "");
    }
    public string _ClassName { get { return "TransitionTarget"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:TransitionTarget"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.AbstractState_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface AbstractState
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState> @state { get; }
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState> @parallel { get; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class AbstractState_class : AbstractState
  {
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState> m_state = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState> AbstractState.@state { [DebuggerStepThrough()] get { return m_state; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState> m_parallel = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState> AbstractState.@parallel { [DebuggerStepThrough()] get { return m_parallel; } }
    public AbstractState_class() {


    }
    public AbstractState_class(XElement xml) : this() {
      foreach (var el in (xml.Element(XName.Get("state", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("state", "http://www.w3.org/2005/07/scxml")) : xml.Elements("state"))) {
        m_state.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState(el));
      }
      foreach (var el in (xml.Element(XName.Get("parallel", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("parallel", "http://www.w3.org/2005/07/scxml")) : xml.Elements("parallel"))) {
        m_parallel.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState(el));
      }
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:AbstractState") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:AbstractState"));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState item in m_state) {
        xml.Add(item.ToXml("state", "scxml:SimpleState", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState item in m_parallel) {
        xml.Add(item.ToXml("parallel", "scxml:ParallelState", "http://www.w3.org/2005/07/scxml"));
      }
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("AbstractState", null, "");
    }
    public string _ClassName { get { return "AbstractState"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:AbstractState"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.State_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface State
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget, global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractState, global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionSource, global::@www.@w3.@org.@_2005.@_07.@scxml.DatamodelContainer
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState @history { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class State_class : State
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState State.@history { get; set; }
    string global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget.@id { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onentry { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onexit { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState> m_state = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState> global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractState.@state { [DebuggerStepThrough()] get { return m_state; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState> m_parallel = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState> global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractState.@parallel { [DebuggerStepThrough()] get { return m_parallel; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition> m_transition = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition> global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionSource.@transition { [DebuggerStepThrough()] get { return m_transition; } }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Datamodel global::@www.@w3.@org.@_2005.@_07.@scxml.DatamodelContainer.@datamodel { get; set; }
    public State_class() {



    }
    public State_class(XElement xml) : this() {
        if ((xml.Element(XName.Get("history", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("history")) != null) ((State)this).@history = new global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState((xml.Element(XName.Get("history", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("history")));
        if ((xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")) != null) ((State)this).@id = (xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")).Value;
        if ((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")) != null) ((State)this).@onentry = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")));
        if ((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")) != null) ((State)this).@onexit = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")));
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((State)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
      foreach (var el in (xml.Element(XName.Get("state", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("state", "http://www.w3.org/2005/07/scxml")) : xml.Elements("state"))) {
        m_state.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState(el));
      }
      foreach (var el in (xml.Element(XName.Get("parallel", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("parallel", "http://www.w3.org/2005/07/scxml")) : xml.Elements("parallel"))) {
        m_parallel.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState(el));
      }
      foreach (var el in (xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) : xml.Elements("transition"))) {
        m_transition.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition(el));
      }
        if ((xml.Element(XName.Get("datamodel", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("datamodel")) != null) ((State)this).@datamodel = new global::@www.@w3.@org.@_2005.@_07.@scxml.Datamodel((xml.Element(XName.Get("datamodel", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("datamodel")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:State") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:State"));
        if (((State)this).@history != null) xml.Add(((State)this).@history.ToXml("history", "scxml:HistoryState", "http://www.w3.org/2005/07/scxml"));
        if (((State)this).@id != null) xml.Add(new XAttribute(XName.Get("id", "http://www.w3.org/2005/07/scxml"), ((State)this).@id.ToString()));
        if (((State)this).@onentry != null) xml.Add(((State)this).@onentry.ToXml("onentry", "scxml:OnEntry", "http://www.w3.org/2005/07/scxml"));
        if (((State)this).@onexit != null) xml.Add(((State)this).@onexit.ToXml("onexit", "scxml:OnExit", "http://www.w3.org/2005/07/scxml"));
        if (((State)this).@description != null) xml.Add(((State)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState item in m_state) {
        xml.Add(item.ToXml("state", "scxml:SimpleState", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState item in m_parallel) {
        xml.Add(item.ToXml("parallel", "scxml:ParallelState", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition item in m_transition) {
        xml.Add(item.ToXml("transition", "scxml:CondEventTransition", "http://www.w3.org/2005/07/scxml"));
      }
        if (((State)this).@datamodel != null) xml.Add(((State)this).@datamodel.ToXml("datamodel", "scxml:Datamodel", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("State", null, "");
    }
    public string _ClassName { get { return "State"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:State"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Transition_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Transition
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent, global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer
  {
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget> @target { get; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Transition_class : Transition
  {
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget> m_target = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget> Transition.@target { [DebuggerStepThrough()] get { return m_target; } }
    private List<object> m_group = new List<object>();
    List<object> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@group { [DebuggerStepThrough()] get { return m_group; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.If> m_if = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.If>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.If> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@if { [DebuggerStepThrough()] get { return m_if; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log> m_log = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@log { [DebuggerStepThrough()] get { return m_log; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise> m_raise = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@raise { [DebuggerStepThrough()] get { return m_raise; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send> m_send = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@send { [DebuggerStepThrough()] get { return m_send; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel> m_cancel = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@cancel { [DebuggerStepThrough()] get { return m_cancel; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign> m_assign = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@assign { [DebuggerStepThrough()] get { return m_assign; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate> m_validate = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@validate { [DebuggerStepThrough()] get { return m_validate; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> m_script = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@script { [DebuggerStepThrough()] get { return m_script; } }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    public Transition_class() {










    }
    public Transition_class(XElement xml) : this() {
      foreach (var el in (xml.Element(XName.Get("target", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("target", "http://www.w3.org/2005/07/scxml")) : xml.Elements("target"))) {
        switch (el.Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")) == null ? string.Empty : el.Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value) {
          case "scxml:State":
            m_target.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.State(el));
            break;
          case "scxml:FinalState":
            m_target.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState(el));
            break;
          case "scxml:HistoryState":
            m_target.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState(el));
            break;
          case "scxml:ParallelState":
            m_target.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState(el));
            break;
          case "scxml:SimpleState":
            m_target.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState(el));
            break;
          case "":
            m_target.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget(el));
            break;
          default:
            throw new NotImplementedException("An unknown type \"" + el.Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value + "\" derived from \"global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget\" was encountered being assigned to \"target\". This type is however not supported in this version of the interface. You may have to recompile the .NET interfaces or add an 'ReferencedBy' annotation to the ecore file if the type is not contained in the same model.");
        }
      }
      foreach (var att in (xml.Attribute(XName.Get("group", "http://www.w3.org/2005/07/scxml")) != null ? xml.Attributes(XName.Get("group", "http://www.w3.org/2005/07/scxml")) : xml.Attributes("group"))) {
        m_group.Add(att.Value);
      }
      foreach (var el in (xml.Element(XName.Get("if", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("if", "http://www.w3.org/2005/07/scxml")) : xml.Elements("if"))) {
        m_if.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.If(el));
      }
      foreach (var el in (xml.Element(XName.Get("log", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("log", "http://www.w3.org/2005/07/scxml")) : xml.Elements("log"))) {
        m_log.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Log(el));
      }
      foreach (var el in (xml.Element(XName.Get("raise", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("raise", "http://www.w3.org/2005/07/scxml")) : xml.Elements("raise"))) {
        m_raise.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Raise(el));
      }
      foreach (var el in (xml.Element(XName.Get("send", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("send", "http://www.w3.org/2005/07/scxml")) : xml.Elements("send"))) {
        m_send.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Send(el));
      }
      foreach (var el in (xml.Element(XName.Get("cancel", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("cancel", "http://www.w3.org/2005/07/scxml")) : xml.Elements("cancel"))) {
        m_cancel.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel(el));
      }
      foreach (var el in (xml.Element(XName.Get("assign", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("assign", "http://www.w3.org/2005/07/scxml")) : xml.Elements("assign"))) {
        m_assign.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Assign(el));
      }
      foreach (var el in (xml.Element(XName.Get("validate", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("validate", "http://www.w3.org/2005/07/scxml")) : xml.Elements("validate"))) {
        m_validate.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Validate(el));
      }
      foreach (var el in (xml.Element(XName.Get("script", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("script", "http://www.w3.org/2005/07/scxml")) : xml.Elements("script"))) {
        m_script.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Script(el));
      }
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((Transition)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Transition") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Transition"));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget item in m_target) {
        xml.Add(item.ToXml("target", "scxml:TransitionTarget", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (object item in m_group) {
        xml.Add(new XAttribute(XName.Get("group", "http://www.w3.org/2005/07/scxml"), item.ToString()));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.If item in m_if) {
        xml.Add(item.ToXml("if", "scxml:If", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Log item in m_log) {
        xml.Add(item.ToXml("log", "scxml:Log", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Raise item in m_raise) {
        xml.Add(item.ToXml("raise", "scxml:Raise", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Send item in m_send) {
        xml.Add(item.ToXml("send", "scxml:Send", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel item in m_cancel) {
        xml.Add(item.ToXml("cancel", "scxml:Cancel", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Assign item in m_assign) {
        xml.Add(item.ToXml("assign", "scxml:Assign", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Validate item in m_validate) {
        xml.Add(item.ToXml("validate", "scxml:Validate", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Script item in m_script) {
        xml.Add(item.ToXml("script", "scxml:Script", "http://www.w3.org/2005/07/scxml"));
      }
        if (((Transition)this).@description != null) xml.Add(((Transition)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Transition", null, "");
    }
    public string _ClassName { get { return "Transition"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Transition"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.CondEventTransition_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface CondEventTransition
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.Transition
  {
    string @cond { get; set; }
    string @event { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class CondEventTransition_class : CondEventTransition
  {
    string CondEventTransition.@cond { get; set; }
    string CondEventTransition.@event { get; set; }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget> m_target = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget> global::@www.@w3.@org.@_2005.@_07.@scxml.Transition.@target { [DebuggerStepThrough()] get { return m_target; } }
    private List<object> m_group = new List<object>();
    List<object> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@group { [DebuggerStepThrough()] get { return m_group; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.If> m_if = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.If>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.If> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@if { [DebuggerStepThrough()] get { return m_if; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log> m_log = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@log { [DebuggerStepThrough()] get { return m_log; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise> m_raise = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@raise { [DebuggerStepThrough()] get { return m_raise; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send> m_send = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@send { [DebuggerStepThrough()] get { return m_send; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel> m_cancel = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@cancel { [DebuggerStepThrough()] get { return m_cancel; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign> m_assign = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@assign { [DebuggerStepThrough()] get { return m_assign; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate> m_validate = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@validate { [DebuggerStepThrough()] get { return m_validate; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> m_script = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@script { [DebuggerStepThrough()] get { return m_script; } }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    public CondEventTransition_class() {










    }
    public CondEventTransition_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("cond", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("cond")) != null) ((CondEventTransition)this).@cond = (xml.Attribute(XName.Get("cond", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("cond")).Value;
        if ((xml.Attribute(XName.Get("event", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("event")) != null) ((CondEventTransition)this).@event = (xml.Attribute(XName.Get("event", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("event")).Value;
      foreach (var el in (xml.Element(XName.Get("target", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("target", "http://www.w3.org/2005/07/scxml")) : xml.Elements("target"))) {
        switch (el.Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")) == null ? string.Empty : el.Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value) {
          case "scxml:State":
            m_target.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.State(el));
            break;
          case "scxml:FinalState":
            m_target.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState(el));
            break;
          case "scxml:HistoryState":
            m_target.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState(el));
            break;
          case "scxml:ParallelState":
            m_target.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState(el));
            break;
          case "scxml:SimpleState":
            m_target.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState(el));
            break;
          case "":
            m_target.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget(el));
            break;
          default:
            throw new NotImplementedException("An unknown type \"" + el.Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value + "\" derived from \"global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget\" was encountered being assigned to \"target\". This type is however not supported in this version of the interface. You may have to recompile the .NET interfaces or add an 'ReferencedBy' annotation to the ecore file if the type is not contained in the same model.");
        }
      }
      foreach (var att in (xml.Attribute(XName.Get("group", "http://www.w3.org/2005/07/scxml")) != null ? xml.Attributes(XName.Get("group", "http://www.w3.org/2005/07/scxml")) : xml.Attributes("group"))) {
        m_group.Add(att.Value);
      }
      foreach (var el in (xml.Element(XName.Get("if", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("if", "http://www.w3.org/2005/07/scxml")) : xml.Elements("if"))) {
        m_if.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.If(el));
      }
      foreach (var el in (xml.Element(XName.Get("log", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("log", "http://www.w3.org/2005/07/scxml")) : xml.Elements("log"))) {
        m_log.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Log(el));
      }
      foreach (var el in (xml.Element(XName.Get("raise", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("raise", "http://www.w3.org/2005/07/scxml")) : xml.Elements("raise"))) {
        m_raise.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Raise(el));
      }
      foreach (var el in (xml.Element(XName.Get("send", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("send", "http://www.w3.org/2005/07/scxml")) : xml.Elements("send"))) {
        m_send.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Send(el));
      }
      foreach (var el in (xml.Element(XName.Get("cancel", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("cancel", "http://www.w3.org/2005/07/scxml")) : xml.Elements("cancel"))) {
        m_cancel.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel(el));
      }
      foreach (var el in (xml.Element(XName.Get("assign", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("assign", "http://www.w3.org/2005/07/scxml")) : xml.Elements("assign"))) {
        m_assign.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Assign(el));
      }
      foreach (var el in (xml.Element(XName.Get("validate", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("validate", "http://www.w3.org/2005/07/scxml")) : xml.Elements("validate"))) {
        m_validate.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Validate(el));
      }
      foreach (var el in (xml.Element(XName.Get("script", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("script", "http://www.w3.org/2005/07/scxml")) : xml.Elements("script"))) {
        m_script.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Script(el));
      }
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((CondEventTransition)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:CondEventTransition") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:CondEventTransition"));
        if (((CondEventTransition)this).@cond != null) xml.Add(new XAttribute(XName.Get("cond", "http://www.w3.org/2005/07/scxml"), ((CondEventTransition)this).@cond.ToString()));
        if (((CondEventTransition)this).@event != null) xml.Add(new XAttribute(XName.Get("event", "http://www.w3.org/2005/07/scxml"), ((CondEventTransition)this).@event.ToString()));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget item in m_target) {
        xml.Add(item.ToXml("target", "scxml:TransitionTarget", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (object item in m_group) {
        xml.Add(new XAttribute(XName.Get("group", "http://www.w3.org/2005/07/scxml"), item.ToString()));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.If item in m_if) {
        xml.Add(item.ToXml("if", "scxml:If", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Log item in m_log) {
        xml.Add(item.ToXml("log", "scxml:Log", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Raise item in m_raise) {
        xml.Add(item.ToXml("raise", "scxml:Raise", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Send item in m_send) {
        xml.Add(item.ToXml("send", "scxml:Send", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel item in m_cancel) {
        xml.Add(item.ToXml("cancel", "scxml:Cancel", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Assign item in m_assign) {
        xml.Add(item.ToXml("assign", "scxml:Assign", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Validate item in m_validate) {
        xml.Add(item.ToXml("validate", "scxml:Validate", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Script item in m_script) {
        xml.Add(item.ToXml("script", "scxml:Script", "http://www.w3.org/2005/07/scxml"));
      }
        if (((CondEventTransition)this).@description != null) xml.Add(((CondEventTransition)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("CondEventTransition", null, "");
    }
    public string _ClassName { get { return "CondEventTransition"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:CondEventTransition"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.InitialState_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface InitialState
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.Transition @transition { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class InitialState_class : InitialState
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.Transition InitialState.@transition { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    public InitialState_class() {
    }
    public InitialState_class(XElement xml) : this() {
        if ((xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")) != null) 
        switch ((xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")) == null ? string.Empty : (xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value) {
          case "scxml:CondEventTransition":
            if ((xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")) != null) ((InitialState)this).@transition = new global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition((xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")));
            break;
          case "":
            if ((xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")) != null) ((InitialState)this).@transition = new global::@www.@w3.@org.@_2005.@_07.@scxml.Transition((xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")));
            break;
          default:
            throw new NotImplementedException("An unknown type \"" + (xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value + "\" derived from \"global::@www.@w3.@org.@_2005.@_07.@scxml.Transition\" was encountered being assigned to \"transition\". This type is however not supported in this version of the interface. You may have to recompile the .NET interfaces or add an 'ReferencedBy' annotation to the ecore file if the type is not contained in the same model.");
        }
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((InitialState)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:InitialState") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:InitialState"));
        if (((InitialState)this).@transition != null) xml.Add(((InitialState)this).@transition.ToXml("transition", "scxml:Transition", "http://www.w3.org/2005/07/scxml"));
        if (((InitialState)this).@description != null) xml.Add(((InitialState)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("InitialState", null, "");
    }
    public string _ClassName { get { return "InitialState"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:InitialState"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Param_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Param
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    string @name { get; set; }
    string @expr { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Param_class : Param
  {
    string Param.@name { get; set; }
    string Param.@expr { get; set; }
    public Param_class() {
    }
    public Param_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("name", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("name")) != null) ((Param)this).@name = (xml.Attribute(XName.Get("name", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("name")).Value;
        if ((xml.Attribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("expr")) != null) ((Param)this).@expr = (xml.Attribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("expr")).Value;
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Param") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Param"));
        if (((Param)this).@name != null) xml.Add(new XAttribute(XName.Get("name", "http://www.w3.org/2005/07/scxml"), ((Param)this).@name.ToString()));
        if (((Param)this).@expr != null) xml.Add(new XAttribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml"), ((Param)this).@expr.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Param", null, "");
    }
    public string _ClassName { get { return "Param"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Param"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Donedata_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Donedata
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Param> @param { get; }
    object @content { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Donedata_class : Donedata
  {
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Param> m_param = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Param>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Param> Donedata.@param { [DebuggerStepThrough()] get { return m_param; } }
    object Donedata.@content { get; set; }
    public Donedata_class() {

    }
    public Donedata_class(XElement xml) : this() {
      foreach (var el in (xml.Element(XName.Get("param", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("param", "http://www.w3.org/2005/07/scxml")) : xml.Elements("param"))) {
        m_param.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Param(el));
      }
        if ((xml.Attribute(XName.Get("content", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("content")) != null) ((Donedata)this).@content = (xml.Attribute(XName.Get("content", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("content")).Value;
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Donedata") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Donedata"));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Param item in m_param) {
        xml.Add(item.ToXml("param", "scxml:Param", "http://www.w3.org/2005/07/scxml"));
      }
        if (((Donedata)this).@content != null) xml.Add(new XAttribute(XName.Get("content", "http://www.w3.org/2005/07/scxml"), ((Donedata)this).@content.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Donedata", null, "");
    }
    public string _ClassName { get { return "Donedata"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Donedata"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Content_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Content
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    string @value { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Content_class : Content
  {
    string Content.@value { get; set; }
    public Content_class() {
    }
    public Content_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("value", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("value")) != null) ((Content)this).@value = (xml.Attribute(XName.Get("value", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("value")).Value;
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Content") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Content"));
        if (((Content)this).@value != null) xml.Add(new XAttribute(XName.Get("value", "http://www.w3.org/2005/07/scxml"), ((Content)this).@value.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Content", null, "");
    }
    public string _ClassName { get { return "Content"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Content"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.FinalState_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface FinalState
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.Donedata @donedata { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class FinalState_class : FinalState
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.Donedata FinalState.@donedata { get; set; }
    string global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget.@id { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onentry { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onexit { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    public FinalState_class() {
    }
    public FinalState_class(XElement xml) : this() {
        if ((xml.Element(XName.Get("donedata", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("donedata")) != null) 
        switch ((xml.Element(XName.Get("donedata", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("donedata")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")) == null ? string.Empty : (xml.Element(XName.Get("donedata", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("donedata")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value) {
          case "scxml:Raise":
            if ((xml.Element(XName.Get("donedata", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("donedata")) != null) ((FinalState)this).@donedata = new global::@www.@w3.@org.@_2005.@_07.@scxml.Raise((xml.Element(XName.Get("donedata", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("donedata")));
            break;
          case "scxml:Send":
            if ((xml.Element(XName.Get("donedata", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("donedata")) != null) ((FinalState)this).@donedata = new global::@www.@w3.@org.@_2005.@_07.@scxml.Send((xml.Element(XName.Get("donedata", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("donedata")));
            break;
          case "scxml:Invoke":
            if ((xml.Element(XName.Get("donedata", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("donedata")) != null) ((FinalState)this).@donedata = new global::@www.@w3.@org.@_2005.@_07.@scxml.Invoke((xml.Element(XName.Get("donedata", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("donedata")));
            break;
          case "":
            if ((xml.Element(XName.Get("donedata", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("donedata")) != null) ((FinalState)this).@donedata = new global::@www.@w3.@org.@_2005.@_07.@scxml.Donedata((xml.Element(XName.Get("donedata", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("donedata")));
            break;
          default:
            throw new NotImplementedException("An unknown type \"" + (xml.Element(XName.Get("donedata", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("donedata")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value + "\" derived from \"global::@www.@w3.@org.@_2005.@_07.@scxml.Donedata\" was encountered being assigned to \"donedata\". This type is however not supported in this version of the interface. You may have to recompile the .NET interfaces or add an 'ReferencedBy' annotation to the ecore file if the type is not contained in the same model.");
        }
        if ((xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")) != null) ((FinalState)this).@id = (xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")).Value;
        if ((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")) != null) ((FinalState)this).@onentry = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")));
        if ((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")) != null) ((FinalState)this).@onexit = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")));
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((FinalState)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:FinalState") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:FinalState"));
        if (((FinalState)this).@donedata != null) xml.Add(((FinalState)this).@donedata.ToXml("donedata", "scxml:Donedata", "http://www.w3.org/2005/07/scxml"));
        if (((FinalState)this).@id != null) xml.Add(new XAttribute(XName.Get("id", "http://www.w3.org/2005/07/scxml"), ((FinalState)this).@id.ToString()));
        if (((FinalState)this).@onentry != null) xml.Add(((FinalState)this).@onentry.ToXml("onentry", "scxml:OnEntry", "http://www.w3.org/2005/07/scxml"));
        if (((FinalState)this).@onexit != null) xml.Add(((FinalState)this).@onexit.ToXml("onexit", "scxml:OnExit", "http://www.w3.org/2005/07/scxml"));
        if (((FinalState)this).@description != null) xml.Add(((FinalState)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("FinalState", null, "");
    }
    public string _ClassName { get { return "FinalState"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:FinalState"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.ParallelState_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface ParallelState
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.State
  {
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class ParallelState_class : ParallelState
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState global::@www.@w3.@org.@_2005.@_07.@scxml.State.@history { get; set; }
    string global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget.@id { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onentry { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onexit { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState> m_state = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState> global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractState.@state { [DebuggerStepThrough()] get { return m_state; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState> m_parallel = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState> global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractState.@parallel { [DebuggerStepThrough()] get { return m_parallel; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition> m_transition = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition> global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionSource.@transition { [DebuggerStepThrough()] get { return m_transition; } }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Datamodel global::@www.@w3.@org.@_2005.@_07.@scxml.DatamodelContainer.@datamodel { get; set; }
    public ParallelState_class() {



    }
    public ParallelState_class(XElement xml) : this() {
        if ((xml.Element(XName.Get("history", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("history")) != null) ((ParallelState)this).@history = new global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState((xml.Element(XName.Get("history", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("history")));
        if ((xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")) != null) ((ParallelState)this).@id = (xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")).Value;
        if ((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")) != null) ((ParallelState)this).@onentry = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")));
        if ((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")) != null) ((ParallelState)this).@onexit = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")));
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((ParallelState)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
      foreach (var el in (xml.Element(XName.Get("state", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("state", "http://www.w3.org/2005/07/scxml")) : xml.Elements("state"))) {
        m_state.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState(el));
      }
      foreach (var el in (xml.Element(XName.Get("parallel", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("parallel", "http://www.w3.org/2005/07/scxml")) : xml.Elements("parallel"))) {
        m_parallel.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState(el));
      }
      foreach (var el in (xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) : xml.Elements("transition"))) {
        m_transition.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition(el));
      }
        if ((xml.Element(XName.Get("datamodel", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("datamodel")) != null) ((ParallelState)this).@datamodel = new global::@www.@w3.@org.@_2005.@_07.@scxml.Datamodel((xml.Element(XName.Get("datamodel", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("datamodel")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:ParallelState") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:ParallelState"));
        if (((ParallelState)this).@history != null) xml.Add(((ParallelState)this).@history.ToXml("history", "scxml:HistoryState", "http://www.w3.org/2005/07/scxml"));
        if (((ParallelState)this).@id != null) xml.Add(new XAttribute(XName.Get("id", "http://www.w3.org/2005/07/scxml"), ((ParallelState)this).@id.ToString()));
        if (((ParallelState)this).@onentry != null) xml.Add(((ParallelState)this).@onentry.ToXml("onentry", "scxml:OnEntry", "http://www.w3.org/2005/07/scxml"));
        if (((ParallelState)this).@onexit != null) xml.Add(((ParallelState)this).@onexit.ToXml("onexit", "scxml:OnExit", "http://www.w3.org/2005/07/scxml"));
        if (((ParallelState)this).@description != null) xml.Add(((ParallelState)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState item in m_state) {
        xml.Add(item.ToXml("state", "scxml:SimpleState", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState item in m_parallel) {
        xml.Add(item.ToXml("parallel", "scxml:ParallelState", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition item in m_transition) {
        xml.Add(item.ToXml("transition", "scxml:CondEventTransition", "http://www.w3.org/2005/07/scxml"));
      }
        if (((ParallelState)this).@datamodel != null) xml.Add(((ParallelState)this).@datamodel.ToXml("datamodel", "scxml:Datamodel", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("ParallelState", null, "");
    }
    public string _ClassName { get { return "ParallelState"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:ParallelState"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.AbstractSimpleState_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface AbstractSimpleState
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget @initial1 { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.InitialState @initial { get; set; }
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState> @final { get; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class AbstractSimpleState_class : AbstractSimpleState
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget AbstractSimpleState.@initial1 { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.InitialState AbstractSimpleState.@initial { get; set; }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState> m_final = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState> AbstractSimpleState.@final { [DebuggerStepThrough()] get { return m_final; } }
    public AbstractSimpleState_class() {

    }
    public AbstractSimpleState_class(XElement xml) : this() {
        if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) 
        switch ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")) == null ? string.Empty : (xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value) {
          case "scxml:State":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((AbstractSimpleState)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.State((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "scxml:FinalState":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((AbstractSimpleState)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "scxml:HistoryState":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((AbstractSimpleState)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "scxml:ParallelState":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((AbstractSimpleState)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "scxml:SimpleState":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((AbstractSimpleState)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((AbstractSimpleState)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          default:
            throw new NotImplementedException("An unknown type \"" + (xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value + "\" derived from \"global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget\" was encountered being assigned to \"initial1\". This type is however not supported in this version of the interface. You may have to recompile the .NET interfaces or add an 'ReferencedBy' annotation to the ecore file if the type is not contained in the same model.");
        }
        if ((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")) != null) 
        switch ((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")) == null ? string.Empty : (xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value) {
          case "scxml:HistoryState":
            if ((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")) != null) ((AbstractSimpleState)this).@initial = new global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")));
            break;
          case "":
            if ((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")) != null) ((AbstractSimpleState)this).@initial = new global::@www.@w3.@org.@_2005.@_07.@scxml.InitialState((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")));
            break;
          default:
            throw new NotImplementedException("An unknown type \"" + (xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value + "\" derived from \"global::@www.@w3.@org.@_2005.@_07.@scxml.InitialState\" was encountered being assigned to \"initial\". This type is however not supported in this version of the interface. You may have to recompile the .NET interfaces or add an 'ReferencedBy' annotation to the ecore file if the type is not contained in the same model.");
        }
      foreach (var el in (xml.Element(XName.Get("final", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("final", "http://www.w3.org/2005/07/scxml")) : xml.Elements("final"))) {
        m_final.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState(el));
      }
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:AbstractSimpleState") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:AbstractSimpleState"));
        if (((AbstractSimpleState)this).@initial1 != null) xml.Add(((AbstractSimpleState)this).@initial1.ToXml("initial1", "scxml:TransitionTarget", "http://www.w3.org/2005/07/scxml"));
        if (((AbstractSimpleState)this).@initial != null) xml.Add(((AbstractSimpleState)this).@initial.ToXml("initial", "scxml:InitialState", "http://www.w3.org/2005/07/scxml"));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState item in m_final) {
        xml.Add(item.ToXml("final", "scxml:FinalState", "http://www.w3.org/2005/07/scxml"));
      }
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("AbstractSimpleState", null, "");
    }
    public string _ClassName { get { return "AbstractSimpleState"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:AbstractSimpleState"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.SimpleState_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface SimpleState
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.State, global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractSimpleState
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.Invoke @invoke { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class SimpleState_class : SimpleState
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.Invoke SimpleState.@invoke { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState global::@www.@w3.@org.@_2005.@_07.@scxml.State.@history { get; set; }
    string global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget.@id { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onentry { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onexit { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState> m_state = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState> global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractState.@state { [DebuggerStepThrough()] get { return m_state; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState> m_parallel = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState> global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractState.@parallel { [DebuggerStepThrough()] get { return m_parallel; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition> m_transition = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition> global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionSource.@transition { [DebuggerStepThrough()] get { return m_transition; } }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Datamodel global::@www.@w3.@org.@_2005.@_07.@scxml.DatamodelContainer.@datamodel { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractSimpleState.@initial1 { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.InitialState global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractSimpleState.@initial { get; set; }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState> m_final = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState> global::@www.@w3.@org.@_2005.@_07.@scxml.AbstractSimpleState.@final { [DebuggerStepThrough()] get { return m_final; } }
    public SimpleState_class() {




    }
    public SimpleState_class(XElement xml) : this() {
        if ((xml.Element(XName.Get("invoke", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("invoke")) != null) ((SimpleState)this).@invoke = new global::@www.@w3.@org.@_2005.@_07.@scxml.Invoke((xml.Element(XName.Get("invoke", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("invoke")));
        if ((xml.Element(XName.Get("history", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("history")) != null) ((SimpleState)this).@history = new global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState((xml.Element(XName.Get("history", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("history")));
        if ((xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")) != null) ((SimpleState)this).@id = (xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")).Value;
        if ((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")) != null) ((SimpleState)this).@onentry = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")));
        if ((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")) != null) ((SimpleState)this).@onexit = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")));
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((SimpleState)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
      foreach (var el in (xml.Element(XName.Get("state", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("state", "http://www.w3.org/2005/07/scxml")) : xml.Elements("state"))) {
        m_state.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState(el));
      }
      foreach (var el in (xml.Element(XName.Get("parallel", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("parallel", "http://www.w3.org/2005/07/scxml")) : xml.Elements("parallel"))) {
        m_parallel.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState(el));
      }
      foreach (var el in (xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) : xml.Elements("transition"))) {
        m_transition.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition(el));
      }
        if ((xml.Element(XName.Get("datamodel", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("datamodel")) != null) ((SimpleState)this).@datamodel = new global::@www.@w3.@org.@_2005.@_07.@scxml.Datamodel((xml.Element(XName.Get("datamodel", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("datamodel")));
        if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) 
        switch ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")) == null ? string.Empty : (xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value) {
          case "scxml:State":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((SimpleState)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.State((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "scxml:FinalState":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((SimpleState)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "scxml:HistoryState":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((SimpleState)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "scxml:ParallelState":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((SimpleState)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "scxml:SimpleState":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((SimpleState)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          case "":
            if ((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")) != null) ((SimpleState)this).@initial1 = new global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget((xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")));
            break;
          default:
            throw new NotImplementedException("An unknown type \"" + (xml.Element(XName.Get("initial1", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial1")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value + "\" derived from \"global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget\" was encountered being assigned to \"initial1\". This type is however not supported in this version of the interface. You may have to recompile the .NET interfaces or add an 'ReferencedBy' annotation to the ecore file if the type is not contained in the same model.");
        }
        if ((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")) != null) 
        switch ((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")) == null ? string.Empty : (xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value) {
          case "scxml:HistoryState":
            if ((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")) != null) ((SimpleState)this).@initial = new global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryState((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")));
            break;
          case "":
            if ((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")) != null) ((SimpleState)this).@initial = new global::@www.@w3.@org.@_2005.@_07.@scxml.InitialState((xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")));
            break;
          default:
            throw new NotImplementedException("An unknown type \"" + (xml.Element(XName.Get("initial", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("initial")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value + "\" derived from \"global::@www.@w3.@org.@_2005.@_07.@scxml.InitialState\" was encountered being assigned to \"initial\". This type is however not supported in this version of the interface. You may have to recompile the .NET interfaces or add an 'ReferencedBy' annotation to the ecore file if the type is not contained in the same model.");
        }
      foreach (var el in (xml.Element(XName.Get("final", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("final", "http://www.w3.org/2005/07/scxml")) : xml.Elements("final"))) {
        m_final.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState(el));
      }
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:SimpleState") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:SimpleState"));
        if (((SimpleState)this).@invoke != null) xml.Add(((SimpleState)this).@invoke.ToXml("invoke", "scxml:Invoke", "http://www.w3.org/2005/07/scxml"));
        if (((SimpleState)this).@history != null) xml.Add(((SimpleState)this).@history.ToXml("history", "scxml:HistoryState", "http://www.w3.org/2005/07/scxml"));
        if (((SimpleState)this).@id != null) xml.Add(new XAttribute(XName.Get("id", "http://www.w3.org/2005/07/scxml"), ((SimpleState)this).@id.ToString()));
        if (((SimpleState)this).@onentry != null) xml.Add(((SimpleState)this).@onentry.ToXml("onentry", "scxml:OnEntry", "http://www.w3.org/2005/07/scxml"));
        if (((SimpleState)this).@onexit != null) xml.Add(((SimpleState)this).@onexit.ToXml("onexit", "scxml:OnExit", "http://www.w3.org/2005/07/scxml"));
        if (((SimpleState)this).@description != null) xml.Add(((SimpleState)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.SimpleState item in m_state) {
        xml.Add(item.ToXml("state", "scxml:SimpleState", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.ParallelState item in m_parallel) {
        xml.Add(item.ToXml("parallel", "scxml:ParallelState", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition item in m_transition) {
        xml.Add(item.ToXml("transition", "scxml:CondEventTransition", "http://www.w3.org/2005/07/scxml"));
      }
        if (((SimpleState)this).@datamodel != null) xml.Add(((SimpleState)this).@datamodel.ToXml("datamodel", "scxml:Datamodel", "http://www.w3.org/2005/07/scxml"));
        if (((SimpleState)this).@initial1 != null) xml.Add(((SimpleState)this).@initial1.ToXml("initial1", "scxml:TransitionTarget", "http://www.w3.org/2005/07/scxml"));
        if (((SimpleState)this).@initial != null) xml.Add(((SimpleState)this).@initial.ToXml("initial", "scxml:InitialState", "http://www.w3.org/2005/07/scxml"));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.FinalState item in m_final) {
        xml.Add(item.ToXml("final", "scxml:FinalState", "http://www.w3.org/2005/07/scxml"));
      }
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("SimpleState", null, "");
    }
    public string _ClassName { get { return "SimpleState"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:SimpleState"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.HistoryState_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface HistoryState
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget, global::@www.@w3.@org.@_2005.@_07.@scxml.InitialState
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryTypeDatatype @type { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class HistoryState_class : HistoryState
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryTypeDatatype HistoryState.@type { get; set; }
    string global::@www.@w3.@org.@_2005.@_07.@scxml.TransitionTarget.@id { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onentry { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit global::@www.@w3.@org.@_2005.@_07.@scxml.Node.@onexit { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Transition global::@www.@w3.@org.@_2005.@_07.@scxml.InitialState.@transition { get; set; }
    public HistoryState_class() {
    }
    public HistoryState_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("type", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("type")) != null) ((HistoryState)this).@type = (global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryTypeDatatype)System.Enum.Parse(typeof(global::@www.@w3.@org.@_2005.@_07.@scxml.HistoryTypeDatatype), (xml.Attribute(XName.Get("type", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("type")).Value);
        if ((xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")) != null) ((HistoryState)this).@id = (xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")).Value;
        if ((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")) != null) ((HistoryState)this).@onentry = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry((xml.Element(XName.Get("onentry", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onentry")));
        if ((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")) != null) ((HistoryState)this).@onexit = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit((xml.Element(XName.Get("onexit", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("onexit")));
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((HistoryState)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
        if ((xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")) != null) 
        switch ((xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")) == null ? string.Empty : (xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value) {
          case "scxml:CondEventTransition":
            if ((xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")) != null) ((HistoryState)this).@transition = new global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition((xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")));
            break;
          case "":
            if ((xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")) != null) ((HistoryState)this).@transition = new global::@www.@w3.@org.@_2005.@_07.@scxml.Transition((xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")));
            break;
          default:
            throw new NotImplementedException("An unknown type \"" + (xml.Element(XName.Get("transition", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("transition")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value + "\" derived from \"global::@www.@w3.@org.@_2005.@_07.@scxml.Transition\" was encountered being assigned to \"transition\". This type is however not supported in this version of the interface. You may have to recompile the .NET interfaces or add an 'ReferencedBy' annotation to the ecore file if the type is not contained in the same model.");
        }
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:HistoryState") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:HistoryState"));
        if (((HistoryState)this).@type != null) xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2005/07/scxml"), ((HistoryState)this).@type.ToString()));
        if (((HistoryState)this).@id != null) xml.Add(new XAttribute(XName.Get("id", "http://www.w3.org/2005/07/scxml"), ((HistoryState)this).@id.ToString()));
        if (((HistoryState)this).@onentry != null) xml.Add(((HistoryState)this).@onentry.ToXml("onentry", "scxml:OnEntry", "http://www.w3.org/2005/07/scxml"));
        if (((HistoryState)this).@onexit != null) xml.Add(((HistoryState)this).@onexit.ToXml("onexit", "scxml:OnExit", "http://www.w3.org/2005/07/scxml"));
        if (((HistoryState)this).@description != null) xml.Add(((HistoryState)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
        if (((HistoryState)this).@transition != null) xml.Add(((HistoryState)this).@transition.ToXml("transition", "scxml:Transition", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("HistoryState", null, "");
    }
    public string _ClassName { get { return "HistoryState"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:HistoryState"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.OnEntry_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface OnEntry
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent
  {
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class OnEntry_class : OnEntry
  {
    private List<object> m_group = new List<object>();
    List<object> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@group { [DebuggerStepThrough()] get { return m_group; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.If> m_if = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.If>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.If> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@if { [DebuggerStepThrough()] get { return m_if; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log> m_log = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@log { [DebuggerStepThrough()] get { return m_log; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise> m_raise = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@raise { [DebuggerStepThrough()] get { return m_raise; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send> m_send = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@send { [DebuggerStepThrough()] get { return m_send; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel> m_cancel = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@cancel { [DebuggerStepThrough()] get { return m_cancel; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign> m_assign = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@assign { [DebuggerStepThrough()] get { return m_assign; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate> m_validate = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@validate { [DebuggerStepThrough()] get { return m_validate; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> m_script = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@script { [DebuggerStepThrough()] get { return m_script; } }
    public OnEntry_class() {









    }
    public OnEntry_class(XElement xml) : this() {
      foreach (var att in (xml.Attribute(XName.Get("group", "http://www.w3.org/2005/07/scxml")) != null ? xml.Attributes(XName.Get("group", "http://www.w3.org/2005/07/scxml")) : xml.Attributes("group"))) {
        m_group.Add(att.Value);
      }
      foreach (var el in (xml.Element(XName.Get("if", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("if", "http://www.w3.org/2005/07/scxml")) : xml.Elements("if"))) {
        m_if.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.If(el));
      }
      foreach (var el in (xml.Element(XName.Get("log", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("log", "http://www.w3.org/2005/07/scxml")) : xml.Elements("log"))) {
        m_log.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Log(el));
      }
      foreach (var el in (xml.Element(XName.Get("raise", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("raise", "http://www.w3.org/2005/07/scxml")) : xml.Elements("raise"))) {
        m_raise.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Raise(el));
      }
      foreach (var el in (xml.Element(XName.Get("send", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("send", "http://www.w3.org/2005/07/scxml")) : xml.Elements("send"))) {
        m_send.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Send(el));
      }
      foreach (var el in (xml.Element(XName.Get("cancel", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("cancel", "http://www.w3.org/2005/07/scxml")) : xml.Elements("cancel"))) {
        m_cancel.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel(el));
      }
      foreach (var el in (xml.Element(XName.Get("assign", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("assign", "http://www.w3.org/2005/07/scxml")) : xml.Elements("assign"))) {
        m_assign.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Assign(el));
      }
      foreach (var el in (xml.Element(XName.Get("validate", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("validate", "http://www.w3.org/2005/07/scxml")) : xml.Elements("validate"))) {
        m_validate.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Validate(el));
      }
      foreach (var el in (xml.Element(XName.Get("script", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("script", "http://www.w3.org/2005/07/scxml")) : xml.Elements("script"))) {
        m_script.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Script(el));
      }
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:OnEntry") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:OnEntry"));
      foreach (object item in m_group) {
        xml.Add(new XAttribute(XName.Get("group", "http://www.w3.org/2005/07/scxml"), item.ToString()));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.If item in m_if) {
        xml.Add(item.ToXml("if", "scxml:If", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Log item in m_log) {
        xml.Add(item.ToXml("log", "scxml:Log", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Raise item in m_raise) {
        xml.Add(item.ToXml("raise", "scxml:Raise", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Send item in m_send) {
        xml.Add(item.ToXml("send", "scxml:Send", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel item in m_cancel) {
        xml.Add(item.ToXml("cancel", "scxml:Cancel", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Assign item in m_assign) {
        xml.Add(item.ToXml("assign", "scxml:Assign", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Validate item in m_validate) {
        xml.Add(item.ToXml("validate", "scxml:Validate", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Script item in m_script) {
        xml.Add(item.ToXml("script", "scxml:Script", "http://www.w3.org/2005/07/scxml"));
      }
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("OnEntry", null, "");
    }
    public string _ClassName { get { return "OnEntry"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:OnEntry"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.OnExit_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface OnExit
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent
  {
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class OnExit_class : OnExit
  {
    private List<object> m_group = new List<object>();
    List<object> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@group { [DebuggerStepThrough()] get { return m_group; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.If> m_if = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.If>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.If> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@if { [DebuggerStepThrough()] get { return m_if; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log> m_log = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@log { [DebuggerStepThrough()] get { return m_log; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise> m_raise = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@raise { [DebuggerStepThrough()] get { return m_raise; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send> m_send = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@send { [DebuggerStepThrough()] get { return m_send; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel> m_cancel = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@cancel { [DebuggerStepThrough()] get { return m_cancel; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign> m_assign = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@assign { [DebuggerStepThrough()] get { return m_assign; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate> m_validate = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@validate { [DebuggerStepThrough()] get { return m_validate; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> m_script = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@script { [DebuggerStepThrough()] get { return m_script; } }
    public OnExit_class() {









    }
    public OnExit_class(XElement xml) : this() {
      foreach (var att in (xml.Attribute(XName.Get("group", "http://www.w3.org/2005/07/scxml")) != null ? xml.Attributes(XName.Get("group", "http://www.w3.org/2005/07/scxml")) : xml.Attributes("group"))) {
        m_group.Add(att.Value);
      }
      foreach (var el in (xml.Element(XName.Get("if", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("if", "http://www.w3.org/2005/07/scxml")) : xml.Elements("if"))) {
        m_if.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.If(el));
      }
      foreach (var el in (xml.Element(XName.Get("log", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("log", "http://www.w3.org/2005/07/scxml")) : xml.Elements("log"))) {
        m_log.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Log(el));
      }
      foreach (var el in (xml.Element(XName.Get("raise", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("raise", "http://www.w3.org/2005/07/scxml")) : xml.Elements("raise"))) {
        m_raise.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Raise(el));
      }
      foreach (var el in (xml.Element(XName.Get("send", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("send", "http://www.w3.org/2005/07/scxml")) : xml.Elements("send"))) {
        m_send.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Send(el));
      }
      foreach (var el in (xml.Element(XName.Get("cancel", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("cancel", "http://www.w3.org/2005/07/scxml")) : xml.Elements("cancel"))) {
        m_cancel.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel(el));
      }
      foreach (var el in (xml.Element(XName.Get("assign", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("assign", "http://www.w3.org/2005/07/scxml")) : xml.Elements("assign"))) {
        m_assign.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Assign(el));
      }
      foreach (var el in (xml.Element(XName.Get("validate", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("validate", "http://www.w3.org/2005/07/scxml")) : xml.Elements("validate"))) {
        m_validate.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Validate(el));
      }
      foreach (var el in (xml.Element(XName.Get("script", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("script", "http://www.w3.org/2005/07/scxml")) : xml.Elements("script"))) {
        m_script.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Script(el));
      }
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:OnExit") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:OnExit"));
      foreach (object item in m_group) {
        xml.Add(new XAttribute(XName.Get("group", "http://www.w3.org/2005/07/scxml"), item.ToString()));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.If item in m_if) {
        xml.Add(item.ToXml("if", "scxml:If", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Log item in m_log) {
        xml.Add(item.ToXml("log", "scxml:Log", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Raise item in m_raise) {
        xml.Add(item.ToXml("raise", "scxml:Raise", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Send item in m_send) {
        xml.Add(item.ToXml("send", "scxml:Send", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel item in m_cancel) {
        xml.Add(item.ToXml("cancel", "scxml:Cancel", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Assign item in m_assign) {
        xml.Add(item.ToXml("assign", "scxml:Assign", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Validate item in m_validate) {
        xml.Add(item.ToXml("validate", "scxml:Validate", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Script item in m_script) {
        xml.Add(item.ToXml("script", "scxml:Script", "http://www.w3.org/2005/07/scxml"));
      }
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("OnExit", null, "");
    }
    public string _ClassName { get { return "OnExit"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:OnExit"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.ExecutableContent_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface ExecutableContent
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    List<object> @group { get; }
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.If> @if { get; }
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log> @log { get; }
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise> @raise { get; }
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send> @send { get; }
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel> @cancel { get; }
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign> @assign { get; }
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate> @validate { get; }
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> @script { get; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class ExecutableContent_class : ExecutableContent
  {
    private List<object> m_group = new List<object>();
    List<object> ExecutableContent.@group { [DebuggerStepThrough()] get { return m_group; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.If> m_if = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.If>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.If> ExecutableContent.@if { [DebuggerStepThrough()] get { return m_if; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log> m_log = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log> ExecutableContent.@log { [DebuggerStepThrough()] get { return m_log; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise> m_raise = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise> ExecutableContent.@raise { [DebuggerStepThrough()] get { return m_raise; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send> m_send = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send> ExecutableContent.@send { [DebuggerStepThrough()] get { return m_send; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel> m_cancel = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel> ExecutableContent.@cancel { [DebuggerStepThrough()] get { return m_cancel; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign> m_assign = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign> ExecutableContent.@assign { [DebuggerStepThrough()] get { return m_assign; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate> m_validate = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate> ExecutableContent.@validate { [DebuggerStepThrough()] get { return m_validate; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> m_script = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> ExecutableContent.@script { [DebuggerStepThrough()] get { return m_script; } }
    public ExecutableContent_class() {









    }
    public ExecutableContent_class(XElement xml) : this() {
      foreach (var att in (xml.Attribute(XName.Get("group", "http://www.w3.org/2005/07/scxml")) != null ? xml.Attributes(XName.Get("group", "http://www.w3.org/2005/07/scxml")) : xml.Attributes("group"))) {
        m_group.Add(att.Value);
      }
      foreach (var el in (xml.Element(XName.Get("if", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("if", "http://www.w3.org/2005/07/scxml")) : xml.Elements("if"))) {
        m_if.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.If(el));
      }
      foreach (var el in (xml.Element(XName.Get("log", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("log", "http://www.w3.org/2005/07/scxml")) : xml.Elements("log"))) {
        m_log.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Log(el));
      }
      foreach (var el in (xml.Element(XName.Get("raise", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("raise", "http://www.w3.org/2005/07/scxml")) : xml.Elements("raise"))) {
        m_raise.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Raise(el));
      }
      foreach (var el in (xml.Element(XName.Get("send", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("send", "http://www.w3.org/2005/07/scxml")) : xml.Elements("send"))) {
        m_send.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Send(el));
      }
      foreach (var el in (xml.Element(XName.Get("cancel", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("cancel", "http://www.w3.org/2005/07/scxml")) : xml.Elements("cancel"))) {
        m_cancel.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel(el));
      }
      foreach (var el in (xml.Element(XName.Get("assign", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("assign", "http://www.w3.org/2005/07/scxml")) : xml.Elements("assign"))) {
        m_assign.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Assign(el));
      }
      foreach (var el in (xml.Element(XName.Get("validate", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("validate", "http://www.w3.org/2005/07/scxml")) : xml.Elements("validate"))) {
        m_validate.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Validate(el));
      }
      foreach (var el in (xml.Element(XName.Get("script", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("script", "http://www.w3.org/2005/07/scxml")) : xml.Elements("script"))) {
        m_script.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Script(el));
      }
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:ExecutableContent") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:ExecutableContent"));
      foreach (object item in m_group) {
        xml.Add(new XAttribute(XName.Get("group", "http://www.w3.org/2005/07/scxml"), item.ToString()));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.If item in m_if) {
        xml.Add(item.ToXml("if", "scxml:If", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Log item in m_log) {
        xml.Add(item.ToXml("log", "scxml:Log", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Raise item in m_raise) {
        xml.Add(item.ToXml("raise", "scxml:Raise", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Send item in m_send) {
        xml.Add(item.ToXml("send", "scxml:Send", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel item in m_cancel) {
        xml.Add(item.ToXml("cancel", "scxml:Cancel", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Assign item in m_assign) {
        xml.Add(item.ToXml("assign", "scxml:Assign", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Validate item in m_validate) {
        xml.Add(item.ToXml("validate", "scxml:Validate", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Script item in m_script) {
        xml.Add(item.ToXml("script", "scxml:Script", "http://www.w3.org/2005/07/scxml"));
      }
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("ExecutableContent", null, "");
    }
    public string _ClassName { get { return "ExecutableContent"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:ExecutableContent"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Raise_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Raise
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.Donedata
  {
    string @event { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Raise_class : Raise
  {
    string Raise.@event { get; set; }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Param> m_param = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Param>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Param> global::@www.@w3.@org.@_2005.@_07.@scxml.Donedata.@param { [DebuggerStepThrough()] get { return m_param; } }
    object global::@www.@w3.@org.@_2005.@_07.@scxml.Donedata.@content { get; set; }
    public Raise_class() {

    }
    public Raise_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("event", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("event")) != null) ((Raise)this).@event = (xml.Attribute(XName.Get("event", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("event")).Value;
      foreach (var el in (xml.Element(XName.Get("param", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("param", "http://www.w3.org/2005/07/scxml")) : xml.Elements("param"))) {
        m_param.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Param(el));
      }
        if ((xml.Attribute(XName.Get("content", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("content")) != null) ((Raise)this).@content = (xml.Attribute(XName.Get("content", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("content")).Value;
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Raise") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Raise"));
        if (((Raise)this).@event != null) xml.Add(new XAttribute(XName.Get("event", "http://www.w3.org/2005/07/scxml"), ((Raise)this).@event.ToString()));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Param item in m_param) {
        xml.Add(item.ToXml("param", "scxml:Param", "http://www.w3.org/2005/07/scxml"));
      }
        if (((Raise)this).@content != null) xml.Add(new XAttribute(XName.Get("content", "http://www.w3.org/2005/07/scxml"), ((Raise)this).@content.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Raise", null, "");
    }
    public string _ClassName { get { return "Raise"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Raise"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Conditional_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Conditional
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    string @cond { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Conditional_class : Conditional
  {
    string Conditional.@cond { get; set; }
    public Conditional_class() {
    }
    public Conditional_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("cond", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("cond")) != null) ((Conditional)this).@cond = (xml.Attribute(XName.Get("cond", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("cond")).Value;
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Conditional") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Conditional"));
        if (((Conditional)this).@cond != null) xml.Add(new XAttribute(XName.Get("cond", "http://www.w3.org/2005/07/scxml"), ((Conditional)this).@cond.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Conditional", null, "");
    }
    public string _ClassName { get { return "Conditional"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Conditional"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.If_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface If
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.Conditional, global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent
  {
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.ElseIf> @elseif { get; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Else @else { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class If_class : If
  {
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.ElseIf> m_elseif = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.ElseIf>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.ElseIf> If.@elseif { [DebuggerStepThrough()] get { return m_elseif; } }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Else If.@else { get; set; }
    string global::@www.@w3.@org.@_2005.@_07.@scxml.Conditional.@cond { get; set; }
    private List<object> m_group = new List<object>();
    List<object> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@group { [DebuggerStepThrough()] get { return m_group; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.If> m_if = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.If>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.If> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@if { [DebuggerStepThrough()] get { return m_if; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log> m_log = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Log> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@log { [DebuggerStepThrough()] get { return m_log; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise> m_raise = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Raise> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@raise { [DebuggerStepThrough()] get { return m_raise; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send> m_send = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Send> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@send { [DebuggerStepThrough()] get { return m_send; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel> m_cancel = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@cancel { [DebuggerStepThrough()] get { return m_cancel; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign> m_assign = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Assign> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@assign { [DebuggerStepThrough()] get { return m_assign; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate> m_validate = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Validate> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@validate { [DebuggerStepThrough()] get { return m_validate; } }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> m_script = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Script> global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent.@script { [DebuggerStepThrough()] get { return m_script; } }
    public If_class() {










    }
    public If_class(XElement xml) : this() {
      foreach (var el in (xml.Element(XName.Get("elseif", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("elseif", "http://www.w3.org/2005/07/scxml")) : xml.Elements("elseif"))) {
        m_elseif.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.ElseIf(el));
      }
        if ((xml.Element(XName.Get("else", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("else")) != null) ((If)this).@else = new global::@www.@w3.@org.@_2005.@_07.@scxml.Else((xml.Element(XName.Get("else", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("else")));
        if ((xml.Attribute(XName.Get("cond", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("cond")) != null) ((If)this).@cond = (xml.Attribute(XName.Get("cond", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("cond")).Value;
      foreach (var att in (xml.Attribute(XName.Get("group", "http://www.w3.org/2005/07/scxml")) != null ? xml.Attributes(XName.Get("group", "http://www.w3.org/2005/07/scxml")) : xml.Attributes("group"))) {
        m_group.Add(att.Value);
      }
      foreach (var el in (xml.Element(XName.Get("if", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("if", "http://www.w3.org/2005/07/scxml")) : xml.Elements("if"))) {
        m_if.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.If(el));
      }
      foreach (var el in (xml.Element(XName.Get("log", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("log", "http://www.w3.org/2005/07/scxml")) : xml.Elements("log"))) {
        m_log.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Log(el));
      }
      foreach (var el in (xml.Element(XName.Get("raise", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("raise", "http://www.w3.org/2005/07/scxml")) : xml.Elements("raise"))) {
        m_raise.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Raise(el));
      }
      foreach (var el in (xml.Element(XName.Get("send", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("send", "http://www.w3.org/2005/07/scxml")) : xml.Elements("send"))) {
        m_send.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Send(el));
      }
      foreach (var el in (xml.Element(XName.Get("cancel", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("cancel", "http://www.w3.org/2005/07/scxml")) : xml.Elements("cancel"))) {
        m_cancel.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel(el));
      }
      foreach (var el in (xml.Element(XName.Get("assign", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("assign", "http://www.w3.org/2005/07/scxml")) : xml.Elements("assign"))) {
        m_assign.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Assign(el));
      }
      foreach (var el in (xml.Element(XName.Get("validate", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("validate", "http://www.w3.org/2005/07/scxml")) : xml.Elements("validate"))) {
        m_validate.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Validate(el));
      }
      foreach (var el in (xml.Element(XName.Get("script", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("script", "http://www.w3.org/2005/07/scxml")) : xml.Elements("script"))) {
        m_script.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Script(el));
      }
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:If") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:If"));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.ElseIf item in m_elseif) {
        xml.Add(item.ToXml("elseif", "scxml:ElseIf", "http://www.w3.org/2005/07/scxml"));
      }
        if (((If)this).@else != null) xml.Add(((If)this).@else.ToXml("else", "scxml:Else", "http://www.w3.org/2005/07/scxml"));
        if (((If)this).@cond != null) xml.Add(new XAttribute(XName.Get("cond", "http://www.w3.org/2005/07/scxml"), ((If)this).@cond.ToString()));
      foreach (object item in m_group) {
        xml.Add(new XAttribute(XName.Get("group", "http://www.w3.org/2005/07/scxml"), item.ToString()));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.If item in m_if) {
        xml.Add(item.ToXml("if", "scxml:If", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Log item in m_log) {
        xml.Add(item.ToXml("log", "scxml:Log", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Raise item in m_raise) {
        xml.Add(item.ToXml("raise", "scxml:Raise", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Send item in m_send) {
        xml.Add(item.ToXml("send", "scxml:Send", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Cancel item in m_cancel) {
        xml.Add(item.ToXml("cancel", "scxml:Cancel", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Assign item in m_assign) {
        xml.Add(item.ToXml("assign", "scxml:Assign", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Validate item in m_validate) {
        xml.Add(item.ToXml("validate", "scxml:Validate", "http://www.w3.org/2005/07/scxml"));
      }
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Script item in m_script) {
        xml.Add(item.ToXml("script", "scxml:Script", "http://www.w3.org/2005/07/scxml"));
      }
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("If", null, "");
    }
    public string _ClassName { get { return "If"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:If"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.ElseIf_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface ElseIf
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.Conditional
  {
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class ElseIf_class : ElseIf
  {
    string global::@www.@w3.@org.@_2005.@_07.@scxml.Conditional.@cond { get; set; }
    public ElseIf_class() {
    }
    public ElseIf_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("cond", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("cond")) != null) ((ElseIf)this).@cond = (xml.Attribute(XName.Get("cond", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("cond")).Value;
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:ElseIf") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:ElseIf"));
        if (((ElseIf)this).@cond != null) xml.Add(new XAttribute(XName.Get("cond", "http://www.w3.org/2005/07/scxml"), ((ElseIf)this).@cond.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("ElseIf", null, "");
    }
    public string _ClassName { get { return "ElseIf"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:ElseIf"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Else_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Else
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Else_class : Else
  {
    public Else_class() {
    }
    public Else_class(XElement xml) : this() {
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Else") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Else"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Else", null, "");
    }
    public string _ClassName { get { return "Else"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Else"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Log_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Log
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    string @label { get; set; }
    string @expr { get; set; }
    string @level { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Log_class : Log
  {
    string Log.@label { get; set; }
    string Log.@expr { get; set; }
    string Log.@level { get; set; }
    public Log_class() {
    }
    public Log_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("label", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("label")) != null) ((Log)this).@label = (xml.Attribute(XName.Get("label", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("label")).Value;
        if ((xml.Attribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("expr")) != null) ((Log)this).@expr = (xml.Attribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("expr")).Value;
        if ((xml.Attribute(XName.Get("level", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("level")) != null) ((Log)this).@level = (xml.Attribute(XName.Get("level", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("level")).Value;
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Log") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Log"));
        if (((Log)this).@label != null) xml.Add(new XAttribute(XName.Get("label", "http://www.w3.org/2005/07/scxml"), ((Log)this).@label.ToString()));
        if (((Log)this).@expr != null) xml.Add(new XAttribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml"), ((Log)this).@expr.ToString()));
        if (((Log)this).@level != null) xml.Add(new XAttribute(XName.Get("level", "http://www.w3.org/2005/07/scxml"), ((Log)this).@level.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Log", null, "");
    }
    public string _ClassName { get { return "Log"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Log"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Send_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Send
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.Donedata
  {
    string @event { get; set; }
    string @eventexpr { get; set; }
    string @target { get; set; }
    string @targetexpr { get; set; }
    string @type { get; set; }
    string @typeexpr { get; set; }
    string @id { get; set; }
    string @idlocation { get; set; }
    string @delay { get; set; }
    string @delayexpr { get; set; }
    string @namelist { get; set; }
    string @hints { get; set; }
    string @hintsexpr { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Send_class : Send
  {
    string Send.@event { get; set; }
    string Send.@eventexpr { get; set; }
    string Send.@target { get; set; }
    string Send.@targetexpr { get; set; }
    string Send.@type { get; set; }
    string Send.@typeexpr { get; set; }
    string Send.@id { get; set; }
    string Send.@idlocation { get; set; }
    string Send.@delay { get; set; }
    string Send.@delayexpr { get; set; }
    string Send.@namelist { get; set; }
    string Send.@hints { get; set; }
    string Send.@hintsexpr { get; set; }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Param> m_param = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Param>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Param> global::@www.@w3.@org.@_2005.@_07.@scxml.Donedata.@param { [DebuggerStepThrough()] get { return m_param; } }
    object global::@www.@w3.@org.@_2005.@_07.@scxml.Donedata.@content { get; set; }
    public Send_class() {

    }
    public Send_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("event", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("event")) != null) ((Send)this).@event = (xml.Attribute(XName.Get("event", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("event")).Value;
        if ((xml.Attribute(XName.Get("eventexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("eventexpr")) != null) ((Send)this).@eventexpr = (xml.Attribute(XName.Get("eventexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("eventexpr")).Value;
        if ((xml.Attribute(XName.Get("target", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("target")) != null) ((Send)this).@target = (xml.Attribute(XName.Get("target", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("target")).Value;
        if ((xml.Attribute(XName.Get("targetexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("targetexpr")) != null) ((Send)this).@targetexpr = (xml.Attribute(XName.Get("targetexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("targetexpr")).Value;
        if ((xml.Attribute(XName.Get("type", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("type")) != null) ((Send)this).@type = (xml.Attribute(XName.Get("type", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("type")).Value;
        if ((xml.Attribute(XName.Get("typeexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("typeexpr")) != null) ((Send)this).@typeexpr = (xml.Attribute(XName.Get("typeexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("typeexpr")).Value;
        if ((xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")) != null) ((Send)this).@id = (xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")).Value;
        if ((xml.Attribute(XName.Get("idlocation", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("idlocation")) != null) ((Send)this).@idlocation = (xml.Attribute(XName.Get("idlocation", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("idlocation")).Value;
        if ((xml.Attribute(XName.Get("delay", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("delay")) != null) ((Send)this).@delay = (xml.Attribute(XName.Get("delay", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("delay")).Value;
        if ((xml.Attribute(XName.Get("delayexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("delayexpr")) != null) ((Send)this).@delayexpr = (xml.Attribute(XName.Get("delayexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("delayexpr")).Value;
        if ((xml.Attribute(XName.Get("namelist", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("namelist")) != null) ((Send)this).@namelist = (xml.Attribute(XName.Get("namelist", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("namelist")).Value;
        if ((xml.Attribute(XName.Get("hints", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("hints")) != null) ((Send)this).@hints = (xml.Attribute(XName.Get("hints", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("hints")).Value;
        if ((xml.Attribute(XName.Get("hintsexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("hintsexpr")) != null) ((Send)this).@hintsexpr = (xml.Attribute(XName.Get("hintsexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("hintsexpr")).Value;
      foreach (var el in (xml.Element(XName.Get("param", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("param", "http://www.w3.org/2005/07/scxml")) : xml.Elements("param"))) {
        m_param.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Param(el));
      }
        if ((xml.Attribute(XName.Get("content", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("content")) != null) ((Send)this).@content = (xml.Attribute(XName.Get("content", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("content")).Value;
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Send") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Send"));
        if (((Send)this).@event != null) xml.Add(new XAttribute(XName.Get("event", "http://www.w3.org/2005/07/scxml"), ((Send)this).@event.ToString()));
        if (((Send)this).@eventexpr != null) xml.Add(new XAttribute(XName.Get("eventexpr", "http://www.w3.org/2005/07/scxml"), ((Send)this).@eventexpr.ToString()));
        if (((Send)this).@target != null) xml.Add(new XAttribute(XName.Get("target", "http://www.w3.org/2005/07/scxml"), ((Send)this).@target.ToString()));
        if (((Send)this).@targetexpr != null) xml.Add(new XAttribute(XName.Get("targetexpr", "http://www.w3.org/2005/07/scxml"), ((Send)this).@targetexpr.ToString()));
        if (((Send)this).@type != null) xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2005/07/scxml"), ((Send)this).@type.ToString()));
        if (((Send)this).@typeexpr != null) xml.Add(new XAttribute(XName.Get("typeexpr", "http://www.w3.org/2005/07/scxml"), ((Send)this).@typeexpr.ToString()));
        if (((Send)this).@id != null) xml.Add(new XAttribute(XName.Get("id", "http://www.w3.org/2005/07/scxml"), ((Send)this).@id.ToString()));
        if (((Send)this).@idlocation != null) xml.Add(new XAttribute(XName.Get("idlocation", "http://www.w3.org/2005/07/scxml"), ((Send)this).@idlocation.ToString()));
        if (((Send)this).@delay != null) xml.Add(new XAttribute(XName.Get("delay", "http://www.w3.org/2005/07/scxml"), ((Send)this).@delay.ToString()));
        if (((Send)this).@delayexpr != null) xml.Add(new XAttribute(XName.Get("delayexpr", "http://www.w3.org/2005/07/scxml"), ((Send)this).@delayexpr.ToString()));
        if (((Send)this).@namelist != null) xml.Add(new XAttribute(XName.Get("namelist", "http://www.w3.org/2005/07/scxml"), ((Send)this).@namelist.ToString()));
        if (((Send)this).@hints != null) xml.Add(new XAttribute(XName.Get("hints", "http://www.w3.org/2005/07/scxml"), ((Send)this).@hints.ToString()));
        if (((Send)this).@hintsexpr != null) xml.Add(new XAttribute(XName.Get("hintsexpr", "http://www.w3.org/2005/07/scxml"), ((Send)this).@hintsexpr.ToString()));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Param item in m_param) {
        xml.Add(item.ToXml("param", "scxml:Param", "http://www.w3.org/2005/07/scxml"));
      }
        if (((Send)this).@content != null) xml.Add(new XAttribute(XName.Get("content", "http://www.w3.org/2005/07/scxml"), ((Send)this).@content.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Send", null, "");
    }
    public string _ClassName { get { return "Send"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Send"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Cancel_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Cancel
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    string @sendid { get; set; }
    string @sendidexpr { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Cancel_class : Cancel
  {
    string Cancel.@sendid { get; set; }
    string Cancel.@sendidexpr { get; set; }
    public Cancel_class() {
    }
    public Cancel_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("sendid", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("sendid")) != null) ((Cancel)this).@sendid = (xml.Attribute(XName.Get("sendid", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("sendid")).Value;
        if ((xml.Attribute(XName.Get("sendidexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("sendidexpr")) != null) ((Cancel)this).@sendidexpr = (xml.Attribute(XName.Get("sendidexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("sendidexpr")).Value;
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Cancel") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Cancel"));
        if (((Cancel)this).@sendid != null) xml.Add(new XAttribute(XName.Get("sendid", "http://www.w3.org/2005/07/scxml"), ((Cancel)this).@sendid.ToString()));
        if (((Cancel)this).@sendidexpr != null) xml.Add(new XAttribute(XName.Get("sendidexpr", "http://www.w3.org/2005/07/scxml"), ((Cancel)this).@sendidexpr.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Cancel", null, "");
    }
    public string _ClassName { get { return "Cancel"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Cancel"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Invoke_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Invoke
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.Donedata
  {
    string @type { get; set; }
    string @typeexpr { get; set; }
    System.Uri @src { get; set; }
    string @srcexpr { get; set; }
    string @id { get; set; }
    string @idlocation { get; set; }
    string @namelist { get; set; }
    bool? @autoforward { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent @finalize { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Invoke_class : Invoke
  {
    string Invoke.@type { get; set; }
    string Invoke.@typeexpr { get; set; }
    System.Uri Invoke.@src { get; set; }
    string Invoke.@srcexpr { get; set; }
    string Invoke.@id { get; set; }
    string Invoke.@idlocation { get; set; }
    string Invoke.@namelist { get; set; }
    bool? Invoke.@autoforward { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent Invoke.@finalize { get; set; }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Param> m_param = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Param>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Param> global::@www.@w3.@org.@_2005.@_07.@scxml.Donedata.@param { [DebuggerStepThrough()] get { return m_param; } }
    object global::@www.@w3.@org.@_2005.@_07.@scxml.Donedata.@content { get; set; }
    public Invoke_class() {

    }
    public Invoke_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("type", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("type")) != null) ((Invoke)this).@type = (xml.Attribute(XName.Get("type", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("type")).Value;
        if ((xml.Attribute(XName.Get("typeexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("typeexpr")) != null) ((Invoke)this).@typeexpr = (xml.Attribute(XName.Get("typeexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("typeexpr")).Value;
        if ((xml.Attribute(XName.Get("src", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("src")) != null) ((Invoke)this).@src = new System.Uri((xml.Attribute(XName.Get("src", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("src")).Value);
        if ((xml.Attribute(XName.Get("srcexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("srcexpr")) != null) ((Invoke)this).@srcexpr = (xml.Attribute(XName.Get("srcexpr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("srcexpr")).Value;
        if ((xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")) != null) ((Invoke)this).@id = (xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")).Value;
        if ((xml.Attribute(XName.Get("idlocation", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("idlocation")) != null) ((Invoke)this).@idlocation = (xml.Attribute(XName.Get("idlocation", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("idlocation")).Value;
        if ((xml.Attribute(XName.Get("namelist", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("namelist")) != null) ((Invoke)this).@namelist = (xml.Attribute(XName.Get("namelist", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("namelist")).Value;
        if ((xml.Attribute(XName.Get("autoforward", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("autoforward")) != null) ((Invoke)this).@autoforward = ((xml.Attribute(XName.Get("autoforward", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("autoforward")).Value != "0");
        if ((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")) != null) 
        switch ((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")) == null ? string.Empty : (xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value) {
          case "scxml:Transition":
            if ((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")) != null) ((Invoke)this).@finalize = new global::@www.@w3.@org.@_2005.@_07.@scxml.Transition((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")));
            break;
          case "scxml:OnEntry":
            if ((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")) != null) ((Invoke)this).@finalize = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnEntry((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")));
            break;
          case "scxml:OnExit":
            if ((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")) != null) ((Invoke)this).@finalize = new global::@www.@w3.@org.@_2005.@_07.@scxml.OnExit((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")));
            break;
          case "scxml:If":
            if ((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")) != null) ((Invoke)this).@finalize = new global::@www.@w3.@org.@_2005.@_07.@scxml.If((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")));
            break;
          case "scxml:CondEventTransition":
            if ((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")) != null) ((Invoke)this).@finalize = new global::@www.@w3.@org.@_2005.@_07.@scxml.CondEventTransition((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")));
            break;
          case "":
            if ((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")) != null) ((Invoke)this).@finalize = new global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent((xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")));
            break;
          default:
            throw new NotImplementedException("An unknown type \"" + (xml.Element(XName.Get("finalize", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("finalize")).Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value + "\" derived from \"global::@www.@w3.@org.@_2005.@_07.@scxml.ExecutableContent\" was encountered being assigned to \"finalize\". This type is however not supported in this version of the interface. You may have to recompile the .NET interfaces or add an 'ReferencedBy' annotation to the ecore file if the type is not contained in the same model.");
        }
      foreach (var el in (xml.Element(XName.Get("param", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("param", "http://www.w3.org/2005/07/scxml")) : xml.Elements("param"))) {
        m_param.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Param(el));
      }
        if ((xml.Attribute(XName.Get("content", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("content")) != null) ((Invoke)this).@content = (xml.Attribute(XName.Get("content", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("content")).Value;
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Invoke") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Invoke"));
        if (((Invoke)this).@type != null) xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2005/07/scxml"), ((Invoke)this).@type.ToString()));
        if (((Invoke)this).@typeexpr != null) xml.Add(new XAttribute(XName.Get("typeexpr", "http://www.w3.org/2005/07/scxml"), ((Invoke)this).@typeexpr.ToString()));
        if (((Invoke)this).@src != null) xml.Add(new XAttribute(XName.Get("src", "http://www.w3.org/2005/07/scxml"), ((Invoke)this).@src.ToString()));
        if (((Invoke)this).@srcexpr != null) xml.Add(new XAttribute(XName.Get("srcexpr", "http://www.w3.org/2005/07/scxml"), ((Invoke)this).@srcexpr.ToString()));
        if (((Invoke)this).@id != null) xml.Add(new XAttribute(XName.Get("id", "http://www.w3.org/2005/07/scxml"), ((Invoke)this).@id.ToString()));
        if (((Invoke)this).@idlocation != null) xml.Add(new XAttribute(XName.Get("idlocation", "http://www.w3.org/2005/07/scxml"), ((Invoke)this).@idlocation.ToString()));
        if (((Invoke)this).@namelist != null) xml.Add(new XAttribute(XName.Get("namelist", "http://www.w3.org/2005/07/scxml"), ((Invoke)this).@namelist.ToString()));
        if (((Invoke)this).@autoforward != null) xml.Add(new XAttribute(XName.Get("autoforward", "http://www.w3.org/2005/07/scxml"), (((Invoke)this).@autoforward.Value ? "1" : "0")));
        if (((Invoke)this).@finalize != null) xml.Add(((Invoke)this).@finalize.ToXml("finalize", "scxml:ExecutableContent", "http://www.w3.org/2005/07/scxml"));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Param item in m_param) {
        xml.Add(item.ToXml("param", "scxml:Param", "http://www.w3.org/2005/07/scxml"));
      }
        if (((Invoke)this).@content != null) xml.Add(new XAttribute(XName.Get("content", "http://www.w3.org/2005/07/scxml"), ((Invoke)this).@content.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Invoke", null, "");
    }
    public string _ClassName { get { return "Invoke"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Invoke"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Data_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Data
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer
  {
    string @id { get; set; }
    System.Uri @src { get; set; }
    string @expr { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Data_class : Data
  {
    string Data.@id { get; set; }
    System.Uri Data.@src { get; set; }
    string Data.@expr { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    public Data_class() {
    }
    public Data_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")) != null) ((Data)this).@id = (xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")).Value;
        if ((xml.Attribute(XName.Get("src", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("src")) != null) ((Data)this).@src = new System.Uri((xml.Attribute(XName.Get("src", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("src")).Value);
        if ((xml.Attribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("expr")) != null) ((Data)this).@expr = (xml.Attribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("expr")).Value;
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((Data)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Data") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Data"));
        if (((Data)this).@id != null) xml.Add(new XAttribute(XName.Get("id", "http://www.w3.org/2005/07/scxml"), ((Data)this).@id.ToString()));
        if (((Data)this).@src != null) xml.Add(new XAttribute(XName.Get("src", "http://www.w3.org/2005/07/scxml"), ((Data)this).@src.ToString()));
        if (((Data)this).@expr != null) xml.Add(new XAttribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml"), ((Data)this).@expr.ToString()));
        if (((Data)this).@description != null) xml.Add(((Data)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Data", null, "");
    }
    public string _ClassName { get { return "Data"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Data"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.XData_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface XData
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.Data
  {
    object @object { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class XData_class : XData
  {
    object XData.@object { get; set; }
    string global::@www.@w3.@org.@_2005.@_07.@scxml.Data.@id { get; set; }
    System.Uri global::@www.@w3.@org.@_2005.@_07.@scxml.Data.@src { get; set; }
    string global::@www.@w3.@org.@_2005.@_07.@scxml.Data.@expr { get; set; }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    public XData_class() {
    }
    public XData_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("object", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("object")) != null) ((XData)this).@object = (xml.Attribute(XName.Get("object", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("object")).Value;
        if ((xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")) != null) ((XData)this).@id = (xml.Attribute(XName.Get("id", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("id")).Value;
        if ((xml.Attribute(XName.Get("src", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("src")) != null) ((XData)this).@src = new System.Uri((xml.Attribute(XName.Get("src", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("src")).Value);
        if ((xml.Attribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("expr")) != null) ((XData)this).@expr = (xml.Attribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("expr")).Value;
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((XData)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:XData") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:XData"));
        if (((XData)this).@object != null) xml.Add(new XAttribute(XName.Get("object", "http://www.w3.org/2005/07/scxml"), ((XData)this).@object.ToString()));
        if (((XData)this).@id != null) xml.Add(new XAttribute(XName.Get("id", "http://www.w3.org/2005/07/scxml"), ((XData)this).@id.ToString()));
        if (((XData)this).@src != null) xml.Add(new XAttribute(XName.Get("src", "http://www.w3.org/2005/07/scxml"), ((XData)this).@src.ToString()));
        if (((XData)this).@expr != null) xml.Add(new XAttribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml"), ((XData)this).@expr.ToString()));
        if (((XData)this).@description != null) xml.Add(((XData)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("XData", null, "");
    }
    public string _ClassName { get { return "XData"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:XData"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.XObject_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface XObject
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    string @nsUri { get; set; }
    string @classifierName { get; set; }
    object @type { get; set; }
    bool? @exchange { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class XObject_class : XObject
  {
    string XObject.@nsUri { get; set; }
    string XObject.@classifierName { get; set; }
    object XObject.@type { get; set; }
    bool? XObject.@exchange { get; set; }
    public XObject_class() {
    }
    public XObject_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("nsUri", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("nsUri")) != null) ((XObject)this).@nsUri = (xml.Attribute(XName.Get("nsUri", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("nsUri")).Value;
        if ((xml.Attribute(XName.Get("classifierName", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("classifierName")) != null) ((XObject)this).@classifierName = (xml.Attribute(XName.Get("classifierName", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("classifierName")).Value;
        if ((xml.Attribute(XName.Get("type", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("type")) != null) ((XObject)this).@type = (xml.Attribute(XName.Get("type", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("type")).Value;
        if ((xml.Attribute(XName.Get("exchange", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("exchange")) != null) ((XObject)this).@exchange = ((xml.Attribute(XName.Get("exchange", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("exchange")).Value != "0");
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:XObject") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:XObject"));
        if (((XObject)this).@nsUri != null) xml.Add(new XAttribute(XName.Get("nsUri", "http://www.w3.org/2005/07/scxml"), ((XObject)this).@nsUri.ToString()));
        if (((XObject)this).@classifierName != null) xml.Add(new XAttribute(XName.Get("classifierName", "http://www.w3.org/2005/07/scxml"), ((XObject)this).@classifierName.ToString()));
        if (((XObject)this).@type != null) xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2005/07/scxml"), ((XObject)this).@type.ToString()));
        if (((XObject)this).@exchange != null) xml.Add(new XAttribute(XName.Get("exchange", "http://www.w3.org/2005/07/scxml"), (((XObject)this).@exchange.Value ? "1" : "0")));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("XObject", null, "");
    }
    public string _ClassName { get { return "XObject"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:XObject"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Datamodel_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Datamodel
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer
  {
    System.Uri @schema { get; set; }
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Data> @data { get; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Datamodel_class : Datamodel
  {
    System.Uri Datamodel.@schema { get; set; }
    private List<global::@www.@w3.@org.@_2005.@_07.@scxml.Data> m_data = new List<global::@www.@w3.@org.@_2005.@_07.@scxml.Data>();
    List<global::@www.@w3.@org.@_2005.@_07.@scxml.Data> Datamodel.@data { [DebuggerStepThrough()] get { return m_data; } }
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description global::@www.@w3.@org.@_2005.@_07.@scxml.DescriptionContainer.@description { get; set; }
    public Datamodel_class() {

    }
    public Datamodel_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("schema", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("schema")) != null) ((Datamodel)this).@schema = new System.Uri((xml.Attribute(XName.Get("schema", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("schema")).Value);
      foreach (var el in (xml.Element(XName.Get("data", "http://www.w3.org/2005/07/scxml")) != null ? xml.Elements(XName.Get("data", "http://www.w3.org/2005/07/scxml")) : xml.Elements("data"))) {
        switch (el.Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")) == null ? string.Empty : el.Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value) {
          case "scxml:XData":
            m_data.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.XData(el));
            break;
          case "":
            m_data.Add(new global::@www.@w3.@org.@_2005.@_07.@scxml.Data(el));
            break;
          default:
            throw new NotImplementedException("An unknown type \"" + el.Attribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance")).Value + "\" derived from \"global::@www.@w3.@org.@_2005.@_07.@scxml.Data\" was encountered being assigned to \"data\". This type is however not supported in this version of the interface. You may have to recompile the .NET interfaces or add an 'ReferencedBy' annotation to the ecore file if the type is not contained in the same model.");
        }
      }
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((Datamodel)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Datamodel") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Datamodel"));
        if (((Datamodel)this).@schema != null) xml.Add(new XAttribute(XName.Get("schema", "http://www.w3.org/2005/07/scxml"), ((Datamodel)this).@schema.ToString()));
      foreach (global::@www.@w3.@org.@_2005.@_07.@scxml.Data item in m_data) {
        xml.Add(item.ToXml("data", "scxml:Data", "http://www.w3.org/2005/07/scxml"));
      }
        if (((Datamodel)this).@description != null) xml.Add(((Datamodel)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Datamodel", null, "");
    }
    public string _ClassName { get { return "Datamodel"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Datamodel"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.DatamodelContainer_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface DatamodelContainer
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.IAdaptable
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.Datamodel @datamodel { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class DatamodelContainer_class : DatamodelContainer
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.Datamodel DatamodelContainer.@datamodel { get; set; }
    public DatamodelContainer_class() {
    }
    public DatamodelContainer_class(XElement xml) : this() {
        if ((xml.Element(XName.Get("datamodel", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("datamodel")) != null) ((DatamodelContainer)this).@datamodel = new global::@www.@w3.@org.@_2005.@_07.@scxml.Datamodel((xml.Element(XName.Get("datamodel", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("datamodel")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:DatamodelContainer") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:DatamodelContainer"));
        if (((DatamodelContainer)this).@datamodel != null) xml.Add(((DatamodelContainer)this).@datamodel.ToXml("datamodel", "scxml:Datamodel", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("DatamodelContainer", null, "");
    }
    public string _ClassName { get { return "DatamodelContainer"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:DatamodelContainer"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.DescriptionContainer_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface DescriptionContainer
    : global::www.dfki.de.iui.mmds.IEcoreBase, global::@www.@w3.@org.@_2005.@_07.@scxml.IAdaptable
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description @description { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class DescriptionContainer_class : DescriptionContainer
  {
    global::@www.@w3.@org.@_2005.@_07.@scxml.Description DescriptionContainer.@description { get; set; }
    public DescriptionContainer_class() {
    }
    public DescriptionContainer_class(XElement xml) : this() {
        if ((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")) != null) ((DescriptionContainer)this).@description = new global::@www.@w3.@org.@_2005.@_07.@scxml.Description((xml.Element(XName.Get("description", "http://www.w3.org/2005/07/scxml")) ?? xml.Element("description")));
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:DescriptionContainer") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:DescriptionContainer"));
        if (((DescriptionContainer)this).@description != null) xml.Add(((DescriptionContainer)this).@description.ToXml("description", "scxml:Description", "http://www.w3.org/2005/07/scxml"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("DescriptionContainer", null, "");
    }
    public string _ClassName { get { return "DescriptionContainer"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:DescriptionContainer"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Description_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Description
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    string @value { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Description_class : Description
  {
    string Description.@value { get; set; }
    public Description_class() {
    }
    public Description_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("value", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("value")) != null) ((Description)this).@value = (xml.Attribute(XName.Get("value", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("value")).Value;
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Description") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Description"));
        if (((Description)this).@value != null) xml.Add(new XAttribute(XName.Get("value", "http://www.w3.org/2005/07/scxml"), ((Description)this).@value.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Description", null, "");
    }
    public string _ClassName { get { return "Description"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Description"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Assign_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Assign
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    string @location { get; set; }
    string @expr { get; set; }
    string @name { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Assign_class : Assign
  {
    string Assign.@location { get; set; }
    string Assign.@expr { get; set; }
    string Assign.@name { get; set; }
    public Assign_class() {
    }
    public Assign_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("location", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("location")) != null) ((Assign)this).@location = (xml.Attribute(XName.Get("location", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("location")).Value;
        if ((xml.Attribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("expr")) != null) ((Assign)this).@expr = (xml.Attribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("expr")).Value;
        if ((xml.Attribute(XName.Get("name", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("name")) != null) ((Assign)this).@name = (xml.Attribute(XName.Get("name", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("name")).Value;
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Assign") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Assign"));
        if (((Assign)this).@location != null) xml.Add(new XAttribute(XName.Get("location", "http://www.w3.org/2005/07/scxml"), ((Assign)this).@location.ToString()));
        if (((Assign)this).@expr != null) xml.Add(new XAttribute(XName.Get("expr", "http://www.w3.org/2005/07/scxml"), ((Assign)this).@expr.ToString()));
        if (((Assign)this).@name != null) xml.Add(new XAttribute(XName.Get("name", "http://www.w3.org/2005/07/scxml"), ((Assign)this).@name.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Assign", null, "");
    }
    public string _ClassName { get { return "Assign"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Assign"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.Validate_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface Validate
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
    string @location { get; set; }
    System.Uri @schema { get; set; }
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class Validate_class : Validate
  {
    string Validate.@location { get; set; }
    System.Uri Validate.@schema { get; set; }
    public Validate_class() {
    }
    public Validate_class(XElement xml) : this() {
        if ((xml.Attribute(XName.Get("location", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("location")) != null) ((Validate)this).@location = (xml.Attribute(XName.Get("location", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("location")).Value;
        if ((xml.Attribute(XName.Get("schema", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("schema")) != null) ((Validate)this).@schema = new System.Uri((xml.Attribute(XName.Get("schema", "http://www.w3.org/2005/07/scxml")) ?? xml.Attribute("schema")).Value);
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:Validate") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:Validate"));
        if (((Validate)this).@location != null) xml.Add(new XAttribute(XName.Get("location", "http://www.w3.org/2005/07/scxml"), ((Validate)this).@location.ToString()));
        if (((Validate)this).@schema != null) xml.Add(new XAttribute(XName.Get("schema", "http://www.w3.org/2005/07/scxml"), ((Validate)this).@schema.ToString()));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("Validate", null, "");
    }
    public string _ClassName { get { return "Validate"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:Validate"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  [CoClass(typeof(CoClasses.IAdaptable_class)), Guid("00000000-0000-0000-0000-000000000000"), ComImport()]
  public interface IAdaptable
    : global::www.dfki.de.iui.mmds.IEcoreBase
  {
  }

  namespace CoClasses {
  [EditorBrowsable(EditorBrowsableState.Never)]
  public sealed class IAdaptable_class : IAdaptable
  {
    public IAdaptable_class() {
    }
    public IAdaptable_class(XElement xml) : this() {
    }
    public XElement ToXml(string name, string baseType, string ns) {
      if (ns == null) ns = string.Empty;
      XElement xml = new XElement(XName.Get(name, ns));
      if (!string.IsNullOrEmpty(baseType) && baseType != "scxml:IAdaptable") xml.Add(new XAttribute(XName.Get("type", "http://www.w3.org/2001/XMLSchema-instance"), "scxml:IAdaptable"));
      return xml;
    }
    public XElement ToXml() {
      return this.ToXml("IAdaptable", null, "");
    }
    public string _ClassName { get { return "IAdaptable"; } }
    public string _ClassNameWithNamespacePrefix { get { return "scxml:IAdaptable"; } }
    public string _NamespaceUri { get { return "http://www.w3.org/2005/07/scxml"; } }

  }
  }
  public enum AdapterToken {
    @DESCRIPTION,
    @DATAMODEL = 1,
  }
  public struct SJavaClass {
    public object Value;
  }
}
