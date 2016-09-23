package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class FieldOverride implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public FieldOverride() {}

    /**
     * element : field of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo field__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","field","http://www.w3.org/2001/XMLSchema","string",1,1,true);

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
      if (__typeMapper.verifyElement(__in, field__typeInfo)) {
        setField(__typeMapper.readString(__in, field__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : formula of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo formula__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","formula","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean formula__is_set = false;

    private java.lang.String formula;

    public java.lang.String getFormula() {
      return formula;
    }

    public void setFormula(java.lang.String formula) {
      this.formula = formula;
      formula__is_set = true;
    }

    protected void setFormula(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, formula__typeInfo)) {
        setFormula(__typeMapper.readString(__in, formula__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : literalValue of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo literalValue__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","literalValue","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean literalValue__is_set = false;

    private java.lang.String literalValue;

    public java.lang.String getLiteralValue() {
      return literalValue;
    }

    public void setLiteralValue(java.lang.String literalValue) {
      this.literalValue = literalValue;
      literalValue__is_set = true;
    }

    protected void setLiteralValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, literalValue__typeInfo)) {
        setLiteralValue(__typeMapper.readString(__in, literalValue__typeInfo, java.lang.String.class));
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
       __typeMapper.writeString(__out, formula__typeInfo, formula, formula__is_set);
       __typeMapper.writeString(__out, literalValue__typeInfo, literalValue, literalValue__is_set);
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
        setFormula(__in, __typeMapper);
        setLiteralValue(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[FieldOverride ");
      sb.append(" field='").append(com.sforce.ws.util.Verbose.toString(field)).append("'\n");
      sb.append(" formula='").append(com.sforce.ws.util.Verbose.toString(formula)).append("'\n");
      sb.append(" literalValue='").append(com.sforce.ws.util.Verbose.toString(literalValue)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
