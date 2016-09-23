package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class CheckDeployStatus_element implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public CheckDeployStatus_element() {}

    /**
     * element : asyncProcessId of type {http://soap.sforce.com/2006/04/metadata}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo asyncProcessId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","asyncProcessId","http://soap.sforce.com/2006/04/metadata","ID",1,1,true);

    private boolean asyncProcessId__is_set = false;

    private java.lang.String asyncProcessId;

    public java.lang.String getAsyncProcessId() {
      return asyncProcessId;
    }

    public void setAsyncProcessId(java.lang.String asyncProcessId) {
      this.asyncProcessId = asyncProcessId;
      asyncProcessId__is_set = true;
    }

    protected void setAsyncProcessId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, asyncProcessId__typeInfo)) {
        setAsyncProcessId(__typeMapper.readString(__in, asyncProcessId__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : includeDetails of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo includeDetails__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","includeDetails","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean includeDetails__is_set = false;

    private boolean includeDetails;

    public boolean getIncludeDetails() {
      return includeDetails;
    }

    public boolean isIncludeDetails() {
      return includeDetails;
    }

    public void setIncludeDetails(boolean includeDetails) {
      this.includeDetails = includeDetails;
      includeDetails__is_set = true;
    }

    protected void setIncludeDetails(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, includeDetails__typeInfo)) {
        setIncludeDetails(__typeMapper.readBoolean(__in, includeDetails__typeInfo, boolean.class));
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
       __typeMapper.writeString(__out, asyncProcessId__typeInfo, asyncProcessId, asyncProcessId__is_set);
       __typeMapper.writeBoolean(__out, includeDetails__typeInfo, includeDetails, includeDetails__is_set);
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
        setAsyncProcessId(__in, __typeMapper);
        setIncludeDetails(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[CheckDeployStatus_element ");
      sb.append(" asyncProcessId='").append(com.sforce.ws.util.Verbose.toString(asyncProcessId)).append("'\n");
      sb.append(" includeDetails='").append(com.sforce.ws.util.Verbose.toString(includeDetails)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
