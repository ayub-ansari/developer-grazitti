package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class DeployRecentValidation_element implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DeployRecentValidation_element() {}

    /**
     * element : validationId of type {http://soap.sforce.com/2006/04/metadata}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo validationId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","validationId","http://soap.sforce.com/2006/04/metadata","ID",1,1,true);

    private boolean validationId__is_set = false;

    private java.lang.String validationId;

    public java.lang.String getValidationId() {
      return validationId;
    }

    public void setValidationId(java.lang.String validationId) {
      this.validationId = validationId;
      validationId__is_set = true;
    }

    protected void setValidationId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, validationId__typeInfo)) {
        setValidationId(__typeMapper.readString(__in, validationId__typeInfo, java.lang.String.class));
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
       __typeMapper.writeString(__out, validationId__typeInfo, validationId, validationId__is_set);
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
        setValidationId(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[DeployRecentValidation_element ");
      sb.append(" validationId='").append(com.sforce.ws.util.Verbose.toString(validationId)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
