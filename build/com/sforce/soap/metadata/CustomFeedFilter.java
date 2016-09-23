package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class CustomFeedFilter extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public CustomFeedFilter() {}

    /**
     * element : criteria of type {http://soap.sforce.com/2006/04/metadata}FeedFilterCriterion
     * java type: com.sforce.soap.metadata.FeedFilterCriterion[]
     */
    private static final com.sforce.ws.bind.TypeInfo criteria__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","criteria","http://soap.sforce.com/2006/04/metadata","FeedFilterCriterion",0,-1,true);

    private boolean criteria__is_set = false;

    private com.sforce.soap.metadata.FeedFilterCriterion[] criteria = new com.sforce.soap.metadata.FeedFilterCriterion[0];

    public com.sforce.soap.metadata.FeedFilterCriterion[] getCriteria() {
      return criteria;
    }

    public void setCriteria(com.sforce.soap.metadata.FeedFilterCriterion[] criteria) {
      this.criteria = criteria;
      criteria__is_set = true;
    }

    protected void setCriteria(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, criteria__typeInfo)) {
        setCriteria((com.sforce.soap.metadata.FeedFilterCriterion[])__typeMapper.readObject(__in, criteria__typeInfo, com.sforce.soap.metadata.FeedFilterCriterion[].class));
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
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "CustomFeedFilter");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, criteria__typeInfo, criteria, criteria__is_set);
       __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
       __typeMapper.writeBoolean(__out, isProtected__typeInfo, isProtected, isProtected__is_set);
       __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
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
        setCriteria(__in, __typeMapper);
        setDescription(__in, __typeMapper);
        setIsProtected(__in, __typeMapper);
        setLabel(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[CustomFeedFilter ");
      sb.append(super.toString());sb.append(" criteria='").append(com.sforce.ws.util.Verbose.toString(criteria)).append("'\n");
      sb.append(" description='").append(com.sforce.ws.util.Verbose.toString(description)).append("'\n");
      sb.append(" isProtected='").append(com.sforce.ws.util.Verbose.toString(isProtected)).append("'\n");
      sb.append(" label='").append(com.sforce.ws.util.Verbose.toString(label)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
