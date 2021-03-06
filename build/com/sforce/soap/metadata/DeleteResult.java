package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class DeleteResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DeleteResult() {}

    /**
     * element : errors of type {http://soap.sforce.com/2006/04/metadata}Error
     * java type: com.sforce.soap.metadata.Error[]
     */
    private static final com.sforce.ws.bind.TypeInfo errors__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","errors","http://soap.sforce.com/2006/04/metadata","Error",0,-1,true);

    private boolean errors__is_set = false;

    private com.sforce.soap.metadata.Error[] errors = new com.sforce.soap.metadata.Error[0];

    public com.sforce.soap.metadata.Error[] getErrors() {
      return errors;
    }

    public void setErrors(com.sforce.soap.metadata.Error[] errors) {
      this.errors = errors;
      errors__is_set = true;
    }

    protected void setErrors(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, errors__typeInfo)) {
        setErrors((com.sforce.soap.metadata.Error[])__typeMapper.readObject(__in, errors__typeInfo, com.sforce.soap.metadata.Error[].class));
      }
    }

    /**
     * element : fullName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo fullName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","fullName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean fullName__is_set = false;

    private java.lang.String fullName;

    public java.lang.String getFullName() {
      return fullName;
    }

    public void setFullName(java.lang.String fullName) {
      this.fullName = fullName;
      fullName__is_set = true;
    }

    protected void setFullName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, fullName__typeInfo)) {
        setFullName(__typeMapper.readString(__in, fullName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : success of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo success__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","success","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean success__is_set = false;

    private boolean success;

    public boolean getSuccess() {
      return success;
    }

    public boolean isSuccess() {
      return success;
    }

    public void setSuccess(boolean success) {
      this.success = success;
      success__is_set = true;
    }

    protected void setSuccess(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, success__typeInfo)) {
        setSuccess(__typeMapper.readBoolean(__in, success__typeInfo, boolean.class));
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
       __typeMapper.writeObject(__out, errors__typeInfo, errors, errors__is_set);
       __typeMapper.writeString(__out, fullName__typeInfo, fullName, fullName__is_set);
       __typeMapper.writeBoolean(__out, success__typeInfo, success, success__is_set);
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
        setErrors(__in, __typeMapper);
        setFullName(__in, __typeMapper);
        setSuccess(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[DeleteResult ");
      sb.append(" errors='").append(com.sforce.ws.util.Verbose.toString(errors)).append("'\n");
      sb.append(" fullName='").append(com.sforce.ws.util.Verbose.toString(fullName)).append("'\n");
      sb.append(" success='").append(com.sforce.ws.util.Verbose.toString(success)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
