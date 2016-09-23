package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class Community extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public Community() {}

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
     * element : communityFeedPage of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo communityFeedPage__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","communityFeedPage","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean communityFeedPage__is_set = false;

    private java.lang.String communityFeedPage;

    public java.lang.String getCommunityFeedPage() {
      return communityFeedPage;
    }

    public void setCommunityFeedPage(java.lang.String communityFeedPage) {
      this.communityFeedPage = communityFeedPage;
      communityFeedPage__is_set = true;
    }

    protected void setCommunityFeedPage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, communityFeedPage__typeInfo)) {
        setCommunityFeedPage(__typeMapper.readString(__in, communityFeedPage__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : dataCategoryName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo dataCategoryName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","dataCategoryName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean dataCategoryName__is_set = false;

    private java.lang.String dataCategoryName;

    public java.lang.String getDataCategoryName() {
      return dataCategoryName;
    }

    public void setDataCategoryName(java.lang.String dataCategoryName) {
      this.dataCategoryName = dataCategoryName;
      dataCategoryName__is_set = true;
    }

    protected void setDataCategoryName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, dataCategoryName__typeInfo)) {
        setDataCategoryName(__typeMapper.readString(__in, dataCategoryName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : description of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo description__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","description","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean description__is_set = false;

    private java.lang.String description;

    public java.lang.String getDescription() {
      return description;
    }

    public void setDescription(java.lang.String description) {
      this.description = description;
      description__is_set = true;
    }

    protected void setDescription(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, description__typeInfo)) {
        setDescription(__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : devPortal of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo devPortal__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","devPortal","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean devPortal__is_set = false;

    private java.lang.String devPortal;

    public java.lang.String getDevPortal() {
      return devPortal;
    }

    public void setDevPortal(java.lang.String devPortal) {
      this.devPortal = devPortal;
      devPortal__is_set = true;
    }

    protected void setDevPortal(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, devPortal__typeInfo)) {
        setDevPortal(__typeMapper.readString(__in, devPortal__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : emailFooterDocument of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo emailFooterDocument__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","emailFooterDocument","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean emailFooterDocument__is_set = false;

    private java.lang.String emailFooterDocument;

    public java.lang.String getEmailFooterDocument() {
      return emailFooterDocument;
    }

    public void setEmailFooterDocument(java.lang.String emailFooterDocument) {
      this.emailFooterDocument = emailFooterDocument;
      emailFooterDocument__is_set = true;
    }

    protected void setEmailFooterDocument(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, emailFooterDocument__typeInfo)) {
        setEmailFooterDocument(__typeMapper.readString(__in, emailFooterDocument__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : emailHeaderDocument of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo emailHeaderDocument__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","emailHeaderDocument","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean emailHeaderDocument__is_set = false;

    private java.lang.String emailHeaderDocument;

    public java.lang.String getEmailHeaderDocument() {
      return emailHeaderDocument;
    }

    public void setEmailHeaderDocument(java.lang.String emailHeaderDocument) {
      this.emailHeaderDocument = emailHeaderDocument;
      emailHeaderDocument__is_set = true;
    }

    protected void setEmailHeaderDocument(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, emailHeaderDocument__typeInfo)) {
        setEmailHeaderDocument(__typeMapper.readString(__in, emailHeaderDocument__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : emailNotificationUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo emailNotificationUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","emailNotificationUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean emailNotificationUrl__is_set = false;

    private java.lang.String emailNotificationUrl;

    public java.lang.String getEmailNotificationUrl() {
      return emailNotificationUrl;
    }

    public void setEmailNotificationUrl(java.lang.String emailNotificationUrl) {
      this.emailNotificationUrl = emailNotificationUrl;
      emailNotificationUrl__is_set = true;
    }

    protected void setEmailNotificationUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, emailNotificationUrl__typeInfo)) {
        setEmailNotificationUrl(__typeMapper.readString(__in, emailNotificationUrl__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : enableChatterAnswers of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo enableChatterAnswers__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","enableChatterAnswers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean enableChatterAnswers__is_set = false;

    private boolean enableChatterAnswers;

    public boolean getEnableChatterAnswers() {
      return enableChatterAnswers;
    }

    public boolean isEnableChatterAnswers() {
      return enableChatterAnswers;
    }

    public void setEnableChatterAnswers(boolean enableChatterAnswers) {
      this.enableChatterAnswers = enableChatterAnswers;
      enableChatterAnswers__is_set = true;
    }

    protected void setEnableChatterAnswers(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, enableChatterAnswers__typeInfo)) {
        setEnableChatterAnswers(__typeMapper.readBoolean(__in, enableChatterAnswers__typeInfo, boolean.class));
      }
    }

    /**
     * element : enablePrivateQuestions of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo enablePrivateQuestions__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","enablePrivateQuestions","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean enablePrivateQuestions__is_set = false;

    private boolean enablePrivateQuestions;

    public boolean getEnablePrivateQuestions() {
      return enablePrivateQuestions;
    }

    public boolean isEnablePrivateQuestions() {
      return enablePrivateQuestions;
    }

    public void setEnablePrivateQuestions(boolean enablePrivateQuestions) {
      this.enablePrivateQuestions = enablePrivateQuestions;
      enablePrivateQuestions__is_set = true;
    }

    protected void setEnablePrivateQuestions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, enablePrivateQuestions__typeInfo)) {
        setEnablePrivateQuestions(__typeMapper.readBoolean(__in, enablePrivateQuestions__typeInfo, boolean.class));
      }
    }

    /**
     * element : expertsGroup of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo expertsGroup__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","expertsGroup","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean expertsGroup__is_set = false;

    private java.lang.String expertsGroup;

    public java.lang.String getExpertsGroup() {
      return expertsGroup;
    }

    public void setExpertsGroup(java.lang.String expertsGroup) {
      this.expertsGroup = expertsGroup;
      expertsGroup__is_set = true;
    }

    protected void setExpertsGroup(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, expertsGroup__typeInfo)) {
        setExpertsGroup(__typeMapper.readString(__in, expertsGroup__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : portal of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo portal__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","portal","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean portal__is_set = false;

    private java.lang.String portal;

    public java.lang.String getPortal() {
      return portal;
    }

    public void setPortal(java.lang.String portal) {
      this.portal = portal;
      portal__is_set = true;
    }

    protected void setPortal(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, portal__typeInfo)) {
        setPortal(__typeMapper.readString(__in, portal__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : reputationLevels of type {http://soap.sforce.com/2006/04/metadata}ReputationLevels
     * java type: com.sforce.soap.metadata.ReputationLevels
     */
    private static final com.sforce.ws.bind.TypeInfo reputationLevels__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","reputationLevels","http://soap.sforce.com/2006/04/metadata","ReputationLevels",0,1,true);

    private boolean reputationLevels__is_set = false;

    private com.sforce.soap.metadata.ReputationLevels reputationLevels;

    public com.sforce.soap.metadata.ReputationLevels getReputationLevels() {
      return reputationLevels;
    }

    public void setReputationLevels(com.sforce.soap.metadata.ReputationLevels reputationLevels) {
      this.reputationLevels = reputationLevels;
      reputationLevels__is_set = true;
    }

    protected void setReputationLevels(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, reputationLevels__typeInfo)) {
        setReputationLevels((com.sforce.soap.metadata.ReputationLevels)__typeMapper.readObject(__in, reputationLevels__typeInfo, com.sforce.soap.metadata.ReputationLevels.class));
      }
    }

    /**
     * element : showInPortal of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo showInPortal__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","showInPortal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean showInPortal__is_set = false;

    private boolean showInPortal;

    public boolean getShowInPortal() {
      return showInPortal;
    }

    public boolean isShowInPortal() {
      return showInPortal;
    }

    public void setShowInPortal(boolean showInPortal) {
      this.showInPortal = showInPortal;
      showInPortal__is_set = true;
    }

    protected void setShowInPortal(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, showInPortal__typeInfo)) {
        setShowInPortal(__typeMapper.readBoolean(__in, showInPortal__typeInfo, boolean.class));
      }
    }

    /**
     * element : site of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo site__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","site","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean site__is_set = false;

    private java.lang.String site;

    public java.lang.String getSite() {
      return site;
    }

    public void setSite(java.lang.String site) {
      this.site = site;
      site__is_set = true;
    }

    protected void setSite(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, site__typeInfo)) {
        setSite(__typeMapper.readString(__in, site__typeInfo, java.lang.String.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "Community");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeBoolean(__out, active__typeInfo, active, active__is_set);
       __typeMapper.writeString(__out, communityFeedPage__typeInfo, communityFeedPage, communityFeedPage__is_set);
       __typeMapper.writeString(__out, dataCategoryName__typeInfo, dataCategoryName, dataCategoryName__is_set);
       __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
       __typeMapper.writeString(__out, devPortal__typeInfo, devPortal, devPortal__is_set);
       __typeMapper.writeString(__out, emailFooterDocument__typeInfo, emailFooterDocument, emailFooterDocument__is_set);
       __typeMapper.writeString(__out, emailHeaderDocument__typeInfo, emailHeaderDocument, emailHeaderDocument__is_set);
       __typeMapper.writeString(__out, emailNotificationUrl__typeInfo, emailNotificationUrl, emailNotificationUrl__is_set);
       __typeMapper.writeBoolean(__out, enableChatterAnswers__typeInfo, enableChatterAnswers, enableChatterAnswers__is_set);
       __typeMapper.writeBoolean(__out, enablePrivateQuestions__typeInfo, enablePrivateQuestions, enablePrivateQuestions__is_set);
       __typeMapper.writeString(__out, expertsGroup__typeInfo, expertsGroup, expertsGroup__is_set);
       __typeMapper.writeString(__out, portal__typeInfo, portal, portal__is_set);
       __typeMapper.writeObject(__out, reputationLevels__typeInfo, reputationLevels, reputationLevels__is_set);
       __typeMapper.writeBoolean(__out, showInPortal__typeInfo, showInPortal, showInPortal__is_set);
       __typeMapper.writeString(__out, site__typeInfo, site, site__is_set);
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
        setCommunityFeedPage(__in, __typeMapper);
        setDataCategoryName(__in, __typeMapper);
        setDescription(__in, __typeMapper);
        setDevPortal(__in, __typeMapper);
        setEmailFooterDocument(__in, __typeMapper);
        setEmailHeaderDocument(__in, __typeMapper);
        setEmailNotificationUrl(__in, __typeMapper);
        setEnableChatterAnswers(__in, __typeMapper);
        setEnablePrivateQuestions(__in, __typeMapper);
        setExpertsGroup(__in, __typeMapper);
        setPortal(__in, __typeMapper);
        setReputationLevels(__in, __typeMapper);
        setShowInPortal(__in, __typeMapper);
        setSite(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[Community ");
      sb.append(super.toString());sb.append(" active='").append(com.sforce.ws.util.Verbose.toString(active)).append("'\n");
      sb.append(" communityFeedPage='").append(com.sforce.ws.util.Verbose.toString(communityFeedPage)).append("'\n");
      sb.append(" dataCategoryName='").append(com.sforce.ws.util.Verbose.toString(dataCategoryName)).append("'\n");
      sb.append(" description='").append(com.sforce.ws.util.Verbose.toString(description)).append("'\n");
      sb.append(" devPortal='").append(com.sforce.ws.util.Verbose.toString(devPortal)).append("'\n");
      sb.append(" emailFooterDocument='").append(com.sforce.ws.util.Verbose.toString(emailFooterDocument)).append("'\n");
      sb.append(" emailHeaderDocument='").append(com.sforce.ws.util.Verbose.toString(emailHeaderDocument)).append("'\n");
      sb.append(" emailNotificationUrl='").append(com.sforce.ws.util.Verbose.toString(emailNotificationUrl)).append("'\n");
      sb.append(" enableChatterAnswers='").append(com.sforce.ws.util.Verbose.toString(enableChatterAnswers)).append("'\n");
      sb.append(" enablePrivateQuestions='").append(com.sforce.ws.util.Verbose.toString(enablePrivateQuestions)).append("'\n");
      sb.append(" expertsGroup='").append(com.sforce.ws.util.Verbose.toString(expertsGroup)).append("'\n");
      sb.append(" portal='").append(com.sforce.ws.util.Verbose.toString(portal)).append("'\n");
      sb.append(" reputationLevels='").append(com.sforce.ws.util.Verbose.toString(reputationLevels)).append("'\n");
      sb.append(" showInPortal='").append(com.sforce.ws.util.Verbose.toString(showInPortal)).append("'\n");
      sb.append(" site='").append(com.sforce.ws.util.Verbose.toString(site)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
