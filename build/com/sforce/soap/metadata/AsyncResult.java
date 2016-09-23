package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class AsyncResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public AsyncResult() {}

    /**
     * element : done of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo done__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","done","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean done__is_set = false;

    private boolean done;

    public boolean getDone() {
      return done;
    }

    public boolean isDone() {
      return done;
    }

    public void setDone(boolean done) {
      this.done = done;
      done__is_set = true;
    }

    protected void setDone(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, done__typeInfo)) {
        setDone(__typeMapper.readBoolean(__in, done__typeInfo, boolean.class));
      }
    }

    /**
     * element : id of type {http://soap.sforce.com/2006/04/metadata}ID
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo id__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","id","http://soap.sforce.com/2006/04/metadata","ID",1,1,true);

    private boolean id__is_set = false;

    private java.lang.String id;

    public java.lang.String getId() {
      return id;
    }

    public void setId(java.lang.String id) {
      this.id = id;
      id__is_set = true;
    }

    protected void setId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, id__typeInfo)) {
        setId(__typeMapper.readString(__in, id__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : message of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo message__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","message","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean message__is_set = false;

    private java.lang.String message;

    public java.lang.String getMessage() {
      return message;
    }

    public void setMessage(java.lang.String message) {
      this.message = message;
      message__is_set = true;
    }

    protected void setMessage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, message__typeInfo)) {
        setMessage(__typeMapper.readString(__in, message__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : state of type {http://soap.sforce.com/2006/04/metadata}AsyncRequestState
     * java type: com.sforce.soap.metadata.AsyncRequestState
     */
    private static final com.sforce.ws.bind.TypeInfo state__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","state","http://soap.sforce.com/2006/04/metadata","AsyncRequestState",1,1,true);

    private boolean state__is_set = false;

    private com.sforce.soap.metadata.AsyncRequestState state;

    public com.sforce.soap.metadata.AsyncRequestState getState() {
      return state;
    }

    public void setState(com.sforce.soap.metadata.AsyncRequestState state) {
      this.state = state;
      state__is_set = true;
    }

    protected void setState(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, state__typeInfo)) {
        setState((com.sforce.soap.metadata.AsyncRequestState)__typeMapper.readObject(__in, state__typeInfo, com.sforce.soap.metadata.AsyncRequestState.class));
      }
    }

    /**
     * element : statusCode of type {http://soap.sforce.com/2006/04/metadata}StatusCode
     * java type: com.sforce.soap.metadata.StatusCode
     */
    private static final com.sforce.ws.bind.TypeInfo statusCode__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","statusCode","http://soap.sforce.com/2006/04/metadata","StatusCode",0,1,true);

    private boolean statusCode__is_set = false;

    private com.sforce.soap.metadata.StatusCode statusCode;

    public com.sforce.soap.metadata.StatusCode getStatusCode() {
      return statusCode;
    }

    public void setStatusCode(com.sforce.soap.metadata.StatusCode statusCode) {
      this.statusCode = statusCode;
      statusCode__is_set = true;
    }

    protected void setStatusCode(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, statusCode__typeInfo)) {
        setStatusCode((com.sforce.soap.metadata.StatusCode)__typeMapper.readObject(__in, statusCode__typeInfo, com.sforce.soap.metadata.StatusCode.class));
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
       __typeMapper.writeBoolean(__out, done__typeInfo, done, done__is_set);
       __typeMapper.writeString(__out, id__typeInfo, id, id__is_set);
       __typeMapper.writeString(__out, message__typeInfo, message, message__is_set);
       __typeMapper.writeObject(__out, state__typeInfo, state, state__is_set);
       __typeMapper.writeObject(__out, statusCode__typeInfo, statusCode, statusCode__is_set);
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
        setDone(__in, __typeMapper);
        setId(__in, __typeMapper);
        setMessage(__in, __typeMapper);
        setState(__in, __typeMapper);
        setStatusCode(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[AsyncResult ");
      sb.append(" done='").append(com.sforce.ws.util.Verbose.toString(done)).append("'\n");
      sb.append(" id='").append(com.sforce.ws.util.Verbose.toString(id)).append("'\n");
      sb.append(" message='").append(com.sforce.ws.util.Verbose.toString(message)).append("'\n");
      sb.append(" state='").append(com.sforce.ws.util.Verbose.toString(state)).append("'\n");
      sb.append(" statusCode='").append(com.sforce.ws.util.Verbose.toString(statusCode)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
