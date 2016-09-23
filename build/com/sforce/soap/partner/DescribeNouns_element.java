package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class DescribeNouns_element implements com.sforce.ws.bind.XMLizable , IDescribeNouns_element{

    /**
     * Constructor
     */
    public DescribeNouns_element() {}

    /**
     * element : nouns of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private static final com.sforce.ws.bind.TypeInfo nouns__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","nouns","http://www.w3.org/2001/XMLSchema","string",0,100,true);

    private boolean nouns__is_set = false;

    private java.lang.String[] nouns = new java.lang.String[0];

    @Override
    public java.lang.String[] getNouns() {
      return nouns;
    }

    @Override
    public void setNouns(java.lang.String[] nouns) {
      this.nouns = castArray(java.lang.String.class, nouns);
      nouns__is_set = true;
    }

    protected void setNouns(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, nouns__typeInfo)) {
        setNouns((java.lang.String[])__typeMapper.readObject(__in, nouns__typeInfo, java.lang.String[].class));
      }
    }

    /**
     * element : onlyRenamed of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo onlyRenamed__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","onlyRenamed","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean onlyRenamed__is_set = false;

    private boolean onlyRenamed;

    @Override
    public boolean getOnlyRenamed() {
      return onlyRenamed;
    }

    @Override
    public boolean isOnlyRenamed() {
      return onlyRenamed;
    }

    @Override
    public void setOnlyRenamed(boolean onlyRenamed) {
      this.onlyRenamed = onlyRenamed;
      onlyRenamed__is_set = true;
    }

    protected void setOnlyRenamed(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, onlyRenamed__typeInfo)) {
        setOnlyRenamed(__typeMapper.readBoolean(__in, onlyRenamed__typeInfo, boolean.class));
      }
    }

    /**
     * element : includeFields of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo includeFields__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","includeFields","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean includeFields__is_set = false;

    private boolean includeFields;

    @Override
    public boolean getIncludeFields() {
      return includeFields;
    }

    @Override
    public boolean isIncludeFields() {
      return includeFields;
    }

    @Override
    public void setIncludeFields(boolean includeFields) {
      this.includeFields = includeFields;
      includeFields__is_set = true;
    }

    protected void setIncludeFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, includeFields__typeInfo)) {
        setIncludeFields(__typeMapper.readBoolean(__in, includeFields__typeInfo, boolean.class));
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
       __typeMapper.writeObject(__out, nouns__typeInfo, nouns, nouns__is_set);
       __typeMapper.writeBoolean(__out, onlyRenamed__typeInfo, onlyRenamed, onlyRenamed__is_set);
       __typeMapper.writeBoolean(__out, includeFields__typeInfo, includeFields, includeFields__is_set);
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
        setNouns(__in, __typeMapper);
        setOnlyRenamed(__in, __typeMapper);
        setIncludeFields(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[DescribeNouns_element ");
      sb.append(" nouns='").append(com.sforce.ws.util.Verbose.toString(nouns)).append("'\n");
      sb.append(" onlyRenamed='").append(com.sforce.ws.util.Verbose.toString(onlyRenamed)).append("'\n");
      sb.append(" includeFields='").append(com.sforce.ws.util.Verbose.toString(includeFields)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private <T,U> T[] castArray(Class<T> clazz, U[] array) {
        if (array == null) {
            return null;
        }
        T[] retVal = (T[]) java.lang.reflect.Array.newInstance(clazz, array.length);
        for (int i=0; i < array.length; i++) {
            retVal[i] = (T)array[i];
        }

        return retVal;
	}
}
