package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class PlatformCachePartitionType implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public PlatformCachePartitionType() {}

    /**
     * element : allocatedCapacity of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo allocatedCapacity__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","allocatedCapacity","http://www.w3.org/2001/XMLSchema","int",1,1,true);

    private boolean allocatedCapacity__is_set = false;

    private int allocatedCapacity;

    public int getAllocatedCapacity() {
      return allocatedCapacity;
    }

    public void setAllocatedCapacity(int allocatedCapacity) {
      this.allocatedCapacity = allocatedCapacity;
      allocatedCapacity__is_set = true;
    }

    protected void setAllocatedCapacity(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, allocatedCapacity__typeInfo)) {
        setAllocatedCapacity((int)__typeMapper.readInt(__in, allocatedCapacity__typeInfo, int.class));
      }
    }

    /**
     * element : allocatedPurchasedCapacity of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo allocatedPurchasedCapacity__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","allocatedPurchasedCapacity","http://www.w3.org/2001/XMLSchema","int",1,1,true);

    private boolean allocatedPurchasedCapacity__is_set = false;

    private int allocatedPurchasedCapacity;

    public int getAllocatedPurchasedCapacity() {
      return allocatedPurchasedCapacity;
    }

    public void setAllocatedPurchasedCapacity(int allocatedPurchasedCapacity) {
      this.allocatedPurchasedCapacity = allocatedPurchasedCapacity;
      allocatedPurchasedCapacity__is_set = true;
    }

    protected void setAllocatedPurchasedCapacity(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, allocatedPurchasedCapacity__typeInfo)) {
        setAllocatedPurchasedCapacity((int)__typeMapper.readInt(__in, allocatedPurchasedCapacity__typeInfo, int.class));
      }
    }

    /**
     * element : allocatedTrialCapacity of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo allocatedTrialCapacity__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","allocatedTrialCapacity","http://www.w3.org/2001/XMLSchema","int",1,1,true);

    private boolean allocatedTrialCapacity__is_set = false;

    private int allocatedTrialCapacity;

    public int getAllocatedTrialCapacity() {
      return allocatedTrialCapacity;
    }

    public void setAllocatedTrialCapacity(int allocatedTrialCapacity) {
      this.allocatedTrialCapacity = allocatedTrialCapacity;
      allocatedTrialCapacity__is_set = true;
    }

    protected void setAllocatedTrialCapacity(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, allocatedTrialCapacity__typeInfo)) {
        setAllocatedTrialCapacity((int)__typeMapper.readInt(__in, allocatedTrialCapacity__typeInfo, int.class));
      }
    }

    /**
     * element : cacheType of type {http://soap.sforce.com/2006/04/metadata}PlatformCacheType
     * java type: com.sforce.soap.metadata.PlatformCacheType
     */
    private static final com.sforce.ws.bind.TypeInfo cacheType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","cacheType","http://soap.sforce.com/2006/04/metadata","PlatformCacheType",1,1,true);

    private boolean cacheType__is_set = false;

    private com.sforce.soap.metadata.PlatformCacheType cacheType;

    public com.sforce.soap.metadata.PlatformCacheType getCacheType() {
      return cacheType;
    }

    public void setCacheType(com.sforce.soap.metadata.PlatformCacheType cacheType) {
      this.cacheType = cacheType;
      cacheType__is_set = true;
    }

    protected void setCacheType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, cacheType__typeInfo)) {
        setCacheType((com.sforce.soap.metadata.PlatformCacheType)__typeMapper.readObject(__in, cacheType__typeInfo, com.sforce.soap.metadata.PlatformCacheType.class));
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
       __typeMapper.writeInt(__out, allocatedCapacity__typeInfo, allocatedCapacity, allocatedCapacity__is_set);
       __typeMapper.writeInt(__out, allocatedPurchasedCapacity__typeInfo, allocatedPurchasedCapacity, allocatedPurchasedCapacity__is_set);
       __typeMapper.writeInt(__out, allocatedTrialCapacity__typeInfo, allocatedTrialCapacity, allocatedTrialCapacity__is_set);
       __typeMapper.writeObject(__out, cacheType__typeInfo, cacheType, cacheType__is_set);
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
        setAllocatedCapacity(__in, __typeMapper);
        setAllocatedPurchasedCapacity(__in, __typeMapper);
        setAllocatedTrialCapacity(__in, __typeMapper);
        setCacheType(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[PlatformCachePartitionType ");
      sb.append(" allocatedCapacity='").append(com.sforce.ws.util.Verbose.toString(allocatedCapacity)).append("'\n");
      sb.append(" allocatedPurchasedCapacity='").append(com.sforce.ws.util.Verbose.toString(allocatedPurchasedCapacity)).append("'\n");
      sb.append(" allocatedTrialCapacity='").append(com.sforce.ws.util.Verbose.toString(allocatedTrialCapacity)).append("'\n");
      sb.append(" cacheType='").append(com.sforce.ws.util.Verbose.toString(cacheType)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
