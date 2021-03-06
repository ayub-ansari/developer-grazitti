package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class KnowledgeLanguageSettings implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public KnowledgeLanguageSettings() {}

    /**
     * element : language of type {http://soap.sforce.com/2006/04/metadata}KnowledgeLanguage
     * java type: com.sforce.soap.metadata.KnowledgeLanguage[]
     */
    private static final com.sforce.ws.bind.TypeInfo language__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","language","http://soap.sforce.com/2006/04/metadata","KnowledgeLanguage",0,-1,true);

    private boolean language__is_set = false;

    private com.sforce.soap.metadata.KnowledgeLanguage[] language = new com.sforce.soap.metadata.KnowledgeLanguage[0];

    public com.sforce.soap.metadata.KnowledgeLanguage[] getLanguage() {
      return language;
    }

    public void setLanguage(com.sforce.soap.metadata.KnowledgeLanguage[] language) {
      this.language = language;
      language__is_set = true;
    }

    protected void setLanguage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, language__typeInfo)) {
        setLanguage((com.sforce.soap.metadata.KnowledgeLanguage[])__typeMapper.readObject(__in, language__typeInfo, com.sforce.soap.metadata.KnowledgeLanguage[].class));
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
       __typeMapper.writeObject(__out, language__typeInfo, language, language__is_set);
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
        setLanguage(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[KnowledgeLanguageSettings ");
      sb.append(" language='").append(com.sforce.ws.util.Verbose.toString(language)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
