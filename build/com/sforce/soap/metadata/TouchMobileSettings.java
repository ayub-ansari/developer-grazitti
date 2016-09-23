package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class TouchMobileSettings implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public TouchMobileSettings() {}

    /**
     * element : enableTouchAppIPad of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo enableTouchAppIPad__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","enableTouchAppIPad","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean enableTouchAppIPad__is_set = false;

    private boolean enableTouchAppIPad;

    public boolean getEnableTouchAppIPad() {
      return enableTouchAppIPad;
    }

    public boolean isEnableTouchAppIPad() {
      return enableTouchAppIPad;
    }

    public void setEnableTouchAppIPad(boolean enableTouchAppIPad) {
      this.enableTouchAppIPad = enableTouchAppIPad;
      enableTouchAppIPad__is_set = true;
    }

    protected void setEnableTouchAppIPad(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, enableTouchAppIPad__typeInfo)) {
        setEnableTouchAppIPad(__typeMapper.readBoolean(__in, enableTouchAppIPad__typeInfo, boolean.class));
      }
    }

    /**
     * element : enableTouchAppIPhone of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo enableTouchAppIPhone__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","enableTouchAppIPhone","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean enableTouchAppIPhone__is_set = false;

    private boolean enableTouchAppIPhone;

    public boolean getEnableTouchAppIPhone() {
      return enableTouchAppIPhone;
    }

    public boolean isEnableTouchAppIPhone() {
      return enableTouchAppIPhone;
    }

    public void setEnableTouchAppIPhone(boolean enableTouchAppIPhone) {
      this.enableTouchAppIPhone = enableTouchAppIPhone;
      enableTouchAppIPhone__is_set = true;
    }

    protected void setEnableTouchAppIPhone(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, enableTouchAppIPhone__typeInfo)) {
        setEnableTouchAppIPhone(__typeMapper.readBoolean(__in, enableTouchAppIPhone__typeInfo, boolean.class));
      }
    }

    /**
     * element : enableTouchBrowserIPad of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo enableTouchBrowserIPad__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","enableTouchBrowserIPad","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean enableTouchBrowserIPad__is_set = false;

    private boolean enableTouchBrowserIPad;

    public boolean getEnableTouchBrowserIPad() {
      return enableTouchBrowserIPad;
    }

    public boolean isEnableTouchBrowserIPad() {
      return enableTouchBrowserIPad;
    }

    public void setEnableTouchBrowserIPad(boolean enableTouchBrowserIPad) {
      this.enableTouchBrowserIPad = enableTouchBrowserIPad;
      enableTouchBrowserIPad__is_set = true;
    }

    protected void setEnableTouchBrowserIPad(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, enableTouchBrowserIPad__typeInfo)) {
        setEnableTouchBrowserIPad(__typeMapper.readBoolean(__in, enableTouchBrowserIPad__typeInfo, boolean.class));
      }
    }

    /**
     * element : enableTouchIosPhone of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo enableTouchIosPhone__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","enableTouchIosPhone","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean enableTouchIosPhone__is_set = false;

    private boolean enableTouchIosPhone;

    public boolean getEnableTouchIosPhone() {
      return enableTouchIosPhone;
    }

    public boolean isEnableTouchIosPhone() {
      return enableTouchIosPhone;
    }

    public void setEnableTouchIosPhone(boolean enableTouchIosPhone) {
      this.enableTouchIosPhone = enableTouchIosPhone;
      enableTouchIosPhone__is_set = true;
    }

    protected void setEnableTouchIosPhone(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, enableTouchIosPhone__typeInfo)) {
        setEnableTouchIosPhone(__typeMapper.readBoolean(__in, enableTouchIosPhone__typeInfo, boolean.class));
      }
    }

    /**
     * element : enableVisualforceInTouch of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo enableVisualforceInTouch__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","enableVisualforceInTouch","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean enableVisualforceInTouch__is_set = false;

    private boolean enableVisualforceInTouch;

    public boolean getEnableVisualforceInTouch() {
      return enableVisualforceInTouch;
    }

    public boolean isEnableVisualforceInTouch() {
      return enableVisualforceInTouch;
    }

    public void setEnableVisualforceInTouch(boolean enableVisualforceInTouch) {
      this.enableVisualforceInTouch = enableVisualforceInTouch;
      enableVisualforceInTouch__is_set = true;
    }

    protected void setEnableVisualforceInTouch(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, enableVisualforceInTouch__typeInfo)) {
        setEnableVisualforceInTouch(__typeMapper.readBoolean(__in, enableVisualforceInTouch__typeInfo, boolean.class));
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
       __typeMapper.writeBoolean(__out, enableTouchAppIPad__typeInfo, enableTouchAppIPad, enableTouchAppIPad__is_set);
       __typeMapper.writeBoolean(__out, enableTouchAppIPhone__typeInfo, enableTouchAppIPhone, enableTouchAppIPhone__is_set);
       __typeMapper.writeBoolean(__out, enableTouchBrowserIPad__typeInfo, enableTouchBrowserIPad, enableTouchBrowserIPad__is_set);
       __typeMapper.writeBoolean(__out, enableTouchIosPhone__typeInfo, enableTouchIosPhone, enableTouchIosPhone__is_set);
       __typeMapper.writeBoolean(__out, enableVisualforceInTouch__typeInfo, enableVisualforceInTouch, enableVisualforceInTouch__is_set);
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
        setEnableTouchAppIPad(__in, __typeMapper);
        setEnableTouchAppIPhone(__in, __typeMapper);
        setEnableTouchBrowserIPad(__in, __typeMapper);
        setEnableTouchIosPhone(__in, __typeMapper);
        setEnableVisualforceInTouch(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[TouchMobileSettings ");
      sb.append(" enableTouchAppIPad='").append(com.sforce.ws.util.Verbose.toString(enableTouchAppIPad)).append("'\n");
      sb.append(" enableTouchAppIPhone='").append(com.sforce.ws.util.Verbose.toString(enableTouchAppIPhone)).append("'\n");
      sb.append(" enableTouchBrowserIPad='").append(com.sforce.ws.util.Verbose.toString(enableTouchBrowserIPad)).append("'\n");
      sb.append(" enableTouchIosPhone='").append(com.sforce.ws.util.Verbose.toString(enableTouchIosPhone)).append("'\n");
      sb.append(" enableVisualforceInTouch='").append(com.sforce.ws.util.Verbose.toString(enableVisualforceInTouch)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
