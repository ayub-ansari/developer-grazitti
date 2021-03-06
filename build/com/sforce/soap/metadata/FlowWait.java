package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class FlowWait extends com.sforce.soap.metadata.FlowNode {

    /**
     * Constructor
     */
    public FlowWait() {}

    /**
     * element : defaultConnector of type {http://soap.sforce.com/2006/04/metadata}FlowConnector
     * java type: com.sforce.soap.metadata.FlowConnector
     */
    private static final com.sforce.ws.bind.TypeInfo defaultConnector__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","defaultConnector","http://soap.sforce.com/2006/04/metadata","FlowConnector",0,1,true);

    private boolean defaultConnector__is_set = false;

    private com.sforce.soap.metadata.FlowConnector defaultConnector;

    public com.sforce.soap.metadata.FlowConnector getDefaultConnector() {
      return defaultConnector;
    }

    public void setDefaultConnector(com.sforce.soap.metadata.FlowConnector defaultConnector) {
      this.defaultConnector = defaultConnector;
      defaultConnector__is_set = true;
    }

    protected void setDefaultConnector(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, defaultConnector__typeInfo)) {
        setDefaultConnector((com.sforce.soap.metadata.FlowConnector)__typeMapper.readObject(__in, defaultConnector__typeInfo, com.sforce.soap.metadata.FlowConnector.class));
      }
    }

    /**
     * element : defaultConnectorLabel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo defaultConnectorLabel__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","defaultConnectorLabel","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean defaultConnectorLabel__is_set = false;

    private java.lang.String defaultConnectorLabel;

    public java.lang.String getDefaultConnectorLabel() {
      return defaultConnectorLabel;
    }

    public void setDefaultConnectorLabel(java.lang.String defaultConnectorLabel) {
      this.defaultConnectorLabel = defaultConnectorLabel;
      defaultConnectorLabel__is_set = true;
    }

    protected void setDefaultConnectorLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, defaultConnectorLabel__typeInfo)) {
        setDefaultConnectorLabel(__typeMapper.readString(__in, defaultConnectorLabel__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : faultConnector of type {http://soap.sforce.com/2006/04/metadata}FlowConnector
     * java type: com.sforce.soap.metadata.FlowConnector
     */
    private static final com.sforce.ws.bind.TypeInfo faultConnector__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","faultConnector","http://soap.sforce.com/2006/04/metadata","FlowConnector",0,1,true);

    private boolean faultConnector__is_set = false;

    private com.sforce.soap.metadata.FlowConnector faultConnector;

    public com.sforce.soap.metadata.FlowConnector getFaultConnector() {
      return faultConnector;
    }

    public void setFaultConnector(com.sforce.soap.metadata.FlowConnector faultConnector) {
      this.faultConnector = faultConnector;
      faultConnector__is_set = true;
    }

    protected void setFaultConnector(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, faultConnector__typeInfo)) {
        setFaultConnector((com.sforce.soap.metadata.FlowConnector)__typeMapper.readObject(__in, faultConnector__typeInfo, com.sforce.soap.metadata.FlowConnector.class));
      }
    }

    /**
     * element : waitEvents of type {http://soap.sforce.com/2006/04/metadata}FlowWaitEvent
     * java type: com.sforce.soap.metadata.FlowWaitEvent[]
     */
    private static final com.sforce.ws.bind.TypeInfo waitEvents__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","waitEvents","http://soap.sforce.com/2006/04/metadata","FlowWaitEvent",0,-1,true);

    private boolean waitEvents__is_set = false;

    private com.sforce.soap.metadata.FlowWaitEvent[] waitEvents = new com.sforce.soap.metadata.FlowWaitEvent[0];

    public com.sforce.soap.metadata.FlowWaitEvent[] getWaitEvents() {
      return waitEvents;
    }

    public void setWaitEvents(com.sforce.soap.metadata.FlowWaitEvent[] waitEvents) {
      this.waitEvents = waitEvents;
      waitEvents__is_set = true;
    }

    protected void setWaitEvents(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, waitEvents__typeInfo)) {
        setWaitEvents((com.sforce.soap.metadata.FlowWaitEvent[])__typeMapper.readObject(__in, waitEvents__typeInfo, com.sforce.soap.metadata.FlowWaitEvent[].class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "FlowWait");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, defaultConnector__typeInfo, defaultConnector, defaultConnector__is_set);
       __typeMapper.writeString(__out, defaultConnectorLabel__typeInfo, defaultConnectorLabel, defaultConnectorLabel__is_set);
       __typeMapper.writeObject(__out, faultConnector__typeInfo, faultConnector, faultConnector__is_set);
       __typeMapper.writeObject(__out, waitEvents__typeInfo, waitEvents, waitEvents__is_set);
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
        setDefaultConnector(__in, __typeMapper);
        setDefaultConnectorLabel(__in, __typeMapper);
        setFaultConnector(__in, __typeMapper);
        setWaitEvents(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[FlowWait ");
      sb.append(super.toString());sb.append(" defaultConnector='").append(com.sforce.ws.util.Verbose.toString(defaultConnector)).append("'\n");
      sb.append(" defaultConnectorLabel='").append(com.sforce.ws.util.Verbose.toString(defaultConnectorLabel)).append("'\n");
      sb.append(" faultConnector='").append(com.sforce.ws.util.Verbose.toString(faultConnector)).append("'\n");
      sb.append(" waitEvents='").append(com.sforce.ws.util.Verbose.toString(waitEvents)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
