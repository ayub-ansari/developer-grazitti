package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class Workflow extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public Workflow() {}

    /**
     * element : alerts of type {http://soap.sforce.com/2006/04/metadata}WorkflowAlert
     * java type: com.sforce.soap.metadata.WorkflowAlert[]
     */
    private static final com.sforce.ws.bind.TypeInfo alerts__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","alerts","http://soap.sforce.com/2006/04/metadata","WorkflowAlert",0,-1,true);

    private boolean alerts__is_set = false;

    private com.sforce.soap.metadata.WorkflowAlert[] alerts = new com.sforce.soap.metadata.WorkflowAlert[0];

    public com.sforce.soap.metadata.WorkflowAlert[] getAlerts() {
      return alerts;
    }

    public void setAlerts(com.sforce.soap.metadata.WorkflowAlert[] alerts) {
      this.alerts = alerts;
      alerts__is_set = true;
    }

    protected void setAlerts(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, alerts__typeInfo)) {
        setAlerts((com.sforce.soap.metadata.WorkflowAlert[])__typeMapper.readObject(__in, alerts__typeInfo, com.sforce.soap.metadata.WorkflowAlert[].class));
      }
    }

    /**
     * element : fieldUpdates of type {http://soap.sforce.com/2006/04/metadata}WorkflowFieldUpdate
     * java type: com.sforce.soap.metadata.WorkflowFieldUpdate[]
     */
    private static final com.sforce.ws.bind.TypeInfo fieldUpdates__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","fieldUpdates","http://soap.sforce.com/2006/04/metadata","WorkflowFieldUpdate",0,-1,true);

    private boolean fieldUpdates__is_set = false;

    private com.sforce.soap.metadata.WorkflowFieldUpdate[] fieldUpdates = new com.sforce.soap.metadata.WorkflowFieldUpdate[0];

    public com.sforce.soap.metadata.WorkflowFieldUpdate[] getFieldUpdates() {
      return fieldUpdates;
    }

    public void setFieldUpdates(com.sforce.soap.metadata.WorkflowFieldUpdate[] fieldUpdates) {
      this.fieldUpdates = fieldUpdates;
      fieldUpdates__is_set = true;
    }

    protected void setFieldUpdates(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, fieldUpdates__typeInfo)) {
        setFieldUpdates((com.sforce.soap.metadata.WorkflowFieldUpdate[])__typeMapper.readObject(__in, fieldUpdates__typeInfo, com.sforce.soap.metadata.WorkflowFieldUpdate[].class));
      }
    }

    /**
     * element : flowActions of type {http://soap.sforce.com/2006/04/metadata}WorkflowFlowAction
     * java type: com.sforce.soap.metadata.WorkflowFlowAction[]
     */
    private static final com.sforce.ws.bind.TypeInfo flowActions__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","flowActions","http://soap.sforce.com/2006/04/metadata","WorkflowFlowAction",0,-1,true);

    private boolean flowActions__is_set = false;

    private com.sforce.soap.metadata.WorkflowFlowAction[] flowActions = new com.sforce.soap.metadata.WorkflowFlowAction[0];

    public com.sforce.soap.metadata.WorkflowFlowAction[] getFlowActions() {
      return flowActions;
    }

    public void setFlowActions(com.sforce.soap.metadata.WorkflowFlowAction[] flowActions) {
      this.flowActions = flowActions;
      flowActions__is_set = true;
    }

    protected void setFlowActions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, flowActions__typeInfo)) {
        setFlowActions((com.sforce.soap.metadata.WorkflowFlowAction[])__typeMapper.readObject(__in, flowActions__typeInfo, com.sforce.soap.metadata.WorkflowFlowAction[].class));
      }
    }

    /**
     * element : knowledgePublishes of type {http://soap.sforce.com/2006/04/metadata}WorkflowKnowledgePublish
     * java type: com.sforce.soap.metadata.WorkflowKnowledgePublish[]
     */
    private static final com.sforce.ws.bind.TypeInfo knowledgePublishes__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","knowledgePublishes","http://soap.sforce.com/2006/04/metadata","WorkflowKnowledgePublish",0,-1,true);

    private boolean knowledgePublishes__is_set = false;

    private com.sforce.soap.metadata.WorkflowKnowledgePublish[] knowledgePublishes = new com.sforce.soap.metadata.WorkflowKnowledgePublish[0];

    public com.sforce.soap.metadata.WorkflowKnowledgePublish[] getKnowledgePublishes() {
      return knowledgePublishes;
    }

    public void setKnowledgePublishes(com.sforce.soap.metadata.WorkflowKnowledgePublish[] knowledgePublishes) {
      this.knowledgePublishes = knowledgePublishes;
      knowledgePublishes__is_set = true;
    }

    protected void setKnowledgePublishes(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, knowledgePublishes__typeInfo)) {
        setKnowledgePublishes((com.sforce.soap.metadata.WorkflowKnowledgePublish[])__typeMapper.readObject(__in, knowledgePublishes__typeInfo, com.sforce.soap.metadata.WorkflowKnowledgePublish[].class));
      }
    }

    /**
     * element : outboundMessages of type {http://soap.sforce.com/2006/04/metadata}WorkflowOutboundMessage
     * java type: com.sforce.soap.metadata.WorkflowOutboundMessage[]
     */
    private static final com.sforce.ws.bind.TypeInfo outboundMessages__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","outboundMessages","http://soap.sforce.com/2006/04/metadata","WorkflowOutboundMessage",0,-1,true);

    private boolean outboundMessages__is_set = false;

    private com.sforce.soap.metadata.WorkflowOutboundMessage[] outboundMessages = new com.sforce.soap.metadata.WorkflowOutboundMessage[0];

    public com.sforce.soap.metadata.WorkflowOutboundMessage[] getOutboundMessages() {
      return outboundMessages;
    }

    public void setOutboundMessages(com.sforce.soap.metadata.WorkflowOutboundMessage[] outboundMessages) {
      this.outboundMessages = outboundMessages;
      outboundMessages__is_set = true;
    }

    protected void setOutboundMessages(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, outboundMessages__typeInfo)) {
        setOutboundMessages((com.sforce.soap.metadata.WorkflowOutboundMessage[])__typeMapper.readObject(__in, outboundMessages__typeInfo, com.sforce.soap.metadata.WorkflowOutboundMessage[].class));
      }
    }

    /**
     * element : rules of type {http://soap.sforce.com/2006/04/metadata}WorkflowRule
     * java type: com.sforce.soap.metadata.WorkflowRule[]
     */
    private static final com.sforce.ws.bind.TypeInfo rules__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","rules","http://soap.sforce.com/2006/04/metadata","WorkflowRule",0,-1,true);

    private boolean rules__is_set = false;

    private com.sforce.soap.metadata.WorkflowRule[] rules = new com.sforce.soap.metadata.WorkflowRule[0];

    public com.sforce.soap.metadata.WorkflowRule[] getRules() {
      return rules;
    }

    public void setRules(com.sforce.soap.metadata.WorkflowRule[] rules) {
      this.rules = rules;
      rules__is_set = true;
    }

    protected void setRules(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, rules__typeInfo)) {
        setRules((com.sforce.soap.metadata.WorkflowRule[])__typeMapper.readObject(__in, rules__typeInfo, com.sforce.soap.metadata.WorkflowRule[].class));
      }
    }

    /**
     * element : send of type {http://soap.sforce.com/2006/04/metadata}WorkflowSend
     * java type: com.sforce.soap.metadata.WorkflowSend[]
     */
    private static final com.sforce.ws.bind.TypeInfo send__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","send","http://soap.sforce.com/2006/04/metadata","WorkflowSend",0,-1,true);

    private boolean send__is_set = false;

    private com.sforce.soap.metadata.WorkflowSend[] send = new com.sforce.soap.metadata.WorkflowSend[0];

    public com.sforce.soap.metadata.WorkflowSend[] getSend() {
      return send;
    }

    public void setSend(com.sforce.soap.metadata.WorkflowSend[] send) {
      this.send = send;
      send__is_set = true;
    }

    protected void setSend(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, send__typeInfo)) {
        setSend((com.sforce.soap.metadata.WorkflowSend[])__typeMapper.readObject(__in, send__typeInfo, com.sforce.soap.metadata.WorkflowSend[].class));
      }
    }

    /**
     * element : tasks of type {http://soap.sforce.com/2006/04/metadata}WorkflowTask
     * java type: com.sforce.soap.metadata.WorkflowTask[]
     */
    private static final com.sforce.ws.bind.TypeInfo tasks__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","tasks","http://soap.sforce.com/2006/04/metadata","WorkflowTask",0,-1,true);

    private boolean tasks__is_set = false;

    private com.sforce.soap.metadata.WorkflowTask[] tasks = new com.sforce.soap.metadata.WorkflowTask[0];

    public com.sforce.soap.metadata.WorkflowTask[] getTasks() {
      return tasks;
    }

    public void setTasks(com.sforce.soap.metadata.WorkflowTask[] tasks) {
      this.tasks = tasks;
      tasks__is_set = true;
    }

    protected void setTasks(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, tasks__typeInfo)) {
        setTasks((com.sforce.soap.metadata.WorkflowTask[])__typeMapper.readObject(__in, tasks__typeInfo, com.sforce.soap.metadata.WorkflowTask[].class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "Workflow");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, alerts__typeInfo, alerts, alerts__is_set);
       __typeMapper.writeObject(__out, fieldUpdates__typeInfo, fieldUpdates, fieldUpdates__is_set);
       __typeMapper.writeObject(__out, flowActions__typeInfo, flowActions, flowActions__is_set);
       __typeMapper.writeObject(__out, knowledgePublishes__typeInfo, knowledgePublishes, knowledgePublishes__is_set);
       __typeMapper.writeObject(__out, outboundMessages__typeInfo, outboundMessages, outboundMessages__is_set);
       __typeMapper.writeObject(__out, rules__typeInfo, rules, rules__is_set);
       __typeMapper.writeObject(__out, send__typeInfo, send, send__is_set);
       __typeMapper.writeObject(__out, tasks__typeInfo, tasks, tasks__is_set);
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
        setAlerts(__in, __typeMapper);
        setFieldUpdates(__in, __typeMapper);
        setFlowActions(__in, __typeMapper);
        setKnowledgePublishes(__in, __typeMapper);
        setOutboundMessages(__in, __typeMapper);
        setRules(__in, __typeMapper);
        setSend(__in, __typeMapper);
        setTasks(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[Workflow ");
      sb.append(super.toString());sb.append(" alerts='").append(com.sforce.ws.util.Verbose.toString(alerts)).append("'\n");
      sb.append(" fieldUpdates='").append(com.sforce.ws.util.Verbose.toString(fieldUpdates)).append("'\n");
      sb.append(" flowActions='").append(com.sforce.ws.util.Verbose.toString(flowActions)).append("'\n");
      sb.append(" knowledgePublishes='").append(com.sforce.ws.util.Verbose.toString(knowledgePublishes)).append("'\n");
      sb.append(" outboundMessages='").append(com.sforce.ws.util.Verbose.toString(outboundMessages)).append("'\n");
      sb.append(" rules='").append(com.sforce.ws.util.Verbose.toString(rules)).append("'\n");
      sb.append(" send='").append(com.sforce.ws.util.Verbose.toString(send)).append("'\n");
      sb.append(" tasks='").append(com.sforce.ws.util.Verbose.toString(tasks)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
