package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class TransactionSecurityAction implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public TransactionSecurityAction() {}

    /**
     * element : block of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo block__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","block","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean block__is_set = false;

    private boolean block;

    public boolean getBlock() {
      return block;
    }

    public boolean isBlock() {
      return block;
    }

    public void setBlock(boolean block) {
      this.block = block;
      block__is_set = true;
    }

    protected void setBlock(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, block__typeInfo)) {
        setBlock(__typeMapper.readBoolean(__in, block__typeInfo, boolean.class));
      }
    }

    /**
     * element : endSession of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo endSession__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","endSession","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean endSession__is_set = false;

    private boolean endSession;

    public boolean getEndSession() {
      return endSession;
    }

    public boolean isEndSession() {
      return endSession;
    }

    public void setEndSession(boolean endSession) {
      this.endSession = endSession;
      endSession__is_set = true;
    }

    protected void setEndSession(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, endSession__typeInfo)) {
        setEndSession(__typeMapper.readBoolean(__in, endSession__typeInfo, boolean.class));
      }
    }

    /**
     * element : notifications of type {http://soap.sforce.com/2006/04/metadata}TransactionSecurityNotification
     * java type: com.sforce.soap.metadata.TransactionSecurityNotification[]
     */
    private static final com.sforce.ws.bind.TypeInfo notifications__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","notifications","http://soap.sforce.com/2006/04/metadata","TransactionSecurityNotification",0,-1,true);

    private boolean notifications__is_set = false;

    private com.sforce.soap.metadata.TransactionSecurityNotification[] notifications = new com.sforce.soap.metadata.TransactionSecurityNotification[0];

    public com.sforce.soap.metadata.TransactionSecurityNotification[] getNotifications() {
      return notifications;
    }

    public void setNotifications(com.sforce.soap.metadata.TransactionSecurityNotification[] notifications) {
      this.notifications = notifications;
      notifications__is_set = true;
    }

    protected void setNotifications(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, notifications__typeInfo)) {
        setNotifications((com.sforce.soap.metadata.TransactionSecurityNotification[])__typeMapper.readObject(__in, notifications__typeInfo, com.sforce.soap.metadata.TransactionSecurityNotification[].class));
      }
    }

    /**
     * element : twoFactorAuthentication of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo twoFactorAuthentication__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","twoFactorAuthentication","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean twoFactorAuthentication__is_set = false;

    private boolean twoFactorAuthentication;

    public boolean getTwoFactorAuthentication() {
      return twoFactorAuthentication;
    }

    public boolean isTwoFactorAuthentication() {
      return twoFactorAuthentication;
    }

    public void setTwoFactorAuthentication(boolean twoFactorAuthentication) {
      this.twoFactorAuthentication = twoFactorAuthentication;
      twoFactorAuthentication__is_set = true;
    }

    protected void setTwoFactorAuthentication(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, twoFactorAuthentication__typeInfo)) {
        setTwoFactorAuthentication(__typeMapper.readBoolean(__in, twoFactorAuthentication__typeInfo, boolean.class));
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
       __typeMapper.writeBoolean(__out, block__typeInfo, block, block__is_set);
       __typeMapper.writeBoolean(__out, endSession__typeInfo, endSession, endSession__is_set);
       __typeMapper.writeObject(__out, notifications__typeInfo, notifications, notifications__is_set);
       __typeMapper.writeBoolean(__out, twoFactorAuthentication__typeInfo, twoFactorAuthentication, twoFactorAuthentication__is_set);
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
        setBlock(__in, __typeMapper);
        setEndSession(__in, __typeMapper);
        setNotifications(__in, __typeMapper);
        setTwoFactorAuthentication(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[TransactionSecurityAction ");
      sb.append(" block='").append(com.sforce.ws.util.Verbose.toString(block)).append("'\n");
      sb.append(" endSession='").append(com.sforce.ws.util.Verbose.toString(endSession)).append("'\n");
      sb.append(" notifications='").append(com.sforce.ws.util.Verbose.toString(notifications)).append("'\n");
      sb.append(" twoFactorAuthentication='").append(com.sforce.ws.util.Verbose.toString(twoFactorAuthentication)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
