package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class PermissionSetTabSetting implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public PermissionSetTabSetting() {}

    /**
     * element : tab of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo tab__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","tab","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean tab__is_set = false;

    private java.lang.String tab;

    public java.lang.String getTab() {
      return tab;
    }

    public void setTab(java.lang.String tab) {
      this.tab = tab;
      tab__is_set = true;
    }

    protected void setTab(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, tab__typeInfo)) {
        setTab(__typeMapper.readString(__in, tab__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : visibility of type {http://soap.sforce.com/2006/04/metadata}PermissionSetTabVisibility
     * java type: com.sforce.soap.metadata.PermissionSetTabVisibility
     */
    private static final com.sforce.ws.bind.TypeInfo visibility__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","visibility","http://soap.sforce.com/2006/04/metadata","PermissionSetTabVisibility",1,1,true);

    private boolean visibility__is_set = false;

    private com.sforce.soap.metadata.PermissionSetTabVisibility visibility;

    public com.sforce.soap.metadata.PermissionSetTabVisibility getVisibility() {
      return visibility;
    }

    public void setVisibility(com.sforce.soap.metadata.PermissionSetTabVisibility visibility) {
      this.visibility = visibility;
      visibility__is_set = true;
    }

    protected void setVisibility(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, visibility__typeInfo)) {
        setVisibility((com.sforce.soap.metadata.PermissionSetTabVisibility)__typeMapper.readObject(__in, visibility__typeInfo, com.sforce.soap.metadata.PermissionSetTabVisibility.class));
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
       __typeMapper.writeString(__out, tab__typeInfo, tab, tab__is_set);
       __typeMapper.writeObject(__out, visibility__typeInfo, visibility, visibility__is_set);
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
        setTab(__in, __typeMapper);
        setVisibility(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[PermissionSetTabSetting ");
      sb.append(" tab='").append(com.sforce.ws.util.Verbose.toString(tab)).append("'\n");
      sb.append(" visibility='").append(com.sforce.ws.util.Verbose.toString(visibility)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
