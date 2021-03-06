package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class PushNotifications implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public PushNotifications() {}

    /**
     * element : pushNotification of type {http://soap.sforce.com/2006/04/metadata}PushNotification
     * java type: com.sforce.soap.metadata.PushNotification[]
     */
    private static final com.sforce.ws.bind.TypeInfo pushNotification__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","pushNotification","http://soap.sforce.com/2006/04/metadata","PushNotification",0,-1,true);

    private boolean pushNotification__is_set = false;

    private com.sforce.soap.metadata.PushNotification[] pushNotification = new com.sforce.soap.metadata.PushNotification[0];

    public com.sforce.soap.metadata.PushNotification[] getPushNotification() {
      return pushNotification;
    }

    public void setPushNotification(com.sforce.soap.metadata.PushNotification[] pushNotification) {
      this.pushNotification = pushNotification;
      pushNotification__is_set = true;
    }

    protected void setPushNotification(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, pushNotification__typeInfo)) {
        setPushNotification((com.sforce.soap.metadata.PushNotification[])__typeMapper.readObject(__in, pushNotification__typeInfo, com.sforce.soap.metadata.PushNotification[].class));
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
       __typeMapper.writeObject(__out, pushNotification__typeInfo, pushNotification, pushNotification__is_set);
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
        setPushNotification(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[PushNotifications ");
      sb.append(" pushNotification='").append(com.sforce.ws.util.Verbose.toString(pushNotification)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
