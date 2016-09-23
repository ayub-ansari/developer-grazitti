package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class MergeRequest implements com.sforce.ws.bind.XMLizable , IMergeRequest{

    /**
     * Constructor
     */
    public MergeRequest() {}

    /**
     * element : masterRecord of type {urn:sobject.partner.soap.sforce.com}sObject
     * java type: com.sforce.soap.partner.sobject.SObject
     */
    private static final com.sforce.ws.bind.TypeInfo masterRecord__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","masterRecord","urn:sobject.partner.soap.sforce.com","sObject",1,1,true);

    private boolean masterRecord__is_set = false;

    private com.sforce.soap.partner.sobject.SObject masterRecord;

    @Override
    public com.sforce.soap.partner.sobject.SObject getMasterRecord() {
      return masterRecord;
    }

    @Override
    public void setMasterRecord(com.sforce.soap.partner.sobject.ISObject masterRecord) {
      this.masterRecord = (com.sforce.soap.partner.sobject.SObject)masterRecord;
      masterRecord__is_set = true;
    }

    protected void setMasterRecord(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, masterRecord__typeInfo)) {
        setMasterRecord((com.sforce.soap.partner.sobject.SObject)__typeMapper.readObject(__in, masterRecord__typeInfo, com.sforce.soap.partner.sobject.SObject.class));
      }
    }

    /**
     * element : recordToMergeIds of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo recordToMergeIds__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","recordToMergeIds","urn:partner.soap.sforce.com","ID",1,-1,true);

    private boolean recordToMergeIds__is_set = false;

    private java.lang.String[] recordToMergeIds = new java.lang.String[0];

    @Override
    public java.lang.String[] getRecordToMergeIds() {
      return recordToMergeIds;
    }

    @Override
    public void setRecordToMergeIds(java.lang.String[] recordToMergeIds) {
      this.recordToMergeIds = castArray(java.lang.String.class, recordToMergeIds);
      recordToMergeIds__is_set = true;
    }

    protected void setRecordToMergeIds(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, recordToMergeIds__typeInfo)) {
        setRecordToMergeIds((java.lang.String[])__typeMapper.readObject(__in, recordToMergeIds__typeInfo, java.lang.String[].class));
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
       __typeMapper.writeObject(__out, masterRecord__typeInfo, masterRecord, masterRecord__is_set);
       __typeMapper.writeObject(__out, recordToMergeIds__typeInfo, recordToMergeIds, recordToMergeIds__is_set);
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
        setMasterRecord(__in, __typeMapper);
        setRecordToMergeIds(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[MergeRequest ");
      sb.append(" masterRecord='").append(com.sforce.ws.util.Verbose.toString(masterRecord)).append("'\n");
      sb.append(" recordToMergeIds='").append(com.sforce.ws.util.Verbose.toString(recordToMergeIds)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private <T,U> T[] castArray(Class<T> clazz, U[] array) {
        if (array == null) {
            return null;
        }
        T[] retVal = (T[]) java.lang.reflect.Array.newInstance(clazz, array.length);
        for (int i=0; i < array.length; i++) {
            retVal[i] = (T)array[i];
        }

        return retVal;
	}
}
