package com.sforce.soap.apex;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class CompileAndTest_element implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public CompileAndTest_element() {}

    /**
     * element : CompileAndTestRequest of type {http://soap.sforce.com/2006/08/apex}CompileAndTestRequest
     * java type: com.sforce.soap.apex.CompileAndTestRequest
     */
    private static final com.sforce.ws.bind.TypeInfo CompileAndTestRequest__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/08/apex","CompileAndTestRequest","http://soap.sforce.com/2006/08/apex","CompileAndTestRequest",1,1,true);

    private boolean CompileAndTestRequest__is_set = false;

    private com.sforce.soap.apex.CompileAndTestRequest CompileAndTestRequest;

    public com.sforce.soap.apex.CompileAndTestRequest getCompileAndTestRequest() {
      return CompileAndTestRequest;
    }

    public void setCompileAndTestRequest(com.sforce.soap.apex.CompileAndTestRequest CompileAndTestRequest) {
      this.CompileAndTestRequest = CompileAndTestRequest;
      CompileAndTestRequest__is_set = true;
    }

    protected void setCompileAndTestRequest(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, CompileAndTestRequest__typeInfo)) {
        setCompileAndTestRequest((com.sforce.soap.apex.CompileAndTestRequest)__typeMapper.readObject(__in, CompileAndTestRequest__typeInfo, com.sforce.soap.apex.CompileAndTestRequest.class));
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
       __typeMapper.writeObject(__out, CompileAndTestRequest__typeInfo, CompileAndTestRequest, CompileAndTestRequest__is_set);
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
        setCompileAndTestRequest(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[CompileAndTest_element ");
      sb.append(" CompileAndTestRequest='").append(com.sforce.ws.util.Verbose.toString(CompileAndTestRequest)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
