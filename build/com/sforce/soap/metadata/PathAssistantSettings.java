package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class PathAssistantSettings extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public PathAssistantSettings() {}

    /**
     * element : pathAssistantEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo pathAssistantEnabled__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","pathAssistantEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean pathAssistantEnabled__is_set = false;

    private boolean pathAssistantEnabled;

    public boolean getPathAssistantEnabled() {
      return pathAssistantEnabled;
    }

    public boolean isPathAssistantEnabled() {
      return pathAssistantEnabled;
    }

    public void setPathAssistantEnabled(boolean pathAssistantEnabled) {
      this.pathAssistantEnabled = pathAssistantEnabled;
      pathAssistantEnabled__is_set = true;
    }

    protected void setPathAssistantEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, pathAssistantEnabled__typeInfo)) {
        setPathAssistantEnabled(__typeMapper.readBoolean(__in, pathAssistantEnabled__typeInfo, boolean.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "PathAssistantSettings");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeBoolean(__out, pathAssistantEnabled__typeInfo, pathAssistantEnabled, pathAssistantEnabled__is_set);
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
        setPathAssistantEnabled(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[PathAssistantSettings ");
      sb.append(super.toString());sb.append(" pathAssistantEnabled='").append(com.sforce.ws.util.Verbose.toString(pathAssistantEnabled)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
