package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class FlowInterviewChoiceUserInput implements com.sforce.ws.bind.XMLizable , IFlowInterviewChoiceUserInput{

    /**
     * Constructor
     */
    public FlowInterviewChoiceUserInput() {}

    /**
     * element : dataType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo dataType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","dataType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean dataType__is_set = false;

    private java.lang.String dataType;

    @Override
    public java.lang.String getDataType() {
      return dataType;
    }

    @Override
    public void setDataType(java.lang.String dataType) {
      this.dataType = dataType;
      dataType__is_set = true;
    }

    protected void setDataType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, dataType__typeInfo)) {
        setDataType(__typeMapper.readString(__in, dataType__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : errorMessages of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo errorMessages__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","errorMessages","http://www.w3.org/2001/XMLSchema","string",1,-1,true);

    private boolean errorMessages__is_set = false;

    private java.lang.String[] errorMessages = new java.lang.String[0];

    @Override
    public java.lang.String[] getErrorMessages() {
      return errorMessages;
    }

    @Override
    public void setErrorMessages(java.lang.String[] errorMessages) {
      this.errorMessages = castArray(java.lang.String.class, errorMessages);
      errorMessages__is_set = true;
    }

    protected void setErrorMessages(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, errorMessages__typeInfo)) {
        setErrorMessages((java.lang.String[])__typeMapper.readObject(__in, errorMessages__typeInfo, java.lang.String[].class));
      }
    }

    /**
     * element : isRequired of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo isRequired__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","isRequired","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean isRequired__is_set = false;

    private boolean isRequired;

    @Override
    public boolean getIsRequired() {
      return isRequired;
    }

    @Override
    public boolean isIsRequired() {
      return isRequired;
    }

    @Override
    public void setIsRequired(boolean isRequired) {
      this.isRequired = isRequired;
      isRequired__is_set = true;
    }

    protected void setIsRequired(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, isRequired__typeInfo)) {
        setIsRequired(__typeMapper.readBoolean(__in, isRequired__typeInfo, boolean.class));
      }
    }

    /**
     * element : isValidValue of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo isValidValue__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","isValidValue","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean isValidValue__is_set = false;

    private boolean isValidValue;

    @Override
    public boolean getIsValidValue() {
      return isValidValue;
    }

    @Override
    public boolean isIsValidValue() {
      return isValidValue;
    }

    @Override
    public void setIsValidValue(boolean isValidValue) {
      this.isValidValue = isValidValue;
      isValidValue__is_set = true;
    }

    protected void setIsValidValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, isValidValue__typeInfo)) {
        setIsValidValue(__typeMapper.readBoolean(__in, isValidValue__typeInfo, boolean.class));
      }
    }

    /**
     * element : name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean name__is_set = false;

    private java.lang.String name;

    @Override
    public java.lang.String getName() {
      return name;
    }

    @Override
    public void setName(java.lang.String name) {
      this.name = name;
      name__is_set = true;
    }

    protected void setName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, name__typeInfo)) {
        setName(__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
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
     * element : value of type {http://www.w3.org/2001/XMLSchema}anyType
     * java type: java.lang.Object
     */
    private static final com.sforce.ws.bind.TypeInfo value__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","value","http://www.w3.org/2001/XMLSchema","anyType",1,1,true);

    private boolean value__is_set = false;

    private java.lang.Object value;

    @Override
    public java.lang.Object getValue() {
      return value;
    }

    @Override
    public void setValue(java.lang.Object value) {
      this.value = value;
      value__is_set = true;
    }

    protected void setValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, value__typeInfo)) {
        setValue((java.lang.Object)__typeMapper.readObject(__in, value__typeInfo, java.lang.Object.class));
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
       __typeMapper.writeString(__out, dataType__typeInfo, dataType, dataType__is_set);
       __typeMapper.writeObject(__out, errorMessages__typeInfo, errorMessages, errorMessages__is_set);
       __typeMapper.writeBoolean(__out, isRequired__typeInfo, isRequired, isRequired__is_set);
       __typeMapper.writeBoolean(__out, isValidValue__typeInfo, isValidValue, isValidValue__is_set);
       __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
       __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
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
        setDataType(__in, __typeMapper);
        setErrorMessages(__in, __typeMapper);
        setIsRequired(__in, __typeMapper);
        setIsValidValue(__in, __typeMapper);
        setName(__in, __typeMapper);
        setLabel(__in, __typeMapper);
        setValue(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[FlowInterviewChoiceUserInput ");
      sb.append(" dataType='").append(com.sforce.ws.util.Verbose.toString(dataType)).append("'\n");
      sb.append(" errorMessages='").append(com.sforce.ws.util.Verbose.toString(errorMessages)).append("'\n");
      sb.append(" isRequired='").append(com.sforce.ws.util.Verbose.toString(isRequired)).append("'\n");
      sb.append(" isValidValue='").append(com.sforce.ws.util.Verbose.toString(isValidValue)).append("'\n");
      sb.append(" name='").append(com.sforce.ws.util.Verbose.toString(name)).append("'\n");
      sb.append(" label='").append(com.sforce.ws.util.Verbose.toString(label)).append("'\n");
      sb.append(" value='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private <T,U> T[] castArray(Class<T> clazz, U[] array) {
        if (array == null) {
            return null;
        }
        T[] retVal = (T[]) java.lang.reflect.Array.newInstance(clazz, array.length);
        for (int i=0; i < array.length; i++) {
            retVal[i] = (T)array[i];
        }

        return retVal;
	}
}
