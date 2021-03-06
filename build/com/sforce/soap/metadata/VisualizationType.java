package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class VisualizationType implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public VisualizationType() {}

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
     * element : developerName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo developerName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","developerName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean developerName__is_set = false;

    private java.lang.String developerName;

    public java.lang.String getDeveloperName() {
      return developerName;
    }

    public void setDeveloperName(java.lang.String developerName) {
      this.developerName = developerName;
      developerName__is_set = true;
    }

    protected void setDeveloperName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, developerName__typeInfo)) {
        setDeveloperName(__typeMapper.readString(__in, developerName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : icon of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo icon__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","icon","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean icon__is_set = false;

    private java.lang.String icon;

    public java.lang.String getIcon() {
      return icon;
    }

    public void setIcon(java.lang.String icon) {
      this.icon = icon;
      icon__is_set = true;
    }

    protected void setIcon(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, icon__typeInfo)) {
        setIcon(__typeMapper.readString(__in, icon__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : masterLabel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo masterLabel__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","masterLabel","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean masterLabel__is_set = false;

    private java.lang.String masterLabel;

    public java.lang.String getMasterLabel() {
      return masterLabel;
    }

    public void setMasterLabel(java.lang.String masterLabel) {
      this.masterLabel = masterLabel;
      masterLabel__is_set = true;
    }

    protected void setMasterLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, masterLabel__typeInfo)) {
        setMasterLabel(__typeMapper.readString(__in, masterLabel__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : scriptBootstrapMethod of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo scriptBootstrapMethod__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","scriptBootstrapMethod","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean scriptBootstrapMethod__is_set = false;

    private java.lang.String scriptBootstrapMethod;

    public java.lang.String getScriptBootstrapMethod() {
      return scriptBootstrapMethod;
    }

    public void setScriptBootstrapMethod(java.lang.String scriptBootstrapMethod) {
      this.scriptBootstrapMethod = scriptBootstrapMethod;
      scriptBootstrapMethod__is_set = true;
    }

    protected void setScriptBootstrapMethod(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, scriptBootstrapMethod__typeInfo)) {
        setScriptBootstrapMethod(__typeMapper.readString(__in, scriptBootstrapMethod__typeInfo, java.lang.String.class));
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
       __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
       __typeMapper.writeString(__out, developerName__typeInfo, developerName, developerName__is_set);
       __typeMapper.writeString(__out, icon__typeInfo, icon, icon__is_set);
       __typeMapper.writeString(__out, masterLabel__typeInfo, masterLabel, masterLabel__is_set);
       __typeMapper.writeString(__out, scriptBootstrapMethod__typeInfo, scriptBootstrapMethod, scriptBootstrapMethod__is_set);
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
        setDescription(__in, __typeMapper);
        setDeveloperName(__in, __typeMapper);
        setIcon(__in, __typeMapper);
        setMasterLabel(__in, __typeMapper);
        setScriptBootstrapMethod(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[VisualizationType ");
      sb.append(" description='").append(com.sforce.ws.util.Verbose.toString(description)).append("'\n");
      sb.append(" developerName='").append(com.sforce.ws.util.Verbose.toString(developerName)).append("'\n");
      sb.append(" icon='").append(com.sforce.ws.util.Verbose.toString(icon)).append("'\n");
      sb.append(" masterLabel='").append(com.sforce.ws.util.Verbose.toString(masterLabel)).append("'\n");
      sb.append(" scriptBootstrapMethod='").append(com.sforce.ws.util.Verbose.toString(scriptBootstrapMethod)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
