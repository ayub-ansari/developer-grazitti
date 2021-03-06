package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class FindSimilarOppFilter implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public FindSimilarOppFilter() {}

    /**
     * element : similarOpportunitiesDisplayColumns of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo similarOpportunitiesDisplayColumns__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","similarOpportunitiesDisplayColumns","http://www.w3.org/2001/XMLSchema","string",0,-1,true);

    private boolean similarOpportunitiesDisplayColumns__is_set = false;

    private java.lang.String[] similarOpportunitiesDisplayColumns = new java.lang.String[0];

    public java.lang.String[] getSimilarOpportunitiesDisplayColumns() {
      return similarOpportunitiesDisplayColumns;
    }

    public void setSimilarOpportunitiesDisplayColumns(java.lang.String[] similarOpportunitiesDisplayColumns) {
      this.similarOpportunitiesDisplayColumns = similarOpportunitiesDisplayColumns;
      similarOpportunitiesDisplayColumns__is_set = true;
    }

    protected void setSimilarOpportunitiesDisplayColumns(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, similarOpportunitiesDisplayColumns__typeInfo)) {
        setSimilarOpportunitiesDisplayColumns((java.lang.String[])__typeMapper.readObject(__in, similarOpportunitiesDisplayColumns__typeInfo, java.lang.String[].class));
      }
    }

    /**
     * element : similarOpportunitiesMatchFields of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo similarOpportunitiesMatchFields__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","similarOpportunitiesMatchFields","http://www.w3.org/2001/XMLSchema","string",0,-1,true);

    private boolean similarOpportunitiesMatchFields__is_set = false;

    private java.lang.String[] similarOpportunitiesMatchFields = new java.lang.String[0];

    public java.lang.String[] getSimilarOpportunitiesMatchFields() {
      return similarOpportunitiesMatchFields;
    }

    public void setSimilarOpportunitiesMatchFields(java.lang.String[] similarOpportunitiesMatchFields) {
      this.similarOpportunitiesMatchFields = similarOpportunitiesMatchFields;
      similarOpportunitiesMatchFields__is_set = true;
    }

    protected void setSimilarOpportunitiesMatchFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, similarOpportunitiesMatchFields__typeInfo)) {
        setSimilarOpportunitiesMatchFields((java.lang.String[])__typeMapper.readObject(__in, similarOpportunitiesMatchFields__typeInfo, java.lang.String[].class));
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
       __typeMapper.writeObject(__out, similarOpportunitiesDisplayColumns__typeInfo, similarOpportunitiesDisplayColumns, similarOpportunitiesDisplayColumns__is_set);
       __typeMapper.writeObject(__out, similarOpportunitiesMatchFields__typeInfo, similarOpportunitiesMatchFields, similarOpportunitiesMatchFields__is_set);
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
        setSimilarOpportunitiesDisplayColumns(__in, __typeMapper);
        setSimilarOpportunitiesMatchFields(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[FindSimilarOppFilter ");
      sb.append(" similarOpportunitiesDisplayColumns='").append(com.sforce.ws.util.Verbose.toString(similarOpportunitiesDisplayColumns)).append("'\n");
      sb.append(" similarOpportunitiesMatchFields='").append(com.sforce.ws.util.Verbose.toString(similarOpportunitiesMatchFields)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
