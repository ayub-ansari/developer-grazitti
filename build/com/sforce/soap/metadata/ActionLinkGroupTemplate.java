package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ActionLinkGroupTemplate extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public ActionLinkGroupTemplate() {}

    /**
     * element : actionLinkTemplates of type {http://soap.sforce.com/2006/04/metadata}ActionLinkTemplate
     * java type: com.sforce.soap.metadata.ActionLinkTemplate[]
     */
    private static final com.sforce.ws.bind.TypeInfo actionLinkTemplates__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","actionLinkTemplates","http://soap.sforce.com/2006/04/metadata","ActionLinkTemplate",0,-1,true);

    private boolean actionLinkTemplates__is_set = false;

    private com.sforce.soap.metadata.ActionLinkTemplate[] actionLinkTemplates = new com.sforce.soap.metadata.ActionLinkTemplate[0];

    public com.sforce.soap.metadata.ActionLinkTemplate[] getActionLinkTemplates() {
      return actionLinkTemplates;
    }

    public void setActionLinkTemplates(com.sforce.soap.metadata.ActionLinkTemplate[] actionLinkTemplates) {
      this.actionLinkTemplates = actionLinkTemplates;
      actionLinkTemplates__is_set = true;
    }

    protected void setActionLinkTemplates(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, actionLinkTemplates__typeInfo)) {
        setActionLinkTemplates((com.sforce.soap.metadata.ActionLinkTemplate[])__typeMapper.readObject(__in, actionLinkTemplates__typeInfo, com.sforce.soap.metadata.ActionLinkTemplate[].class));
      }
    }

    /**
     * element : category of type {http://soap.sforce.com/2006/04/metadata}PlatformActionGroupCategory
     * java type: com.sforce.soap.metadata.PlatformActionGroupCategory
     */
    private static final com.sforce.ws.bind.TypeInfo category__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","category","http://soap.sforce.com/2006/04/metadata","PlatformActionGroupCategory",1,1,true);

    private boolean category__is_set = false;

    private com.sforce.soap.metadata.PlatformActionGroupCategory category;

    public com.sforce.soap.metadata.PlatformActionGroupCategory getCategory() {
      return category;
    }

    public void setCategory(com.sforce.soap.metadata.PlatformActionGroupCategory category) {
      this.category = category;
      category__is_set = true;
    }

    protected void setCategory(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, category__typeInfo)) {
        setCategory((com.sforce.soap.metadata.PlatformActionGroupCategory)__typeMapper.readObject(__in, category__typeInfo, com.sforce.soap.metadata.PlatformActionGroupCategory.class));
      }
    }

    /**
     * element : executionsAllowed of type {http://soap.sforce.com/2006/04/metadata}ActionLinkExecutionsAllowed
     * java type: com.sforce.soap.metadata.ActionLinkExecutionsAllowed
     */
    private static final com.sforce.ws.bind.TypeInfo executionsAllowed__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","executionsAllowed","http://soap.sforce.com/2006/04/metadata","ActionLinkExecutionsAllowed",1,1,true);

    private boolean executionsAllowed__is_set = false;

    private com.sforce.soap.metadata.ActionLinkExecutionsAllowed executionsAllowed;

    public com.sforce.soap.metadata.ActionLinkExecutionsAllowed getExecutionsAllowed() {
      return executionsAllowed;
    }

    public void setExecutionsAllowed(com.sforce.soap.metadata.ActionLinkExecutionsAllowed executionsAllowed) {
      this.executionsAllowed = executionsAllowed;
      executionsAllowed__is_set = true;
    }

    protected void setExecutionsAllowed(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, executionsAllowed__typeInfo)) {
        setExecutionsAllowed((com.sforce.soap.metadata.ActionLinkExecutionsAllowed)__typeMapper.readObject(__in, executionsAllowed__typeInfo, com.sforce.soap.metadata.ActionLinkExecutionsAllowed.class));
      }
    }

    /**
     * element : hoursUntilExpiration of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo hoursUntilExpiration__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","hoursUntilExpiration","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean hoursUntilExpiration__is_set = false;

    private int hoursUntilExpiration;

    public int getHoursUntilExpiration() {
      return hoursUntilExpiration;
    }

    public void setHoursUntilExpiration(int hoursUntilExpiration) {
      this.hoursUntilExpiration = hoursUntilExpiration;
      hoursUntilExpiration__is_set = true;
    }

    protected void setHoursUntilExpiration(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, hoursUntilExpiration__typeInfo)) {
        setHoursUntilExpiration((int)__typeMapper.readInt(__in, hoursUntilExpiration__typeInfo, int.class));
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
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "ActionLinkGroupTemplate");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, actionLinkTemplates__typeInfo, actionLinkTemplates, actionLinkTemplates__is_set);
       __typeMapper.writeObject(__out, category__typeInfo, category, category__is_set);
       __typeMapper.writeObject(__out, executionsAllowed__typeInfo, executionsAllowed, executionsAllowed__is_set);
       __typeMapper.writeInt(__out, hoursUntilExpiration__typeInfo, hoursUntilExpiration, hoursUntilExpiration__is_set);
       __typeMapper.writeBoolean(__out, isPublished__typeInfo, isPublished, isPublished__is_set);
       __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
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
        setActionLinkTemplates(__in, __typeMapper);
        setCategory(__in, __typeMapper);
        setExecutionsAllowed(__in, __typeMapper);
        setHoursUntilExpiration(__in, __typeMapper);
        setIsPublished(__in, __typeMapper);
        setName(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ActionLinkGroupTemplate ");
      sb.append(super.toString());sb.append(" actionLinkTemplates='").append(com.sforce.ws.util.Verbose.toString(actionLinkTemplates)).append("'\n");
      sb.append(" category='").append(com.sforce.ws.util.Verbose.toString(category)).append("'\n");
      sb.append(" executionsAllowed='").append(com.sforce.ws.util.Verbose.toString(executionsAllowed)).append("'\n");
      sb.append(" hoursUntilExpiration='").append(com.sforce.ws.util.Verbose.toString(hoursUntilExpiration)).append("'\n");
      sb.append(" isPublished='").append(com.sforce.ws.util.Verbose.toString(isPublished)).append("'\n");
      sb.append(" name='").append(com.sforce.ws.util.Verbose.toString(name)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
