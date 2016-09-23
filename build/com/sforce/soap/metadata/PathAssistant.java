package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class PathAssistant extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public PathAssistant() {}

    /**
     * element : active of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo active__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean active__is_set = false;

    private boolean active;

    public boolean getActive() {
      return active;
    }

    public boolean isActive() {
      return active;
    }

    public void setActive(boolean active) {
      this.active = active;
      active__is_set = true;
    }

    protected void setActive(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, active__typeInfo)) {
        setActive(__typeMapper.readBoolean(__in, active__typeInfo, boolean.class));
      }
    }

    /**
     * element : entityName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo entityName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","entityName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean entityName__is_set = false;

    private java.lang.String entityName;

    public java.lang.String getEntityName() {
      return entityName;
    }

    public void setEntityName(java.lang.String entityName) {
      this.entityName = entityName;
      entityName__is_set = true;
    }

    protected void setEntityName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, entityName__typeInfo)) {
        setEntityName(__typeMapper.readString(__in, entityName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : fieldName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo fieldName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","fieldName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean fieldName__is_set = false;

    private java.lang.String fieldName;

    public java.lang.String getFieldName() {
      return fieldName;
    }

    public void setFieldName(java.lang.String fieldName) {
      this.fieldName = fieldName;
      fieldName__is_set = true;
    }

    protected void setFieldName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, fieldName__typeInfo)) {
        setFieldName(__typeMapper.readString(__in, fieldName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : masterLabel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo masterLabel__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","masterLabel","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean masterLabel__is_set = false;

    private java.lang.String masterLabel;

    public java.lang.String getMasterLabel() {
      return masterLabel;
    }

    public void setMasterLabel(java.lang.String masterLabel) {
      this.masterLabel = masterLabel;
      masterLabel__is_set = true;
    }

    protected void setMasterLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, masterLabel__typeInfo)) {
        setMasterLabel(__typeMapper.readString(__in, masterLabel__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : pathAssistantSteps of type {http://soap.sforce.com/2006/04/metadata}PathAssistantStep
     * java type: com.sforce.soap.metadata.PathAssistantStep[]
     */
    private static final com.sforce.ws.bind.TypeInfo pathAssistantSteps__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","pathAssistantSteps","http://soap.sforce.com/2006/04/metadata","PathAssistantStep",0,-1,true);

    private boolean pathAssistantSteps__is_set = false;

    private com.sforce.soap.metadata.PathAssistantStep[] pathAssistantSteps = new com.sforce.soap.metadata.PathAssistantStep[0];

    public com.sforce.soap.metadata.PathAssistantStep[] getPathAssistantSteps() {
      return pathAssistantSteps;
    }

    public void setPathAssistantSteps(com.sforce.soap.metadata.PathAssistantStep[] pathAssistantSteps) {
      this.pathAssistantSteps = pathAssistantSteps;
      pathAssistantSteps__is_set = true;
    }

    protected void setPathAssistantSteps(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, pathAssistantSteps__typeInfo)) {
        setPathAssistantSteps((com.sforce.soap.metadata.PathAssistantStep[])__typeMapper.readObject(__in, pathAssistantSteps__typeInfo, com.sforce.soap.metadata.PathAssistantStep[].class));
      }
    }

    /**
     * element : recordTypeName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo recordTypeName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","recordTypeName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean recordTypeName__is_set = false;

    private java.lang.String recordTypeName;

    public java.lang.String getRecordTypeName() {
      return recordTypeName;
    }

    public void setRecordTypeName(java.lang.String recordTypeName) {
      this.recordTypeName = recordTypeName;
      recordTypeName__is_set = true;
    }

    protected void setRecordTypeName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, recordTypeName__typeInfo)) {
        setRecordTypeName(__typeMapper.readString(__in, recordTypeName__typeInfo, java.lang.String.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "PathAssistant");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeBoolean(__out, active__typeInfo, active, active__is_set);
       __typeMapper.writeString(__out, entityName__typeInfo, entityName, entityName__is_set);
       __typeMapper.writeString(__out, fieldName__typeInfo, fieldName, fieldName__is_set);
       __typeMapper.writeString(__out, masterLabel__typeInfo, masterLabel, masterLabel__is_set);
       __typeMapper.writeObject(__out, pathAssistantSteps__typeInfo, pathAssistantSteps, pathAssistantSteps__is_set);
       __typeMapper.writeString(__out, recordTypeName__typeInfo, recordTypeName, recordTypeName__is_set);
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
        setActive(__in, __typeMapper);
        setEntityName(__in, __typeMapper);
        setFieldName(__in, __typeMapper);
        setMasterLabel(__in, __typeMapper);
        setPathAssistantSteps(__in, __typeMapper);
        setRecordTypeName(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[PathAssistant ");
      sb.append(super.toString());sb.append(" active='").append(com.sforce.ws.util.Verbose.toString(active)).append("'\n");
      sb.append(" entityName='").append(com.sforce.ws.util.Verbose.toString(entityName)).append("'\n");
      sb.append(" fieldName='").append(com.sforce.ws.util.Verbose.toString(fieldName)).append("'\n");
      sb.append(" masterLabel='").append(com.sforce.ws.util.Verbose.toString(masterLabel)).append("'\n");
      sb.append(" pathAssistantSteps='").append(com.sforce.ws.util.Verbose.toString(pathAssistantSteps)).append("'\n");
      sb.append(" recordTypeName='").append(com.sforce.ws.util.Verbose.toString(recordTypeName)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
