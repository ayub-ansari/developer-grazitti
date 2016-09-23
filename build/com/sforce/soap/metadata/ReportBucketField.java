package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ReportBucketField implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ReportBucketField() {}

    /**
     * element : bucketType of type {http://soap.sforce.com/2006/04/metadata}ReportBucketFieldType
     * java type: com.sforce.soap.metadata.ReportBucketFieldType
     */
    private static final com.sforce.ws.bind.TypeInfo bucketType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","bucketType","http://soap.sforce.com/2006/04/metadata","ReportBucketFieldType",1,1,true);

    private boolean bucketType__is_set = false;

    private com.sforce.soap.metadata.ReportBucketFieldType bucketType;

    public com.sforce.soap.metadata.ReportBucketFieldType getBucketType() {
      return bucketType;
    }

    public void setBucketType(com.sforce.soap.metadata.ReportBucketFieldType bucketType) {
      this.bucketType = bucketType;
      bucketType__is_set = true;
    }

    protected void setBucketType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, bucketType__typeInfo)) {
        setBucketType((com.sforce.soap.metadata.ReportBucketFieldType)__typeMapper.readObject(__in, bucketType__typeInfo, com.sforce.soap.metadata.ReportBucketFieldType.class));
      }
    }

    /**
     * element : developerName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo developerName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","developerName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean developerName__is_set = false;

    private java.lang.String developerName;

    public java.lang.String getDeveloperName() {
      return developerName;
    }

    public void setDeveloperName(java.lang.String developerName) {
      this.developerName = developerName;
      developerName__is_set = true;
    }

    protected void setDeveloperName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, developerName__typeInfo)) {
        setDeveloperName(__typeMapper.readString(__in, developerName__typeInfo, java.lang.String.class));
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
     * element : nullTreatment of type {http://soap.sforce.com/2006/04/metadata}ReportFormulaNullTreatment
     * java type: com.sforce.soap.metadata.ReportFormulaNullTreatment
     */
    private static final com.sforce.ws.bind.TypeInfo nullTreatment__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","nullTreatment","http://soap.sforce.com/2006/04/metadata","ReportFormulaNullTreatment",0,1,true);

    private boolean nullTreatment__is_set = false;

    private com.sforce.soap.metadata.ReportFormulaNullTreatment nullTreatment;

    public com.sforce.soap.metadata.ReportFormulaNullTreatment getNullTreatment() {
      return nullTreatment;
    }

    public void setNullTreatment(com.sforce.soap.metadata.ReportFormulaNullTreatment nullTreatment) {
      this.nullTreatment = nullTreatment;
      nullTreatment__is_set = true;
    }

    protected void setNullTreatment(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, nullTreatment__typeInfo)) {
        setNullTreatment((com.sforce.soap.metadata.ReportFormulaNullTreatment)__typeMapper.readObject(__in, nullTreatment__typeInfo, com.sforce.soap.metadata.ReportFormulaNullTreatment.class));
      }
    }

    /**
     * element : otherBucketLabel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo otherBucketLabel__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","otherBucketLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean otherBucketLabel__is_set = false;

    private java.lang.String otherBucketLabel;

    public java.lang.String getOtherBucketLabel() {
      return otherBucketLabel;
    }

    public void setOtherBucketLabel(java.lang.String otherBucketLabel) {
      this.otherBucketLabel = otherBucketLabel;
      otherBucketLabel__is_set = true;
    }

    protected void setOtherBucketLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, otherBucketLabel__typeInfo)) {
        setOtherBucketLabel(__typeMapper.readString(__in, otherBucketLabel__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : sourceColumnName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo sourceColumnName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","sourceColumnName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean sourceColumnName__is_set = false;

    private java.lang.String sourceColumnName;

    public java.lang.String getSourceColumnName() {
      return sourceColumnName;
    }

    public void setSourceColumnName(java.lang.String sourceColumnName) {
      this.sourceColumnName = sourceColumnName;
      sourceColumnName__is_set = true;
    }

    protected void setSourceColumnName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, sourceColumnName__typeInfo)) {
        setSourceColumnName(__typeMapper.readString(__in, sourceColumnName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : useOther of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo useOther__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","useOther","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean useOther__is_set = false;

    private boolean useOther;

    public boolean getUseOther() {
      return useOther;
    }

    public boolean isUseOther() {
      return useOther;
    }

    public void setUseOther(boolean useOther) {
      this.useOther = useOther;
      useOther__is_set = true;
    }

    protected void setUseOther(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, useOther__typeInfo)) {
        setUseOther(__typeMapper.readBoolean(__in, useOther__typeInfo, boolean.class));
      }
    }

    /**
     * element : values of type {http://soap.sforce.com/2006/04/metadata}ReportBucketFieldValue
     * java type: com.sforce.soap.metadata.ReportBucketFieldValue[]
     */
    private static final com.sforce.ws.bind.TypeInfo values__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","values","http://soap.sforce.com/2006/04/metadata","ReportBucketFieldValue",0,-1,true);

    private boolean values__is_set = false;

    private com.sforce.soap.metadata.ReportBucketFieldValue[] values = new com.sforce.soap.metadata.ReportBucketFieldValue[0];

    public com.sforce.soap.metadata.ReportBucketFieldValue[] getValues() {
      return values;
    }

    public void setValues(com.sforce.soap.metadata.ReportBucketFieldValue[] values) {
      this.values = values;
      values__is_set = true;
    }

    protected void setValues(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, values__typeInfo)) {
        setValues((com.sforce.soap.metadata.ReportBucketFieldValue[])__typeMapper.readObject(__in, values__typeInfo, com.sforce.soap.metadata.ReportBucketFieldValue[].class));
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
       __typeMapper.writeObject(__out, bucketType__typeInfo, bucketType, bucketType__is_set);
       __typeMapper.writeString(__out, developerName__typeInfo, developerName, developerName__is_set);
       __typeMapper.writeString(__out, masterLabel__typeInfo, masterLabel, masterLabel__is_set);
       __typeMapper.writeObject(__out, nullTreatment__typeInfo, nullTreatment, nullTreatment__is_set);
       __typeMapper.writeString(__out, otherBucketLabel__typeInfo, otherBucketLabel, otherBucketLabel__is_set);
       __typeMapper.writeString(__out, sourceColumnName__typeInfo, sourceColumnName, sourceColumnName__is_set);
       __typeMapper.writeBoolean(__out, useOther__typeInfo, useOther, useOther__is_set);
       __typeMapper.writeObject(__out, values__typeInfo, values, values__is_set);
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
        setBucketType(__in, __typeMapper);
        setDeveloperName(__in, __typeMapper);
        setMasterLabel(__in, __typeMapper);
        setNullTreatment(__in, __typeMapper);
        setOtherBucketLabel(__in, __typeMapper);
        setSourceColumnName(__in, __typeMapper);
        setUseOther(__in, __typeMapper);
        setValues(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ReportBucketField ");
      sb.append(" bucketType='").append(com.sforce.ws.util.Verbose.toString(bucketType)).append("'\n");
      sb.append(" developerName='").append(com.sforce.ws.util.Verbose.toString(developerName)).append("'\n");
      sb.append(" masterLabel='").append(com.sforce.ws.util.Verbose.toString(masterLabel)).append("'\n");
      sb.append(" nullTreatment='").append(com.sforce.ws.util.Verbose.toString(nullTreatment)).append("'\n");
      sb.append(" otherBucketLabel='").append(com.sforce.ws.util.Verbose.toString(otherBucketLabel)).append("'\n");
      sb.append(" sourceColumnName='").append(com.sforce.ws.util.Verbose.toString(sourceColumnName)).append("'\n");
      sb.append(" useOther='").append(com.sforce.ws.util.Verbose.toString(useOther)).append("'\n");
      sb.append(" values='").append(com.sforce.ws.util.Verbose.toString(values)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
