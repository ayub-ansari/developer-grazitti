package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class FlowDecision extends com.sforce.soap.metadata.FlowNode {

    /**
     * Constructor
     */
    public FlowDecision() {}

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
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","defaultConnectorLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

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
      if (__typeMapper.isElement(__in, defaultConnectorLabel__typeInfo)) {
        setDefaultConnectorLabel(__typeMapper.readString(__in, defaultConnectorLabel__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : rules of type {http://soap.sforce.com/2006/04/metadata}FlowRule
     * java type: com.sforce.soap.metadata.FlowRule[]
     */
    private static final com.sforce.ws.bind.TypeInfo rules__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","rules","http://soap.sforce.com/2006/04/metadata","FlowRule",0,-1,true);

    private boolean rules__is_set = false;

    private com.sforce.soap.metadata.FlowRule[] rules = new com.sforce.soap.metadata.FlowRule[0];

    public com.sforce.soap.metadata.FlowRule[] getRules() {
      return rules;
    }

    public void setRules(com.sforce.soap.metadata.FlowRule[] rules) {
      this.rules = rules;
      rules__is_set = true;
    }

    protected void setRules(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, rules__typeInfo)) {
        setRules((com.sforce.soap.metadata.FlowRule[])__typeMapper.readObject(__in, rules__typeInfo, com.sforce.soap.metadata.FlowRule[].class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "FlowDecision");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, defaultConnector__typeInfo, defaultConnector, defaultConnector__is_set);
       __typeMapper.writeString(__out, defaultConnectorLabel__typeInfo, defaultConnectorLabel, defaultConnectorLabel__is_set);
       __typeMapper.writeObject(__out, rules__typeInfo, rules, rules__is_set);
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
        setRules(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[FlowDecision ");
      sb.append(super.toString());sb.append(" defaultConnector='").append(com.sforce.ws.util.Verbose.toString(defaultConnector)).append("'\n");
      sb.append(" defaultConnectorLabel='").append(com.sforce.ws.util.Verbose.toString(defaultConnectorLabel)).append("'\n");
      sb.append(" rules='").append(com.sforce.ws.util.Verbose.toString(rules)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
