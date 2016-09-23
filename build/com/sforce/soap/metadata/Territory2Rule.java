package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class Territory2Rule extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public Territory2Rule() {}

    /**
     * element : active of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo active__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean active__is_set = false;

    private boolean active;

    public boolean getActive() {
      return active;
    }

    public boolean isActive() {
      return active;
    }

    public void setActive(boolean active) {
      this.active = active;
      active__is_set = true;
    }

    protected void setActive(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, active__typeInfo)) {
        setActive(__typeMapper.readBoolean(__in, active__typeInfo, boolean.class));
      }
    }

    /**
     * element : booleanFilter of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo booleanFilter__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","booleanFilter","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean booleanFilter__is_set = false;

    private java.lang.String booleanFilter;

    public java.lang.String getBooleanFilter() {
      return booleanFilter;
    }

    public void setBooleanFilter(java.lang.String booleanFilter) {
      this.booleanFilter = booleanFilter;
      booleanFilter__is_set = true;
    }

    protected void setBooleanFilter(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, booleanFilter__typeInfo)) {
        setBooleanFilter(__typeMapper.readString(__in, booleanFilter__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean name__is_set = false;

    private java.lang.String name;

    public java.lang.String getName() {
      return name;
    }

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
     * element : objectType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo objectType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","objectType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean objectType__is_set = false;

    private java.lang.String objectType;

    public java.lang.String getObjectType() {
      return objectType;
    }

    public void setObjectType(java.lang.String objectType) {
      this.objectType = objectType;
      objectType__is_set = true;
    }

    protected void setObjectType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, objectType__typeInfo)) {
        setObjectType(__typeMapper.readString(__in, objectType__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : ruleItems of type {http://soap.sforce.com/2006/04/metadata}Territory2RuleItem
     * java type: com.sforce.soap.metadata.Territory2RuleItem[]
     */
    private static final com.sforce.ws.bind.TypeInfo ruleItems__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","ruleItems","http://soap.sforce.com/2006/04/metadata","Territory2RuleItem",0,-1,true);

    private boolean ruleItems__is_set = false;

    private com.sforce.soap.metadata.Territory2RuleItem[] ruleItems = new com.sforce.soap.metadata.Territory2RuleItem[0];

    public com.sforce.soap.metadata.Territory2RuleItem[] getRuleItems() {
      return ruleItems;
    }

    public void setRuleItems(com.sforce.soap.metadata.Territory2RuleItem[] ruleItems) {
      this.ruleItems = ruleItems;
      ruleItems__is_set = true;
    }

    protected void setRuleItems(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, ruleItems__typeInfo)) {
        setRuleItems((com.sforce.soap.metadata.Territory2RuleItem[])__typeMapper.readObject(__in, ruleItems__typeInfo, com.sforce.soap.metadata.Territory2RuleItem[].class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "Territory2Rule");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeBoolean(__out, active__typeInfo, active, active__is_set);
       __typeMapper.writeString(__out, booleanFilter__typeInfo, booleanFilter, booleanFilter__is_set);
       __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
       __typeMapper.writeString(__out, objectType__typeInfo, objectType, objectType__is_set);
       __typeMapper.writeObject(__out, ruleItems__typeInfo, ruleItems, ruleItems__is_set);
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
        setActive(__in, __typeMapper);
        setBooleanFilter(__in, __typeMapper);
        setName(__in, __typeMapper);
        setObjectType(__in, __typeMapper);
        setRuleItems(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[Territory2Rule ");
      sb.append(super.toString());sb.append(" active='").append(com.sforce.ws.util.Verbose.toString(active)).append("'\n");
      sb.append(" booleanFilter='").append(com.sforce.ws.util.Verbose.toString(booleanFilter)).append("'\n");
      sb.append(" name='").append(com.sforce.ws.util.Verbose.toString(name)).append("'\n");
      sb.append(" objectType='").append(com.sforce.ws.util.Verbose.toString(objectType)).append("'\n");
      sb.append(" ruleItems='").append(com.sforce.ws.util.Verbose.toString(ruleItems)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
