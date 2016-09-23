package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ListMetadataQuery implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ListMetadataQuery() {}

    /**
     * element : folder of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo folder__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","folder","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean folder__is_set = false;

    private java.lang.String folder;

    public java.lang.String getFolder() {
      return folder;
    }

    public void setFolder(java.lang.String folder) {
      this.folder = folder;
      folder__is_set = true;
    }

    protected void setFolder(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, folder__typeInfo)) {
        setFolder(__typeMapper.readString(__in, folder__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : type of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo type__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","type","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean type__is_set = false;

    private java.lang.String type;

    public java.lang.String getType() {
      return type;
    }

    public void setType(java.lang.String type) {
      this.type = type;
      type__is_set = true;
    }

    protected void setType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, type__typeInfo)) {
        setType(__typeMapper.readString(__in, type__typeInfo, java.lang.String.class));
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
       __typeMapper.writeString(__out, folder__typeInfo, folder, folder__is_set);
       __typeMapper.writeString(__out, type__typeInfo, type, type__is_set);
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
        setFolder(__in, __typeMapper);
        setType(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ListMetadataQuery ");
      sb.append(" folder='").append(com.sforce.ws.util.Verbose.toString(folder)).append("'\n");
      sb.append(" type='").append(com.sforce.ws.util.Verbose.toString(type)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
