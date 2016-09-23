package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class SingleEmailMessage extends com.sforce.soap.partner.Email implements ISingleEmailMessage{

    /**
     * Constructor
     */
    public SingleEmailMessage() {}

    /**
     * element : bccAddresses of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo bccAddresses__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","bccAddresses","http://www.w3.org/2001/XMLSchema","string",0,25,true);

    private boolean bccAddresses__is_set = false;

    private java.lang.String[] bccAddresses = new java.lang.String[0];

    @Override
    public java.lang.String[] getBccAddresses() {
      return bccAddresses;
    }

    @Override
    public void setBccAddresses(java.lang.String[] bccAddresses) {
      this.bccAddresses = castArray(java.lang.String.class, bccAddresses);
      bccAddresses__is_set = true;
    }

    protected void setBccAddresses(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, bccAddresses__typeInfo)) {
        setBccAddresses((java.lang.String[])__typeMapper.readObject(__in, bccAddresses__typeInfo, java.lang.String[].class));
      }
    }

    /**
     * element : ccAddresses of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo ccAddresses__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","ccAddresses","http://www.w3.org/2001/XMLSchema","string",0,25,true);

    private boolean ccAddresses__is_set = false;

    private java.lang.String[] ccAddresses = new java.lang.String[0];

    @Override
    public java.lang.String[] getCcAddresses() {
      return ccAddresses;
    }

    @Override
    public void setCcAddresses(java.lang.String[] ccAddresses) {
      this.ccAddresses = castArray(java.lang.String.class, ccAddresses);
      ccAddresses__is_set = true;
    }

    protected void setCcAddresses(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, ccAddresses__typeInfo)) {
        setCcAddresses((java.lang.String[])__typeMapper.readObject(__in, ccAddresses__typeInfo, java.lang.String[].class));
      }
    }

    /**
     * element : charset of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo charset__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","charset","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean charset__is_set = false;

    private java.lang.String charset;

    @Override
    public java.lang.String getCharset() {
      return charset;
    }

    @Override
    public void setCharset(java.lang.String charset) {
      this.charset = charset;
      charset__is_set = true;
    }

    protected void setCharset(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, charset__typeInfo)) {
        setCharset(__typeMapper.readString(__in, charset__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : documentAttachments of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo documentAttachments__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","documentAttachments","urn:partner.soap.sforce.com","ID",0,-1,true);

    private boolean documentAttachments__is_set = false;

    private java.lang.String[] documentAttachments = new java.lang.String[0];

    @Override
    public java.lang.String[] getDocumentAttachments() {
      return documentAttachments;
    }

    @Override
    public void setDocumentAttachments(java.lang.String[] documentAttachments) {
      this.documentAttachments = castArray(java.lang.String.class, documentAttachments);
      documentAttachments__is_set = true;
    }

    protected void setDocumentAttachments(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, documentAttachments__typeInfo)) {
        setDocumentAttachments((java.lang.String[])__typeMapper.readObject(__in, documentAttachments__typeInfo, java.lang.String[].class));
      }
    }

    /**
     * element : entityAttachments of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo entityAttachments__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","entityAttachments","urn:partner.soap.sforce.com","ID",0,-1,true);

    private boolean entityAttachments__is_set = false;

    private java.lang.String[] entityAttachments = new java.lang.String[0];

    @Override
    public java.lang.String[] getEntityAttachments() {
      return entityAttachments;
    }

    @Override
    public void setEntityAttachments(java.lang.String[] entityAttachments) {
      this.entityAttachments = castArray(java.lang.String.class, entityAttachments);
      entityAttachments__is_set = true;
    }

    protected void setEntityAttachments(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, entityAttachments__typeInfo)) {
        setEntityAttachments((java.lang.String[])__typeMapper.readObject(__in, entityAttachments__typeInfo, java.lang.String[].class));
      }
    }

    /**
     * element : fileAttachments of type {urn:partner.soap.sforce.com}EmailFileAttachment
     * java type: com.sforce.soap.partner.EmailFileAttachment[]
     */
    private static final com.sforce.ws.bind.TypeInfo fileAttachments__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","fileAttachments","urn:partner.soap.sforce.com","EmailFileAttachment",0,-1,true);

    private boolean fileAttachments__is_set = false;

    private com.sforce.soap.partner.EmailFileAttachment[] fileAttachments = new com.sforce.soap.partner.EmailFileAttachment[0];

    @Override
    public com.sforce.soap.partner.EmailFileAttachment[] getFileAttachments() {
      return fileAttachments;
    }

    @Override
    public void setFileAttachments(com.sforce.soap.partner.IEmailFileAttachment[] fileAttachments) {
      this.fileAttachments = castArray(com.sforce.soap.partner.EmailFileAttachment.class, fileAttachments);
      fileAttachments__is_set = true;
    }

    protected void setFileAttachments(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, fileAttachments__typeInfo)) {
        setFileAttachments((com.sforce.soap.partner.EmailFileAttachment[])__typeMapper.readObject(__in, fileAttachments__typeInfo, com.sforce.soap.partner.EmailFileAttachment[].class));
      }
    }

    /**
     * element : htmlBody of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo htmlBody__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","htmlBody","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean htmlBody__is_set = false;

    private java.lang.String htmlBody;

    @Override
    public java.lang.String getHtmlBody() {
      return htmlBody;
    }

    @Override
    public void setHtmlBody(java.lang.String htmlBody) {
      this.htmlBody = htmlBody;
      htmlBody__is_set = true;
    }

    protected void setHtmlBody(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, htmlBody__typeInfo)) {
        setHtmlBody(__typeMapper.readString(__in, htmlBody__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : inReplyTo of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo inReplyTo__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","inReplyTo","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean inReplyTo__is_set = false;

    private java.lang.String inReplyTo;

    @Override
    public java.lang.String getInReplyTo() {
      return inReplyTo;
    }

    @Override
    public void setInReplyTo(java.lang.String inReplyTo) {
      this.inReplyTo = inReplyTo;
      inReplyTo__is_set = true;
    }

    protected void setInReplyTo(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, inReplyTo__typeInfo)) {
        setInReplyTo(__typeMapper.readString(__in, inReplyTo__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : optOutPolicy of type {urn:partner.soap.sforce.com}SendEmailOptOutPolicy
     * java type: com.sforce.soap.partner.SendEmailOptOutPolicy
     */
    private static final com.sforce.ws.bind.TypeInfo optOutPolicy__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","optOutPolicy","urn:partner.soap.sforce.com","SendEmailOptOutPolicy",1,1,true);

    private boolean optOutPolicy__is_set = false;

    private com.sforce.soap.partner.SendEmailOptOutPolicy optOutPolicy;

    @Override
    public com.sforce.soap.partner.SendEmailOptOutPolicy getOptOutPolicy() {
      return optOutPolicy;
    }

    @Override
    public void setOptOutPolicy(com.sforce.soap.partner.SendEmailOptOutPolicy optOutPolicy) {
      this.optOutPolicy = optOutPolicy;
      optOutPolicy__is_set = true;
    }

    protected void setOptOutPolicy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, optOutPolicy__typeInfo)) {
        setOptOutPolicy((com.sforce.soap.partner.SendEmailOptOutPolicy)__typeMapper.readObject(__in, optOutPolicy__typeInfo, com.sforce.soap.partner.SendEmailOptOutPolicy.class));
      }
    }

    /**
     * element : orgWideEmailAddressId of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo orgWideEmailAddressId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","orgWideEmailAddressId","urn:partner.soap.sforce.com","ID",0,1,true);

    private boolean orgWideEmailAddressId__is_set = false;

    private java.lang.String orgWideEmailAddressId;

    @Override
    public java.lang.String getOrgWideEmailAddressId() {
      return orgWideEmailAddressId;
    }

    @Override
    public void setOrgWideEmailAddressId(java.lang.String orgWideEmailAddressId) {
      this.orgWideEmailAddressId = orgWideEmailAddressId;
      orgWideEmailAddressId__is_set = true;
    }

    protected void setOrgWideEmailAddressId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, orgWideEmailAddressId__typeInfo)) {
        setOrgWideEmailAddressId(__typeMapper.readString(__in, orgWideEmailAddressId__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : plainTextBody of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo plainTextBody__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","plainTextBody","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean plainTextBody__is_set = false;

    private java.lang.String plainTextBody;

    @Override
    public java.lang.String getPlainTextBody() {
      return plainTextBody;
    }

    @Override
    public void setPlainTextBody(java.lang.String plainTextBody) {
      this.plainTextBody = plainTextBody;
      plainTextBody__is_set = true;
    }

    protected void setPlainTextBody(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, plainTextBody__typeInfo)) {
        setPlainTextBody(__typeMapper.readString(__in, plainTextBody__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : references of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo references__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","references","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean references__is_set = false;

    private java.lang.String references;

    @Override
    public java.lang.String getReferences() {
      return references;
    }

    @Override
    public void setReferences(java.lang.String references) {
      this.references = references;
      references__is_set = true;
    }

    protected void setReferences(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, references__typeInfo)) {
        setReferences(__typeMapper.readString(__in, references__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : targetObjectId of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo targetObjectId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","targetObjectId","urn:partner.soap.sforce.com","ID",1,1,true);

    private boolean targetObjectId__is_set = false;

    private java.lang.String targetObjectId;

    @Override
    public java.lang.String getTargetObjectId() {
      return targetObjectId;
    }

    @Override
    public void setTargetObjectId(java.lang.String targetObjectId) {
      this.targetObjectId = targetObjectId;
      targetObjectId__is_set = true;
    }

    protected void setTargetObjectId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, targetObjectId__typeInfo)) {
        setTargetObjectId(__typeMapper.readString(__in, targetObjectId__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : templateId of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo templateId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","templateId","urn:partner.soap.sforce.com","ID",1,1,true);

    private boolean templateId__is_set = false;

    private java.lang.String templateId;

    @Override
    public java.lang.String getTemplateId() {
      return templateId;
    }

    @Override
    public void setTemplateId(java.lang.String templateId) {
      this.templateId = templateId;
      templateId__is_set = true;
    }

    protected void setTemplateId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, templateId__typeInfo)) {
        setTemplateId(__typeMapper.readString(__in, templateId__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : toAddresses of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo toAddresses__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","toAddresses","http://www.w3.org/2001/XMLSchema","string",0,100,true);

    private boolean toAddresses__is_set = false;

    private java.lang.String[] toAddresses = new java.lang.String[0];

    @Override
    public java.lang.String[] getToAddresses() {
      return toAddresses;
    }

    @Override
    public void setToAddresses(java.lang.String[] toAddresses) {
      this.toAddresses = castArray(java.lang.String.class, toAddresses);
      toAddresses__is_set = true;
    }

    protected void setToAddresses(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, toAddresses__typeInfo)) {
        setToAddresses((java.lang.String[])__typeMapper.readObject(__in, toAddresses__typeInfo, java.lang.String[].class));
      }
    }

    /**
     * element : treatBodiesAsTemplate of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private static final com.sforce.ws.bind.TypeInfo treatBodiesAsTemplate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","treatBodiesAsTemplate","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean treatBodiesAsTemplate__is_set = false;

    private java.lang.Boolean treatBodiesAsTemplate;

    @Override
    public java.lang.Boolean getTreatBodiesAsTemplate() {
      return treatBodiesAsTemplate;
    }

    @Override
    public void setTreatBodiesAsTemplate(java.lang.Boolean treatBodiesAsTemplate) {
      this.treatBodiesAsTemplate = treatBodiesAsTemplate;
      treatBodiesAsTemplate__is_set = true;
    }

    protected void setTreatBodiesAsTemplate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, treatBodiesAsTemplate__typeInfo)) {
        setTreatBodiesAsTemplate((java.lang.Boolean)__typeMapper.readObject(__in, treatBodiesAsTemplate__typeInfo, java.lang.Boolean.class));
      }
    }

    /**
     * element : treatTargetObjectAsRecipient of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private static final com.sforce.ws.bind.TypeInfo treatTargetObjectAsRecipient__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","treatTargetObjectAsRecipient","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean treatTargetObjectAsRecipient__is_set = false;

    private java.lang.Boolean treatTargetObjectAsRecipient;

    @Override
    public java.lang.Boolean getTreatTargetObjectAsRecipient() {
      return treatTargetObjectAsRecipient;
    }

    @Override
    public void setTreatTargetObjectAsRecipient(java.lang.Boolean treatTargetObjectAsRecipient) {
      this.treatTargetObjectAsRecipient = treatTargetObjectAsRecipient;
      treatTargetObjectAsRecipient__is_set = true;
    }

    protected void setTreatTargetObjectAsRecipient(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, treatTargetObjectAsRecipient__typeInfo)) {
        setTreatTargetObjectAsRecipient((java.lang.Boolean)__typeMapper.readObject(__in, treatTargetObjectAsRecipient__typeInfo, java.lang.Boolean.class));
      }
    }

    /**
     * element : whatId of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo whatId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","whatId","urn:partner.soap.sforce.com","ID",1,1,true);

    private boolean whatId__is_set = false;

    private java.lang.String whatId;

    @Override
    public java.lang.String getWhatId() {
      return whatId;
    }

    @Override
    public void setWhatId(java.lang.String whatId) {
      this.whatId = whatId;
      whatId__is_set = true;
    }

    protected void setWhatId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, whatId__typeInfo)) {
        setWhatId(__typeMapper.readString(__in, whatId__typeInfo, java.lang.String.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:partner.soap.sforce.com", "SingleEmailMessage");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, bccAddresses__typeInfo, bccAddresses, bccAddresses__is_set);
       __typeMapper.writeObject(__out, ccAddresses__typeInfo, ccAddresses, ccAddresses__is_set);
       __typeMapper.writeString(__out, charset__typeInfo, charset, charset__is_set);
       __typeMapper.writeObject(__out, documentAttachments__typeInfo, documentAttachments, documentAttachments__is_set);
       __typeMapper.writeObject(__out, entityAttachments__typeInfo, entityAttachments, entityAttachments__is_set);
       __typeMapper.writeObject(__out, fileAttachments__typeInfo, fileAttachments, fileAttachments__is_set);
       __typeMapper.writeString(__out, htmlBody__typeInfo, htmlBody, htmlBody__is_set);
       __typeMapper.writeString(__out, inReplyTo__typeInfo, inReplyTo, inReplyTo__is_set);
       __typeMapper.writeObject(__out, optOutPolicy__typeInfo, optOutPolicy, optOutPolicy__is_set);
       __typeMapper.writeString(__out, orgWideEmailAddressId__typeInfo, orgWideEmailAddressId, orgWideEmailAddressId__is_set);
       __typeMapper.writeString(__out, plainTextBody__typeInfo, plainTextBody, plainTextBody__is_set);
       __typeMapper.writeString(__out, references__typeInfo, references, references__is_set);
       __typeMapper.writeString(__out, targetObjectId__typeInfo, targetObjectId, targetObjectId__is_set);
       __typeMapper.writeString(__out, templateId__typeInfo, templateId, templateId__is_set);
       __typeMapper.writeObject(__out, toAddresses__typeInfo, toAddresses, toAddresses__is_set);
       __typeMapper.writeObject(__out, treatBodiesAsTemplate__typeInfo, treatBodiesAsTemplate, treatBodiesAsTemplate__is_set);
       __typeMapper.writeObject(__out, treatTargetObjectAsRecipient__typeInfo, treatTargetObjectAsRecipient, treatTargetObjectAsRecipient__is_set);
       __typeMapper.writeString(__out, whatId__typeInfo, whatId, whatId__is_set);
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
        setBccAddresses(__in, __typeMapper);
        setCcAddresses(__in, __typeMapper);
        setCharset(__in, __typeMapper);
        setDocumentAttachments(__in, __typeMapper);
        setEntityAttachments(__in, __typeMapper);
        setFileAttachments(__in, __typeMapper);
        setHtmlBody(__in, __typeMapper);
        setInReplyTo(__in, __typeMapper);
        setOptOutPolicy(__in, __typeMapper);
        setOrgWideEmailAddressId(__in, __typeMapper);
        setPlainTextBody(__in, __typeMapper);
        setReferences(__in, __typeMapper);
        setTargetObjectId(__in, __typeMapper);
        setTemplateId(__in, __typeMapper);
        setToAddresses(__in, __typeMapper);
        setTreatBodiesAsTemplate(__in, __typeMapper);
        setTreatTargetObjectAsRecipient(__in, __typeMapper);
        setWhatId(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[SingleEmailMessage ");
      sb.append(super.toString());sb.append(" bccAddresses='").append(com.sforce.ws.util.Verbose.toString(bccAddresses)).append("'\n");
      sb.append(" ccAddresses='").append(com.sforce.ws.util.Verbose.toString(ccAddresses)).append("'\n");
      sb.append(" charset='").append(com.sforce.ws.util.Verbose.toString(charset)).append("'\n");
      sb.append(" documentAttachments='").append(com.sforce.ws.util.Verbose.toString(documentAttachments)).append("'\n");
      sb.append(" entityAttachments='").append(com.sforce.ws.util.Verbose.toString(entityAttachments)).append("'\n");
      sb.append(" fileAttachments='").append(com.sforce.ws.util.Verbose.toString(fileAttachments)).append("'\n");
      sb.append(" htmlBody='").append(com.sforce.ws.util.Verbose.toString(htmlBody)).append("'\n");
      sb.append(" inReplyTo='").append(com.sforce.ws.util.Verbose.toString(inReplyTo)).append("'\n");
      sb.append(" optOutPolicy='").append(com.sforce.ws.util.Verbose.toString(optOutPolicy)).append("'\n");
      sb.append(" orgWideEmailAddressId='").append(com.sforce.ws.util.Verbose.toString(orgWideEmailAddressId)).append("'\n");
      sb.append(" plainTextBody='").append(com.sforce.ws.util.Verbose.toString(plainTextBody)).append("'\n");
      sb.append(" references='").append(com.sforce.ws.util.Verbose.toString(references)).append("'\n");
      sb.append(" targetObjectId='").append(com.sforce.ws.util.Verbose.toString(targetObjectId)).append("'\n");
      sb.append(" templateId='").append(com.sforce.ws.util.Verbose.toString(templateId)).append("'\n");
      sb.append(" toAddresses='").append(com.sforce.ws.util.Verbose.toString(toAddresses)).append("'\n");
      sb.append(" treatBodiesAsTemplate='").append(com.sforce.ws.util.Verbose.toString(treatBodiesAsTemplate)).append("'\n");
      sb.append(" treatTargetObjectAsRecipient='").append(com.sforce.ws.util.Verbose.toString(treatTargetObjectAsRecipient)).append("'\n");
      sb.append(" whatId='").append(com.sforce.ws.util.Verbose.toString(whatId)).append("'\n");
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
