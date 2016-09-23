package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class QuickAction extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public QuickAction() {}

    /**
     * element : canvas of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo canvas__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","canvas","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean canvas__is_set = false;

    private java.lang.String canvas;

    public java.lang.String getCanvas() {
      return canvas;
    }

    public void setCanvas(java.lang.String canvas) {
      this.canvas = canvas;
      canvas__is_set = true;
    }

    protected void setCanvas(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, canvas__typeInfo)) {
        setCanvas(__typeMapper.readString(__in, canvas__typeInfo, java.lang.String.class));
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
     * element : fieldOverrides of type {http://soap.sforce.com/2006/04/metadata}FieldOverride
     * java type: com.sforce.soap.metadata.FieldOverride[]
     */
    private static final com.sforce.ws.bind.TypeInfo fieldOverrides__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","fieldOverrides","http://soap.sforce.com/2006/04/metadata","FieldOverride",0,-1,true);

    private boolean fieldOverrides__is_set = false;

    private com.sforce.soap.metadata.FieldOverride[] fieldOverrides = new com.sforce.soap.metadata.FieldOverride[0];

    public com.sforce.soap.metadata.FieldOverride[] getFieldOverrides() {
      return fieldOverrides;
    }

    public void setFieldOverrides(com.sforce.soap.metadata.FieldOverride[] fieldOverrides) {
      this.fieldOverrides = fieldOverrides;
      fieldOverrides__is_set = true;
    }

    protected void setFieldOverrides(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, fieldOverrides__typeInfo)) {
        setFieldOverrides((com.sforce.soap.metadata.FieldOverride[])__typeMapper.readObject(__in, fieldOverrides__typeInfo, com.sforce.soap.metadata.FieldOverride[].class));
      }
    }

    /**
     * element : height of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo height__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","height","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean height__is_set = false;

    private int height;

    public int getHeight() {
      return height;
    }

    public void setHeight(int height) {
      this.height = height;
      height__is_set = true;
    }

    protected void setHeight(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, height__typeInfo)) {
        setHeight((int)__typeMapper.readInt(__in, height__typeInfo, int.class));
      }
    }

    /**
     * element : icon of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo icon__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","icon","http://www.w3.org/2001/XMLSchema","string",0,1,true);

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
      if (__typeMapper.isElement(__in, icon__typeInfo)) {
        setIcon(__typeMapper.readString(__in, icon__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : isProtected of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo isProtected__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","isProtected","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean isProtected__is_set = false;

    private boolean isProtected;

    public boolean getIsProtected() {
      return isProtected;
    }

    public boolean isIsProtected() {
      return isProtected;
    }

    public void setIsProtected(boolean isProtected) {
      this.isProtected = isProtected;
      isProtected__is_set = true;
    }

    protected void setIsProtected(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, isProtected__typeInfo)) {
        setIsProtected(__typeMapper.readBoolean(__in, isProtected__typeInfo, boolean.class));
      }
    }

    /**
     * element : label of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","label","http://www.w3.org/2001/XMLSchema","string",0,1,true);

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
      if (__typeMapper.isElement(__in, label__typeInfo)) {
        setLabel(__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : optionsCreateFeedItem of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo optionsCreateFeedItem__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","optionsCreateFeedItem","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean optionsCreateFeedItem__is_set = false;

    private boolean optionsCreateFeedItem;

    public boolean getOptionsCreateFeedItem() {
      return optionsCreateFeedItem;
    }

    public boolean isOptionsCreateFeedItem() {
      return optionsCreateFeedItem;
    }

    public void setOptionsCreateFeedItem(boolean optionsCreateFeedItem) {
      this.optionsCreateFeedItem = optionsCreateFeedItem;
      optionsCreateFeedItem__is_set = true;
    }

    protected void setOptionsCreateFeedItem(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, optionsCreateFeedItem__typeInfo)) {
        setOptionsCreateFeedItem(__typeMapper.readBoolean(__in, optionsCreateFeedItem__typeInfo, boolean.class));
      }
    }

    /**
     * element : page of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo page__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","page","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean page__is_set = false;

    private java.lang.String page;

    public java.lang.String getPage() {
      return page;
    }

    public void setPage(java.lang.String page) {
      this.page = page;
      page__is_set = true;
    }

    protected void setPage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, page__typeInfo)) {
        setPage(__typeMapper.readString(__in, page__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : quickActionLayout of type {http://soap.sforce.com/2006/04/metadata}QuickActionLayout
     * java type: com.sforce.soap.metadata.QuickActionLayout
     */
    private static final com.sforce.ws.bind.TypeInfo quickActionLayout__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","quickActionLayout","http://soap.sforce.com/2006/04/metadata","QuickActionLayout",0,1,true);

    private boolean quickActionLayout__is_set = false;

    private com.sforce.soap.metadata.QuickActionLayout quickActionLayout;

    public com.sforce.soap.metadata.QuickActionLayout getQuickActionLayout() {
      return quickActionLayout;
    }

    public void setQuickActionLayout(com.sforce.soap.metadata.QuickActionLayout quickActionLayout) {
      this.quickActionLayout = quickActionLayout;
      quickActionLayout__is_set = true;
    }

    protected void setQuickActionLayout(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, quickActionLayout__typeInfo)) {
        setQuickActionLayout((com.sforce.soap.metadata.QuickActionLayout)__typeMapper.readObject(__in, quickActionLayout__typeInfo, com.sforce.soap.metadata.QuickActionLayout.class));
      }
    }

    /**
     * element : standardLabel of type {http://soap.sforce.com/2006/04/metadata}QuickActionLabel
     * java type: com.sforce.soap.metadata.QuickActionLabel
     */
    private static final com.sforce.ws.bind.TypeInfo standardLabel__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","standardLabel","http://soap.sforce.com/2006/04/metadata","QuickActionLabel",0,1,true);

    private boolean standardLabel__is_set = false;

    private com.sforce.soap.metadata.QuickActionLabel standardLabel;

    public com.sforce.soap.metadata.QuickActionLabel getStandardLabel() {
      return standardLabel;
    }

    public void setStandardLabel(com.sforce.soap.metadata.QuickActionLabel standardLabel) {
      this.standardLabel = standardLabel;
      standardLabel__is_set = true;
    }

    protected void setStandardLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, standardLabel__typeInfo)) {
        setStandardLabel((com.sforce.soap.metadata.QuickActionLabel)__typeMapper.readObject(__in, standardLabel__typeInfo, com.sforce.soap.metadata.QuickActionLabel.class));
      }
    }

    /**
     * element : successMessage of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo successMessage__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","successMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean successMessage__is_set = false;

    private java.lang.String successMessage;

    public java.lang.String getSuccessMessage() {
      return successMessage;
    }

    public void setSuccessMessage(java.lang.String successMessage) {
      this.successMessage = successMessage;
      successMessage__is_set = true;
    }

    protected void setSuccessMessage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, successMessage__typeInfo)) {
        setSuccessMessage(__typeMapper.readString(__in, successMessage__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : targetObject of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo targetObject__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","targetObject","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean targetObject__is_set = false;

    private java.lang.String targetObject;

    public java.lang.String getTargetObject() {
      return targetObject;
    }

    public void setTargetObject(java.lang.String targetObject) {
      this.targetObject = targetObject;
      targetObject__is_set = true;
    }

    protected void setTargetObject(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, targetObject__typeInfo)) {
        setTargetObject(__typeMapper.readString(__in, targetObject__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : targetParentField of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo targetParentField__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","targetParentField","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean targetParentField__is_set = false;

    private java.lang.String targetParentField;

    public java.lang.String getTargetParentField() {
      return targetParentField;
    }

    public void setTargetParentField(java.lang.String targetParentField) {
      this.targetParentField = targetParentField;
      targetParentField__is_set = true;
    }

    protected void setTargetParentField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, targetParentField__typeInfo)) {
        setTargetParentField(__typeMapper.readString(__in, targetParentField__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : targetRecordType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo targetRecordType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","targetRecordType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean targetRecordType__is_set = false;

    private java.lang.String targetRecordType;

    public java.lang.String getTargetRecordType() {
      return targetRecordType;
    }

    public void setTargetRecordType(java.lang.String targetRecordType) {
      this.targetRecordType = targetRecordType;
      targetRecordType__is_set = true;
    }

    protected void setTargetRecordType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, targetRecordType__typeInfo)) {
        setTargetRecordType(__typeMapper.readString(__in, targetRecordType__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : type of type {http://soap.sforce.com/2006/04/metadata}QuickActionType
     * java type: com.sforce.soap.metadata.QuickActionType
     */
    private static final com.sforce.ws.bind.TypeInfo type__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","type","http://soap.sforce.com/2006/04/metadata","QuickActionType",1,1,true);

    private boolean type__is_set = false;

    private com.sforce.soap.metadata.QuickActionType type;

    public com.sforce.soap.metadata.QuickActionType getType() {
      return type;
    }

    public void setType(com.sforce.soap.metadata.QuickActionType type) {
      this.type = type;
      type__is_set = true;
    }

    protected void setType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, type__typeInfo)) {
        setType((com.sforce.soap.metadata.QuickActionType)__typeMapper.readObject(__in, type__typeInfo, com.sforce.soap.metadata.QuickActionType.class));
      }
    }

    /**
     * element : width of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo width__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","width","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean width__is_set = false;

    private int width;

    public int getWidth() {
      return width;
    }

    public void setWidth(int width) {
      this.width = width;
      width__is_set = true;
    }

    protected void setWidth(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, width__typeInfo)) {
        setWidth((int)__typeMapper.readInt(__in, width__typeInfo, int.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "QuickAction");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeString(__out, canvas__typeInfo, canvas, canvas__is_set);
       __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
       __typeMapper.writeObject(__out, fieldOverrides__typeInfo, fieldOverrides, fieldOverrides__is_set);
       __typeMapper.writeInt(__out, height__typeInfo, height, height__is_set);
       __typeMapper.writeString(__out, icon__typeInfo, icon, icon__is_set);
       __typeMapper.writeBoolean(__out, isProtected__typeInfo, isProtected, isProtected__is_set);
       __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
       __typeMapper.writeBoolean(__out, optionsCreateFeedItem__typeInfo, optionsCreateFeedItem, optionsCreateFeedItem__is_set);
       __typeMapper.writeString(__out, page__typeInfo, page, page__is_set);
       __typeMapper.writeObject(__out, quickActionLayout__typeInfo, quickActionLayout, quickActionLayout__is_set);
       __typeMapper.writeObject(__out, standardLabel__typeInfo, standardLabel, standardLabel__is_set);
       __typeMapper.writeString(__out, successMessage__typeInfo, successMessage, successMessage__is_set);
       __typeMapper.writeString(__out, targetObject__typeInfo, targetObject, targetObject__is_set);
       __typeMapper.writeString(__out, targetParentField__typeInfo, targetParentField, targetParentField__is_set);
       __typeMapper.writeString(__out, targetRecordType__typeInfo, targetRecordType, targetRecordType__is_set);
       __typeMapper.writeObject(__out, type__typeInfo, type, type__is_set);
       __typeMapper.writeInt(__out, width__typeInfo, width, width__is_set);
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
        setCanvas(__in, __typeMapper);
        setDescription(__in, __typeMapper);
        setFieldOverrides(__in, __typeMapper);
        setHeight(__in, __typeMapper);
        setIcon(__in, __typeMapper);
        setIsProtected(__in, __typeMapper);
        setLabel(__in, __typeMapper);
        setOptionsCreateFeedItem(__in, __typeMapper);
        setPage(__in, __typeMapper);
        setQuickActionLayout(__in, __typeMapper);
        setStandardLabel(__in, __typeMapper);
        setSuccessMessage(__in, __typeMapper);
        setTargetObject(__in, __typeMapper);
        setTargetParentField(__in, __typeMapper);
        setTargetRecordType(__in, __typeMapper);
        setType(__in, __typeMapper);
        setWidth(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[QuickAction ");
      sb.append(super.toString());sb.append(" canvas='").append(com.sforce.ws.util.Verbose.toString(canvas)).append("'\n");
      sb.append(" description='").append(com.sforce.ws.util.Verbose.toString(description)).append("'\n");
      sb.append(" fieldOverrides='").append(com.sforce.ws.util.Verbose.toString(fieldOverrides)).append("'\n");
      sb.append(" height='").append(com.sforce.ws.util.Verbose.toString(height)).append("'\n");
      sb.append(" icon='").append(com.sforce.ws.util.Verbose.toString(icon)).append("'\n");
      sb.append(" isProtected='").append(com.sforce.ws.util.Verbose.toString(isProtected)).append("'\n");
      sb.append(" label='").append(com.sforce.ws.util.Verbose.toString(label)).append("'\n");
      sb.append(" optionsCreateFeedItem='").append(com.sforce.ws.util.Verbose.toString(optionsCreateFeedItem)).append("'\n");
      sb.append(" page='").append(com.sforce.ws.util.Verbose.toString(page)).append("'\n");
      sb.append(" quickActionLayout='").append(com.sforce.ws.util.Verbose.toString(quickActionLayout)).append("'\n");
      sb.append(" standardLabel='").append(com.sforce.ws.util.Verbose.toString(standardLabel)).append("'\n");
      sb.append(" successMessage='").append(com.sforce.ws.util.Verbose.toString(successMessage)).append("'\n");
      sb.append(" targetObject='").append(com.sforce.ws.util.Verbose.toString(targetObject)).append("'\n");
      sb.append(" targetParentField='").append(com.sforce.ws.util.Verbose.toString(targetParentField)).append("'\n");
      sb.append(" targetRecordType='").append(com.sforce.ws.util.Verbose.toString(targetRecordType)).append("'\n");
      sb.append(" type='").append(com.sforce.ws.util.Verbose.toString(type)).append("'\n");
      sb.append(" width='").append(com.sforce.ws.util.Verbose.toString(width)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
