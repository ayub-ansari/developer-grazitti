package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class WorkflowAlert extends com.sforce.soap.metadata.WorkflowAction {

    /**
     * Constructor
     */
    public WorkflowAlert() {}

    /**
     * element : ccEmails of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo ccEmails__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","ccEmails","http://www.w3.org/2001/XMLSchema","string",0,-1,true);

    private boolean ccEmails__is_set = false;

    private java.lang.String[] ccEmails = new java.lang.String[0];

    public java.lang.String[] getCcEmails() {
      return ccEmails;
    }

    public void setCcEmails(java.lang.String[] ccEmails) {
      this.ccEmails = ccEmails;
      ccEmails__is_set = true;
    }

    protected void setCcEmails(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, ccEmails__typeInfo)) {
        setCcEmails((java.lang.String[])__typeMapper.readObject(__in, ccEmails__typeInfo, java.lang.String[].class));
      }
    }

    /**
     * element : description of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo description__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","description","http://www.w3.org/2001/XMLSchema","string",1,1,true);

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
      if (__typeMapper.verifyElement(__in, description__typeInfo)) {
        setDescription(__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : _protected of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo _protected__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","_protected","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean _protected__is_set = false;

    private boolean _protected;

    public boolean get_protected() {
      return _protected;
    }

    public boolean is_protected() {
      return _protected;
    }

    public void set_protected(boolean _protected) {
      this._protected = _protected;
      _protected__is_set = true;
    }

    protected void set_protected(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _protected__typeInfo)) {
        set_protected(__typeMapper.readBoolean(__in, _protected__typeInfo, boolean.class));
      }
    }

    /**
     * element : recipients of type {http://soap.sforce.com/2006/04/metadata}WorkflowEmailRecipient
     * java type: com.sforce.soap.metadata.WorkflowEmailRecipient[]
     */
    private static final com.sforce.ws.bind.TypeInfo recipients__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","recipients","http://soap.sforce.com/2006/04/metadata","WorkflowEmailRecipient",0,-1,true);

    private boolean recipients__is_set = false;

    private com.sforce.soap.metadata.WorkflowEmailRecipient[] recipients = new com.sforce.soap.metadata.WorkflowEmailRecipient[0];

    public com.sforce.soap.metadata.WorkflowEmailRecipient[] getRecipients() {
      return recipients;
    }

    public void setRecipients(com.sforce.soap.metadata.WorkflowEmailRecipient[] recipients) {
      this.recipients = recipients;
      recipients__is_set = true;
    }

    protected void setRecipients(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, recipients__typeInfo)) {
        setRecipients((com.sforce.soap.metadata.WorkflowEmailRecipient[])__typeMapper.readObject(__in, recipients__typeInfo, com.sforce.soap.metadata.WorkflowEmailRecipient[].class));
      }
    }

    /**
     * element : senderAddress of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo senderAddress__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","senderAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean senderAddress__is_set = false;

    private java.lang.String senderAddress;

    public java.lang.String getSenderAddress() {
      return senderAddress;
    }

    public void setSenderAddress(java.lang.String senderAddress) {
      this.senderAddress = senderAddress;
      senderAddress__is_set = true;
    }

    protected void setSenderAddress(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, senderAddress__typeInfo)) {
        setSenderAddress(__typeMapper.readString(__in, senderAddress__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : senderType of type {http://soap.sforce.com/2006/04/metadata}ActionEmailSenderType
     * java type: com.sforce.soap.metadata.ActionEmailSenderType
     */
    private static final com.sforce.ws.bind.TypeInfo senderType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","senderType","http://soap.sforce.com/2006/04/metadata","ActionEmailSenderType",0,1,true);

    private boolean senderType__is_set = false;

    private com.sforce.soap.metadata.ActionEmailSenderType senderType;

    public com.sforce.soap.metadata.ActionEmailSenderType getSenderType() {
      return senderType;
    }

    public void setSenderType(com.sforce.soap.metadata.ActionEmailSenderType senderType) {
      this.senderType = senderType;
      senderType__is_set = true;
    }

    protected void setSenderType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, senderType__typeInfo)) {
        setSenderType((com.sforce.soap.metadata.ActionEmailSenderType)__typeMapper.readObject(__in, senderType__typeInfo, com.sforce.soap.metadata.ActionEmailSenderType.class));
      }
    }

    /**
     * element : template of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo template__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","template","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean template__is_set = false;

    private java.lang.String template;

    public java.lang.String getTemplate() {
      return template;
    }

    public void setTemplate(java.lang.String template) {
      this.template = template;
      template__is_set = true;
    }

    protected void setTemplate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, template__typeInfo)) {
        setTemplate(__typeMapper.readString(__in, template__typeInfo, java.lang.String.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "WorkflowAlert");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, ccEmails__typeInfo, ccEmails, ccEmails__is_set);
       __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
       __typeMapper.writeBoolean(__out, _protected__typeInfo, _protected, _protected__is_set);
       __typeMapper.writeObject(__out, recipients__typeInfo, recipients, recipients__is_set);
       __typeMapper.writeString(__out, senderAddress__typeInfo, senderAddress, senderAddress__is_set);
       __typeMapper.writeObject(__out, senderType__typeInfo, senderType, senderType__is_set);
       __typeMapper.writeString(__out, template__typeInfo, template, template__is_set);
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
        setCcEmails(__in, __typeMapper);
        setDescription(__in, __typeMapper);
        set_protected(__in, __typeMapper);
        setRecipients(__in, __typeMapper);
        setSenderAddress(__in, __typeMapper);
        setSenderType(__in, __typeMapper);
        setTemplate(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[WorkflowAlert ");
      sb.append(super.toString());sb.append(" ccEmails='").append(com.sforce.ws.util.Verbose.toString(ccEmails)).append("'\n");
      sb.append(" description='").append(com.sforce.ws.util.Verbose.toString(description)).append("'\n");
      sb.append(" _protected='").append(com.sforce.ws.util.Verbose.toString(_protected)).append("'\n");
      sb.append(" recipients='").append(com.sforce.ws.util.Verbose.toString(recipients)).append("'\n");
      sb.append(" senderAddress='").append(com.sforce.ws.util.Verbose.toString(senderAddress)).append("'\n");
      sb.append(" senderType='").append(com.sforce.ws.util.Verbose.toString(senderType)).append("'\n");
      sb.append(" template='").append(com.sforce.ws.util.Verbose.toString(template)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
