package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ConnectedAppSamlConfig implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ConnectedAppSamlConfig() {}

    /**
     * element : acsUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo acsUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","acsUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean acsUrl__is_set = false;

    private java.lang.String acsUrl;

    public java.lang.String getAcsUrl() {
      return acsUrl;
    }

    public void setAcsUrl(java.lang.String acsUrl) {
      this.acsUrl = acsUrl;
      acsUrl__is_set = true;
    }

    protected void setAcsUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, acsUrl__typeInfo)) {
        setAcsUrl(__typeMapper.readString(__in, acsUrl__typeInfo, java.lang.String.class));
      }
    }

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
     * element : encryptionCertificate of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo encryptionCertificate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","encryptionCertificate","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean encryptionCertificate__is_set = false;

    private java.lang.String encryptionCertificate;

    public java.lang.String getEncryptionCertificate() {
      return encryptionCertificate;
    }

    public void setEncryptionCertificate(java.lang.String encryptionCertificate) {
      this.encryptionCertificate = encryptionCertificate;
      encryptionCertificate__is_set = true;
    }

    protected void setEncryptionCertificate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, encryptionCertificate__typeInfo)) {
        setEncryptionCertificate(__typeMapper.readString(__in, encryptionCertificate__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : encryptionType of type {http://soap.sforce.com/2006/04/metadata}SamlEncryptionType
     * java type: com.sforce.soap.metadata.SamlEncryptionType
     */
    private static final com.sforce.ws.bind.TypeInfo encryptionType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","encryptionType","http://soap.sforce.com/2006/04/metadata","SamlEncryptionType",0,1,true);

    private boolean encryptionType__is_set = false;

    private com.sforce.soap.metadata.SamlEncryptionType encryptionType;

    public com.sforce.soap.metadata.SamlEncryptionType getEncryptionType() {
      return encryptionType;
    }

    public void setEncryptionType(com.sforce.soap.metadata.SamlEncryptionType encryptionType) {
      this.encryptionType = encryptionType;
      encryptionType__is_set = true;
    }

    protected void setEncryptionType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, encryptionType__typeInfo)) {
        setEncryptionType((com.sforce.soap.metadata.SamlEncryptionType)__typeMapper.readObject(__in, encryptionType__typeInfo, com.sforce.soap.metadata.SamlEncryptionType.class));
      }
    }

    /**
     * element : entityUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo entityUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","entityUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean entityUrl__is_set = false;

    private java.lang.String entityUrl;

    public java.lang.String getEntityUrl() {
      return entityUrl;
    }

    public void setEntityUrl(java.lang.String entityUrl) {
      this.entityUrl = entityUrl;
      entityUrl__is_set = true;
    }

    protected void setEntityUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, entityUrl__typeInfo)) {
        setEntityUrl(__typeMapper.readString(__in, entityUrl__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : issuer of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo issuer__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","issuer","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean issuer__is_set = false;

    private java.lang.String issuer;

    public java.lang.String getIssuer() {
      return issuer;
    }

    public void setIssuer(java.lang.String issuer) {
      this.issuer = issuer;
      issuer__is_set = true;
    }

    protected void setIssuer(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, issuer__typeInfo)) {
        setIssuer(__typeMapper.readString(__in, issuer__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : samlNameIdFormat of type {http://soap.sforce.com/2006/04/metadata}SamlNameIdFormatType
     * java type: com.sforce.soap.metadata.SamlNameIdFormatType
     */
    private static final com.sforce.ws.bind.TypeInfo samlNameIdFormat__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","samlNameIdFormat","http://soap.sforce.com/2006/04/metadata","SamlNameIdFormatType",0,1,true);

    private boolean samlNameIdFormat__is_set = false;

    private com.sforce.soap.metadata.SamlNameIdFormatType samlNameIdFormat;

    public com.sforce.soap.metadata.SamlNameIdFormatType getSamlNameIdFormat() {
      return samlNameIdFormat;
    }

    public void setSamlNameIdFormat(com.sforce.soap.metadata.SamlNameIdFormatType samlNameIdFormat) {
      this.samlNameIdFormat = samlNameIdFormat;
      samlNameIdFormat__is_set = true;
    }

    protected void setSamlNameIdFormat(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, samlNameIdFormat__typeInfo)) {
        setSamlNameIdFormat((com.sforce.soap.metadata.SamlNameIdFormatType)__typeMapper.readObject(__in, samlNameIdFormat__typeInfo, com.sforce.soap.metadata.SamlNameIdFormatType.class));
      }
    }

    /**
     * element : samlSubjectCustomAttr of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo samlSubjectCustomAttr__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","samlSubjectCustomAttr","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean samlSubjectCustomAttr__is_set = false;

    private java.lang.String samlSubjectCustomAttr;

    public java.lang.String getSamlSubjectCustomAttr() {
      return samlSubjectCustomAttr;
    }

    public void setSamlSubjectCustomAttr(java.lang.String samlSubjectCustomAttr) {
      this.samlSubjectCustomAttr = samlSubjectCustomAttr;
      samlSubjectCustomAttr__is_set = true;
    }

    protected void setSamlSubjectCustomAttr(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, samlSubjectCustomAttr__typeInfo)) {
        setSamlSubjectCustomAttr(__typeMapper.readString(__in, samlSubjectCustomAttr__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : samlSubjectType of type {http://soap.sforce.com/2006/04/metadata}SamlSubjectType
     * java type: com.sforce.soap.metadata.SamlSubjectType
     */
    private static final com.sforce.ws.bind.TypeInfo samlSubjectType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","samlSubjectType","http://soap.sforce.com/2006/04/metadata","SamlSubjectType",1,1,true);

    private boolean samlSubjectType__is_set = false;

    private com.sforce.soap.metadata.SamlSubjectType samlSubjectType;

    public com.sforce.soap.metadata.SamlSubjectType getSamlSubjectType() {
      return samlSubjectType;
    }

    public void setSamlSubjectType(com.sforce.soap.metadata.SamlSubjectType samlSubjectType) {
      this.samlSubjectType = samlSubjectType;
      samlSubjectType__is_set = true;
    }

    protected void setSamlSubjectType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, samlSubjectType__typeInfo)) {
        setSamlSubjectType((com.sforce.soap.metadata.SamlSubjectType)__typeMapper.readObject(__in, samlSubjectType__typeInfo, com.sforce.soap.metadata.SamlSubjectType.class));
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
       __typeMapper.writeString(__out, acsUrl__typeInfo, acsUrl, acsUrl__is_set);
       __typeMapper.writeString(__out, certificate__typeInfo, certificate, certificate__is_set);
       __typeMapper.writeString(__out, encryptionCertificate__typeInfo, encryptionCertificate, encryptionCertificate__is_set);
       __typeMapper.writeObject(__out, encryptionType__typeInfo, encryptionType, encryptionType__is_set);
       __typeMapper.writeString(__out, entityUrl__typeInfo, entityUrl, entityUrl__is_set);
       __typeMapper.writeString(__out, issuer__typeInfo, issuer, issuer__is_set);
       __typeMapper.writeObject(__out, samlNameIdFormat__typeInfo, samlNameIdFormat, samlNameIdFormat__is_set);
       __typeMapper.writeString(__out, samlSubjectCustomAttr__typeInfo, samlSubjectCustomAttr, samlSubjectCustomAttr__is_set);
       __typeMapper.writeObject(__out, samlSubjectType__typeInfo, samlSubjectType, samlSubjectType__is_set);
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
        setAcsUrl(__in, __typeMapper);
        setCertificate(__in, __typeMapper);
        setEncryptionCertificate(__in, __typeMapper);
        setEncryptionType(__in, __typeMapper);
        setEntityUrl(__in, __typeMapper);
        setIssuer(__in, __typeMapper);
        setSamlNameIdFormat(__in, __typeMapper);
        setSamlSubjectCustomAttr(__in, __typeMapper);
        setSamlSubjectType(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ConnectedAppSamlConfig ");
      sb.append(" acsUrl='").append(com.sforce.ws.util.Verbose.toString(acsUrl)).append("'\n");
      sb.append(" certificate='").append(com.sforce.ws.util.Verbose.toString(certificate)).append("'\n");
      sb.append(" encryptionCertificate='").append(com.sforce.ws.util.Verbose.toString(encryptionCertificate)).append("'\n");
      sb.append(" encryptionType='").append(com.sforce.ws.util.Verbose.toString(encryptionType)).append("'\n");
      sb.append(" entityUrl='").append(com.sforce.ws.util.Verbose.toString(entityUrl)).append("'\n");
      sb.append(" issuer='").append(com.sforce.ws.util.Verbose.toString(issuer)).append("'\n");
      sb.append(" samlNameIdFormat='").append(com.sforce.ws.util.Verbose.toString(samlNameIdFormat)).append("'\n");
      sb.append(" samlSubjectCustomAttr='").append(com.sforce.ws.util.Verbose.toString(samlSubjectCustomAttr)).append("'\n");
      sb.append(" samlSubjectType='").append(com.sforce.ws.util.Verbose.toString(samlSubjectType)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
