package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class LeadConvert implements com.sforce.ws.bind.XMLizable , ILeadConvert{

    /**
     * Constructor
     */
    public LeadConvert() {}

    /**
     * element : accountId of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo accountId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","accountId","urn:partner.soap.sforce.com","ID",1,1,true);

    private boolean accountId__is_set = false;

    private java.lang.String accountId;

    @Override
    public java.lang.String getAccountId() {
      return accountId;
    }

    @Override
    public void setAccountId(java.lang.String accountId) {
      this.accountId = accountId;
      accountId__is_set = true;
    }

    protected void setAccountId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, accountId__typeInfo)) {
        setAccountId(__typeMapper.readString(__in, accountId__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : contactId of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo contactId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","contactId","urn:partner.soap.sforce.com","ID",1,1,true);

    private boolean contactId__is_set = false;

    private java.lang.String contactId;

    @Override
    public java.lang.String getContactId() {
      return contactId;
    }

    @Override
    public void setContactId(java.lang.String contactId) {
      this.contactId = contactId;
      contactId__is_set = true;
    }

    protected void setContactId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, contactId__typeInfo)) {
        setContactId(__typeMapper.readString(__in, contactId__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : convertedStatus of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo convertedStatus__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","convertedStatus","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean convertedStatus__is_set = false;

    private java.lang.String convertedStatus;

    @Override
    public java.lang.String getConvertedStatus() {
      return convertedStatus;
    }

    @Override
    public void setConvertedStatus(java.lang.String convertedStatus) {
      this.convertedStatus = convertedStatus;
      convertedStatus__is_set = true;
    }

    protected void setConvertedStatus(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, convertedStatus__typeInfo)) {
        setConvertedStatus(__typeMapper.readString(__in, convertedStatus__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : doNotCreateOpportunity of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo doNotCreateOpportunity__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","doNotCreateOpportunity","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean doNotCreateOpportunity__is_set = false;

    private boolean doNotCreateOpportunity;

    @Override
    public boolean getDoNotCreateOpportunity() {
      return doNotCreateOpportunity;
    }

    @Override
    public boolean isDoNotCreateOpportunity() {
      return doNotCreateOpportunity;
    }

    @Override
    public void setDoNotCreateOpportunity(boolean doNotCreateOpportunity) {
      this.doNotCreateOpportunity = doNotCreateOpportunity;
      doNotCreateOpportunity__is_set = true;
    }

    protected void setDoNotCreateOpportunity(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, doNotCreateOpportunity__typeInfo)) {
        setDoNotCreateOpportunity(__typeMapper.readBoolean(__in, doNotCreateOpportunity__typeInfo, boolean.class));
      }
    }

    /**
     * element : leadId of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo leadId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","leadId","urn:partner.soap.sforce.com","ID",1,1,true);

    private boolean leadId__is_set = false;

    private java.lang.String leadId;

    @Override
    public java.lang.String getLeadId() {
      return leadId;
    }

    @Override
    public void setLeadId(java.lang.String leadId) {
      this.leadId = leadId;
      leadId__is_set = true;
    }

    protected void setLeadId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, leadId__typeInfo)) {
        setLeadId(__typeMapper.readString(__in, leadId__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : opportunityName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo opportunityName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","opportunityName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean opportunityName__is_set = false;

    private java.lang.String opportunityName;

    @Override
    public java.lang.String getOpportunityName() {
      return opportunityName;
    }

    @Override
    public void setOpportunityName(java.lang.String opportunityName) {
      this.opportunityName = opportunityName;
      opportunityName__is_set = true;
    }

    protected void setOpportunityName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, opportunityName__typeInfo)) {
        setOpportunityName(__typeMapper.readString(__in, opportunityName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : overwriteLeadSource of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo overwriteLeadSource__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","overwriteLeadSource","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean overwriteLeadSource__is_set = false;

    private boolean overwriteLeadSource;

    @Override
    public boolean getOverwriteLeadSource() {
      return overwriteLeadSource;
    }

    @Override
    public boolean isOverwriteLeadSource() {
      return overwriteLeadSource;
    }

    @Override
    public void setOverwriteLeadSource(boolean overwriteLeadSource) {
      this.overwriteLeadSource = overwriteLeadSource;
      overwriteLeadSource__is_set = true;
    }

    protected void setOverwriteLeadSource(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, overwriteLeadSource__typeInfo)) {
        setOverwriteLeadSource(__typeMapper.readBoolean(__in, overwriteLeadSource__typeInfo, boolean.class));
      }
    }

    /**
     * element : ownerId of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo ownerId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","ownerId","urn:partner.soap.sforce.com","ID",1,1,true);

    private boolean ownerId__is_set = false;

    private java.lang.String ownerId;

    @Override
    public java.lang.String getOwnerId() {
      return ownerId;
    }

    @Override
    public void setOwnerId(java.lang.String ownerId) {
      this.ownerId = ownerId;
      ownerId__is_set = true;
    }

    protected void setOwnerId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, ownerId__typeInfo)) {
        setOwnerId(__typeMapper.readString(__in, ownerId__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : sendNotificationEmail of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo sendNotificationEmail__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","sendNotificationEmail","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean sendNotificationEmail__is_set = false;

    private boolean sendNotificationEmail;

    @Override
    public boolean getSendNotificationEmail() {
      return sendNotificationEmail;
    }

    @Override
    public boolean isSendNotificationEmail() {
      return sendNotificationEmail;
    }

    @Override
    public void setSendNotificationEmail(boolean sendNotificationEmail) {
      this.sendNotificationEmail = sendNotificationEmail;
      sendNotificationEmail__is_set = true;
    }

    protected void setSendNotificationEmail(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, sendNotificationEmail__typeInfo)) {
        setSendNotificationEmail(__typeMapper.readBoolean(__in, sendNotificationEmail__typeInfo, boolean.class));
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
       __typeMapper.writeString(__out, accountId__typeInfo, accountId, accountId__is_set);
       __typeMapper.writeString(__out, contactId__typeInfo, contactId, contactId__is_set);
       __typeMapper.writeString(__out, convertedStatus__typeInfo, convertedStatus, convertedStatus__is_set);
       __typeMapper.writeBoolean(__out, doNotCreateOpportunity__typeInfo, doNotCreateOpportunity, doNotCreateOpportunity__is_set);
       __typeMapper.writeString(__out, leadId__typeInfo, leadId, leadId__is_set);
       __typeMapper.writeString(__out, opportunityName__typeInfo, opportunityName, opportunityName__is_set);
       __typeMapper.writeBoolean(__out, overwriteLeadSource__typeInfo, overwriteLeadSource, overwriteLeadSource__is_set);
       __typeMapper.writeString(__out, ownerId__typeInfo, ownerId, ownerId__is_set);
       __typeMapper.writeBoolean(__out, sendNotificationEmail__typeInfo, sendNotificationEmail, sendNotificationEmail__is_set);
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
        setAccountId(__in, __typeMapper);
        setContactId(__in, __typeMapper);
        setConvertedStatus(__in, __typeMapper);
        setDoNotCreateOpportunity(__in, __typeMapper);
        setLeadId(__in, __typeMapper);
        setOpportunityName(__in, __typeMapper);
        setOverwriteLeadSource(__in, __typeMapper);
        setOwnerId(__in, __typeMapper);
        setSendNotificationEmail(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[LeadConvert ");
      sb.append(" accountId='").append(com.sforce.ws.util.Verbose.toString(accountId)).append("'\n");
      sb.append(" contactId='").append(com.sforce.ws.util.Verbose.toString(contactId)).append("'\n");
      sb.append(" convertedStatus='").append(com.sforce.ws.util.Verbose.toString(convertedStatus)).append("'\n");
      sb.append(" doNotCreateOpportunity='").append(com.sforce.ws.util.Verbose.toString(doNotCreateOpportunity)).append("'\n");
      sb.append(" leadId='").append(com.sforce.ws.util.Verbose.toString(leadId)).append("'\n");
      sb.append(" opportunityName='").append(com.sforce.ws.util.Verbose.toString(opportunityName)).append("'\n");
      sb.append(" overwriteLeadSource='").append(com.sforce.ws.util.Verbose.toString(overwriteLeadSource)).append("'\n");
      sb.append(" ownerId='").append(com.sforce.ws.util.Verbose.toString(ownerId)).append("'\n");
      sb.append(" sendNotificationEmail='").append(com.sforce.ws.util.Verbose.toString(sendNotificationEmail)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
