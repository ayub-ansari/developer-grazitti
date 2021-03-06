package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class OrderSettings extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public OrderSettings() {}

    /**
     * element : enableNegativeQuantity of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo enableNegativeQuantity__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","enableNegativeQuantity","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean enableNegativeQuantity__is_set = false;

    private boolean enableNegativeQuantity;

    public boolean getEnableNegativeQuantity() {
      return enableNegativeQuantity;
    }

    public boolean isEnableNegativeQuantity() {
      return enableNegativeQuantity;
    }

    public void setEnableNegativeQuantity(boolean enableNegativeQuantity) {
      this.enableNegativeQuantity = enableNegativeQuantity;
      enableNegativeQuantity__is_set = true;
    }

    protected void setEnableNegativeQuantity(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, enableNegativeQuantity__typeInfo)) {
        setEnableNegativeQuantity(__typeMapper.readBoolean(__in, enableNegativeQuantity__typeInfo, boolean.class));
      }
    }

    /**
     * element : enableOrders of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo enableOrders__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","enableOrders","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean enableOrders__is_set = false;

    private boolean enableOrders;

    public boolean getEnableOrders() {
      return enableOrders;
    }

    public boolean isEnableOrders() {
      return enableOrders;
    }

    public void setEnableOrders(boolean enableOrders) {
      this.enableOrders = enableOrders;
      enableOrders__is_set = true;
    }

    protected void setEnableOrders(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, enableOrders__typeInfo)) {
        setEnableOrders(__typeMapper.readBoolean(__in, enableOrders__typeInfo, boolean.class));
      }
    }

    /**
     * element : enableReductionOrders of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo enableReductionOrders__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","enableReductionOrders","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean enableReductionOrders__is_set = false;

    private boolean enableReductionOrders;

    public boolean getEnableReductionOrders() {
      return enableReductionOrders;
    }

    public boolean isEnableReductionOrders() {
      return enableReductionOrders;
    }

    public void setEnableReductionOrders(boolean enableReductionOrders) {
      this.enableReductionOrders = enableReductionOrders;
      enableReductionOrders__is_set = true;
    }

    protected void setEnableReductionOrders(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, enableReductionOrders__typeInfo)) {
        setEnableReductionOrders(__typeMapper.readBoolean(__in, enableReductionOrders__typeInfo, boolean.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "OrderSettings");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeBoolean(__out, enableNegativeQuantity__typeInfo, enableNegativeQuantity, enableNegativeQuantity__is_set);
       __typeMapper.writeBoolean(__out, enableOrders__typeInfo, enableOrders, enableOrders__is_set);
       __typeMapper.writeBoolean(__out, enableReductionOrders__typeInfo, enableReductionOrders, enableReductionOrders__is_set);
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
        setEnableNegativeQuantity(__in, __typeMapper);
        setEnableOrders(__in, __typeMapper);
        setEnableReductionOrders(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[OrderSettings ");
      sb.append(super.toString());sb.append(" enableNegativeQuantity='").append(com.sforce.ws.util.Verbose.toString(enableNegativeQuantity)).append("'\n");
      sb.append(" enableOrders='").append(com.sforce.ws.util.Verbose.toString(enableOrders)).append("'\n");
      sb.append(" enableReductionOrders='").append(com.sforce.ws.util.Verbose.toString(enableReductionOrders)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
