package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class DashboardTableColumn implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DashboardTableColumn() {}

    /**
     * element : aggregateType of type {http://soap.sforce.com/2006/04/metadata}ReportSummaryType
     * java type: com.sforce.soap.metadata.ReportSummaryType
     */
    private static final com.sforce.ws.bind.TypeInfo aggregateType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","aggregateType","http://soap.sforce.com/2006/04/metadata","ReportSummaryType",0,1,true);

    private boolean aggregateType__is_set = false;

    private com.sforce.soap.metadata.ReportSummaryType aggregateType;

    public com.sforce.soap.metadata.ReportSummaryType getAggregateType() {
      return aggregateType;
    }

    public void setAggregateType(com.sforce.soap.metadata.ReportSummaryType aggregateType) {
      this.aggregateType = aggregateType;
      aggregateType__is_set = true;
    }

    protected void setAggregateType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, aggregateType__typeInfo)) {
        setAggregateType((com.sforce.soap.metadata.ReportSummaryType)__typeMapper.readObject(__in, aggregateType__typeInfo, com.sforce.soap.metadata.ReportSummaryType.class));
      }
    }

    /**
     * element : calculatePercent of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo calculatePercent__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","calculatePercent","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean calculatePercent__is_set = false;

    private boolean calculatePercent;

    public boolean getCalculatePercent() {
      return calculatePercent;
    }

    public boolean isCalculatePercent() {
      return calculatePercent;
    }

    public void setCalculatePercent(boolean calculatePercent) {
      this.calculatePercent = calculatePercent;
      calculatePercent__is_set = true;
    }

    protected void setCalculatePercent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, calculatePercent__typeInfo)) {
        setCalculatePercent(__typeMapper.readBoolean(__in, calculatePercent__typeInfo, boolean.class));
      }
    }

    /**
     * element : column of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo column__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","column","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean column__is_set = false;

    private java.lang.String column;

    public java.lang.String getColumn() {
      return column;
    }

    public void setColumn(java.lang.String column) {
      this.column = column;
      column__is_set = true;
    }

    protected void setColumn(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, column__typeInfo)) {
        setColumn(__typeMapper.readString(__in, column__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : decimalPlaces of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo decimalPlaces__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","decimalPlaces","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean decimalPlaces__is_set = false;

    private int decimalPlaces;

    public int getDecimalPlaces() {
      return decimalPlaces;
    }

    public void setDecimalPlaces(int decimalPlaces) {
      this.decimalPlaces = decimalPlaces;
      decimalPlaces__is_set = true;
    }

    protected void setDecimalPlaces(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, decimalPlaces__typeInfo)) {
        setDecimalPlaces((int)__typeMapper.readInt(__in, decimalPlaces__typeInfo, int.class));
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
     * element : sortBy of type {http://soap.sforce.com/2006/04/metadata}DashboardComponentFilter
     * java type: com.sforce.soap.metadata.DashboardComponentFilter
     */
    private static final com.sforce.ws.bind.TypeInfo sortBy__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","sortBy","http://soap.sforce.com/2006/04/metadata","DashboardComponentFilter",0,1,true);

    private boolean sortBy__is_set = false;

    private com.sforce.soap.metadata.DashboardComponentFilter sortBy;

    public com.sforce.soap.metadata.DashboardComponentFilter getSortBy() {
      return sortBy;
    }

    public void setSortBy(com.sforce.soap.metadata.DashboardComponentFilter sortBy) {
      this.sortBy = sortBy;
      sortBy__is_set = true;
    }

    protected void setSortBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, sortBy__typeInfo)) {
        setSortBy((com.sforce.soap.metadata.DashboardComponentFilter)__typeMapper.readObject(__in, sortBy__typeInfo, com.sforce.soap.metadata.DashboardComponentFilter.class));
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
       __typeMapper.writeObject(__out, aggregateType__typeInfo, aggregateType, aggregateType__is_set);
       __typeMapper.writeBoolean(__out, calculatePercent__typeInfo, calculatePercent, calculatePercent__is_set);
       __typeMapper.writeString(__out, column__typeInfo, column, column__is_set);
       __typeMapper.writeInt(__out, decimalPlaces__typeInfo, decimalPlaces, decimalPlaces__is_set);
       __typeMapper.writeBoolean(__out, showTotal__typeInfo, showTotal, showTotal__is_set);
       __typeMapper.writeObject(__out, sortBy__typeInfo, sortBy, sortBy__is_set);
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
        setAggregateType(__in, __typeMapper);
        setCalculatePercent(__in, __typeMapper);
        setColumn(__in, __typeMapper);
        setDecimalPlaces(__in, __typeMapper);
        setShowTotal(__in, __typeMapper);
        setSortBy(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[DashboardTableColumn ");
      sb.append(" aggregateType='").append(com.sforce.ws.util.Verbose.toString(aggregateType)).append("'\n");
      sb.append(" calculatePercent='").append(com.sforce.ws.util.Verbose.toString(calculatePercent)).append("'\n");
      sb.append(" column='").append(com.sforce.ws.util.Verbose.toString(column)).append("'\n");
      sb.append(" decimalPlaces='").append(com.sforce.ws.util.Verbose.toString(decimalPlaces)).append("'\n");
      sb.append(" showTotal='").append(com.sforce.ws.util.Verbose.toString(showTotal)).append("'\n");
      sb.append(" sortBy='").append(com.sforce.ws.util.Verbose.toString(sortBy)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
