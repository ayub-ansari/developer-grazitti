package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ReadResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ReadResult() {}

    /**
     * element : records of type {http://soap.sforce.com/2006/04/metadata}Metadata
     * java type: com.sforce.soap.metadata.Metadata[]
     */
    private static final com.sforce.ws.bind.TypeInfo records__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","records","http://soap.sforce.com/2006/04/metadata","Metadata",0,-1,true);

    private boolean records__is_set = false;

    private com.sforce.soap.metadata.Metadata[] records = new com.sforce.soap.metadata.Metadata[0];

    public com.sforce.soap.metadata.Metadata[] getRecords() {
      return records;
    }

    public void setRecords(com.sforce.soap.metadata.Metadata[] records) {
      this.records = records;
      records__is_set = true;
    }

    protected void setRecords(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, records__typeInfo)) {
        setRecords((com.sforce.soap.metadata.Metadata[])__typeMapper.readObject(__in, records__typeInfo, com.sforce.soap.metadata.Metadata[].class));
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
       __typeMapper.writeObject(__out, records__typeInfo, records, records__is_set);
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
        setRecords(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ReadResult ");
      sb.append(" records='").append(com.sforce.ws.util.Verbose.toString(records)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
