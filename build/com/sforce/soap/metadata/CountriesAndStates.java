package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class CountriesAndStates implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public CountriesAndStates() {}

    /**
     * element : countries of type {http://soap.sforce.com/2006/04/metadata}Country
     * java type: com.sforce.soap.metadata.Country[]
     */
    private static final com.sforce.ws.bind.TypeInfo countries__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","countries","http://soap.sforce.com/2006/04/metadata","Country",0,-1,true);

    private boolean countries__is_set = false;

    private com.sforce.soap.metadata.Country[] countries = new com.sforce.soap.metadata.Country[0];

    public com.sforce.soap.metadata.Country[] getCountries() {
      return countries;
    }

    public void setCountries(com.sforce.soap.metadata.Country[] countries) {
      this.countries = countries;
      countries__is_set = true;
    }

    protected void setCountries(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, countries__typeInfo)) {
        setCountries((com.sforce.soap.metadata.Country[])__typeMapper.readObject(__in, countries__typeInfo, com.sforce.soap.metadata.Country[].class));
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
       __typeMapper.writeObject(__out, countries__typeInfo, countries, countries__is_set);
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
        setCountries(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[CountriesAndStates ");
      sb.append(" countries='").append(com.sforce.ws.util.Verbose.toString(countries)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
