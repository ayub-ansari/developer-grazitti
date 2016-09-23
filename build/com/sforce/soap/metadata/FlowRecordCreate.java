package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class FlowRecordCreate extends com.sforce.soap.metadata.FlowNode {

    /**
     * Constructor
     */
    public FlowRecordCreate() {}

    /**
     * element : assignRecordIdToReference of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo assignRecordIdToReference__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","assignRecordIdToReference","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean assignRecordIdToReference__is_set = false;

    private java.lang.String assignRecordIdToReference;

    public java.lang.String getAssignRecordIdToReference() {
      return assignRecordIdToReference;
    }

    public void setAssignRecordIdToReference(java.lang.String assignRecordIdToReference) {
      this.assignRecordIdToReference = assignRecordIdToReference;
      assignRecordIdToReference__is_set = true;
    }

    protected void setAssignRecordIdToReference(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, assignRecordIdToReference__typeInfo)) {
        setAssignRecordIdToReference(__typeMapper.readString(__in, assignRecordIdToReference__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : connector of type {http://soap.sforce.com/2006/04/metadata}FlowConnector
     * java type: com.sforce.soap.metadata.FlowConnector
     */
    private static final com.sforce.ws.bind.TypeInfo connector__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","connector","http://soap.sforce.com/2006/04/metadata","FlowConnector",0,1,true);

    private boolean connector__is_set = false;

    private com.sforce.soap.metadata.FlowConnector connector;

    public com.sforce.soap.metadata.FlowConnector getConnector() {
      return connector;
    }

    public void setConnector(com.sforce.soap.metadata.FlowConnector connector) {
      this.connector = connector;
      connector__is_set = true;
    }

    protected void setConnector(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, connector__typeInfo)) {
        setConnector((com.sforce.soap.metadata.FlowConnector)__typeMapper.readObject(__in, connector__typeInfo, com.sforce.soap.metadata.FlowConnector.class));
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
     * element : inputAssignments of type {http://soap.sforce.com/2006/04/metadata}FlowInputFieldAssignment
     * java type: com.sforce.soap.metadata.FlowInputFieldAssignment[]
     */
    private static final com.sforce.ws.bind.TypeInfo inputAssignments__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","inputAssignments","http://soap.sforce.com/2006/04/metadata","FlowInputFieldAssignment",0,-1,true);

    private boolean inputAssignments__is_set = false;

    private com.sforce.soap.metadata.FlowInputFieldAssignment[] inputAssignments = new com.sforce.soap.metadata.FlowInputFieldAssignment[0];

    public com.sforce.soap.metadata.FlowInputFieldAssignment[] getInputAssignments() {
      return inputAssignments;
    }

    public void setInputAssignments(com.sforce.soap.metadata.FlowInputFieldAssignment[] inputAssignments) {
      this.inputAssignments = inputAssignments;
      inputAssignments__is_set = true;
    }

    protected void setInputAssignments(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, inputAssignments__typeInfo)) {
        setInputAssignments((com.sforce.soap.metadata.FlowInputFieldAssignment[])__typeMapper.readObject(__in, inputAssignments__typeInfo, com.sforce.soap.metadata.FlowInputFieldAssignment[].class));
      }
    }

    /**
     * element : inputReference of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo inputReference__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","inputReference","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean inputReference__is_set = false;

    private java.lang.String inputReference;

    public java.lang.String getInputReference() {
      return inputReference;
    }

    public void setInputReference(java.lang.String inputReference) {
      this.inputReference = inputReference;
      inputReference__is_set = true;
    }

    protected void setInputReference(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, inputReference__typeInfo)) {
        setInputReference(__typeMapper.readString(__in, inputReference__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : object of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo object__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","object","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean object__is_set = false;

    private java.lang.String object;

    public java.lang.String getObject() {
      return object;
    }

    public void setObject(java.lang.String object) {
      this.object = object;
      object__is_set = true;
    }

    protected void setObject(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, object__typeInfo)) {
        setObject(__typeMapper.readString(__in, object__typeInfo, java.lang.String.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "FlowRecordCreate");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeString(__out, assignRecordIdToReference__typeInfo, assignRecordIdToReference, assignRecordIdToReference__is_set);
       __typeMapper.writeObject(__out, connector__typeInfo, connector, connector__is_set);
       __typeMapper.writeObject(__out, faultConnector__typeInfo, faultConnector, faultConnector__is_set);
       __typeMapper.writeObject(__out, inputAssignments__typeInfo, inputAssignments, inputAssignments__is_set);
       __typeMapper.writeString(__out, inputReference__typeInfo, inputReference, inputReference__is_set);
       __typeMapper.writeString(__out, object__typeInfo, object, object__is_set);
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
        setAssignRecordIdToReference(__in, __typeMapper);
        setConnector(__in, __typeMapper);
        setFaultConnector(__in, __typeMapper);
        setInputAssignments(__in, __typeMapper);
        setInputReference(__in, __typeMapper);
        setObject(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[FlowRecordCreate ");
      sb.append(super.toString());sb.append(" assignRecordIdToReference='").append(com.sforce.ws.util.Verbose.toString(assignRecordIdToReference)).append("'\n");
      sb.append(" connector='").append(com.sforce.ws.util.Verbose.toString(connector)).append("'\n");
      sb.append(" faultConnector='").append(com.sforce.ws.util.Verbose.toString(faultConnector)).append("'\n");
      sb.append(" inputAssignments='").append(com.sforce.ws.util.Verbose.toString(inputAssignments)).append("'\n");
      sb.append(" inputReference='").append(com.sforce.ws.util.Verbose.toString(inputReference)).append("'\n");
      sb.append(" object='").append(com.sforce.ws.util.Verbose.toString(object)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
