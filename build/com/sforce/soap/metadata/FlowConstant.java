package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class FlowConstant extends com.sforce.soap.metadata.FlowElement {

    /**
     * Constructor
     */
    public FlowConstant() {}

    /**
     * element : dataType of type {http://soap.sforce.com/2006/04/metadata}FlowDataType
     * java type: com.sforce.soap.metadata.FlowDataType
     */
    private static final com.sforce.ws.bind.TypeInfo dataType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","dataType","http://soap.sforce.com/2006/04/metadata","FlowDataType",1,1,true);

    private boolean dataType__is_set = false;

    private com.sforce.soap.metadata.FlowDataType dataType;

    public com.sforce.soap.metadata.FlowDataType getDataType() {
      return dataType;
    }

    public void setDataType(com.sforce.soap.metadata.FlowDataType dataType) {
      this.dataType = dataType;
      dataType__is_set = true;
    }

    protected void setDataType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, dataType__typeInfo)) {
        setDataType((com.sforce.soap.metadata.FlowDataType)__typeMapper.readObject(__in, dataType__typeInfo, com.sforce.soap.metadata.FlowDataType.class));
      }
    }

    /**
     * element : value of type {http://soap.sforce.com/2006/04/metadata}FlowElementReferenceOrValue
     * java type: com.sforce.soap.metadata.FlowElementReferenceOrValue
     */
    private static final com.sforce.ws.bind.TypeInfo value__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","value","http://soap.sforce.com/2006/04/metadata","FlowElementReferenceOrValue",0,1,true);

    private boolean value__is_set = false;

    private com.sforce.soap.metadata.FlowElementReferenceOrValue value;

    public com.sforce.soap.metadata.FlowElementReferenceOrValue getValue() {
      return value;
    }

    public void setValue(com.sforce.soap.metadata.FlowElementReferenceOrValue value) {
      this.value = value;
      value__is_set = true;
    }

    protected void setValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, value__typeInfo)) {
        setValue((com.sforce.soap.metadata.FlowElementReferenceOrValue)__typeMapper.readObject(__in, value__typeInfo, com.sforce.soap.metadata.FlowElementReferenceOrValue.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "FlowConstant");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, dataType__typeInfo, dataType, dataType__is_set);
       __typeMapper.writeObject(__out, value__typeInfo, value, value__is_set);
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
        super.loadFields(__in, __typeMapper);
        setDataType(__in, __typeMapper);
        setValue(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[FlowConstant ");
      sb.append(super.toString());sb.append(" dataType='").append(com.sforce.ws.util.Verbose.toString(dataType)).append("'\n");
      sb.append(" value='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
