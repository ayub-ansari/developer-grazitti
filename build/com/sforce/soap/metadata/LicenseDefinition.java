package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class LicenseDefinition extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public LicenseDefinition() {}

    /**
     * element : aggregationGroup of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo aggregationGroup__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","aggregationGroup","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean aggregationGroup__is_set = false;

    private java.lang.String aggregationGroup;

    public java.lang.String getAggregationGroup() {
      return aggregationGroup;
    }

    public void setAggregationGroup(java.lang.String aggregationGroup) {
      this.aggregationGroup = aggregationGroup;
      aggregationGroup__is_set = true;
    }

    protected void setAggregationGroup(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, aggregationGroup__typeInfo)) {
        setAggregationGroup(__typeMapper.readString(__in, aggregationGroup__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : description of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo description__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","description","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean description__is_set = false;

    private java.lang.String description;

    public java.lang.String getDescription() {
      return description;
    }

    public void setDescription(java.lang.String description) {
      this.description = description;
      description__is_set = true;
    }

    protected void setDescription(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, description__typeInfo)) {
        setDescription(__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : isPublished of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo isPublished__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","isPublished","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean isPublished__is_set = false;

    private boolean isPublished;

    public boolean getIsPublished() {
      return isPublished;
    }

    public boolean isIsPublished() {
      return isPublished;
    }

    public void setIsPublished(boolean isPublished) {
      this.isPublished = isPublished;
      isPublished__is_set = true;
    }

    protected void setIsPublished(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, isPublished__typeInfo)) {
        setIsPublished(__typeMapper.readBoolean(__in, isPublished__typeInfo, boolean.class));
      }
    }

    /**
     * element : label of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean label__is_set = false;

    private java.lang.String label;

    public java.lang.String getLabel() {
      return label;
    }

    public void setLabel(java.lang.String label) {
      this.label = label;
      label__is_set = true;
    }

    protected void setLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, label__typeInfo)) {
        setLabel(__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : licensedCustomPermissions of type {http://soap.sforce.com/2006/04/metadata}LicensedCustomPermissions
     * java type: com.sforce.soap.metadata.LicensedCustomPermissions[]
     */
    private static final com.sforce.ws.bind.TypeInfo licensedCustomPermissions__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","licensedCustomPermissions","http://soap.sforce.com/2006/04/metadata","LicensedCustomPermissions",0,-1,true);

    private boolean licensedCustomPermissions__is_set = false;

    private com.sforce.soap.metadata.LicensedCustomPermissions[] licensedCustomPermissions = new com.sforce.soap.metadata.LicensedCustomPermissions[0];

    public com.sforce.soap.metadata.LicensedCustomPermissions[] getLicensedCustomPermissions() {
      return licensedCustomPermissions;
    }

    public void setLicensedCustomPermissions(com.sforce.soap.metadata.LicensedCustomPermissions[] licensedCustomPermissions) {
      this.licensedCustomPermissions = licensedCustomPermissions;
      licensedCustomPermissions__is_set = true;
    }

    protected void setLicensedCustomPermissions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, licensedCustomPermissions__typeInfo)) {
        setLicensedCustomPermissions((com.sforce.soap.metadata.LicensedCustomPermissions[])__typeMapper.readObject(__in, licensedCustomPermissions__typeInfo, com.sforce.soap.metadata.LicensedCustomPermissions[].class));
      }
    }

    /**
     * element : licensingAuthority of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo licensingAuthority__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","licensingAuthority","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean licensingAuthority__is_set = false;

    private java.lang.String licensingAuthority;

    public java.lang.String getLicensingAuthority() {
      return licensingAuthority;
    }

    public void setLicensingAuthority(java.lang.String licensingAuthority) {
      this.licensingAuthority = licensingAuthority;
      licensingAuthority__is_set = true;
    }

    protected void setLicensingAuthority(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, licensingAuthority__typeInfo)) {
        setLicensingAuthority(__typeMapper.readString(__in, licensingAuthority__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : licensingAuthorityProvider of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo licensingAuthorityProvider__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","licensingAuthorityProvider","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean licensingAuthorityProvider__is_set = false;

    private java.lang.String licensingAuthorityProvider;

    public java.lang.String getLicensingAuthorityProvider() {
      return licensingAuthorityProvider;
    }

    public void setLicensingAuthorityProvider(java.lang.String licensingAuthorityProvider) {
      this.licensingAuthorityProvider = licensingAuthorityProvider;
      licensingAuthorityProvider__is_set = true;
    }

    protected void setLicensingAuthorityProvider(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, licensingAuthorityProvider__typeInfo)) {
        setLicensingAuthorityProvider(__typeMapper.readString(__in, licensingAuthorityProvider__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : minPlatformVersion of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo minPlatformVersion__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","minPlatformVersion","http://www.w3.org/2001/XMLSchema","int",1,1,true);

    private boolean minPlatformVersion__is_set = false;

    private int minPlatformVersion;

    public int getMinPlatformVersion() {
      return minPlatformVersion;
    }

    public void setMinPlatformVersion(int minPlatformVersion) {
      this.minPlatformVersion = minPlatformVersion;
      minPlatformVersion__is_set = true;
    }

    protected void setMinPlatformVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, minPlatformVersion__typeInfo)) {
        setMinPlatformVersion((int)__typeMapper.readInt(__in, minPlatformVersion__typeInfo, int.class));
      }
    }

    /**
     * element : origin of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo origin__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","origin","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean origin__is_set = false;

    private java.lang.String origin;

    public java.lang.String getOrigin() {
      return origin;
    }

    public void setOrigin(java.lang.String origin) {
      this.origin = origin;
      origin__is_set = true;
    }

    protected void setOrigin(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, origin__typeInfo)) {
        setOrigin(__typeMapper.readString(__in, origin__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : revision of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo revision__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","revision","http://www.w3.org/2001/XMLSchema","int",1,1,true);

    private boolean revision__is_set = false;

    private int revision;

    public int getRevision() {
      return revision;
    }

    public void setRevision(int revision) {
      this.revision = revision;
      revision__is_set = true;
    }

    protected void setRevision(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, revision__typeInfo)) {
        setRevision((int)__typeMapper.readInt(__in, revision__typeInfo, int.class));
      }
    }

    /**
     * element : trialLicenseDuration of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo trialLicenseDuration__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","trialLicenseDuration","http://www.w3.org/2001/XMLSchema","int",1,1,true);

    private boolean trialLicenseDuration__is_set = false;

    private int trialLicenseDuration;

    public int getTrialLicenseDuration() {
      return trialLicenseDuration;
    }

    public void setTrialLicenseDuration(int trialLicenseDuration) {
      this.trialLicenseDuration = trialLicenseDuration;
      trialLicenseDuration__is_set = true;
    }

    protected void setTrialLicenseDuration(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, trialLicenseDuration__typeInfo)) {
        setTrialLicenseDuration((int)__typeMapper.readInt(__in, trialLicenseDuration__typeInfo, int.class));
      }
    }

    /**
     * element : trialLicenseQuantity of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo trialLicenseQuantity__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","trialLicenseQuantity","http://www.w3.org/2001/XMLSchema","int",1,1,true);

    private boolean trialLicenseQuantity__is_set = false;

    private int trialLicenseQuantity;

    public int getTrialLicenseQuantity() {
      return trialLicenseQuantity;
    }

    public void setTrialLicenseQuantity(int trialLicenseQuantity) {
      this.trialLicenseQuantity = trialLicenseQuantity;
      trialLicenseQuantity__is_set = true;
    }

    protected void setTrialLicenseQuantity(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, trialLicenseQuantity__typeInfo)) {
        setTrialLicenseQuantity((int)__typeMapper.readInt(__in, trialLicenseQuantity__typeInfo, int.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "LicenseDefinition");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeString(__out, aggregationGroup__typeInfo, aggregationGroup, aggregationGroup__is_set);
       __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
       __typeMapper.writeBoolean(__out, isPublished__typeInfo, isPublished, isPublished__is_set);
       __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
       __typeMapper.writeObject(__out, licensedCustomPermissions__typeInfo, licensedCustomPermissions, licensedCustomPermissions__is_set);
       __typeMapper.writeString(__out, licensingAuthority__typeInfo, licensingAuthority, licensingAuthority__is_set);
       __typeMapper.writeString(__out, licensingAuthorityProvider__typeInfo, licensingAuthorityProvider, licensingAuthorityProvider__is_set);
       __typeMapper.writeInt(__out, minPlatformVersion__typeInfo, minPlatformVersion, minPlatformVersion__is_set);
       __typeMapper.writeString(__out, origin__typeInfo, origin, origin__is_set);
       __typeMapper.writeInt(__out, revision__typeInfo, revision, revision__is_set);
       __typeMapper.writeInt(__out, trialLicenseDuration__typeInfo, trialLicenseDuration, trialLicenseDuration__is_set);
       __typeMapper.writeInt(__out, trialLicenseQuantity__typeInfo, trialLicenseQuantity, trialLicenseQuantity__is_set);
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
        setAggregationGroup(__in, __typeMapper);
        setDescription(__in, __typeMapper);
        setIsPublished(__in, __typeMapper);
        setLabel(__in, __typeMapper);
        setLicensedCustomPermissions(__in, __typeMapper);
        setLicensingAuthority(__in, __typeMapper);
        setLicensingAuthorityProvider(__in, __typeMapper);
        setMinPlatformVersion(__in, __typeMapper);
        setOrigin(__in, __typeMapper);
        setRevision(__in, __typeMapper);
        setTrialLicenseDuration(__in, __typeMapper);
        setTrialLicenseQuantity(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[LicenseDefinition ");
      sb.append(super.toString());sb.append(" aggregationGroup='").append(com.sforce.ws.util.Verbose.toString(aggregationGroup)).append("'\n");
      sb.append(" description='").append(com.sforce.ws.util.Verbose.toString(description)).append("'\n");
      sb.append(" isPublished='").append(com.sforce.ws.util.Verbose.toString(isPublished)).append("'\n");
      sb.append(" label='").append(com.sforce.ws.util.Verbose.toString(label)).append("'\n");
      sb.append(" licensedCustomPermissions='").append(com.sforce.ws.util.Verbose.toString(licensedCustomPermissions)).append("'\n");
      sb.append(" licensingAuthority='").append(com.sforce.ws.util.Verbose.toString(licensingAuthority)).append("'\n");
      sb.append(" licensingAuthorityProvider='").append(com.sforce.ws.util.Verbose.toString(licensingAuthorityProvider)).append("'\n");
      sb.append(" minPlatformVersion='").append(com.sforce.ws.util.Verbose.toString(minPlatformVersion)).append("'\n");
      sb.append(" origin='").append(com.sforce.ws.util.Verbose.toString(origin)).append("'\n");
      sb.append(" revision='").append(com.sforce.ws.util.Verbose.toString(revision)).append("'\n");
      sb.append(" trialLicenseDuration='").append(com.sforce.ws.util.Verbose.toString(trialLicenseDuration)).append("'\n");
      sb.append(" trialLicenseQuantity='").append(com.sforce.ws.util.Verbose.toString(trialLicenseQuantity)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
