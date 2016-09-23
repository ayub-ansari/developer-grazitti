package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class Package extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public Package() {}

    /**
     * element : apiAccessLevel of type {http://soap.sforce.com/2006/04/metadata}APIAccessLevel
     * java type: com.sforce.soap.metadata.APIAccessLevel
     */
    private static final com.sforce.ws.bind.TypeInfo apiAccessLevel__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","apiAccessLevel","http://soap.sforce.com/2006/04/metadata","APIAccessLevel",0,1,true);

    private boolean apiAccessLevel__is_set = false;

    private com.sforce.soap.metadata.APIAccessLevel apiAccessLevel;

    public com.sforce.soap.metadata.APIAccessLevel getApiAccessLevel() {
      return apiAccessLevel;
    }

    public void setApiAccessLevel(com.sforce.soap.metadata.APIAccessLevel apiAccessLevel) {
      this.apiAccessLevel = apiAccessLevel;
      apiAccessLevel__is_set = true;
    }

    protected void setApiAccessLevel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, apiAccessLevel__typeInfo)) {
        setApiAccessLevel((com.sforce.soap.metadata.APIAccessLevel)__typeMapper.readObject(__in, apiAccessLevel__typeInfo, com.sforce.soap.metadata.APIAccessLevel.class));
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
     * element : namespacePrefix of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo namespacePrefix__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","namespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean namespacePrefix__is_set = false;

    private java.lang.String namespacePrefix;

    public java.lang.String getNamespacePrefix() {
      return namespacePrefix;
    }

    public void setNamespacePrefix(java.lang.String namespacePrefix) {
      this.namespacePrefix = namespacePrefix;
      namespacePrefix__is_set = true;
    }

    protected void setNamespacePrefix(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, namespacePrefix__typeInfo)) {
        setNamespacePrefix(__typeMapper.readString(__in, namespacePrefix__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : objectPermissions of type {http://soap.sforce.com/2006/04/metadata}ProfileObjectPermissions
     * java type: com.sforce.soap.metadata.ProfileObjectPermissions[]
     */
    private static final com.sforce.ws.bind.TypeInfo objectPermissions__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","objectPermissions","http://soap.sforce.com/2006/04/metadata","ProfileObjectPermissions",0,-1,true);

    private boolean objectPermissions__is_set = false;

    private com.sforce.soap.metadata.ProfileObjectPermissions[] objectPermissions = new com.sforce.soap.metadata.ProfileObjectPermissions[0];

    public com.sforce.soap.metadata.ProfileObjectPermissions[] getObjectPermissions() {
      return objectPermissions;
    }

    public void setObjectPermissions(com.sforce.soap.metadata.ProfileObjectPermissions[] objectPermissions) {
      this.objectPermissions = objectPermissions;
      objectPermissions__is_set = true;
    }

    protected void setObjectPermissions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, objectPermissions__typeInfo)) {
        setObjectPermissions((com.sforce.soap.metadata.ProfileObjectPermissions[])__typeMapper.readObject(__in, objectPermissions__typeInfo, com.sforce.soap.metadata.ProfileObjectPermissions[].class));
      }
    }

    /**
     * element : packageType of type {http://soap.sforce.com/2006/04/metadata}PackageTypeEnum
     * java type: com.sforce.soap.metadata.PackageTypeEnum
     */
    private static final com.sforce.ws.bind.TypeInfo packageType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","packageType","http://soap.sforce.com/2006/04/metadata","PackageTypeEnum",0,1,true);

    private boolean packageType__is_set = false;

    private com.sforce.soap.metadata.PackageTypeEnum packageType;

    public com.sforce.soap.metadata.PackageTypeEnum getPackageType() {
      return packageType;
    }

    public void setPackageType(com.sforce.soap.metadata.PackageTypeEnum packageType) {
      this.packageType = packageType;
      packageType__is_set = true;
    }

    protected void setPackageType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, packageType__typeInfo)) {
        setPackageType((com.sforce.soap.metadata.PackageTypeEnum)__typeMapper.readObject(__in, packageType__typeInfo, com.sforce.soap.metadata.PackageTypeEnum.class));
      }
    }

    /**
     * element : packageVersion of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo packageVersion__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","packageVersion","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean packageVersion__is_set = false;

    private java.lang.String packageVersion;

    public java.lang.String getPackageVersion() {
      return packageVersion;
    }

    public void setPackageVersion(java.lang.String packageVersion) {
      this.packageVersion = packageVersion;
      packageVersion__is_set = true;
    }

    protected void setPackageVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, packageVersion__typeInfo)) {
        setPackageVersion(__typeMapper.readString(__in, packageVersion__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : postInstallClass of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo postInstallClass__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","postInstallClass","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean postInstallClass__is_set = false;

    private java.lang.String postInstallClass;

    public java.lang.String getPostInstallClass() {
      return postInstallClass;
    }

    public void setPostInstallClass(java.lang.String postInstallClass) {
      this.postInstallClass = postInstallClass;
      postInstallClass__is_set = true;
    }

    protected void setPostInstallClass(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, postInstallClass__typeInfo)) {
        setPostInstallClass(__typeMapper.readString(__in, postInstallClass__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : setupWeblink of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo setupWeblink__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","setupWeblink","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean setupWeblink__is_set = false;

    private java.lang.String setupWeblink;

    public java.lang.String getSetupWeblink() {
      return setupWeblink;
    }

    public void setSetupWeblink(java.lang.String setupWeblink) {
      this.setupWeblink = setupWeblink;
      setupWeblink__is_set = true;
    }

    protected void setSetupWeblink(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, setupWeblink__typeInfo)) {
        setSetupWeblink(__typeMapper.readString(__in, setupWeblink__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : types of type {http://soap.sforce.com/2006/04/metadata}PackageTypeMembers
     * java type: com.sforce.soap.metadata.PackageTypeMembers[]
     */
    private static final com.sforce.ws.bind.TypeInfo types__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","types","http://soap.sforce.com/2006/04/metadata","PackageTypeMembers",0,-1,true);

    private boolean types__is_set = false;

    private com.sforce.soap.metadata.PackageTypeMembers[] types = new com.sforce.soap.metadata.PackageTypeMembers[0];

    public com.sforce.soap.metadata.PackageTypeMembers[] getTypes() {
      return types;
    }

    public void setTypes(com.sforce.soap.metadata.PackageTypeMembers[] types) {
      this.types = types;
      types__is_set = true;
    }

    protected void setTypes(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, types__typeInfo)) {
        setTypes((com.sforce.soap.metadata.PackageTypeMembers[])__typeMapper.readObject(__in, types__typeInfo, com.sforce.soap.metadata.PackageTypeMembers[].class));
      }
    }

    /**
     * element : uninstallClass of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo uninstallClass__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","uninstallClass","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean uninstallClass__is_set = false;

    private java.lang.String uninstallClass;

    public java.lang.String getUninstallClass() {
      return uninstallClass;
    }

    public void setUninstallClass(java.lang.String uninstallClass) {
      this.uninstallClass = uninstallClass;
      uninstallClass__is_set = true;
    }

    protected void setUninstallClass(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, uninstallClass__typeInfo)) {
        setUninstallClass(__typeMapper.readString(__in, uninstallClass__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : version of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo version__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","version","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean version__is_set = false;

    private java.lang.String version;

    public java.lang.String getVersion() {
      return version;
    }

    public void setVersion(java.lang.String version) {
      this.version = version;
      version__is_set = true;
    }

    protected void setVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, version__typeInfo)) {
        setVersion(__typeMapper.readString(__in, version__typeInfo, java.lang.String.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "Package");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, apiAccessLevel__typeInfo, apiAccessLevel, apiAccessLevel__is_set);
       __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
       __typeMapper.writeString(__out, namespacePrefix__typeInfo, namespacePrefix, namespacePrefix__is_set);
       __typeMapper.writeObject(__out, objectPermissions__typeInfo, objectPermissions, objectPermissions__is_set);
       __typeMapper.writeObject(__out, packageType__typeInfo, packageType, packageType__is_set);
       __typeMapper.writeString(__out, packageVersion__typeInfo, packageVersion, packageVersion__is_set);
       __typeMapper.writeString(__out, postInstallClass__typeInfo, postInstallClass, postInstallClass__is_set);
       __typeMapper.writeString(__out, setupWeblink__typeInfo, setupWeblink, setupWeblink__is_set);
       __typeMapper.writeObject(__out, types__typeInfo, types, types__is_set);
       __typeMapper.writeString(__out, uninstallClass__typeInfo, uninstallClass, uninstallClass__is_set);
       __typeMapper.writeString(__out, version__typeInfo, version, version__is_set);
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
        setApiAccessLevel(__in, __typeMapper);
        setDescription(__in, __typeMapper);
        setNamespacePrefix(__in, __typeMapper);
        setObjectPermissions(__in, __typeMapper);
        setPackageType(__in, __typeMapper);
        setPackageVersion(__in, __typeMapper);
        setPostInstallClass(__in, __typeMapper);
        setSetupWeblink(__in, __typeMapper);
        setTypes(__in, __typeMapper);
        setUninstallClass(__in, __typeMapper);
        setVersion(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[Package ");
      sb.append(super.toString());sb.append(" apiAccessLevel='").append(com.sforce.ws.util.Verbose.toString(apiAccessLevel)).append("'\n");
      sb.append(" description='").append(com.sforce.ws.util.Verbose.toString(description)).append("'\n");
      sb.append(" namespacePrefix='").append(com.sforce.ws.util.Verbose.toString(namespacePrefix)).append("'\n");
      sb.append(" objectPermissions='").append(com.sforce.ws.util.Verbose.toString(objectPermissions)).append("'\n");
      sb.append(" packageType='").append(com.sforce.ws.util.Verbose.toString(packageType)).append("'\n");
      sb.append(" packageVersion='").append(com.sforce.ws.util.Verbose.toString(packageVersion)).append("'\n");
      sb.append(" postInstallClass='").append(com.sforce.ws.util.Verbose.toString(postInstallClass)).append("'\n");
      sb.append(" setupWeblink='").append(com.sforce.ws.util.Verbose.toString(setupWeblink)).append("'\n");
      sb.append(" types='").append(com.sforce.ws.util.Verbose.toString(types)).append("'\n");
      sb.append(" uninstallClass='").append(com.sforce.ws.util.Verbose.toString(uninstallClass)).append("'\n");
      sb.append(" version='").append(com.sforce.ws.util.Verbose.toString(version)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
