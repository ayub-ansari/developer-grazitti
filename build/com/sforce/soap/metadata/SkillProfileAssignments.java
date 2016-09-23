package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class SkillProfileAssignments implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public SkillProfileAssignments() {}

    /**
     * element : profile of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo profile__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","profile","http://www.w3.org/2001/XMLSchema","string",0,-1,true);

    private boolean profile__is_set = false;

    private java.lang.String[] profile = new java.lang.String[0];

    public java.lang.String[] getProfile() {
      return profile;
    }

    public void setProfile(java.lang.String[] profile) {
      this.profile = profile;
      profile__is_set = true;
    }

    protected void setProfile(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, profile__typeInfo)) {
        setProfile((java.lang.String[])__typeMapper.readObject(__in, profile__typeInfo, java.lang.String[].class));
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
       __typeMapper.writeObject(__out, profile__typeInfo, profile, profile__is_set);
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
        setProfile(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[SkillProfileAssignments ");
      sb.append(" profile='").append(com.sforce.ws.util.Verbose.toString(profile)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
