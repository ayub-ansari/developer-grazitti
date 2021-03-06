package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class TabLimitConfig implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public TabLimitConfig() {}

    /**
     * element : maxNumberOfPrimaryTabs of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo maxNumberOfPrimaryTabs__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","maxNumberOfPrimaryTabs","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean maxNumberOfPrimaryTabs__is_set = false;

    private java.lang.String maxNumberOfPrimaryTabs;

    public java.lang.String getMaxNumberOfPrimaryTabs() {
      return maxNumberOfPrimaryTabs;
    }

    public void setMaxNumberOfPrimaryTabs(java.lang.String maxNumberOfPrimaryTabs) {
      this.maxNumberOfPrimaryTabs = maxNumberOfPrimaryTabs;
      maxNumberOfPrimaryTabs__is_set = true;
    }

    protected void setMaxNumberOfPrimaryTabs(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, maxNumberOfPrimaryTabs__typeInfo)) {
        setMaxNumberOfPrimaryTabs(__typeMapper.readString(__in, maxNumberOfPrimaryTabs__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : maxNumberOfSubTabs of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo maxNumberOfSubTabs__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","maxNumberOfSubTabs","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean maxNumberOfSubTabs__is_set = false;

    private java.lang.String maxNumberOfSubTabs;

    public java.lang.String getMaxNumberOfSubTabs() {
      return maxNumberOfSubTabs;
    }

    public void setMaxNumberOfSubTabs(java.lang.String maxNumberOfSubTabs) {
      this.maxNumberOfSubTabs = maxNumberOfSubTabs;
      maxNumberOfSubTabs__is_set = true;
    }

    protected void setMaxNumberOfSubTabs(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, maxNumberOfSubTabs__typeInfo)) {
        setMaxNumberOfSubTabs(__typeMapper.readString(__in, maxNumberOfSubTabs__typeInfo, java.lang.String.class));
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
       __typeMapper.writeString(__out, maxNumberOfPrimaryTabs__typeInfo, maxNumberOfPrimaryTabs, maxNumberOfPrimaryTabs__is_set);
       __typeMapper.writeString(__out, maxNumberOfSubTabs__typeInfo, maxNumberOfSubTabs, maxNumberOfSubTabs__is_set);
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
        setMaxNumberOfPrimaryTabs(__in, __typeMapper);
        setMaxNumberOfSubTabs(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[TabLimitConfig ");
      sb.append(" maxNumberOfPrimaryTabs='").append(com.sforce.ws.util.Verbose.toString(maxNumberOfPrimaryTabs)).append("'\n");
      sb.append(" maxNumberOfSubTabs='").append(com.sforce.ws.util.Verbose.toString(maxNumberOfSubTabs)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
