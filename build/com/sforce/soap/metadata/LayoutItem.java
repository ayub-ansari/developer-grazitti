package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class LayoutItem implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public LayoutItem() {}

    /**
     * element : analyticsCloudComponent of type {http://soap.sforce.com/2006/04/metadata}AnalyticsCloudComponentLayoutItem
     * java type: com.sforce.soap.metadata.AnalyticsCloudComponentLayoutItem
     */
    private static final com.sforce.ws.bind.TypeInfo analyticsCloudComponent__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","analyticsCloudComponent","http://soap.sforce.com/2006/04/metadata","AnalyticsCloudComponentLayoutItem",0,1,true);

    private boolean analyticsCloudComponent__is_set = false;

    private com.sforce.soap.metadata.AnalyticsCloudComponentLayoutItem analyticsCloudComponent;

    public com.sforce.soap.metadata.AnalyticsCloudComponentLayoutItem getAnalyticsCloudComponent() {
      return analyticsCloudComponent;
    }

    public void setAnalyticsCloudComponent(com.sforce.soap.metadata.AnalyticsCloudComponentLayoutItem analyticsCloudComponent) {
      this.analyticsCloudComponent = analyticsCloudComponent;
      analyticsCloudComponent__is_set = true;
    }

    protected void setAnalyticsCloudComponent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, analyticsCloudComponent__typeInfo)) {
        setAnalyticsCloudComponent((com.sforce.soap.metadata.AnalyticsCloudComponentLayoutItem)__typeMapper.readObject(__in, analyticsCloudComponent__typeInfo, com.sforce.soap.metadata.AnalyticsCloudComponentLayoutItem.class));
      }
    }

    /**
     * element : behavior of type {http://soap.sforce.com/2006/04/metadata}UiBehavior
     * java type: com.sforce.soap.metadata.UiBehavior
     */
    private static final com.sforce.ws.bind.TypeInfo behavior__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","behavior","http://soap.sforce.com/2006/04/metadata","UiBehavior",0,1,true);

    private boolean behavior__is_set = false;

    private com.sforce.soap.metadata.UiBehavior behavior;

    public com.sforce.soap.metadata.UiBehavior getBehavior() {
      return behavior;
    }

    public void setBehavior(com.sforce.soap.metadata.UiBehavior behavior) {
      this.behavior = behavior;
      behavior__is_set = true;
    }

    protected void setBehavior(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, behavior__typeInfo)) {
        setBehavior((com.sforce.soap.metadata.UiBehavior)__typeMapper.readObject(__in, behavior__typeInfo, com.sforce.soap.metadata.UiBehavior.class));
      }
    }

    /**
     * element : canvas of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo canvas__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","canvas","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean canvas__is_set = false;

    private java.lang.String canvas;

    public java.lang.String getCanvas() {
      return canvas;
    }

    public void setCanvas(java.lang.String canvas) {
      this.canvas = canvas;
      canvas__is_set = true;
    }

    protected void setCanvas(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, canvas__typeInfo)) {
        setCanvas(__typeMapper.readString(__in, canvas__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : component of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo component__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","component","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean component__is_set = false;

    private java.lang.String component;

    public java.lang.String getComponent() {
      return component;
    }

    public void setComponent(java.lang.String component) {
      this.component = component;
      component__is_set = true;
    }

    protected void setComponent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, component__typeInfo)) {
        setComponent(__typeMapper.readString(__in, component__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : customLink of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo customLink__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","customLink","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean customLink__is_set = false;

    private java.lang.String customLink;

    public java.lang.String getCustomLink() {
      return customLink;
    }

    public void setCustomLink(java.lang.String customLink) {
      this.customLink = customLink;
      customLink__is_set = true;
    }

    protected void setCustomLink(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, customLink__typeInfo)) {
        setCustomLink(__typeMapper.readString(__in, customLink__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : emptySpace of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo emptySpace__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","emptySpace","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean emptySpace__is_set = false;

    private boolean emptySpace;

    public boolean getEmptySpace() {
      return emptySpace;
    }

    public boolean isEmptySpace() {
      return emptySpace;
    }

    public void setEmptySpace(boolean emptySpace) {
      this.emptySpace = emptySpace;
      emptySpace__is_set = true;
    }

    protected void setEmptySpace(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, emptySpace__typeInfo)) {
        setEmptySpace(__typeMapper.readBoolean(__in, emptySpace__typeInfo, boolean.class));
      }
    }

    /**
     * element : field of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo field__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","field","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean field__is_set = false;

    private java.lang.String field;

    public java.lang.String getField() {
      return field;
    }

    public void setField(java.lang.String field) {
      this.field = field;
      field__is_set = true;
    }

    protected void setField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, field__typeInfo)) {
        setField(__typeMapper.readString(__in, field__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : height of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo height__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","height","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean height__is_set = false;

    private int height;

    public int getHeight() {
      return height;
    }

    public void setHeight(int height) {
      this.height = height;
      height__is_set = true;
    }

    protected void setHeight(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, height__typeInfo)) {
        setHeight((int)__typeMapper.readInt(__in, height__typeInfo, int.class));
      }
    }

    /**
     * element : page of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo page__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","page","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean page__is_set = false;

    private java.lang.String page;

    public java.lang.String getPage() {
      return page;
    }

    public void setPage(java.lang.String page) {
      this.page = page;
      page__is_set = true;
    }

    protected void setPage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, page__typeInfo)) {
        setPage(__typeMapper.readString(__in, page__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : reportChartComponent of type {http://soap.sforce.com/2006/04/metadata}ReportChartComponentLayoutItem
     * java type: com.sforce.soap.metadata.ReportChartComponentLayoutItem
     */
    private static final com.sforce.ws.bind.TypeInfo reportChartComponent__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","reportChartComponent","http://soap.sforce.com/2006/04/metadata","ReportChartComponentLayoutItem",0,1,true);

    private boolean reportChartComponent__is_set = false;

    private com.sforce.soap.metadata.ReportChartComponentLayoutItem reportChartComponent;

    public com.sforce.soap.metadata.ReportChartComponentLayoutItem getReportChartComponent() {
      return reportChartComponent;
    }

    public void setReportChartComponent(com.sforce.soap.metadata.ReportChartComponentLayoutItem reportChartComponent) {
      this.reportChartComponent = reportChartComponent;
      reportChartComponent__is_set = true;
    }

    protected void setReportChartComponent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, reportChartComponent__typeInfo)) {
        setReportChartComponent((com.sforce.soap.metadata.ReportChartComponentLayoutItem)__typeMapper.readObject(__in, reportChartComponent__typeInfo, com.sforce.soap.metadata.ReportChartComponentLayoutItem.class));
      }
    }

    /**
     * element : scontrol of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo scontrol__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","scontrol","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean scontrol__is_set = false;

    private java.lang.String scontrol;

    public java.lang.String getScontrol() {
      return scontrol;
    }

    public void setScontrol(java.lang.String scontrol) {
      this.scontrol = scontrol;
      scontrol__is_set = true;
    }

    protected void setScontrol(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, scontrol__typeInfo)) {
        setScontrol(__typeMapper.readString(__in, scontrol__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : showLabel of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo showLabel__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","showLabel","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean showLabel__is_set = false;

    private boolean showLabel;

    public boolean getShowLabel() {
      return showLabel;
    }

    public boolean isShowLabel() {
      return showLabel;
    }

    public void setShowLabel(boolean showLabel) {
      this.showLabel = showLabel;
      showLabel__is_set = true;
    }

    protected void setShowLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, showLabel__typeInfo)) {
        setShowLabel(__typeMapper.readBoolean(__in, showLabel__typeInfo, boolean.class));
      }
    }

    /**
     * element : showScrollbars of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo showScrollbars__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","showScrollbars","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean showScrollbars__is_set = false;

    private boolean showScrollbars;

    public boolean getShowScrollbars() {
      return showScrollbars;
    }

    public boolean isShowScrollbars() {
      return showScrollbars;
    }

    public void setShowScrollbars(boolean showScrollbars) {
      this.showScrollbars = showScrollbars;
      showScrollbars__is_set = true;
    }

    protected void setShowScrollbars(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, showScrollbars__typeInfo)) {
        setShowScrollbars(__typeMapper.readBoolean(__in, showScrollbars__typeInfo, boolean.class));
      }
    }

    /**
     * element : width of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo width__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","width","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean width__is_set = false;

    private java.lang.String width;

    public java.lang.String getWidth() {
      return width;
    }

    public void setWidth(java.lang.String width) {
      this.width = width;
      width__is_set = true;
    }

    protected void setWidth(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, width__typeInfo)) {
        setWidth(__typeMapper.readString(__in, width__typeInfo, java.lang.String.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       __typeMapper.writeObject(__out, analyticsCloudComponent__typeInfo, analyticsCloudComponent, analyticsCloudComponent__is_set);
       __typeMapper.writeObject(__out, behavior__typeInfo, behavior, behavior__is_set);
       __typeMapper.writeString(__out, canvas__typeInfo, canvas, canvas__is_set);
       __typeMapper.writeString(__out, component__typeInfo, component, component__is_set);
       __typeMapper.writeString(__out, customLink__typeInfo, customLink, customLink__is_set);
       __typeMapper.writeBoolean(__out, emptySpace__typeInfo, emptySpace, emptySpace__is_set);
       __typeMapper.writeString(__out, field__typeInfo, field, field__is_set);
       __typeMapper.writeInt(__out, height__typeInfo, height, height__is_set);
       __typeMapper.writeString(__out, page__typeInfo, page, page__is_set);
       __typeMapper.writeObject(__out, reportChartComponent__typeInfo, reportChartComponent, reportChartComponent__is_set);
       __typeMapper.writeString(__out, scontrol__typeInfo, scontrol, scontrol__is_set);
       __typeMapper.writeBoolean(__out, showLabel__typeInfo, showLabel, showLabel__is_set);
       __typeMapper.writeBoolean(__out, showScrollbars__typeInfo, showScrollbars, showScrollbars__is_set);
       __typeMapper.writeString(__out, width__typeInfo, width, width__is_set);
    }

    @Override
    public void load(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __typeMapper.consumeStartTag(__in);
      loadFields(__in, __typeMapper);
      __typeMapper.consumeEndTag(__in);
    }

    protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
        setAnalyticsCloudComponent(__in, __typeMapper);
        setBehavior(__in, __typeMapper);
        setCanvas(__in, __typeMapper);
        setComponent(__in, __typeMapper);
        setCustomLink(__in, __typeMapper);
        setEmptySpace(__in, __typeMapper);
        setField(__in, __typeMapper);
        setHeight(__in, __typeMapper);
        setPage(__in, __typeMapper);
        setReportChartComponent(__in, __typeMapper);
        setScontrol(__in, __typeMapper);
        setShowLabel(__in, __typeMapper);
        setShowScrollbars(__in, __typeMapper);
        setWidth(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[LayoutItem ");
      sb.append(" analyticsCloudComponent='").append(com.sforce.ws.util.Verbose.toString(analyticsCloudComponent)).append("'\n");
      sb.append(" behavior='").append(com.sforce.ws.util.Verbose.toString(behavior)).append("'\n");
      sb.append(" canvas='").append(com.sforce.ws.util.Verbose.toString(canvas)).append("'\n");
      sb.append(" component='").append(com.sforce.ws.util.Verbose.toString(component)).append("'\n");
      sb.append(" customLink='").append(com.sforce.ws.util.Verbose.toString(customLink)).append("'\n");
      sb.append(" emptySpace='").append(com.sforce.ws.util.Verbose.toString(emptySpace)).append("'\n");
      sb.append(" field='").append(com.sforce.ws.util.Verbose.toString(field)).append("'\n");
      sb.append(" height='").append(com.sforce.ws.util.Verbose.toString(height)).append("'\n");
      sb.append(" page='").append(com.sforce.ws.util.Verbose.toString(page)).append("'\n");
      sb.append(" reportChartComponent='").append(com.sforce.ws.util.Verbose.toString(reportChartComponent)).append("'\n");
      sb.append(" scontrol='").append(com.sforce.ws.util.Verbose.toString(scontrol)).append("'\n");
      sb.append(" showLabel='").append(com.sforce.ws.util.Verbose.toString(showLabel)).append("'\n");
      sb.append(" showScrollbars='").append(com.sforce.ws.util.Verbose.toString(showScrollbars)).append("'\n");
      sb.append(" width='").append(com.sforce.ws.util.Verbose.toString(width)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
