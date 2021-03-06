package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class KnowledgeLanguage implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public KnowledgeLanguage() {}

    /**
     * element : active of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo active__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","active","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

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
      if (__typeMapper.isElement(__in, active__typeInfo)) {
        setActive(__typeMapper.readBoolean(__in, active__typeInfo, boolean.class));
      }
    }

    /**
     * element : defaultAssignee of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo defaultAssignee__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","defaultAssignee","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean defaultAssignee__is_set = false;

    private java.lang.String defaultAssignee;

    public java.lang.String getDefaultAssignee() {
      return defaultAssignee;
    }

    public void setDefaultAssignee(java.lang.String defaultAssignee) {
      this.defaultAssignee = defaultAssignee;
      defaultAssignee__is_set = true;
    }

    protected void setDefaultAssignee(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, defaultAssignee__typeInfo)) {
        setDefaultAssignee(__typeMapper.readString(__in, defaultAssignee__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : defaultAssigneeType of type {http://soap.sforce.com/2006/04/metadata}KnowledgeLanguageLookupValueType
     * java type: com.sforce.soap.metadata.KnowledgeLanguageLookupValueType
     */
    private static final com.sforce.ws.bind.TypeInfo defaultAssigneeType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","defaultAssigneeType","http://soap.sforce.com/2006/04/metadata","KnowledgeLanguageLookupValueType",0,1,true);

    private boolean defaultAssigneeType__is_set = false;

    private com.sforce.soap.metadata.KnowledgeLanguageLookupValueType defaultAssigneeType;

    public com.sforce.soap.metadata.KnowledgeLanguageLookupValueType getDefaultAssigneeType() {
      return defaultAssigneeType;
    }

    public void setDefaultAssigneeType(com.sforce.soap.metadata.KnowledgeLanguageLookupValueType defaultAssigneeType) {
      this.defaultAssigneeType = defaultAssigneeType;
      defaultAssigneeType__is_set = true;
    }

    protected void setDefaultAssigneeType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, defaultAssigneeType__typeInfo)) {
        setDefaultAssigneeType((com.sforce.soap.metadata.KnowledgeLanguageLookupValueType)__typeMapper.readObject(__in, defaultAssigneeType__typeInfo, com.sforce.soap.metadata.KnowledgeLanguageLookupValueType.class));
      }
    }

    /**
     * element : defaultReviewer of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo defaultReviewer__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","defaultReviewer","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean defaultReviewer__is_set = false;

    private java.lang.String defaultReviewer;

    public java.lang.String getDefaultReviewer() {
      return defaultReviewer;
    }

    public void setDefaultReviewer(java.lang.String defaultReviewer) {
      this.defaultReviewer = defaultReviewer;
      defaultReviewer__is_set = true;
    }

    protected void setDefaultReviewer(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, defaultReviewer__typeInfo)) {
        setDefaultReviewer(__typeMapper.readString(__in, defaultReviewer__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : defaultReviewerType of type {http://soap.sforce.com/2006/04/metadata}KnowledgeLanguageLookupValueType
     * java type: com.sforce.soap.metadata.KnowledgeLanguageLookupValueType
     */
    private static final com.sforce.ws.bind.TypeInfo defaultReviewerType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","defaultReviewerType","http://soap.sforce.com/2006/04/metadata","KnowledgeLanguageLookupValueType",0,1,true);

    private boolean defaultReviewerType__is_set = false;

    private com.sforce.soap.metadata.KnowledgeLanguageLookupValueType defaultReviewerType;

    public com.sforce.soap.metadata.KnowledgeLanguageLookupValueType getDefaultReviewerType() {
      return defaultReviewerType;
    }

    public void setDefaultReviewerType(com.sforce.soap.metadata.KnowledgeLanguageLookupValueType defaultReviewerType) {
      this.defaultReviewerType = defaultReviewerType;
      defaultReviewerType__is_set = true;
    }

    protected void setDefaultReviewerType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, defaultReviewerType__typeInfo)) {
        setDefaultReviewerType((com.sforce.soap.metadata.KnowledgeLanguageLookupValueType)__typeMapper.readObject(__in, defaultReviewerType__typeInfo, com.sforce.soap.metadata.KnowledgeLanguageLookupValueType.class));
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
       __typeMapper.writeBoolean(__out, active__typeInfo, active, active__is_set);
       __typeMapper.writeString(__out, defaultAssignee__typeInfo, defaultAssignee, defaultAssignee__is_set);
       __typeMapper.writeObject(__out, defaultAssigneeType__typeInfo, defaultAssigneeType, defaultAssigneeType__is_set);
       __typeMapper.writeString(__out, defaultReviewer__typeInfo, defaultReviewer, defaultReviewer__is_set);
       __typeMapper.writeObject(__out, defaultReviewerType__typeInfo, defaultReviewerType, defaultReviewerType__is_set);
       __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
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
        setActive(__in, __typeMapper);
        setDefaultAssignee(__in, __typeMapper);
        setDefaultAssigneeType(__in, __typeMapper);
        setDefaultReviewer(__in, __typeMapper);
        setDefaultReviewerType(__in, __typeMapper);
        setName(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[KnowledgeLanguage ");
      sb.append(" active='").append(com.sforce.ws.util.Verbose.toString(active)).append("'\n");
      sb.append(" defaultAssignee='").append(com.sforce.ws.util.Verbose.toString(defaultAssignee)).append("'\n");
      sb.append(" defaultAssigneeType='").append(com.sforce.ws.util.Verbose.toString(defaultAssigneeType)).append("'\n");
      sb.append(" defaultReviewer='").append(com.sforce.ws.util.Verbose.toString(defaultReviewer)).append("'\n");
      sb.append(" defaultReviewerType='").append(com.sforce.ws.util.Verbose.toString(defaultReviewerType)).append("'\n");
      sb.append(" name='").append(com.sforce.ws.util.Verbose.toString(name)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
