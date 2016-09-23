package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ProcessWorkitemRequest extends com.sforce.soap.partner.ProcessRequest implements IProcessWorkitemRequest{

    /**
     * Constructor
     */
    public ProcessWorkitemRequest() {}

    /**
     * element : action of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo action__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","action","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean action__is_set = false;

    private java.lang.String action;

    @Override
    public java.lang.String getAction() {
      return action;
    }

    @Override
    public void setAction(java.lang.String action) {
      this.action = action;
      action__is_set = true;
    }

    protected void setAction(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, action__typeInfo)) {
        setAction(__typeMapper.readString(__in, action__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : workitemId of type {urn:partner.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo workitemId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","workitemId","urn:partner.soap.sforce.com","ID",1,1,true);

    private boolean workitemId__is_set = false;

    private java.lang.String workitemId;

    @Override
    public java.lang.String getWorkitemId() {
      return workitemId;
    }

    @Override
    public void setWorkitemId(java.lang.String workitemId) {
      this.workitemId = workitemId;
      workitemId__is_set = true;
    }

    protected void setWorkitemId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, workitemId__typeInfo)) {
        setWorkitemId(__typeMapper.readString(__in, workitemId__typeInfo, java.lang.String.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:partner.soap.sforce.com", "ProcessWorkitemRequest");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeString(__out, action__typeInfo, action, action__is_set);
       __typeMapper.writeString(__out, workitemId__typeInfo, workitemId, workitemId__is_set);
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
        setAction(__in, __typeMapper);
        setWorkitemId(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ProcessWorkitemRequest ");
      sb.append(super.toString());sb.append(" action='").append(com.sforce.ws.util.Verbose.toString(action)).append("'\n");
      sb.append(" workitemId='").append(com.sforce.ws.util.Verbose.toString(workitemId)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
