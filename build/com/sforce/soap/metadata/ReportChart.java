package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ReportChart implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ReportChart() {}

    /**
     * element : backgroundColor1 of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo backgroundColor1__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","backgroundColor1","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean backgroundColor1__is_set = false;

    private java.lang.String backgroundColor1;

    public java.lang.String getBackgroundColor1() {
      return backgroundColor1;
    }

    public void setBackgroundColor1(java.lang.String backgroundColor1) {
      this.backgroundColor1 = backgroundColor1;
      backgroundColor1__is_set = true;
    }

    protected void setBackgroundColor1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, backgroundColor1__typeInfo)) {
        setBackgroundColor1(__typeMapper.readString(__in, backgroundColor1__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : backgroundColor2 of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo backgroundColor2__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","backgroundColor2","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean backgroundColor2__is_set = false;

    private java.lang.String backgroundColor2;

    public java.lang.String getBackgroundColor2() {
      return backgroundColor2;
    }

    public void setBackgroundColor2(java.lang.String backgroundColor2) {
      this.backgroundColor2 = backgroundColor2;
      backgroundColor2__is_set = true;
    }

    protected void setBackgroundColor2(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, backgroundColor2__typeInfo)) {
        setBackgroundColor2(__typeMapper.readString(__in, backgroundColor2__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : backgroundFadeDir of type {http://soap.sforce.com/2006/04/metadata}ChartBackgroundDirection
     * java type: com.sforce.soap.metadata.ChartBackgroundDirection
     */
    private static final com.sforce.ws.bind.TypeInfo backgroundFadeDir__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","backgroundFadeDir","http://soap.sforce.com/2006/04/metadata","ChartBackgroundDirection",0,1,true);

    private boolean backgroundFadeDir__is_set = false;

    private com.sforce.soap.metadata.ChartBackgroundDirection backgroundFadeDir;

    public com.sforce.soap.metadata.ChartBackgroundDirection getBackgroundFadeDir() {
      return backgroundFadeDir;
    }

    public void setBackgroundFadeDir(com.sforce.soap.metadata.ChartBackgroundDirection backgroundFadeDir) {
      this.backgroundFadeDir = backgroundFadeDir;
      backgroundFadeDir__is_set = true;
    }

    protected void setBackgroundFadeDir(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, backgroundFadeDir__typeInfo)) {
        setBackgroundFadeDir((com.sforce.soap.metadata.ChartBackgroundDirection)__typeMapper.readObject(__in, backgroundFadeDir__typeInfo, com.sforce.soap.metadata.ChartBackgroundDirection.class));
      }
    }

    /**
     * element : chartSummaries of type {http://soap.sforce.com/2006/04/metadata}ChartSummary
     * java type: com.sforce.soap.metadata.ChartSummary[]
     */
    private static final com.sforce.ws.bind.TypeInfo chartSummaries__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","chartSummaries","http://soap.sforce.com/2006/04/metadata","ChartSummary",0,-1,true);

    private boolean chartSummaries__is_set = false;

    private com.sforce.soap.metadata.ChartSummary[] chartSummaries = new com.sforce.soap.metadata.ChartSummary[0];

    public com.sforce.soap.metadata.ChartSummary[] getChartSummaries() {
      return chartSummaries;
    }

    public void setChartSummaries(com.sforce.soap.metadata.ChartSummary[] chartSummaries) {
      this.chartSummaries = chartSummaries;
      chartSummaries__is_set = true;
    }

    protected void setChartSummaries(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, chartSummaries__typeInfo)) {
        setChartSummaries((com.sforce.soap.metadata.ChartSummary[])__typeMapper.readObject(__in, chartSummaries__typeInfo, com.sforce.soap.metadata.ChartSummary[].class));
      }
    }

    /**
     * element : chartType of type {http://soap.sforce.com/2006/04/metadata}ChartType
     * java type: com.sforce.soap.metadata.ChartType
     */
    private static final com.sforce.ws.bind.TypeInfo chartType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","chartType","http://soap.sforce.com/2006/04/metadata","ChartType",1,1,true);

    private boolean chartType__is_set = false;

    private com.sforce.soap.metadata.ChartType chartType;

    public com.sforce.soap.metadata.ChartType getChartType() {
      return chartType;
    }

    public void setChartType(com.sforce.soap.metadata.ChartType chartType) {
      this.chartType = chartType;
      chartType__is_set = true;
    }

    protected void setChartType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, chartType__typeInfo)) {
        setChartType((com.sforce.soap.metadata.ChartType)__typeMapper.readObject(__in, chartType__typeInfo, com.sforce.soap.metadata.ChartType.class));
      }
    }

    /**
     * element : enableHoverLabels of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo enableHoverLabels__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","enableHoverLabels","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean enableHoverLabels__is_set = false;

    private boolean enableHoverLabels;

    public boolean getEnableHoverLabels() {
      return enableHoverLabels;
    }

    public boolean isEnableHoverLabels() {
      return enableHoverLabels;
    }

    public void setEnableHoverLabels(boolean enableHoverLabels) {
      this.enableHoverLabels = enableHoverLabels;
      enableHoverLabels__is_set = true;
    }

    protected void setEnableHoverLabels(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, enableHoverLabels__typeInfo)) {
        setEnableHoverLabels(__typeMapper.readBoolean(__in, enableHoverLabels__typeInfo, boolean.class));
      }
    }

    /**
     * element : expandOthers of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo expandOthers__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","expandOthers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean expandOthers__is_set = false;

    private boolean expandOthers;

    public boolean getExpandOthers() {
      return expandOthers;
    }

    public boolean isExpandOthers() {
      return expandOthers;
    }

    public void setExpandOthers(boolean expandOthers) {
      this.expandOthers = expandOthers;
      expandOthers__is_set = true;
    }

    protected void setExpandOthers(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, expandOthers__typeInfo)) {
        setExpandOthers(__typeMapper.readBoolean(__in, expandOthers__typeInfo, boolean.class));
      }
    }

    /**
     * element : groupingColumn of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo groupingColumn__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","groupingColumn","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean groupingColumn__is_set = false;

    private java.lang.String groupingColumn;

    public java.lang.String getGroupingColumn() {
      return groupingColumn;
    }

    public void setGroupingColumn(java.lang.String groupingColumn) {
      this.groupingColumn = groupingColumn;
      groupingColumn__is_set = true;
    }

    protected void setGroupingColumn(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, groupingColumn__typeInfo)) {
        setGroupingColumn(__typeMapper.readString(__in, groupingColumn__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : legendPosition of type {http://soap.sforce.com/2006/04/metadata}ChartLegendPosition
     * java type: com.sforce.soap.metadata.ChartLegendPosition
     */
    private static final com.sforce.ws.bind.TypeInfo legendPosition__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","legendPosition","http://soap.sforce.com/2006/04/metadata","ChartLegendPosition",0,1,true);

    private boolean legendPosition__is_set = false;

    private com.sforce.soap.metadata.ChartLegendPosition legendPosition;

    public com.sforce.soap.metadata.ChartLegendPosition getLegendPosition() {
      return legendPosition;
    }

    public void setLegendPosition(com.sforce.soap.metadata.ChartLegendPosition legendPosition) {
      this.legendPosition = legendPosition;
      legendPosition__is_set = true;
    }

    protected void setLegendPosition(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, legendPosition__typeInfo)) {
        setLegendPosition((com.sforce.soap.metadata.ChartLegendPosition)__typeMapper.readObject(__in, legendPosition__typeInfo, com.sforce.soap.metadata.ChartLegendPosition.class));
      }
    }

    /**
     * element : location of type {http://soap.sforce.com/2006/04/metadata}ChartPosition
     * java type: com.sforce.soap.metadata.ChartPosition
     */
    private static final com.sforce.ws.bind.TypeInfo location__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","location","http://soap.sforce.com/2006/04/metadata","ChartPosition",0,1,true);

    private boolean location__is_set = false;

    private com.sforce.soap.metadata.ChartPosition location;

    public com.sforce.soap.metadata.ChartPosition getLocation() {
      return location;
    }

    public void setLocation(com.sforce.soap.metadata.ChartPosition location) {
      this.location = location;
      location__is_set = true;
    }

    protected void setLocation(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, location__typeInfo)) {
        setLocation((com.sforce.soap.metadata.ChartPosition)__typeMapper.readObject(__in, location__typeInfo, com.sforce.soap.metadata.ChartPosition.class));
      }
    }

    /**
     * element : secondaryGroupingColumn of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo secondaryGroupingColumn__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","secondaryGroupingColumn","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean secondaryGroupingColumn__is_set = false;

    private java.lang.String secondaryGroupingColumn;

    public java.lang.String getSecondaryGroupingColumn() {
      return secondaryGroupingColumn;
    }

    public void setSecondaryGroupingColumn(java.lang.String secondaryGroupingColumn) {
      this.secondaryGroupingColumn = secondaryGroupingColumn;
      secondaryGroupingColumn__is_set = true;
    }

    protected void setSecondaryGroupingColumn(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, secondaryGroupingColumn__typeInfo)) {
        setSecondaryGroupingColumn(__typeMapper.readString(__in, secondaryGroupingColumn__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : showAxisLabels of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo showAxisLabels__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","showAxisLabels","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean showAxisLabels__is_set = false;

    private boolean showAxisLabels;

    public boolean getShowAxisLabels() {
      return showAxisLabels;
    }

    public boolean isShowAxisLabels() {
      return showAxisLabels;
    }

    public void setShowAxisLabels(boolean showAxisLabels) {
      this.showAxisLabels = showAxisLabels;
      showAxisLabels__is_set = true;
    }

    protected void setShowAxisLabels(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, showAxisLabels__typeInfo)) {
        setShowAxisLabels(__typeMapper.readBoolean(__in, showAxisLabels__typeInfo, boolean.class));
      }
    }

    /**
     * element : showPercentage of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo showPercentage__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","showPercentage","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean showPercentage__is_set = false;

    private boolean showPercentage;

    public boolean getShowPercentage() {
      return showPercentage;
    }

    public boolean isShowPercentage() {
      return showPercentage;
    }

    public void setShowPercentage(boolean showPercentage) {
      this.showPercentage = showPercentage;
      showPercentage__is_set = true;
    }

    protected void setShowPercentage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, showPercentage__typeInfo)) {
        setShowPercentage(__typeMapper.readBoolean(__in, showPercentage__typeInfo, boolean.class));
      }
    }

    /**
     * element : showTotal of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo showTotal__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","showTotal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean showTotal__is_set = false;

    private boolean showTotal;

    public boolean getShowTotal() {
      return showTotal;
    }

    public boolean isShowTotal() {
      return showTotal;
    }

    public void setShowTotal(boolean showTotal) {
      this.showTotal = showTotal;
      showTotal__is_set = true;
    }

    protected void setShowTotal(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, showTotal__typeInfo)) {
        setShowTotal(__typeMapper.readBoolean(__in, showTotal__typeInfo, boolean.class));
      }
    }

    /**
     * element : showValues of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo showValues__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","showValues","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean showValues__is_set = false;

    private boolean showValues;

    public boolean getShowValues() {
      return showValues;
    }

    public boolean isShowValues() {
      return showValues;
    }

    public void setShowValues(boolean showValues) {
      this.showValues = showValues;
      showValues__is_set = true;
    }

    protected void setShowValues(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, showValues__typeInfo)) {
        setShowValues(__typeMapper.readBoolean(__in, showValues__typeInfo, boolean.class));
      }
    }

    /**
     * element : size of type {http://soap.sforce.com/2006/04/metadata}ReportChartSize
     * java type: com.sforce.soap.metadata.ReportChartSize
     */
    private static final com.sforce.ws.bind.TypeInfo size__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","size","http://soap.sforce.com/2006/04/metadata","ReportChartSize",0,1,true);

    private boolean size__is_set = false;

    private com.sforce.soap.metadata.ReportChartSize size;

    public com.sforce.soap.metadata.ReportChartSize getSize() {
      return size;
    }

    public void setSize(com.sforce.soap.metadata.ReportChartSize size) {
      this.size = size;
      size__is_set = true;
    }

    protected void setSize(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, size__typeInfo)) {
        setSize((com.sforce.soap.metadata.ReportChartSize)__typeMapper.readObject(__in, size__typeInfo, com.sforce.soap.metadata.ReportChartSize.class));
      }
    }

    /**
     * element : summaryAxisManualRangeEnd of type {http://www.w3.org/2001/XMLSchema}double
     * java type: double
     */
    private static final com.sforce.ws.bind.TypeInfo summaryAxisManualRangeEnd__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","summaryAxisManualRangeEnd","http://www.w3.org/2001/XMLSchema","double",0,1,true);

    private boolean summaryAxisManualRangeEnd__is_set = false;

    private double summaryAxisManualRangeEnd;

    public double getSummaryAxisManualRangeEnd() {
      return summaryAxisManualRangeEnd;
    }

    public void setSummaryAxisManualRangeEnd(double summaryAxisManualRangeEnd) {
      this.summaryAxisManualRangeEnd = summaryAxisManualRangeEnd;
      summaryAxisManualRangeEnd__is_set = true;
    }

    protected void setSummaryAxisManualRangeEnd(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, summaryAxisManualRangeEnd__typeInfo)) {
        setSummaryAxisManualRangeEnd((double)__typeMapper.readDouble(__in, summaryAxisManualRangeEnd__typeInfo, double.class));
      }
    }

    /**
     * element : summaryAxisManualRangeStart of type {http://www.w3.org/2001/XMLSchema}double
     * java type: double
     */
    private static final com.sforce.ws.bind.TypeInfo summaryAxisManualRangeStart__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","summaryAxisManualRangeStart","http://www.w3.org/2001/XMLSchema","double",0,1,true);

    private boolean summaryAxisManualRangeStart__is_set = false;

    private double summaryAxisManualRangeStart;

    public double getSummaryAxisManualRangeStart() {
      return summaryAxisManualRangeStart;
    }

    public void setSummaryAxisManualRangeStart(double summaryAxisManualRangeStart) {
      this.summaryAxisManualRangeStart = summaryAxisManualRangeStart;
      summaryAxisManualRangeStart__is_set = true;
    }

    protected void setSummaryAxisManualRangeStart(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, summaryAxisManualRangeStart__typeInfo)) {
        setSummaryAxisManualRangeStart((double)__typeMapper.readDouble(__in, summaryAxisManualRangeStart__typeInfo, double.class));
      }
    }

    /**
     * element : summaryAxisRange of type {http://soap.sforce.com/2006/04/metadata}ChartRangeType
     * java type: com.sforce.soap.metadata.ChartRangeType
     */
    private static final com.sforce.ws.bind.TypeInfo summaryAxisRange__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","summaryAxisRange","http://soap.sforce.com/2006/04/metadata","ChartRangeType",0,1,true);

    private boolean summaryAxisRange__is_set = false;

    private com.sforce.soap.metadata.ChartRangeType summaryAxisRange;

    public com.sforce.soap.metadata.ChartRangeType getSummaryAxisRange() {
      return summaryAxisRange;
    }

    public void setSummaryAxisRange(com.sforce.soap.metadata.ChartRangeType summaryAxisRange) {
      this.summaryAxisRange = summaryAxisRange;
      summaryAxisRange__is_set = true;
    }

    protected void setSummaryAxisRange(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, summaryAxisRange__typeInfo)) {
        setSummaryAxisRange((com.sforce.soap.metadata.ChartRangeType)__typeMapper.readObject(__in, summaryAxisRange__typeInfo, com.sforce.soap.metadata.ChartRangeType.class));
      }
    }

    /**
     * element : textColor of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo textColor__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","textColor","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean textColor__is_set = false;

    private java.lang.String textColor;

    public java.lang.String getTextColor() {
      return textColor;
    }

    public void setTextColor(java.lang.String textColor) {
      this.textColor = textColor;
      textColor__is_set = true;
    }

    protected void setTextColor(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, textColor__typeInfo)) {
        setTextColor(__typeMapper.readString(__in, textColor__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : textSize of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo textSize__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","textSize","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean textSize__is_set = false;

    private int textSize;

    public int getTextSize() {
      return textSize;
    }

    public void setTextSize(int textSize) {
      this.textSize = textSize;
      textSize__is_set = true;
    }

    protected void setTextSize(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, textSize__typeInfo)) {
        setTextSize((int)__typeMapper.readInt(__in, textSize__typeInfo, int.class));
      }
    }

    /**
     * element : title of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo title__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","title","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean title__is_set = false;

    private java.lang.String title;

    public java.lang.String getTitle() {
      return title;
    }

    public void setTitle(java.lang.String title) {
      this.title = title;
      title__is_set = true;
    }

    protected void setTitle(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, title__typeInfo)) {
        setTitle(__typeMapper.readString(__in, title__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : titleColor of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo titleColor__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","titleColor","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean titleColor__is_set = false;

    private java.lang.String titleColor;

    public java.lang.String getTitleColor() {
      return titleColor;
    }

    public void setTitleColor(java.lang.String titleColor) {
      this.titleColor = titleColor;
      titleColor__is_set = true;
    }

    protected void setTitleColor(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, titleColor__typeInfo)) {
        setTitleColor(__typeMapper.readString(__in, titleColor__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : titleSize of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo titleSize__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","titleSize","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean titleSize__is_set = false;

    private int titleSize;

    public int getTitleSize() {
      return titleSize;
    }

    public void setTitleSize(int titleSize) {
      this.titleSize = titleSize;
      titleSize__is_set = true;
    }

    protected void setTitleSize(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, titleSize__typeInfo)) {
        setTitleSize((int)__typeMapper.readInt(__in, titleSize__typeInfo, int.class));
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
       __typeMapper.writeString(__out, backgroundColor1__typeInfo, backgroundColor1, backgroundColor1__is_set);
       __typeMapper.writeString(__out, backgroundColor2__typeInfo, backgroundColor2, backgroundColor2__is_set);
       __typeMapper.writeObject(__out, backgroundFadeDir__typeInfo, backgroundFadeDir, backgroundFadeDir__is_set);
       __typeMapper.writeObject(__out, chartSummaries__typeInfo, chartSummaries, chartSummaries__is_set);
       __typeMapper.writeObject(__out, chartType__typeInfo, chartType, chartType__is_set);
       __typeMapper.writeBoolean(__out, enableHoverLabels__typeInfo, enableHoverLabels, enableHoverLabels__is_set);
       __typeMapper.writeBoolean(__out, expandOthers__typeInfo, expandOthers, expandOthers__is_set);
       __typeMapper.writeString(__out, groupingColumn__typeInfo, groupingColumn, groupingColumn__is_set);
       __typeMapper.writeObject(__out, legendPosition__typeInfo, legendPosition, legendPosition__is_set);
       __typeMapper.writeObject(__out, location__typeInfo, location, location__is_set);
       __typeMapper.writeString(__out, secondaryGroupingColumn__typeInfo, secondaryGroupingColumn, secondaryGroupingColumn__is_set);
       __typeMapper.writeBoolean(__out, showAxisLabels__typeInfo, showAxisLabels, showAxisLabels__is_set);
       __typeMapper.writeBoolean(__out, showPercentage__typeInfo, showPercentage, showPercentage__is_set);
       __typeMapper.writeBoolean(__out, showTotal__typeInfo, showTotal, showTotal__is_set);
       __typeMapper.writeBoolean(__out, showValues__typeInfo, showValues, showValues__is_set);
       __typeMapper.writeObject(__out, size__typeInfo, size, size__is_set);
       __typeMapper.writeDouble(__out, summaryAxisManualRangeEnd__typeInfo, summaryAxisManualRangeEnd, summaryAxisManualRangeEnd__is_set);
       __typeMapper.writeDouble(__out, summaryAxisManualRangeStart__typeInfo, summaryAxisManualRangeStart, summaryAxisManualRangeStart__is_set);
       __typeMapper.writeObject(__out, summaryAxisRange__typeInfo, summaryAxisRange, summaryAxisRange__is_set);
       __typeMapper.writeString(__out, textColor__typeInfo, textColor, textColor__is_set);
       __typeMapper.writeInt(__out, textSize__typeInfo, textSize, textSize__is_set);
       __typeMapper.writeString(__out, title__typeInfo, title, title__is_set);
       __typeMapper.writeString(__out, titleColor__typeInfo, titleColor, titleColor__is_set);
       __typeMapper.writeInt(__out, titleSize__typeInfo, titleSize, titleSize__is_set);
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
        setBackgroundColor1(__in, __typeMapper);
        setBackgroundColor2(__in, __typeMapper);
        setBackgroundFadeDir(__in, __typeMapper);
        setChartSummaries(__in, __typeMapper);
        setChartType(__in, __typeMapper);
        setEnableHoverLabels(__in, __typeMapper);
        setExpandOthers(__in, __typeMapper);
        setGroupingColumn(__in, __typeMapper);
        setLegendPosition(__in, __typeMapper);
        setLocation(__in, __typeMapper);
        setSecondaryGroupingColumn(__in, __typeMapper);
        setShowAxisLabels(__in, __typeMapper);
        setShowPercentage(__in, __typeMapper);
        setShowTotal(__in, __typeMapper);
        setShowValues(__in, __typeMapper);
        setSize(__in, __typeMapper);
        setSummaryAxisManualRangeEnd(__in, __typeMapper);
        setSummaryAxisManualRangeStart(__in, __typeMapper);
        setSummaryAxisRange(__in, __typeMapper);
        setTextColor(__in, __typeMapper);
        setTextSize(__in, __typeMapper);
        setTitle(__in, __typeMapper);
        setTitleColor(__in, __typeMapper);
        setTitleSize(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ReportChart ");
      sb.append(" backgroundColor1='").append(com.sforce.ws.util.Verbose.toString(backgroundColor1)).append("'\n");
      sb.append(" backgroundColor2='").append(com.sforce.ws.util.Verbose.toString(backgroundColor2)).append("'\n");
      sb.append(" backgroundFadeDir='").append(com.sforce.ws.util.Verbose.toString(backgroundFadeDir)).append("'\n");
      sb.append(" chartSummaries='").append(com.sforce.ws.util.Verbose.toString(chartSummaries)).append("'\n");
      sb.append(" chartType='").append(com.sforce.ws.util.Verbose.toString(chartType)).append("'\n");
      sb.append(" enableHoverLabels='").append(com.sforce.ws.util.Verbose.toString(enableHoverLabels)).append("'\n");
      sb.append(" expandOthers='").append(com.sforce.ws.util.Verbose.toString(expandOthers)).append("'\n");
      sb.append(" groupingColumn='").append(com.sforce.ws.util.Verbose.toString(groupingColumn)).append("'\n");
      sb.append(" legendPosition='").append(com.sforce.ws.util.Verbose.toString(legendPosition)).append("'\n");
      sb.append(" location='").append(com.sforce.ws.util.Verbose.toString(location)).append("'\n");
      sb.append(" secondaryGroupingColumn='").append(com.sforce.ws.util.Verbose.toString(secondaryGroupingColumn)).append("'\n");
      sb.append(" showAxisLabels='").append(com.sforce.ws.util.Verbose.toString(showAxisLabels)).append("'\n");
      sb.append(" showPercentage='").append(com.sforce.ws.util.Verbose.toString(showPercentage)).append("'\n");
      sb.append(" showTotal='").append(com.sforce.ws.util.Verbose.toString(showTotal)).append("'\n");
      sb.append(" showValues='").append(com.sforce.ws.util.Verbose.toString(showValues)).append("'\n");
      sb.append(" size='").append(com.sforce.ws.util.Verbose.toString(size)).append("'\n");
      sb.append(" summaryAxisManualRangeEnd='").append(com.sforce.ws.util.Verbose.toString(summaryAxisManualRangeEnd)).append("'\n");
      sb.append(" summaryAxisManualRangeStart='").append(com.sforce.ws.util.Verbose.toString(summaryAxisManualRangeStart)).append("'\n");
      sb.append(" summaryAxisRange='").append(com.sforce.ws.util.Verbose.toString(summaryAxisRange)).append("'\n");
      sb.append(" textColor='").append(com.sforce.ws.util.Verbose.toString(textColor)).append("'\n");
      sb.append(" textSize='").append(com.sforce.ws.util.Verbose.toString(textSize)).append("'\n");
      sb.append(" title='").append(com.sforce.ws.util.Verbose.toString(title)).append("'\n");
      sb.append(" titleColor='").append(com.sforce.ws.util.Verbose.toString(titleColor)).append("'\n");
      sb.append(" titleSize='").append(com.sforce.ws.util.Verbose.toString(titleSize)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
