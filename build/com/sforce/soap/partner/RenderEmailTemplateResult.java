package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class RenderEmailTemplateResult implements com.sforce.ws.bind.XMLizable , IRenderEmailTemplateResult{

    /**
     * Constructor
     */
    public RenderEmailTemplateResult() {}

    /**
     * element : bodyResults of type {urn:partner.soap.sforce.com}RenderEmailTemplateBodyResult
     * java type: com.sforce.soap.partner.RenderEmailTemplateBodyResult[]
     */
    private static final com.sforce.ws.bind.TypeInfo bodyResults__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","bodyResults","urn:partner.soap.sforce.com","RenderEmailTemplateBodyResult",0,10,true);

    private boolean bodyResults__is_set = false;

    private com.sforce.soap.partner.RenderEmailTemplateBodyResult[] bodyResults = new com.sforce.soap.partner.RenderEmailTemplateBodyResult[0];

    @Override
    public com.sforce.soap.partner.RenderEmailTemplateBodyResult[] getBodyResults() {
      return bodyResults;
    }

    @Override
    public void setBodyResults(com.sforce.soap.partner.IRenderEmailTemplateBodyResult[] bodyResults) {
      this.bodyResults = castArray(com.sforce.soap.partner.RenderEmailTemplateBodyResult.class, bodyResults);
      bodyResults__is_set = true;
    }

    protected void setBodyResults(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, bodyResults__typeInfo)) {
        setBodyResults((com.sforce.soap.partner.RenderEmailTemplateBodyResult[])__typeMapper.readObject(__in, bodyResults__typeInfo, com.sforce.soap.partner.RenderEmailTemplateBodyResult[].class));
      }
    }

    /**
     * element : errors of type {urn:partner.soap.sforce.com}Error
     * java type: com.sforce.soap.partner.Error[]
     */
    private static final com.sforce.ws.bind.TypeInfo errors__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","errors","urn:partner.soap.sforce.com","Error",0,-1,true);

    private boolean errors__is_set = false;

    private com.sforce.soap.partner.Error[] errors = new com.sforce.soap.partner.Error[0];

    @Override
    public com.sforce.soap.partner.Error[] getErrors() {
      return errors;
    }

    @Override
    public void setErrors(com.sforce.soap.partner.IError[] errors) {
      this.errors = castArray(com.sforce.soap.partner.Error.class, errors);
      errors__is_set = true;
    }

    protected void setErrors(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, errors__typeInfo)) {
        setErrors((com.sforce.soap.partner.Error[])__typeMapper.readObject(__in, errors__typeInfo, com.sforce.soap.partner.Error[].class));
      }
    }

    /**
     * element : success of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo success__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","success","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean success__is_set = false;

    private boolean success;

    @Override
    public boolean getSuccess() {
      return success;
    }

    @Override
    public boolean isSuccess() {
      return success;
    }

    @Override
    public void setSuccess(boolean success) {
      this.success = success;
      success__is_set = true;
    }

    protected void setSuccess(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, success__typeInfo)) {
        setSuccess(__typeMapper.readBoolean(__in, success__typeInfo, boolean.class));
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
       __typeMapper.writeObject(__out, bodyResults__typeInfo, bodyResults, bodyResults__is_set);
       __typeMapper.writeObject(__out, errors__typeInfo, errors, errors__is_set);
       __typeMapper.writeBoolean(__out, success__typeInfo, success, success__is_set);
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
        setBodyResults(__in, __typeMapper);
        setErrors(__in, __typeMapper);
        setSuccess(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[RenderEmailTemplateResult ");
      sb.append(" bodyResults='").append(com.sforce.ws.util.Verbose.toString(bodyResults)).append("'\n");
      sb.append(" errors='").append(com.sforce.ws.util.Verbose.toString(errors)).append("'\n");
      sb.append(" success='").append(com.sforce.ws.util.Verbose.toString(success)).append("'\n");
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
