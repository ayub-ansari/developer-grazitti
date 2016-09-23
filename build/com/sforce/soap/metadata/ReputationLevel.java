package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ReputationLevel implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ReputationLevel() {}

    /**
     * element : branding of type {http://soap.sforce.com/2006/04/metadata}ReputationBranding
     * java type: com.sforce.soap.metadata.ReputationBranding
     */
    private static final com.sforce.ws.bind.TypeInfo branding__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","branding","http://soap.sforce.com/2006/04/metadata","ReputationBranding",0,1,true);

    private boolean branding__is_set = false;

    private com.sforce.soap.metadata.ReputationBranding branding;

    public com.sforce.soap.metadata.ReputationBranding getBranding() {
      return branding;
    }

    public void setBranding(com.sforce.soap.metadata.ReputationBranding branding) {
      this.branding = branding;
      branding__is_set = true;
    }

    protected void setBranding(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, branding__typeInfo)) {
        setBranding((com.sforce.soap.metadata.ReputationBranding)__typeMapper.readObject(__in, branding__typeInfo, com.sforce.soap.metadata.ReputationBranding.class));
      }
    }

    /**
     * element : label of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","label","http://www.w3.org/2001/XMLSchema","string",0,1,true);

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
      if (__typeMapper.isElement(__in, label__typeInfo)) {
        setLabel(__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : lowerThreshold of type {http://www.w3.org/2001/XMLSchema}double
     * java type: double
     */
    private static final com.sforce.ws.bind.TypeInfo lowerThreshold__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","lowerThreshold","http://www.w3.org/2001/XMLSchema","double",1,1,true);

    private boolean lowerThreshold__is_set = false;

    private double lowerThreshold;

    public double getLowerThreshold() {
      return lowerThreshold;
    }

    public void setLowerThreshold(double lowerThreshold) {
      this.lowerThreshold = lowerThreshold;
      lowerThreshold__is_set = true;
    }

    protected void setLowerThreshold(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, lowerThreshold__typeInfo)) {
        setLowerThreshold((double)__typeMapper.readDouble(__in, lowerThreshold__typeInfo, double.class));
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
       __typeMapper.writeObject(__out, branding__typeInfo, branding, branding__is_set);
       __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
       __typeMapper.writeDouble(__out, lowerThreshold__typeInfo, lowerThreshold, lowerThreshold__is_set);
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
        setBranding(__in, __typeMapper);
        setLabel(__in, __typeMapper);
        setLowerThreshold(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ReputationLevel ");
      sb.append(" branding='").append(com.sforce.ws.util.Verbose.toString(branding)).append("'\n");
      sb.append(" label='").append(com.sforce.ws.util.Verbose.toString(label)).append("'\n");
      sb.append(" lowerThreshold='").append(com.sforce.ws.util.Verbose.toString(lowerThreshold)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
