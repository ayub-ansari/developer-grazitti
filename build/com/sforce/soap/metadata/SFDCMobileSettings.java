package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class SFDCMobileSettings implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public SFDCMobileSettings() {}

    /**
     * element : enableMobileLite of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo enableMobileLite__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","enableMobileLite","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean enableMobileLite__is_set = false;

    private boolean enableMobileLite;

    public boolean getEnableMobileLite() {
      return enableMobileLite;
    }

    public boolean isEnableMobileLite() {
      return enableMobileLite;
    }

    public void setEnableMobileLite(boolean enableMobileLite) {
      this.enableMobileLite = enableMobileLite;
      enableMobileLite__is_set = true;
    }

    protected void setEnableMobileLite(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, enableMobileLite__typeInfo)) {
        setEnableMobileLite(__typeMapper.readBoolean(__in, enableMobileLite__typeInfo, boolean.class));
      }
    }

    /**
     * element : enableUserToDeviceLinking of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo enableUserToDeviceLinking__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","enableUserToDeviceLinking","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean enableUserToDeviceLinking__is_set = false;

    private boolean enableUserToDeviceLinking;

    public boolean getEnableUserToDeviceLinking() {
      return enableUserToDeviceLinking;
    }

    public boolean isEnableUserToDeviceLinking() {
      return enableUserToDeviceLinking;
    }

    public void setEnableUserToDeviceLinking(boolean enableUserToDeviceLinking) {
      this.enableUserToDeviceLinking = enableUserToDeviceLinking;
      enableUserToDeviceLinking__is_set = true;
    }

    protected void setEnableUserToDeviceLinking(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, enableUserToDeviceLinking__typeInfo)) {
        setEnableUserToDeviceLinking(__typeMapper.readBoolean(__in, enableUserToDeviceLinking__typeInfo, boolean.class));
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
       __typeMapper.writeBoolean(__out, enableMobileLite__typeInfo, enableMobileLite, enableMobileLite__is_set);
       __typeMapper.writeBoolean(__out, enableUserToDeviceLinking__typeInfo, enableUserToDeviceLinking, enableUserToDeviceLinking__is_set);
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
        setEnableMobileLite(__in, __typeMapper);
        setEnableUserToDeviceLinking(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[SFDCMobileSettings ");
      sb.append(" enableMobileLite='").append(com.sforce.ws.util.Verbose.toString(enableMobileLite)).append("'\n");
      sb.append(" enableUserToDeviceLinking='").append(com.sforce.ws.util.Verbose.toString(enableUserToDeviceLinking)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
