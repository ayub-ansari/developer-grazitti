package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class RelatedContent implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public RelatedContent() {}

    /**
     * element : relatedContentItems of type {http://soap.sforce.com/2006/04/metadata}RelatedContentItem
     * java type: com.sforce.soap.metadata.RelatedContentItem[]
     */
    private static final com.sforce.ws.bind.TypeInfo relatedContentItems__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","relatedContentItems","http://soap.sforce.com/2006/04/metadata","RelatedContentItem",0,-1,true);

    private boolean relatedContentItems__is_set = false;

    private com.sforce.soap.metadata.RelatedContentItem[] relatedContentItems = new com.sforce.soap.metadata.RelatedContentItem[0];

    public com.sforce.soap.metadata.RelatedContentItem[] getRelatedContentItems() {
      return relatedContentItems;
    }

    public void setRelatedContentItems(com.sforce.soap.metadata.RelatedContentItem[] relatedContentItems) {
      this.relatedContentItems = relatedContentItems;
      relatedContentItems__is_set = true;
    }

    protected void setRelatedContentItems(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, relatedContentItems__typeInfo)) {
        setRelatedContentItems((com.sforce.soap.metadata.RelatedContentItem[])__typeMapper.readObject(__in, relatedContentItems__typeInfo, com.sforce.soap.metadata.RelatedContentItem[].class));
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
       __typeMapper.writeObject(__out, relatedContentItems__typeInfo, relatedContentItems, relatedContentItems__is_set);
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
        setRelatedContentItems(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[RelatedContent ");
      sb.append(" relatedContentItems='").append(com.sforce.ws.util.Verbose.toString(relatedContentItems)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
