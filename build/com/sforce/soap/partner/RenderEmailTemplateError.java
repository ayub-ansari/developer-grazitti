package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class RenderEmailTemplateError implements com.sforce.ws.bind.XMLizable , IRenderEmailTemplateError{

    /**
     * Constructor
     */
    public RenderEmailTemplateError() {}

    /**
     * element : fieldName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo fieldName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","fieldName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean fieldName__is_set = false;

    private java.lang.String fieldName;

    @Override
    public java.lang.String getFieldName() {
      return fieldName;
    }

    @Override
    public void setFieldName(java.lang.String fieldName) {
      this.fieldName = fieldName;
      fieldName__is_set = true;
    }

    protected void setFieldName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, fieldName__typeInfo)) {
        setFieldName(__typeMapper.readString(__in, fieldName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : message of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo message__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","message","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean message__is_set = false;

    private java.lang.String message;

    @Override
    public java.lang.String getMessage() {
      return message;
    }

    @Override
    public void setMessage(java.lang.String message) {
      this.message = message;
      message__is_set = true;
    }

    protected void setMessage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, message__typeInfo)) {
        setMessage(__typeMapper.readString(__in, message__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : offset of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo offset__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","offset","http://www.w3.org/2001/XMLSchema","int",1,1,true);

    private boolean offset__is_set = false;

    private int offset;

    @Override
    public int getOffset() {
      return offset;
    }

    @Override
    public void setOffset(int offset) {
      this.offset = offset;
      offset__is_set = true;
    }

    protected void setOffset(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, offset__typeInfo)) {
        setOffset((int)__typeMapper.readInt(__in, offset__typeInfo, int.class));
      }
    }

    /**
     * element : statusCode of type {urn:partner.soap.sforce.com}StatusCode
     * java type: com.sforce.soap.partner.StatusCode
     */
    private static final com.sforce.ws.bind.TypeInfo statusCode__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","statusCode","urn:partner.soap.sforce.com","StatusCode",1,1,true);

    private boolean statusCode__is_set = false;

    private com.sforce.soap.partner.StatusCode statusCode;

    @Override
    public com.sforce.soap.partner.StatusCode getStatusCode() {
      return statusCode;
    }

    @Override
    public void setStatusCode(com.sforce.soap.partner.StatusCode statusCode) {
      this.statusCode = statusCode;
      statusCode__is_set = true;
    }

    protected void setStatusCode(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, statusCode__typeInfo)) {
        setStatusCode((com.sforce.soap.partner.StatusCode)__typeMapper.readObject(__in, statusCode__typeInfo, com.sforce.soap.partner.StatusCode.class));
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
       __typeMapper.writeString(__out, fieldName__typeInfo, fieldName, fieldName__is_set);
       __typeMapper.writeString(__out, message__typeInfo, message, message__is_set);
       __typeMapper.writeInt(__out, offset__typeInfo, offset, offset__is_set);
       __typeMapper.writeObject(__out, statusCode__typeInfo, statusCode, statusCode__is_set);
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
        setFieldName(__in, __typeMapper);
        setMessage(__in, __typeMapper);
        setOffset(__in, __typeMapper);
        setStatusCode(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[RenderEmailTemplateError ");
      sb.append(" fieldName='").append(com.sforce.ws.util.Verbose.toString(fieldName)).append("'\n");
      sb.append(" message='").append(com.sforce.ws.util.Verbose.toString(message)).append("'\n");
      sb.append(" offset='").append(com.sforce.ws.util.Verbose.toString(offset)).append("'\n");
      sb.append(" statusCode='").append(com.sforce.ws.util.Verbose.toString(statusCode)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
