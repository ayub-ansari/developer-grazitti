package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class SiteWebAddress implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public SiteWebAddress() {}

    /**
     * element : certificate of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo certificate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","certificate","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean certificate__is_set = false;

    private java.lang.String certificate;

    public java.lang.String getCertificate() {
      return certificate;
    }

    public void setCertificate(java.lang.String certificate) {
      this.certificate = certificate;
      certificate__is_set = true;
    }

    protected void setCertificate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, certificate__typeInfo)) {
        setCertificate(__typeMapper.readString(__in, certificate__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : domainName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo domainName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","domainName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean domainName__is_set = false;

    private java.lang.String domainName;

    public java.lang.String getDomainName() {
      return domainName;
    }

    public void setDomainName(java.lang.String domainName) {
      this.domainName = domainName;
      domainName__is_set = true;
    }

    protected void setDomainName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, domainName__typeInfo)) {
        setDomainName(__typeMapper.readString(__in, domainName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : primary of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo primary__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","primary","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean primary__is_set = false;

    private boolean primary;

    public boolean getPrimary() {
      return primary;
    }

    public boolean isPrimary() {
      return primary;
    }

    public void setPrimary(boolean primary) {
      this.primary = primary;
      primary__is_set = true;
    }

    protected void setPrimary(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, primary__typeInfo)) {
        setPrimary(__typeMapper.readBoolean(__in, primary__typeInfo, boolean.class));
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
       __typeMapper.writeString(__out, certificate__typeInfo, certificate, certificate__is_set);
       __typeMapper.writeString(__out, domainName__typeInfo, domainName, domainName__is_set);
       __typeMapper.writeBoolean(__out, primary__typeInfo, primary, primary__is_set);
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
        setCertificate(__in, __typeMapper);
        setDomainName(__in, __typeMapper);
        setPrimary(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[SiteWebAddress ");
      sb.append(" certificate='").append(com.sforce.ws.util.Verbose.toString(certificate)).append("'\n");
      sb.append(" domainName='").append(com.sforce.ws.util.Verbose.toString(domainName)).append("'\n");
      sb.append(" primary='").append(com.sforce.ws.util.Verbose.toString(primary)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
