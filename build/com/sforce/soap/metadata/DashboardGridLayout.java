package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class DashboardGridLayout implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DashboardGridLayout() {}

    /**
     * element : dashboardGridComponents of type {http://soap.sforce.com/2006/04/metadata}DashboardGridComponent
     * java type: com.sforce.soap.metadata.DashboardGridComponent[]
     */
    private static final com.sforce.ws.bind.TypeInfo dashboardGridComponents__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","dashboardGridComponents","http://soap.sforce.com/2006/04/metadata","DashboardGridComponent",0,-1,true);

    private boolean dashboardGridComponents__is_set = false;

    private com.sforce.soap.metadata.DashboardGridComponent[] dashboardGridComponents = new com.sforce.soap.metadata.DashboardGridComponent[0];

    public com.sforce.soap.metadata.DashboardGridComponent[] getDashboardGridComponents() {
      return dashboardGridComponents;
    }

    public void setDashboardGridComponents(com.sforce.soap.metadata.DashboardGridComponent[] dashboardGridComponents) {
      this.dashboardGridComponents = dashboardGridComponents;
      dashboardGridComponents__is_set = true;
    }

    protected void setDashboardGridComponents(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, dashboardGridComponents__typeInfo)) {
        setDashboardGridComponents((com.sforce.soap.metadata.DashboardGridComponent[])__typeMapper.readObject(__in, dashboardGridComponents__typeInfo, com.sforce.soap.metadata.DashboardGridComponent[].class));
      }
    }

    /**
     * element : numberOfColumns of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo numberOfColumns__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","numberOfColumns","http://www.w3.org/2001/XMLSchema","int",1,1,true);

    private boolean numberOfColumns__is_set = false;

    private int numberOfColumns;

    public int getNumberOfColumns() {
      return numberOfColumns;
    }

    public void setNumberOfColumns(int numberOfColumns) {
      this.numberOfColumns = numberOfColumns;
      numberOfColumns__is_set = true;
    }

    protected void setNumberOfColumns(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, numberOfColumns__typeInfo)) {
        setNumberOfColumns((int)__typeMapper.readInt(__in, numberOfColumns__typeInfo, int.class));
      }
    }

    /**
     * element : rowHeight of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo rowHeight__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","rowHeight","http://www.w3.org/2001/XMLSchema","int",1,1,true);

    private boolean rowHeight__is_set = false;

    private int rowHeight;

    public int getRowHeight() {
      return rowHeight;
    }

    public void setRowHeight(int rowHeight) {
      this.rowHeight = rowHeight;
      rowHeight__is_set = true;
    }

    protected void setRowHeight(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, rowHeight__typeInfo)) {
        setRowHeight((int)__typeMapper.readInt(__in, rowHeight__typeInfo, int.class));
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
       __typeMapper.writeObject(__out, dashboardGridComponents__typeInfo, dashboardGridComponents, dashboardGridComponents__is_set);
       __typeMapper.writeInt(__out, numberOfColumns__typeInfo, numberOfColumns, numberOfColumns__is_set);
       __typeMapper.writeInt(__out, rowHeight__typeInfo, rowHeight, rowHeight__is_set);
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
        setDashboardGridComponents(__in, __typeMapper);
        setNumberOfColumns(__in, __typeMapper);
        setRowHeight(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[DashboardGridLayout ");
      sb.append(" dashboardGridComponents='").append(com.sforce.ws.util.Verbose.toString(dashboardGridComponents)).append("'\n");
      sb.append(" numberOfColumns='").append(com.sforce.ws.util.Verbose.toString(numberOfColumns)).append("'\n");
      sb.append(" rowHeight='").append(com.sforce.ws.util.Verbose.toString(rowHeight)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
