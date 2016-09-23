package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class MatchingRules extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public MatchingRules() {}

    /**
     * element : matchingRules of type {http://soap.sforce.com/2006/04/metadata}MatchingRule
     * java type: com.sforce.soap.metadata.MatchingRule[]
     */
    private static final com.sforce.ws.bind.TypeInfo matchingRules__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","matchingRules","http://soap.sforce.com/2006/04/metadata","MatchingRule",0,-1,true);

    private boolean matchingRules__is_set = false;

    private com.sforce.soap.metadata.MatchingRule[] matchingRules = new com.sforce.soap.metadata.MatchingRule[0];

    public com.sforce.soap.metadata.MatchingRule[] getMatchingRules() {
      return matchingRules;
    }

    public void setMatchingRules(com.sforce.soap.metadata.MatchingRule[] matchingRules) {
      this.matchingRules = matchingRules;
      matchingRules__is_set = true;
    }

    protected void setMatchingRules(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, matchingRules__typeInfo)) {
        setMatchingRules((com.sforce.soap.metadata.MatchingRule[])__typeMapper.readObject(__in, matchingRules__typeInfo, com.sforce.soap.metadata.MatchingRule[].class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "MatchingRules");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, matchingRules__typeInfo, matchingRules, matchingRules__is_set);
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
        setMatchingRules(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[MatchingRules ");
      sb.append(super.toString());sb.append(" matchingRules='").append(com.sforce.ws.util.Verbose.toString(matchingRules)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
