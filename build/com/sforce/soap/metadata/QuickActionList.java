package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class QuickActionList implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public QuickActionList() {}

    /**
     * element : quickActionListItems of type {http://soap.sforce.com/2006/04/metadata}QuickActionListItem
     * java type: com.sforce.soap.metadata.QuickActionListItem[]
     */
    private static final com.sforce.ws.bind.TypeInfo quickActionListItems__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","quickActionListItems","http://soap.sforce.com/2006/04/metadata","QuickActionListItem",0,-1,true);

    private boolean quickActionListItems__is_set = false;

    private com.sforce.soap.metadata.QuickActionListItem[] quickActionListItems = new com.sforce.soap.metadata.QuickActionListItem[0];

    public com.sforce.soap.metadata.QuickActionListItem[] getQuickActionListItems() {
      return quickActionListItems;
    }

    public void setQuickActionListItems(com.sforce.soap.metadata.QuickActionListItem[] quickActionListItems) {
      this.quickActionListItems = quickActionListItems;
      quickActionListItems__is_set = true;
    }

    protected void setQuickActionListItems(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, quickActionListItems__typeInfo)) {
        setQuickActionListItems((com.sforce.soap.metadata.QuickActionListItem[])__typeMapper.readObject(__in, quickActionListItems__typeInfo, com.sforce.soap.metadata.QuickActionListItem[].class));
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
       __typeMapper.writeObject(__out, quickActionListItems__typeInfo, quickActionListItems, quickActionListItems__is_set);
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
        setQuickActionListItems(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[QuickActionList ");
      sb.append(" quickActionListItems='").append(com.sforce.ws.util.Verbose.toString(quickActionListItems)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
