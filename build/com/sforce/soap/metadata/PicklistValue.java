package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class PicklistValue extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public PicklistValue() {}

    /**
     * element : allowEmail of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo allowEmail__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","allowEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean allowEmail__is_set = false;

    private boolean allowEmail;

    public boolean getAllowEmail() {
      return allowEmail;
    }

    public boolean isAllowEmail() {
      return allowEmail;
    }

    public void setAllowEmail(boolean allowEmail) {
      this.allowEmail = allowEmail;
      allowEmail__is_set = true;
    }

    protected void setAllowEmail(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, allowEmail__typeInfo)) {
        setAllowEmail(__typeMapper.readBoolean(__in, allowEmail__typeInfo, boolean.class));
      }
    }

    /**
     * element : closed of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo closed__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","closed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean closed__is_set = false;

    private boolean closed;

    public boolean getClosed() {
      return closed;
    }

    public boolean isClosed() {
      return closed;
    }

    public void setClosed(boolean closed) {
      this.closed = closed;
      closed__is_set = true;
    }

    protected void setClosed(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, closed__typeInfo)) {
        setClosed(__typeMapper.readBoolean(__in, closed__typeInfo, boolean.class));
      }
    }

    /**
     * element : color of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo color__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","color","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean color__is_set = false;

    private java.lang.String color;

    public java.lang.String getColor() {
      return color;
    }

    public void setColor(java.lang.String color) {
      this.color = color;
      color__is_set = true;
    }

    protected void setColor(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, color__typeInfo)) {
        setColor(__typeMapper.readString(__in, color__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : controllingFieldValues of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo controllingFieldValues__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","controllingFieldValues","http://www.w3.org/2001/XMLSchema","string",0,-1,true);

    private boolean controllingFieldValues__is_set = false;

    private java.lang.String[] controllingFieldValues = new java.lang.String[0];

    public java.lang.String[] getControllingFieldValues() {
      return controllingFieldValues;
    }

    public void setControllingFieldValues(java.lang.String[] controllingFieldValues) {
      this.controllingFieldValues = controllingFieldValues;
      controllingFieldValues__is_set = true;
    }

    protected void setControllingFieldValues(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, controllingFieldValues__typeInfo)) {
        setControllingFieldValues((java.lang.String[])__typeMapper.readObject(__in, controllingFieldValues__typeInfo, java.lang.String[].class));
      }
    }

    /**
     * element : converted of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo converted__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","converted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean converted__is_set = false;

    private boolean converted;

    public boolean getConverted() {
      return converted;
    }

    public boolean isConverted() {
      return converted;
    }

    public void setConverted(boolean converted) {
      this.converted = converted;
      converted__is_set = true;
    }

    protected void setConverted(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, converted__typeInfo)) {
        setConverted(__typeMapper.readBoolean(__in, converted__typeInfo, boolean.class));
      }
    }

    /**
     * element : cssExposed of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo cssExposed__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","cssExposed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean cssExposed__is_set = false;

    private boolean cssExposed;

    public boolean getCssExposed() {
      return cssExposed;
    }

    public boolean isCssExposed() {
      return cssExposed;
    }

    public void setCssExposed(boolean cssExposed) {
      this.cssExposed = cssExposed;
      cssExposed__is_set = true;
    }

    protected void setCssExposed(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, cssExposed__typeInfo)) {
        setCssExposed(__typeMapper.readBoolean(__in, cssExposed__typeInfo, boolean.class));
      }
    }

    /**
     * element : _default of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo _default__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","_default","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean _default__is_set = false;

    private boolean _default;

    public boolean get_default() {
      return _default;
    }

    public boolean is_default() {
      return _default;
    }

    public void set_default(boolean _default) {
      this._default = _default;
      _default__is_set = true;
    }

    protected void set_default(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _default__typeInfo)) {
        set_default(__typeMapper.readBoolean(__in, _default__typeInfo, boolean.class));
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
     * element : forecastCategory of type {http://soap.sforce.com/2006/04/metadata}ForecastCategories
     * java type: com.sforce.soap.metadata.ForecastCategories
     */
    private static final com.sforce.ws.bind.TypeInfo forecastCategory__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","forecastCategory","http://soap.sforce.com/2006/04/metadata","ForecastCategories",0,1,true);

    private boolean forecastCategory__is_set = false;

    private com.sforce.soap.metadata.ForecastCategories forecastCategory;

    public com.sforce.soap.metadata.ForecastCategories getForecastCategory() {
      return forecastCategory;
    }

    public void setForecastCategory(com.sforce.soap.metadata.ForecastCategories forecastCategory) {
      this.forecastCategory = forecastCategory;
      forecastCategory__is_set = true;
    }

    protected void setForecastCategory(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, forecastCategory__typeInfo)) {
        setForecastCategory((com.sforce.soap.metadata.ForecastCategories)__typeMapper.readObject(__in, forecastCategory__typeInfo, com.sforce.soap.metadata.ForecastCategories.class));
      }
    }

    /**
     * element : highPriority of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo highPriority__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","highPriority","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean highPriority__is_set = false;

    private boolean highPriority;

    public boolean getHighPriority() {
      return highPriority;
    }

    public boolean isHighPriority() {
      return highPriority;
    }

    public void setHighPriority(boolean highPriority) {
      this.highPriority = highPriority;
      highPriority__is_set = true;
    }

    protected void setHighPriority(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, highPriority__typeInfo)) {
        setHighPriority(__typeMapper.readBoolean(__in, highPriority__typeInfo, boolean.class));
      }
    }

    /**
     * element : probability of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo probability__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","probability","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean probability__is_set = false;

    private int probability;

    public int getProbability() {
      return probability;
    }

    public void setProbability(int probability) {
      this.probability = probability;
      probability__is_set = true;
    }

    protected void setProbability(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, probability__typeInfo)) {
        setProbability((int)__typeMapper.readInt(__in, probability__typeInfo, int.class));
      }
    }

    /**
     * element : reverseRole of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo reverseRole__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","reverseRole","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean reverseRole__is_set = false;

    private java.lang.String reverseRole;

    public java.lang.String getReverseRole() {
      return reverseRole;
    }

    public void setReverseRole(java.lang.String reverseRole) {
      this.reverseRole = reverseRole;
      reverseRole__is_set = true;
    }

    protected void setReverseRole(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, reverseRole__typeInfo)) {
        setReverseRole(__typeMapper.readString(__in, reverseRole__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : reviewed of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo reviewed__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","reviewed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean reviewed__is_set = false;

    private boolean reviewed;

    public boolean getReviewed() {
      return reviewed;
    }

    public boolean isReviewed() {
      return reviewed;
    }

    public void setReviewed(boolean reviewed) {
      this.reviewed = reviewed;
      reviewed__is_set = true;
    }

    protected void setReviewed(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, reviewed__typeInfo)) {
        setReviewed(__typeMapper.readBoolean(__in, reviewed__typeInfo, boolean.class));
      }
    }

    /**
     * element : won of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo won__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","won","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean won__is_set = false;

    private boolean won;

    public boolean getWon() {
      return won;
    }

    public boolean isWon() {
      return won;
    }

    public void setWon(boolean won) {
      this.won = won;
      won__is_set = true;
    }

    protected void setWon(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, won__typeInfo)) {
        setWon(__typeMapper.readBoolean(__in, won__typeInfo, boolean.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "PicklistValue");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeBoolean(__out, allowEmail__typeInfo, allowEmail, allowEmail__is_set);
       __typeMapper.writeBoolean(__out, closed__typeInfo, closed, closed__is_set);
       __typeMapper.writeString(__out, color__typeInfo, color, color__is_set);
       __typeMapper.writeObject(__out, controllingFieldValues__typeInfo, controllingFieldValues, controllingFieldValues__is_set);
       __typeMapper.writeBoolean(__out, converted__typeInfo, converted, converted__is_set);
       __typeMapper.writeBoolean(__out, cssExposed__typeInfo, cssExposed, cssExposed__is_set);
       __typeMapper.writeBoolean(__out, _default__typeInfo, _default, _default__is_set);
       __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
       __typeMapper.writeObject(__out, forecastCategory__typeInfo, forecastCategory, forecastCategory__is_set);
       __typeMapper.writeBoolean(__out, highPriority__typeInfo, highPriority, highPriority__is_set);
       __typeMapper.writeInt(__out, probability__typeInfo, probability, probability__is_set);
       __typeMapper.writeString(__out, reverseRole__typeInfo, reverseRole, reverseRole__is_set);
       __typeMapper.writeBoolean(__out, reviewed__typeInfo, reviewed, reviewed__is_set);
       __typeMapper.writeBoolean(__out, won__typeInfo, won, won__is_set);
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
        setAllowEmail(__in, __typeMapper);
        setClosed(__in, __typeMapper);
        setColor(__in, __typeMapper);
        setControllingFieldValues(__in, __typeMapper);
        setConverted(__in, __typeMapper);
        setCssExposed(__in, __typeMapper);
        set_default(__in, __typeMapper);
        setDescription(__in, __typeMapper);
        setForecastCategory(__in, __typeMapper);
        setHighPriority(__in, __typeMapper);
        setProbability(__in, __typeMapper);
        setReverseRole(__in, __typeMapper);
        setReviewed(__in, __typeMapper);
        setWon(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[PicklistValue ");
      sb.append(super.toString());sb.append(" allowEmail='").append(com.sforce.ws.util.Verbose.toString(allowEmail)).append("'\n");
      sb.append(" closed='").append(com.sforce.ws.util.Verbose.toString(closed)).append("'\n");
      sb.append(" color='").append(com.sforce.ws.util.Verbose.toString(color)).append("'\n");
      sb.append(" controllingFieldValues='").append(com.sforce.ws.util.Verbose.toString(controllingFieldValues)).append("'\n");
      sb.append(" converted='").append(com.sforce.ws.util.Verbose.toString(converted)).append("'\n");
      sb.append(" cssExposed='").append(com.sforce.ws.util.Verbose.toString(cssExposed)).append("'\n");
      sb.append(" _default='").append(com.sforce.ws.util.Verbose.toString(_default)).append("'\n");
      sb.append(" description='").append(com.sforce.ws.util.Verbose.toString(description)).append("'\n");
      sb.append(" forecastCategory='").append(com.sforce.ws.util.Verbose.toString(forecastCategory)).append("'\n");
      sb.append(" highPriority='").append(com.sforce.ws.util.Verbose.toString(highPriority)).append("'\n");
      sb.append(" probability='").append(com.sforce.ws.util.Verbose.toString(probability)).append("'\n");
      sb.append(" reverseRole='").append(com.sforce.ws.util.Verbose.toString(reverseRole)).append("'\n");
      sb.append(" reviewed='").append(com.sforce.ws.util.Verbose.toString(reviewed)).append("'\n");
      sb.append(" won='").append(com.sforce.ws.util.Verbose.toString(won)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
