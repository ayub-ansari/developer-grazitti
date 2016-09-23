package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class DescribePathAssistantField implements com.sforce.ws.bind.XMLizable , IDescribePathAssistantField{

    /**
     * Constructor
     */
    public DescribePathAssistantField() {}

    /**
     * element : apiName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo apiName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","apiName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean apiName__is_set = false;

    private java.lang.String apiName;

    @Override
    public java.lang.String getApiName() {
      return apiName;
    }

    @Override
    public void setApiName(java.lang.String apiName) {
      this.apiName = apiName;
      apiName__is_set = true;
    }

    protected void setApiName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, apiName__typeInfo)) {
        setApiName(__typeMapper.readString(__in, apiName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : label of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean label__is_set = false;

    private java.lang.String label;

    @Override
    public java.lang.String getLabel() {
      return label;
    }

    @Override
    public void setLabel(java.lang.String label) {
      this.label = label;
      label__is_set = true;
    }

    protected void setLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, label__typeInfo)) {
        setLabel(__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : readOnly of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo readOnly__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","readOnly","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean readOnly__is_set = false;

    private boolean readOnly;

    @Override
    public boolean getReadOnly() {
      return readOnly;
    }

    @Override
    public boolean isReadOnly() {
      return readOnly;
    }

    @Override
    public void setReadOnly(boolean readOnly) {
      this.readOnly = readOnly;
      readOnly__is_set = true;
    }

    protected void setReadOnly(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, readOnly__typeInfo)) {
        setReadOnly(__typeMapper.readBoolean(__in, readOnly__typeInfo, boolean.class));
      }
    }

    /**
     * element : required of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo required__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","required","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean required__is_set = false;

    private boolean required;

    @Override
    public boolean getRequired() {
      return required;
    }

    @Override
    public boolean isRequired() {
      return required;
    }

    @Override
    public void setRequired(boolean required) {
      this.required = required;
      required__is_set = true;
    }

    protected void setRequired(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, required__typeInfo)) {
        setRequired(__typeMapper.readBoolean(__in, required__typeInfo, boolean.class));
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
       __typeMapper.writeString(__out, apiName__typeInfo, apiName, apiName__is_set);
       __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
       __typeMapper.writeBoolean(__out, readOnly__typeInfo, readOnly, readOnly__is_set);
       __typeMapper.writeBoolean(__out, required__typeInfo, required, required__is_set);
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
        setApiName(__in, __typeMapper);
        setLabel(__in, __typeMapper);
        setReadOnly(__in, __typeMapper);
        setRequired(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[DescribePathAssistantField ");
      sb.append(" apiName='").append(com.sforce.ws.util.Verbose.toString(apiName)).append("'\n");
      sb.append(" label='").append(com.sforce.ws.util.Verbose.toString(label)).append("'\n");
      sb.append(" readOnly='").append(com.sforce.ws.util.Verbose.toString(readOnly)).append("'\n");
      sb.append(" required='").append(com.sforce.ws.util.Verbose.toString(required)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
