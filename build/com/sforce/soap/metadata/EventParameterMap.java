package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class EventParameterMap implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public EventParameterMap() {}

    /**
     * element : parameterName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo parameterName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","parameterName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean parameterName__is_set = false;

    private java.lang.String parameterName;

    public java.lang.String getParameterName() {
      return parameterName;
    }

    public void setParameterName(java.lang.String parameterName) {
      this.parameterName = parameterName;
      parameterName__is_set = true;
    }

    protected void setParameterName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, parameterName__typeInfo)) {
        setParameterName(__typeMapper.readString(__in, parameterName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : parameterValue of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo parameterValue__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","parameterValue","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean parameterValue__is_set = false;

    private java.lang.String parameterValue;

    public java.lang.String getParameterValue() {
      return parameterValue;
    }

    public void setParameterValue(java.lang.String parameterValue) {
      this.parameterValue = parameterValue;
      parameterValue__is_set = true;
    }

    protected void setParameterValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, parameterValue__typeInfo)) {
        setParameterValue(__typeMapper.readString(__in, parameterValue__typeInfo, java.lang.String.class));
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
       __typeMapper.writeString(__out, parameterName__typeInfo, parameterName, parameterName__is_set);
       __typeMapper.writeString(__out, parameterValue__typeInfo, parameterValue, parameterValue__is_set);
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
        setParameterName(__in, __typeMapper);
        setParameterValue(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[EventParameterMap ");
      sb.append(" parameterName='").append(com.sforce.ws.util.Verbose.toString(parameterName)).append("'\n");
      sb.append(" parameterValue='").append(com.sforce.ws.util.Verbose.toString(parameterValue)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
