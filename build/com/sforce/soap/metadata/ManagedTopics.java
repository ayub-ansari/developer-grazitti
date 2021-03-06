package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ManagedTopics extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public ManagedTopics() {}

    /**
     * element : managedTopic of type {http://soap.sforce.com/2006/04/metadata}ManagedTopic
     * java type: com.sforce.soap.metadata.ManagedTopic[]
     */
    private static final com.sforce.ws.bind.TypeInfo managedTopic__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","managedTopic","http://soap.sforce.com/2006/04/metadata","ManagedTopic",0,-1,true);

    private boolean managedTopic__is_set = false;

    private com.sforce.soap.metadata.ManagedTopic[] managedTopic = new com.sforce.soap.metadata.ManagedTopic[0];

    public com.sforce.soap.metadata.ManagedTopic[] getManagedTopic() {
      return managedTopic;
    }

    public void setManagedTopic(com.sforce.soap.metadata.ManagedTopic[] managedTopic) {
      this.managedTopic = managedTopic;
      managedTopic__is_set = true;
    }

    protected void setManagedTopic(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, managedTopic__typeInfo)) {
        setManagedTopic((com.sforce.soap.metadata.ManagedTopic[])__typeMapper.readObject(__in, managedTopic__typeInfo, com.sforce.soap.metadata.ManagedTopic[].class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "ManagedTopics");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, managedTopic__typeInfo, managedTopic, managedTopic__is_set);
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
        setManagedTopic(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ManagedTopics ");
      sb.append(super.toString());sb.append(" managedTopic='").append(com.sforce.ws.util.Verbose.toString(managedTopic)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
