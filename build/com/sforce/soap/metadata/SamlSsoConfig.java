package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class SamlSsoConfig extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public SamlSsoConfig() {}

    /**
     * element : attributeName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo attributeName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","attributeName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean attributeName__is_set = false;

    private java.lang.String attributeName;

    public java.lang.String getAttributeName() {
      return attributeName;
    }

    public void setAttributeName(java.lang.String attributeName) {
      this.attributeName = attributeName;
      attributeName__is_set = true;
    }

    protected void setAttributeName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, attributeName__typeInfo)) {
        setAttributeName(__typeMapper.readString(__in, attributeName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : attributeNameIdFormat of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo attributeNameIdFormat__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","attributeNameIdFormat","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean attributeNameIdFormat__is_set = false;

    private java.lang.String attributeNameIdFormat;

    public java.lang.String getAttributeNameIdFormat() {
      return attributeNameIdFormat;
    }

    public void setAttributeNameIdFormat(java.lang.String attributeNameIdFormat) {
      this.attributeNameIdFormat = attributeNameIdFormat;
      attributeNameIdFormat__is_set = true;
    }

    protected void setAttributeNameIdFormat(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, attributeNameIdFormat__typeInfo)) {
        setAttributeNameIdFormat(__typeMapper.readString(__in, attributeNameIdFormat__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : decryptionCertificate of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo decryptionCertificate__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","decryptionCertificate","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean decryptionCertificate__is_set = false;

    private java.lang.String decryptionCertificate;

    public java.lang.String getDecryptionCertificate() {
      return decryptionCertificate;
    }

    public void setDecryptionCertificate(java.lang.String decryptionCertificate) {
      this.decryptionCertificate = decryptionCertificate;
      decryptionCertificate__is_set = true;
    }

    protected void setDecryptionCertificate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, decryptionCertificate__typeInfo)) {
        setDecryptionCertificate(__typeMapper.readString(__in, decryptionCertificate__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : errorUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo errorUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","errorUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean errorUrl__is_set = false;

    private java.lang.String errorUrl;

    public java.lang.String getErrorUrl() {
      return errorUrl;
    }

    public void setErrorUrl(java.lang.String errorUrl) {
      this.errorUrl = errorUrl;
      errorUrl__is_set = true;
    }

    protected void setErrorUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, errorUrl__typeInfo)) {
        setErrorUrl(__typeMapper.readString(__in, errorUrl__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : executionUserId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo executionUserId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","executionUserId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean executionUserId__is_set = false;

    private java.lang.String executionUserId;

    public java.lang.String getExecutionUserId() {
      return executionUserId;
    }

    public void setExecutionUserId(java.lang.String executionUserId) {
      this.executionUserId = executionUserId;
      executionUserId__is_set = true;
    }

    protected void setExecutionUserId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, executionUserId__typeInfo)) {
        setExecutionUserId(__typeMapper.readString(__in, executionUserId__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : identityLocation of type {http://soap.sforce.com/2006/04/metadata}SamlIdentityLocationType
     * java type: com.sforce.soap.metadata.SamlIdentityLocationType
     */
    private static final com.sforce.ws.bind.TypeInfo identityLocation__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","identityLocation","http://soap.sforce.com/2006/04/metadata","SamlIdentityLocationType",1,1,true);

    private boolean identityLocation__is_set = false;

    private com.sforce.soap.metadata.SamlIdentityLocationType identityLocation;

    public com.sforce.soap.metadata.SamlIdentityLocationType getIdentityLocation() {
      return identityLocation;
    }

    public void setIdentityLocation(com.sforce.soap.metadata.SamlIdentityLocationType identityLocation) {
      this.identityLocation = identityLocation;
      identityLocation__is_set = true;
    }

    protected void setIdentityLocation(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, identityLocation__typeInfo)) {
        setIdentityLocation((com.sforce.soap.metadata.SamlIdentityLocationType)__typeMapper.readObject(__in, identityLocation__typeInfo, com.sforce.soap.metadata.SamlIdentityLocationType.class));
      }
    }

    /**
     * element : identityMapping of type {http://soap.sforce.com/2006/04/metadata}SamlIdentityType
     * java type: com.sforce.soap.metadata.SamlIdentityType
     */
    private static final com.sforce.ws.bind.TypeInfo identityMapping__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","identityMapping","http://soap.sforce.com/2006/04/metadata","SamlIdentityType",1,1,true);

    private boolean identityMapping__is_set = false;

    private com.sforce.soap.metadata.SamlIdentityType identityMapping;

    public com.sforce.soap.metadata.SamlIdentityType getIdentityMapping() {
      return identityMapping;
    }

    public void setIdentityMapping(com.sforce.soap.metadata.SamlIdentityType identityMapping) {
      this.identityMapping = identityMapping;
      identityMapping__is_set = true;
    }

    protected void setIdentityMapping(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, identityMapping__typeInfo)) {
        setIdentityMapping((com.sforce.soap.metadata.SamlIdentityType)__typeMapper.readObject(__in, identityMapping__typeInfo, com.sforce.soap.metadata.SamlIdentityType.class));
      }
    }

    /**
     * element : issuer of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo issuer__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","issuer","http://www.w3.org/2001/XMLSchema","string",1,1,true);

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
      if (__typeMapper.verifyElement(__in, issuer__typeInfo)) {
        setIssuer(__typeMapper.readString(__in, issuer__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : loginUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo loginUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","loginUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean loginUrl__is_set = false;

    private java.lang.String loginUrl;

    public java.lang.String getLoginUrl() {
      return loginUrl;
    }

    public void setLoginUrl(java.lang.String loginUrl) {
      this.loginUrl = loginUrl;
      loginUrl__is_set = true;
    }

    protected void setLoginUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, loginUrl__typeInfo)) {
        setLoginUrl(__typeMapper.readString(__in, loginUrl__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : logoutUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo logoutUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","logoutUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean logoutUrl__is_set = false;

    private java.lang.String logoutUrl;

    public java.lang.String getLogoutUrl() {
      return logoutUrl;
    }

    public void setLogoutUrl(java.lang.String logoutUrl) {
      this.logoutUrl = logoutUrl;
      logoutUrl__is_set = true;
    }

    protected void setLogoutUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, logoutUrl__typeInfo)) {
        setLogoutUrl(__typeMapper.readString(__in, logoutUrl__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean name__is_set = false;

    private java.lang.String name;

    public java.lang.String getName() {
      return name;
    }

    public void setName(java.lang.String name) {
      this.name = name;
      name__is_set = true;
    }

    protected void setName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, name__typeInfo)) {
        setName(__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : oauthTokenEndpoint of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo oauthTokenEndpoint__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","oauthTokenEndpoint","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean oauthTokenEndpoint__is_set = false;

    private java.lang.String oauthTokenEndpoint;

    public java.lang.String getOauthTokenEndpoint() {
      return oauthTokenEndpoint;
    }

    public void setOauthTokenEndpoint(java.lang.String oauthTokenEndpoint) {
      this.oauthTokenEndpoint = oauthTokenEndpoint;
      oauthTokenEndpoint__is_set = true;
    }

    protected void setOauthTokenEndpoint(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, oauthTokenEndpoint__typeInfo)) {
        setOauthTokenEndpoint(__typeMapper.readString(__in, oauthTokenEndpoint__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : redirectBinding of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo redirectBinding__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","redirectBinding","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean redirectBinding__is_set = false;

    private boolean redirectBinding;

    public boolean getRedirectBinding() {
      return redirectBinding;
    }

    public boolean isRedirectBinding() {
      return redirectBinding;
    }

    public void setRedirectBinding(boolean redirectBinding) {
      this.redirectBinding = redirectBinding;
      redirectBinding__is_set = true;
    }

    protected void setRedirectBinding(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, redirectBinding__typeInfo)) {
        setRedirectBinding(__typeMapper.readBoolean(__in, redirectBinding__typeInfo, boolean.class));
      }
    }

    /**
     * element : requestSignatureMethod of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo requestSignatureMethod__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","requestSignatureMethod","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean requestSignatureMethod__is_set = false;

    private java.lang.String requestSignatureMethod;

    public java.lang.String getRequestSignatureMethod() {
      return requestSignatureMethod;
    }

    public void setRequestSignatureMethod(java.lang.String requestSignatureMethod) {
      this.requestSignatureMethod = requestSignatureMethod;
      requestSignatureMethod__is_set = true;
    }

    protected void setRequestSignatureMethod(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, requestSignatureMethod__typeInfo)) {
        setRequestSignatureMethod(__typeMapper.readString(__in, requestSignatureMethod__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : salesforceLoginUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo salesforceLoginUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","salesforceLoginUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean salesforceLoginUrl__is_set = false;

    private java.lang.String salesforceLoginUrl;

    public java.lang.String getSalesforceLoginUrl() {
      return salesforceLoginUrl;
    }

    public void setSalesforceLoginUrl(java.lang.String salesforceLoginUrl) {
      this.salesforceLoginUrl = salesforceLoginUrl;
      salesforceLoginUrl__is_set = true;
    }

    protected void setSalesforceLoginUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, salesforceLoginUrl__typeInfo)) {
        setSalesforceLoginUrl(__typeMapper.readString(__in, salesforceLoginUrl__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : samlEntityId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo samlEntityId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","samlEntityId","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean samlEntityId__is_set = false;

    private java.lang.String samlEntityId;

    public java.lang.String getSamlEntityId() {
      return samlEntityId;
    }

    public void setSamlEntityId(java.lang.String samlEntityId) {
      this.samlEntityId = samlEntityId;
      samlEntityId__is_set = true;
    }

    protected void setSamlEntityId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, samlEntityId__typeInfo)) {
        setSamlEntityId(__typeMapper.readString(__in, samlEntityId__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : samlJitHandlerId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo samlJitHandlerId__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","samlJitHandlerId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean samlJitHandlerId__is_set = false;

    private java.lang.String samlJitHandlerId;

    public java.lang.String getSamlJitHandlerId() {
      return samlJitHandlerId;
    }

    public void setSamlJitHandlerId(java.lang.String samlJitHandlerId) {
      this.samlJitHandlerId = samlJitHandlerId;
      samlJitHandlerId__is_set = true;
    }

    protected void setSamlJitHandlerId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, samlJitHandlerId__typeInfo)) {
        setSamlJitHandlerId(__typeMapper.readString(__in, samlJitHandlerId__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : samlVersion of type {http://soap.sforce.com/2006/04/metadata}SamlType
     * java type: com.sforce.soap.metadata.SamlType
     */
    private static final com.sforce.ws.bind.TypeInfo samlVersion__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","samlVersion","http://soap.sforce.com/2006/04/metadata","SamlType",1,1,true);

    private boolean samlVersion__is_set = false;

    private com.sforce.soap.metadata.SamlType samlVersion;

    public com.sforce.soap.metadata.SamlType getSamlVersion() {
      return samlVersion;
    }

    public void setSamlVersion(com.sforce.soap.metadata.SamlType samlVersion) {
      this.samlVersion = samlVersion;
      samlVersion__is_set = true;
    }

    protected void setSamlVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, samlVersion__typeInfo)) {
        setSamlVersion((com.sforce.soap.metadata.SamlType)__typeMapper.readObject(__in, samlVersion__typeInfo, com.sforce.soap.metadata.SamlType.class));
      }
    }

    /**
     * element : userProvisioning of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo userProvisioning__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","userProvisioning","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean userProvisioning__is_set = false;

    private boolean userProvisioning;

    public boolean getUserProvisioning() {
      return userProvisioning;
    }

    public boolean isUserProvisioning() {
      return userProvisioning;
    }

    public void setUserProvisioning(boolean userProvisioning) {
      this.userProvisioning = userProvisioning;
      userProvisioning__is_set = true;
    }

    protected void setUserProvisioning(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, userProvisioning__typeInfo)) {
        setUserProvisioning(__typeMapper.readBoolean(__in, userProvisioning__typeInfo, boolean.class));
      }
    }

    /**
     * element : validationCert of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo validationCert__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","validationCert","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean validationCert__is_set = false;

    private java.lang.String validationCert;

    public java.lang.String getValidationCert() {
      return validationCert;
    }

    public void setValidationCert(java.lang.String validationCert) {
      this.validationCert = validationCert;
      validationCert__is_set = true;
    }

    protected void setValidationCert(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, validationCert__typeInfo)) {
        setValidationCert(__typeMapper.readString(__in, validationCert__typeInfo, java.lang.String.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "SamlSsoConfig");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeString(__out, attributeName__typeInfo, attributeName, attributeName__is_set);
       __typeMapper.writeString(__out, attributeNameIdFormat__typeInfo, attributeNameIdFormat, attributeNameIdFormat__is_set);
       __typeMapper.writeString(__out, decryptionCertificate__typeInfo, decryptionCertificate, decryptionCertificate__is_set);
       __typeMapper.writeString(__out, errorUrl__typeInfo, errorUrl, errorUrl__is_set);
       __typeMapper.writeString(__out, executionUserId__typeInfo, executionUserId, executionUserId__is_set);
       __typeMapper.writeObject(__out, identityLocation__typeInfo, identityLocation, identityLocation__is_set);
       __typeMapper.writeObject(__out, identityMapping__typeInfo, identityMapping, identityMapping__is_set);
       __typeMapper.writeString(__out, issuer__typeInfo, issuer, issuer__is_set);
       __typeMapper.writeString(__out, loginUrl__typeInfo, loginUrl, loginUrl__is_set);
       __typeMapper.writeString(__out, logoutUrl__typeInfo, logoutUrl, logoutUrl__is_set);
       __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
       __typeMapper.writeString(__out, oauthTokenEndpoint__typeInfo, oauthTokenEndpoint, oauthTokenEndpoint__is_set);
       __typeMapper.writeBoolean(__out, redirectBinding__typeInfo, redirectBinding, redirectBinding__is_set);
       __typeMapper.writeString(__out, requestSignatureMethod__typeInfo, requestSignatureMethod, requestSignatureMethod__is_set);
       __typeMapper.writeString(__out, salesforceLoginUrl__typeInfo, salesforceLoginUrl, salesforceLoginUrl__is_set);
       __typeMapper.writeString(__out, samlEntityId__typeInfo, samlEntityId, samlEntityId__is_set);
       __typeMapper.writeString(__out, samlJitHandlerId__typeInfo, samlJitHandlerId, samlJitHandlerId__is_set);
       __typeMapper.writeObject(__out, samlVersion__typeInfo, samlVersion, samlVersion__is_set);
       __typeMapper.writeBoolean(__out, userProvisioning__typeInfo, userProvisioning, userProvisioning__is_set);
       __typeMapper.writeString(__out, validationCert__typeInfo, validationCert, validationCert__is_set);
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
        setAttributeName(__in, __typeMapper);
        setAttributeNameIdFormat(__in, __typeMapper);
        setDecryptionCertificate(__in, __typeMapper);
        setErrorUrl(__in, __typeMapper);
        setExecutionUserId(__in, __typeMapper);
        setIdentityLocation(__in, __typeMapper);
        setIdentityMapping(__in, __typeMapper);
        setIssuer(__in, __typeMapper);
        setLoginUrl(__in, __typeMapper);
        setLogoutUrl(__in, __typeMapper);
        setName(__in, __typeMapper);
        setOauthTokenEndpoint(__in, __typeMapper);
        setRedirectBinding(__in, __typeMapper);
        setRequestSignatureMethod(__in, __typeMapper);
        setSalesforceLoginUrl(__in, __typeMapper);
        setSamlEntityId(__in, __typeMapper);
        setSamlJitHandlerId(__in, __typeMapper);
        setSamlVersion(__in, __typeMapper);
        setUserProvisioning(__in, __typeMapper);
        setValidationCert(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[SamlSsoConfig ");
      sb.append(super.toString());sb.append(" attributeName='").append(com.sforce.ws.util.Verbose.toString(attributeName)).append("'\n");
      sb.append(" attributeNameIdFormat='").append(com.sforce.ws.util.Verbose.toString(attributeNameIdFormat)).append("'\n");
      sb.append(" decryptionCertificate='").append(com.sforce.ws.util.Verbose.toString(decryptionCertificate)).append("'\n");
      sb.append(" errorUrl='").append(com.sforce.ws.util.Verbose.toString(errorUrl)).append("'\n");
      sb.append(" executionUserId='").append(com.sforce.ws.util.Verbose.toString(executionUserId)).append("'\n");
      sb.append(" identityLocation='").append(com.sforce.ws.util.Verbose.toString(identityLocation)).append("'\n");
      sb.append(" identityMapping='").append(com.sforce.ws.util.Verbose.toString(identityMapping)).append("'\n");
      sb.append(" issuer='").append(com.sforce.ws.util.Verbose.toString(issuer)).append("'\n");
      sb.append(" loginUrl='").append(com.sforce.ws.util.Verbose.toString(loginUrl)).append("'\n");
      sb.append(" logoutUrl='").append(com.sforce.ws.util.Verbose.toString(logoutUrl)).append("'\n");
      sb.append(" name='").append(com.sforce.ws.util.Verbose.toString(name)).append("'\n");
      sb.append(" oauthTokenEndpoint='").append(com.sforce.ws.util.Verbose.toString(oauthTokenEndpoint)).append("'\n");
      sb.append(" redirectBinding='").append(com.sforce.ws.util.Verbose.toString(redirectBinding)).append("'\n");
      sb.append(" requestSignatureMethod='").append(com.sforce.ws.util.Verbose.toString(requestSignatureMethod)).append("'\n");
      sb.append(" salesforceLoginUrl='").append(com.sforce.ws.util.Verbose.toString(salesforceLoginUrl)).append("'\n");
      sb.append(" samlEntityId='").append(com.sforce.ws.util.Verbose.toString(samlEntityId)).append("'\n");
      sb.append(" samlJitHandlerId='").append(com.sforce.ws.util.Verbose.toString(samlJitHandlerId)).append("'\n");
      sb.append(" samlVersion='").append(com.sforce.ws.util.Verbose.toString(samlVersion)).append("'\n");
      sb.append(" userProvisioning='").append(com.sforce.ws.util.Verbose.toString(userProvisioning)).append("'\n");
      sb.append(" validationCert='").append(com.sforce.ws.util.Verbose.toString(validationCert)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
