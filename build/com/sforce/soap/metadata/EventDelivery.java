package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class EventDelivery extends com.sforce.soap.metadata.Metadata {

    /**
     * Constructor
     */
    public EventDelivery() {}

    /**
     * element : eventParameters of type {http://soap.sforce.com/2006/04/metadata}EventParameterMap
     * java type: com.sforce.soap.metadata.EventParameterMap[]
     */
    private static final com.sforce.ws.bind.TypeInfo eventParameters__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","eventParameters","http://soap.sforce.com/2006/04/metadata","EventParameterMap",0,-1,true);

    private boolean eventParameters__is_set = false;

    private com.sforce.soap.metadata.EventParameterMap[] eventParameters = new com.sforce.soap.metadata.EventParameterMap[0];

    public com.sforce.soap.metadata.EventParameterMap[] getEventParameters() {
      return eventParameters;
    }

    public void setEventParameters(com.sforce.soap.metadata.EventParameterMap[] eventParameters) {
      this.eventParameters = eventParameters;
      eventParameters__is_set = true;
    }

    protected void setEventParameters(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, eventParameters__typeInfo)) {
        setEventParameters((com.sforce.soap.metadata.EventParameterMap[])__typeMapper.readObject(__in, eventParameters__typeInfo, com.sforce.soap.metadata.EventParameterMap[].class));
      }
    }

    /**
     * element : eventSubscription of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo eventSubscription__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","eventSubscription","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean eventSubscription__is_set = false;

    private java.lang.String eventSubscription;

    public java.lang.String getEventSubscription() {
      return eventSubscription;
    }

    public void setEventSubscription(java.lang.String eventSubscription) {
      this.eventSubscription = eventSubscription;
      eventSubscription__is_set = true;
    }

    protected void setEventSubscription(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, eventSubscription__typeInfo)) {
        setEventSubscription(__typeMapper.readString(__in, eventSubscription__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : referenceData of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo referenceData__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","referenceData","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean referenceData__is_set = false;

    private java.lang.String referenceData;

    public java.lang.String getReferenceData() {
      return referenceData;
    }

    public void setReferenceData(java.lang.String referenceData) {
      this.referenceData = referenceData;
      referenceData__is_set = true;
    }

    protected void setReferenceData(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, referenceData__typeInfo)) {
        setReferenceData(__typeMapper.readString(__in, referenceData__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : type of type {http://soap.sforce.com/2006/04/metadata}EventDeliveryType
     * java type: com.sforce.soap.metadata.EventDeliveryType
     */
    private static final com.sforce.ws.bind.TypeInfo type__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","type","http://soap.sforce.com/2006/04/metadata","EventDeliveryType",1,1,true);

    private boolean type__is_set = false;

    private com.sforce.soap.metadata.EventDeliveryType type;

    public com.sforce.soap.metadata.EventDeliveryType getType() {
      return type;
    }

    public void setType(com.sforce.soap.metadata.EventDeliveryType type) {
      this.type = type;
      type__is_set = true;
    }

    protected void setType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, type__typeInfo)) {
        setType((com.sforce.soap.metadata.EventDeliveryType)__typeMapper.readObject(__in, type__typeInfo, com.sforce.soap.metadata.EventDeliveryType.class));
      }
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "http://soap.sforce.com/2006/04/metadata", "EventDelivery");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       __typeMapper.writeObject(__out, eventParameters__typeInfo, eventParameters, eventParameters__is_set);
       __typeMapper.writeString(__out, eventSubscription__typeInfo, eventSubscription, eventSubscription__is_set);
       __typeMapper.writeString(__out, referenceData__typeInfo, referenceData, referenceData__is_set);
       __typeMapper.writeObject(__out, type__typeInfo, type, type__is_set);
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
        setEventParameters(__in, __typeMapper);
        setEventSubscription(__in, __typeMapper);
        setReferenceData(__in, __typeMapper);
        setType(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[EventDelivery ");
      sb.append(super.toString());sb.append(" eventParameters='").append(com.sforce.ws.util.Verbose.toString(eventParameters)).append("'\n");
      sb.append(" eventSubscription='").append(com.sforce.ws.util.Verbose.toString(eventSubscription)).append("'\n");
      sb.append(" referenceData='").append(com.sforce.ws.util.Verbose.toString(referenceData)).append("'\n");
      sb.append(" type='").append(com.sforce.ws.util.Verbose.toString(type)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
