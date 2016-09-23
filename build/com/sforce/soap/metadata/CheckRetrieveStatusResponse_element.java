package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class CheckRetrieveStatusResponse_element implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public CheckRetrieveStatusResponse_element() {}

    /**
     * element : result of type {http://soap.sforce.com/2006/04/metadata}RetrieveResult
     * java type: com.sforce.soap.metadata.RetrieveResult
     */
    private static final com.sforce.ws.bind.TypeInfo result__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","result","http://soap.sforce.com/2006/04/metadata","RetrieveResult",1,1,true);

    private boolean result__is_set = false;

    private com.sforce.soap.metadata.RetrieveResult result;

    public com.sforce.soap.metadata.RetrieveResult getResult() {
      return result;
    }

    public void setResult(com.sforce.soap.metadata.RetrieveResult result) {
      this.result = result;
      result__is_set = true;
    }

    protected void setResult(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, result__typeInfo)) {
        setResult((com.sforce.soap.metadata.RetrieveResult)__typeMapper.readObject(__in, result__typeInfo, com.sforce.soap.metadata.RetrieveResult.class));
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
       __typeMapper.writeObject(__out, result__typeInfo, result, result__is_set);
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
        setResult(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[CheckRetrieveStatusResponse_element ");
      sb.append(" result='").append(com.sforce.ws.util.Verbose.toString(result)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
