package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ConnectedApp extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public ConnectedApp() {}

    /**
     * element : attributes of type {http://soap.sforce.com/2006/04/metadata}ConnectedAppAttribute
     * java type: com.sforce.soap.metadata.ConnectedAppAttribute[]
     */
    private static final com.sforce.ws.bind.TypeInfo attributes__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","attributes","http://soap.sforce.com/2006/04/metadata","ConnectedAppAttribute",0,-1,true);

    private boolean attributes__is_set = false;

    private com.sforce.soap.metadata.ConnectedAppAttribute[] attributes = new com.sforce.soap.metadata.ConnectedAppAttribute[0];

    public com.sforce.soap.metadata.ConnectedAppAttribute[] getAttributes() {
      return attributes;
    }

    public void setAttributes(com.sforce.soap.metadata.ConnectedAppAttribute[] attributes) {
      this.attributes = attributes;
      attributes__is_set = true;
    }

    protected void setAttributes(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, attributes__typeInfo)) {
        setAttributes((com.sforce.soap.metadata.ConnectedAppAttribute[])__typeMapper.readObject(__in, attributes__typeInfo, com.sforce.soap.metadata.ConnectedAppAttribute[].class));
      }
    }

    /**
     * element : canvasConfig of type {http://soap.sforce.com/2006/04/metadata}ConnectedAppCanvasConfig
     * java type: com.sforce.soap.metadata.ConnectedAppCanvasConfig
     */
    private static final com.sforce.ws.bind.TypeInfo canvasConfig__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","canvasConfig","http://soap.sforce.com/2006/04/metadata","ConnectedAppCanvasConfig",0,1,true);

    private boolean canvasConfig__is_set = false;

    private com.sforce.soap.metadata.ConnectedAppCanvasConfig canvasConfig;

    public com.sforce.soap.metadata.ConnectedAppCanvasConfig getCanvasConfig() {
      return canvasConfig;
    }

    public void setCanvasConfig(com.sforce.soap.metadata.ConnectedAppCanvasConfig canvasConfig) {
      this.canvasConfig = canvasConfig;
      canvasConfig__is_set = true;
    }

    protected void setCanvasConfig(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, canvasConfig__typeInfo)) {
        setCanvasConfig((com.sforce.soap.metadata.ConnectedAppCanvasConfig)__typeMapper.readObject(__in, canvasConfig__typeInfo, com.sforce.soap.metadata.ConnectedAppCanvasConfig.class));
      }
    }

    /**
     * element : contactEmail of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo contactEmail__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","contactEmail","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean contactEmail__is_set = false;

    private java.lang.String contactEmail;

    public java.lang.String getContactEmail() {
      return contactEmail;
    }

    public void setContactEmail(java.lang.String contactEmail) {
      this.contactEmail = contactEmail;
      contactEmail__is_set = true;
    }

    protected void setContactEmail(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, contactEmail__typeInfo)) {
        setContactEmail(__typeMapper.readString(__in, contactEmail__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : contactPhone of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo contactPhone__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","contactPhone","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean contactPhone__is_set = false;

    private java.lang.String contactPhone;

    public java.lang.String getContactPhone() {
      return contactPhone;
    }

    public void setContactPhone(java.lang.String contactPhone) {
      this.contactPhone = contactPhone;
      contactPhone__is_set = true;
    }

    protected void setContactPhone(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, contactPhone__typeInfo)) {
        setContactPhone(__typeMapper.readString(__in, contactPhone__typeInfo, java.lang.String.class));
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
     * element : iconUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo iconUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","iconUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean iconUrl__is_set = false;

    private java.lang.String iconUrl;

    public java.lang.String getIconUrl() {
      return iconUrl;
    }

    public void setIconUrl(java.lang.String iconUrl) {
      this.iconUrl = iconUrl;
      iconUrl__is_set = true;
    }

    protected void setIconUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, iconUrl__typeInfo)) {
        setIconUrl(__typeMapper.readString(__in, iconUrl__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : infoUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo infoUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","infoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean infoUrl__is_set = false;

    private java.lang.String infoUrl;

    public java.lang.String getInfoUrl() {
      return infoUrl;
    }

    public void setInfoUrl(java.lang.String infoUrl) {
      this.infoUrl = infoUrl;
      infoUrl__is_set = true;
    }

    protected void setInfoUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, infoUrl__typeInfo)) {
        setInfoUrl(__typeMapper.readString(__in, infoUrl__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : ipRanges of type {http://soap.sforce.com/2006/04/metadata}ConnectedAppIpRange
     * java type: com.sforce.soap.metadata.ConnectedAppIpRange[]
     */
    private static final com.sforce.ws.bind.TypeInfo ipRanges__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","ipRanges","http://soap.sforce.com/2006/04/metadata","ConnectedAppIpRange",0,-1,true);

    private boolean ipRanges__is_set = false;

    private com.sforce.soap.metadata.ConnectedAppIpRange[] ipRanges = new com.sforce.soap.metadata.ConnectedAppIpRange[0];

    public com.sforce.soap.metadata.ConnectedAppIpRange[] getIpRanges() {
      return ipRanges;
    }

    public void setIpRanges(com.sforce.soap.metadata.ConnectedAppIpRange[] ipRanges) {
      this.ipRanges = ipRanges;
      ipRanges__is_set = true;
    }

    protected void setIpRanges(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, ipRanges__typeInfo)) {
        setIpRanges((com.sforce.soap.metadata.ConnectedAppIpRange[])__typeMapper.readObject(__in, ipRanges__typeInfo, com.sforce.soap.metadata.ConnectedAppIpRange[].class));
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
     * element : logoUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo logoUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","logoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean logoUrl__is_set = false;

    private java.lang.String logoUrl;

    public java.lang.String getLogoUrl() {
      return logoUrl;
    }

    public void setLogoUrl(java.lang.String logoUrl) {
      this.logoUrl = logoUrl;
      logoUrl__is_set = true;
    }

    protected void setLogoUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, logoUrl__typeInfo)) {
        setLogoUrl(__typeMapper.readString(__in, logoUrl__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : mobileAppConfig of type {http://soap.sforce.com/2006/04/metadata}ConnectedAppMobileDetailConfig
     * java type: com.sforce.soap.metadata.ConnectedAppMobileDetailConfig
     */
    private static final com.sforce.ws.bind.TypeInfo mobileAppConfig__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","mobileAppConfig","http://soap.sforce.com/2006/04/metadata","ConnectedAppMobileDetailConfig",0,1,true);

    private boolean mobileAppConfig__is_set = false;

    private com.sforce.soap.metadata.ConnectedAppMobileDetailConfig mobileAppConfig;

    public com.sforce.soap.metadata.ConnectedAppMobileDetailConfig getMobileAppConfig() {
      return mobileAppConfig;
    }

    public void setMobileAppConfig(com.sforce.soap.metadata.ConnectedAppMobileDetailConfig mobileAppConfig) {
      this.mobileAppConfig = mobileAppConfig;
      mobileAppConfig__is_set = true;
    }

    protected void setMobileAppConfig(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, mobileAppConfig__typeInfo)) {
        setMobileAppConfig((com.sforce.soap.metadata.ConnectedAppMobileDetailConfig)__typeMapper.readObject(__in, mobileAppConfig__typeInfo, com.sforce.soap.metadata.ConnectedAppMobileDetailConfig.class));
      }
    }

    /**
     * element : mobileStartUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo mobileStartUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","mobileStartUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean mobileStartUrl__is_set = false;

    private java.lang.String mobileStartUrl;

    public java.lang.String getMobileStartUrl() {
      return mobileStartUrl;
    }

    public void setMobileStartUrl(java.lang.String mobileStartUrl) {
      this.mobileStartUrl = mobileStartUrl;
      mobileStartUrl__is_set = true;
    }

    protected void setMobileStartUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, mobileStartUrl__typeInfo)) {
        setMobileStartUrl(__typeMapper.readString(__in, mobileStartUrl__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : oauthConfig of type {http://soap.sforce.com/2006/04/metadata}ConnectedAppOauthConfig
     * java type: com.sforce.soap.metadata.ConnectedAppOauthConfig
     */
    private static final com.sforce.ws.bind.TypeInfo oauthConfig__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","oauthConfig","http://soap.sforce.com/2006/04/metadata","ConnectedAppOauthConfig",0,1,true);

    private boolean oauthConfig__is_set = false;

    private com.sforce.soap.metadata.ConnectedAppOauthConfig oauthConfig;

    public com.sforce.soap.metadata.ConnectedAppOauthConfig getOauthConfig() {
      return oauthConfig;
    }

    public void setOauthConfig(com.sforce.soap.metadata.ConnectedAppOauthConfig oauthConfig) {
      this.oauthConfig = oauthConfig;
      oauthConfig__is_set = true;
    }

    protected void setOauthConfig(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, oauthConfig__typeInfo)) {
        setOauthConfig((com.sforce.soap.metadata.ConnectedAppOauthConfig)__typeMapper.readObject(__in, oauthConfig__typeInfo, com.sforce.soap.metadata.ConnectedAppOauthConfig.class));
      }
    }

    /**
     * element : plugin of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo plugin__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","plugin","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean plugin__is_set = false;

    private java.lang.String plugin;

    public java.lang.String getPlugin() {
      return plugin;
    }

    public void setPlugin(java.lang.String plugin) {
      this.plugin = plugin;
      plugin__is_set = true;
    }

    protected void setPlugin(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, plugin__typeInfo)) {
        setPlugin(__typeMapper.readString(__in, plugin__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : samlConfig of type {http://soap.sforce.com/2006/04/metadata}ConnectedAppSamlConfig
     * java type: com.sforce.soap.metadata.ConnectedAppSamlConfig
     */
    private static final com.sforce.ws.bind.TypeInfo samlConfig__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","samlConfig","http://soap.sforce.com/2006/04/metadata","ConnectedAppSamlConfig",0,1,true);

    private boolean samlConfig__is_set = false;

    private com.sforce.soap.metadata.ConnectedAppSamlConfig samlConfig;

    public com.sforce.soap.metadata.ConnectedAppSamlConfig getSamlConfig() {
      return samlConfig;
    }

    public void setSamlConfig(com.sforce.soap.metadata.ConnectedAppSamlConfig samlConfig) {
      this.samlConfig = samlConfig;
      samlConfig__is_set = true;
    }

    protected void setSamlConfig(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, samlConfig__typeInfo)) {
        setSamlConfig((com.sforce.soap.metadata.ConnectedAppSamlConfig)__typeMapper.readObject(__in, samlConfig__typeInfo, com.sforce.soap.metadata.ConnectedAppSamlConfig.class));
      }
    }

    /**
     * element : startUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo startUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","startUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean startUrl__is_set = false;

    private java.lang.String startUrl;

    public java.lang.String getStartUrl() {
      return startUrl;
    }

    public void setStartUrl(java.lang.String startUrl) {
      this.startUrl = startUrl;
      startUrl__is_set = true;
    }

    protected void setStartUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, startUrl__typeInfo)) {
        setStartUrl(__typeMapper.readString(__in, startUrl__typeInfo, java.lang.String.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "ConnectedApp");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, attributes__typeInfo, attributes, attributes__is_set);
       __typeMapper.writeObject(__out, canvasConfig__typeInfo, canvasConfig, canvasConfig__is_set);
       __typeMapper.writeString(__out, contactEmail__typeInfo, contactEmail, contactEmail__is_set);
       __typeMapper.writeString(__out, contactPhone__typeInfo, contactPhone, contactPhone__is_set);
       __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
       __typeMapper.writeString(__out, iconUrl__typeInfo, iconUrl, iconUrl__is_set);
       __typeMapper.writeString(__out, infoUrl__typeInfo, infoUrl, infoUrl__is_set);
       __typeMapper.writeObject(__out, ipRanges__typeInfo, ipRanges, ipRanges__is_set);
       __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
       __typeMapper.writeString(__out, logoUrl__typeInfo, logoUrl, logoUrl__is_set);
       __typeMapper.writeObject(__out, mobileAppConfig__typeInfo, mobileAppConfig, mobileAppConfig__is_set);
       __typeMapper.writeString(__out, mobileStartUrl__typeInfo, mobileStartUrl, mobileStartUrl__is_set);
       __typeMapper.writeObject(__out, oauthConfig__typeInfo, oauthConfig, oauthConfig__is_set);
       __typeMapper.writeString(__out, plugin__typeInfo, plugin, plugin__is_set);
       __typeMapper.writeObject(__out, samlConfig__typeInfo, samlConfig, samlConfig__is_set);
       __typeMapper.writeString(__out, startUrl__typeInfo, startUrl, startUrl__is_set);
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
        setAttributes(__in, __typeMapper);
        setCanvasConfig(__in, __typeMapper);
        setContactEmail(__in, __typeMapper);
        setContactPhone(__in, __typeMapper);
        setDescription(__in, __typeMapper);
        setIconUrl(__in, __typeMapper);
        setInfoUrl(__in, __typeMapper);
        setIpRanges(__in, __typeMapper);
        setLabel(__in, __typeMapper);
        setLogoUrl(__in, __typeMapper);
        setMobileAppConfig(__in, __typeMapper);
        setMobileStartUrl(__in, __typeMapper);
        setOauthConfig(__in, __typeMapper);
        setPlugin(__in, __typeMapper);
        setSamlConfig(__in, __typeMapper);
        setStartUrl(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ConnectedApp ");
      sb.append(super.toString());sb.append(" attributes='").append(com.sforce.ws.util.Verbose.toString(attributes)).append("'\n");
      sb.append(" canvasConfig='").append(com.sforce.ws.util.Verbose.toString(canvasConfig)).append("'\n");
      sb.append(" contactEmail='").append(com.sforce.ws.util.Verbose.toString(contactEmail)).append("'\n");
      sb.append(" contactPhone='").append(com.sforce.ws.util.Verbose.toString(contactPhone)).append("'\n");
      sb.append(" description='").append(com.sforce.ws.util.Verbose.toString(description)).append("'\n");
      sb.append(" iconUrl='").append(com.sforce.ws.util.Verbose.toString(iconUrl)).append("'\n");
      sb.append(" infoUrl='").append(com.sforce.ws.util.Verbose.toString(infoUrl)).append("'\n");
      sb.append(" ipRanges='").append(com.sforce.ws.util.Verbose.toString(ipRanges)).append("'\n");
      sb.append(" label='").append(com.sforce.ws.util.Verbose.toString(label)).append("'\n");
      sb.append(" logoUrl='").append(com.sforce.ws.util.Verbose.toString(logoUrl)).append("'\n");
      sb.append(" mobileAppConfig='").append(com.sforce.ws.util.Verbose.toString(mobileAppConfig)).append("'\n");
      sb.append(" mobileStartUrl='").append(com.sforce.ws.util.Verbose.toString(mobileStartUrl)).append("'\n");
      sb.append(" oauthConfig='").append(com.sforce.ws.util.Verbose.toString(oauthConfig)).append("'\n");
      sb.append(" plugin='").append(com.sforce.ws.util.Verbose.toString(plugin)).append("'\n");
      sb.append(" samlConfig='").append(com.sforce.ws.util.Verbose.toString(samlConfig)).append("'\n");
      sb.append(" startUrl='").append(com.sforce.ws.util.Verbose.toString(startUrl)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
