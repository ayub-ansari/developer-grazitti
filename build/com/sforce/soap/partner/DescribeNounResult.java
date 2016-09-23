package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class DescribeNounResult implements com.sforce.ws.bind.XMLizable , IDescribeNounResult{

    /**
     * Constructor
     */
    public DescribeNounResult() {}

    /**
     * element : caseValues of type {urn:partner.soap.sforce.com}NameCaseValue
     * java type: com.sforce.soap.partner.NameCaseValue[]
     */
    private static final com.sforce.ws.bind.TypeInfo caseValues__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","caseValues","urn:partner.soap.sforce.com","NameCaseValue",0,-1,true);

    private boolean caseValues__is_set = false;

    private com.sforce.soap.partner.NameCaseValue[] caseValues = new com.sforce.soap.partner.NameCaseValue[0];

    @Override
    public com.sforce.soap.partner.NameCaseValue[] getCaseValues() {
      return caseValues;
    }

    @Override
    public void setCaseValues(com.sforce.soap.partner.INameCaseValue[] caseValues) {
      this.caseValues = castArray(com.sforce.soap.partner.NameCaseValue.class, caseValues);
      caseValues__is_set = true;
    }

    protected void setCaseValues(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, caseValues__typeInfo)) {
        setCaseValues((com.sforce.soap.partner.NameCaseValue[])__typeMapper.readObject(__in, caseValues__typeInfo, com.sforce.soap.partner.NameCaseValue[].class));
      }
    }

    /**
     * element : developerName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo developerName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","developerName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean developerName__is_set = false;

    private java.lang.String developerName;

    @Override
    public java.lang.String getDeveloperName() {
      return developerName;
    }

    @Override
    public void setDeveloperName(java.lang.String developerName) {
      this.developerName = developerName;
      developerName__is_set = true;
    }

    protected void setDeveloperName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, developerName__typeInfo)) {
        setDeveloperName(__typeMapper.readString(__in, developerName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : gender of type {urn:partner.soap.sforce.com}Gender
     * java type: com.sforce.soap.partner.Gender
     */
    private static final com.sforce.ws.bind.TypeInfo gender__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","gender","urn:partner.soap.sforce.com","Gender",1,1,true);

    private boolean gender__is_set = false;

    private com.sforce.soap.partner.Gender gender;

    @Override
    public com.sforce.soap.partner.Gender getGender() {
      return gender;
    }

    @Override
    public void setGender(com.sforce.soap.partner.Gender gender) {
      this.gender = gender;
      gender__is_set = true;
    }

    protected void setGender(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, gender__typeInfo)) {
        setGender((com.sforce.soap.partner.Gender)__typeMapper.readObject(__in, gender__typeInfo, com.sforce.soap.partner.Gender.class));
      }
    }

    /**
     * element : name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean name__is_set = false;

    private java.lang.String name;

    @Override
    public java.lang.String getName() {
      return name;
    }

    @Override
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
     * element : pluralAlias of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo pluralAlias__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","pluralAlias","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean pluralAlias__is_set = false;

    private java.lang.String pluralAlias;

    @Override
    public java.lang.String getPluralAlias() {
      return pluralAlias;
    }

    @Override
    public void setPluralAlias(java.lang.String pluralAlias) {
      this.pluralAlias = pluralAlias;
      pluralAlias__is_set = true;
    }

    protected void setPluralAlias(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, pluralAlias__typeInfo)) {
        setPluralAlias(__typeMapper.readString(__in, pluralAlias__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : startsWith of type {urn:partner.soap.sforce.com}StartsWith
     * java type: com.sforce.soap.partner.StartsWith
     */
    private static final com.sforce.ws.bind.TypeInfo startsWith__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","startsWith","urn:partner.soap.sforce.com","StartsWith",1,1,true);

    private boolean startsWith__is_set = false;

    private com.sforce.soap.partner.StartsWith startsWith;

    @Override
    public com.sforce.soap.partner.StartsWith getStartsWith() {
      return startsWith;
    }

    @Override
    public void setStartsWith(com.sforce.soap.partner.StartsWith startsWith) {
      this.startsWith = startsWith;
      startsWith__is_set = true;
    }

    protected void setStartsWith(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, startsWith__typeInfo)) {
        setStartsWith((com.sforce.soap.partner.StartsWith)__typeMapper.readObject(__in, startsWith__typeInfo, com.sforce.soap.partner.StartsWith.class));
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
       __typeMapper.writeObject(__out, caseValues__typeInfo, caseValues, caseValues__is_set);
       __typeMapper.writeString(__out, developerName__typeInfo, developerName, developerName__is_set);
       __typeMapper.writeObject(__out, gender__typeInfo, gender, gender__is_set);
       __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
       __typeMapper.writeString(__out, pluralAlias__typeInfo, pluralAlias, pluralAlias__is_set);
       __typeMapper.writeObject(__out, startsWith__typeInfo, startsWith, startsWith__is_set);
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
        setCaseValues(__in, __typeMapper);
        setDeveloperName(__in, __typeMapper);
        setGender(__in, __typeMapper);
        setName(__in, __typeMapper);
        setPluralAlias(__in, __typeMapper);
        setStartsWith(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[DescribeNounResult ");
      sb.append(" caseValues='").append(com.sforce.ws.util.Verbose.toString(caseValues)).append("'\n");
      sb.append(" developerName='").append(com.sforce.ws.util.Verbose.toString(developerName)).append("'\n");
      sb.append(" gender='").append(com.sforce.ws.util.Verbose.toString(gender)).append("'\n");
      sb.append(" name='").append(com.sforce.ws.util.Verbose.toString(name)).append("'\n");
      sb.append(" pluralAlias='").append(com.sforce.ws.util.Verbose.toString(pluralAlias)).append("'\n");
      sb.append(" startsWith='").append(com.sforce.ws.util.Verbose.toString(startsWith)).append("'\n");
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
