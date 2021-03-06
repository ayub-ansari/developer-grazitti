package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class FieldSetItem implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public FieldSetItem() {}

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
     * element : isFieldManaged of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo isFieldManaged__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","isFieldManaged","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean isFieldManaged__is_set = false;

    private boolean isFieldManaged;

    public boolean getIsFieldManaged() {
      return isFieldManaged;
    }

    public boolean isIsFieldManaged() {
      return isFieldManaged;
    }

    public void setIsFieldManaged(boolean isFieldManaged) {
      this.isFieldManaged = isFieldManaged;
      isFieldManaged__is_set = true;
    }

    protected void setIsFieldManaged(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, isFieldManaged__typeInfo)) {
        setIsFieldManaged(__typeMapper.readBoolean(__in, isFieldManaged__typeInfo, boolean.class));
      }
    }

    /**
     * element : isRequired of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo isRequired__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","isRequired","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean isRequired__is_set = false;

    private boolean isRequired;

    public boolean getIsRequired() {
      return isRequired;
    }

    public boolean isIsRequired() {
      return isRequired;
    }

    public void setIsRequired(boolean isRequired) {
      this.isRequired = isRequired;
      isRequired__is_set = true;
    }

    protected void setIsRequired(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, isRequired__typeInfo)) {
        setIsRequired(__typeMapper.readBoolean(__in, isRequired__typeInfo, boolean.class));
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
       __typeMapper.writeString(__out, field__typeInfo, field, field__is_set);
       __typeMapper.writeBoolean(__out, isFieldManaged__typeInfo, isFieldManaged, isFieldManaged__is_set);
       __typeMapper.writeBoolean(__out, isRequired__typeInfo, isRequired, isRequired__is_set);
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
        setField(__in, __typeMapper);
        setIsFieldManaged(__in, __typeMapper);
        setIsRequired(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[FieldSetItem ");
      sb.append(" field='").append(com.sforce.ws.util.Verbose.toString(field)).append("'\n");
      sb.append(" isFieldManaged='").append(com.sforce.ws.util.Verbose.toString(isFieldManaged)).append("'\n");
      sb.append(" isRequired='").append(com.sforce.ws.util.Verbose.toString(isRequired)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
