package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class EmailToCaseRoutingAddress implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public EmailToCaseRoutingAddress() {}

    /**
     * element : addressType of type {http://soap.sforce.com/2006/04/metadata}EmailToCaseRoutingAddressType
     * java type: com.sforce.soap.metadata.EmailToCaseRoutingAddressType
     */
    private static final com.sforce.ws.bind.TypeInfo addressType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","addressType","http://soap.sforce.com/2006/04/metadata","EmailToCaseRoutingAddressType",0,1,true);

    private boolean addressType__is_set = false;

    private com.sforce.soap.metadata.EmailToCaseRoutingAddressType addressType;

    public com.sforce.soap.metadata.EmailToCaseRoutingAddressType getAddressType() {
      return addressType;
    }

    public void setAddressType(com.sforce.soap.metadata.EmailToCaseRoutingAddressType addressType) {
      this.addressType = addressType;
      addressType__is_set = true;
    }

    protected void setAddressType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, addressType__typeInfo)) {
        setAddressType((com.sforce.soap.metadata.EmailToCaseRoutingAddressType)__typeMapper.readObject(__in, addressType__typeInfo, com.sforce.soap.metadata.EmailToCaseRoutingAddressType.class));
      }
    }

    /**
     * element : authorizedSenders of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo authorizedSenders__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","authorizedSenders","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean authorizedSenders__is_set = false;

    private java.lang.String authorizedSenders;

    public java.lang.String getAuthorizedSenders() {
      return authorizedSenders;
    }

    public void setAuthorizedSenders(java.lang.String authorizedSenders) {
      this.authorizedSenders = authorizedSenders;
      authorizedSenders__is_set = true;
    }

    protected void setAuthorizedSenders(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, authorizedSenders__typeInfo)) {
        setAuthorizedSenders(__typeMapper.readString(__in, authorizedSenders__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : caseOrigin of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo caseOrigin__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","caseOrigin","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean caseOrigin__is_set = false;

    private java.lang.String caseOrigin;

    public java.lang.String getCaseOrigin() {
      return caseOrigin;
    }

    public void setCaseOrigin(java.lang.String caseOrigin) {
      this.caseOrigin = caseOrigin;
      caseOrigin__is_set = true;
    }

    protected void setCaseOrigin(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, caseOrigin__typeInfo)) {
        setCaseOrigin(__typeMapper.readString(__in, caseOrigin__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : caseOwner of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo caseOwner__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","caseOwner","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean caseOwner__is_set = false;

    private java.lang.String caseOwner;

    public java.lang.String getCaseOwner() {
      return caseOwner;
    }

    public void setCaseOwner(java.lang.String caseOwner) {
      this.caseOwner = caseOwner;
      caseOwner__is_set = true;
    }

    protected void setCaseOwner(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, caseOwner__typeInfo)) {
        setCaseOwner(__typeMapper.readString(__in, caseOwner__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : caseOwnerType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo caseOwnerType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","caseOwnerType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean caseOwnerType__is_set = false;

    private java.lang.String caseOwnerType;

    public java.lang.String getCaseOwnerType() {
      return caseOwnerType;
    }

    public void setCaseOwnerType(java.lang.String caseOwnerType) {
      this.caseOwnerType = caseOwnerType;
      caseOwnerType__is_set = true;
    }

    protected void setCaseOwnerType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, caseOwnerType__typeInfo)) {
        setCaseOwnerType(__typeMapper.readString(__in, caseOwnerType__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : casePriority of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo casePriority__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","casePriority","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean casePriority__is_set = false;

    private java.lang.String casePriority;

    public java.lang.String getCasePriority() {
      return casePriority;
    }

    public void setCasePriority(java.lang.String casePriority) {
      this.casePriority = casePriority;
      casePriority__is_set = true;
    }

    protected void setCasePriority(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, casePriority__typeInfo)) {
        setCasePriority(__typeMapper.readString(__in, casePriority__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : createTask of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo createTask__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","createTask","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean createTask__is_set = false;

    private boolean createTask;

    public boolean getCreateTask() {
      return createTask;
    }

    public boolean isCreateTask() {
      return createTask;
    }

    public void setCreateTask(boolean createTask) {
      this.createTask = createTask;
      createTask__is_set = true;
    }

    protected void setCreateTask(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, createTask__typeInfo)) {
        setCreateTask(__typeMapper.readBoolean(__in, createTask__typeInfo, boolean.class));
      }
    }

    /**
     * element : emailAddress of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo emailAddress__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","emailAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean emailAddress__is_set = false;

    private java.lang.String emailAddress;

    public java.lang.String getEmailAddress() {
      return emailAddress;
    }

    public void setEmailAddress(java.lang.String emailAddress) {
      this.emailAddress = emailAddress;
      emailAddress__is_set = true;
    }

    protected void setEmailAddress(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, emailAddress__typeInfo)) {
        setEmailAddress(__typeMapper.readString(__in, emailAddress__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : routingName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo routingName__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","routingName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean routingName__is_set = false;

    private java.lang.String routingName;

    public java.lang.String getRoutingName() {
      return routingName;
    }

    public void setRoutingName(java.lang.String routingName) {
      this.routingName = routingName;
      routingName__is_set = true;
    }

    protected void setRoutingName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, routingName__typeInfo)) {
        setRoutingName(__typeMapper.readString(__in, routingName__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : saveEmailHeaders of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo saveEmailHeaders__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","saveEmailHeaders","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean saveEmailHeaders__is_set = false;

    private boolean saveEmailHeaders;

    public boolean getSaveEmailHeaders() {
      return saveEmailHeaders;
    }

    public boolean isSaveEmailHeaders() {
      return saveEmailHeaders;
    }

    public void setSaveEmailHeaders(boolean saveEmailHeaders) {
      this.saveEmailHeaders = saveEmailHeaders;
      saveEmailHeaders__is_set = true;
    }

    protected void setSaveEmailHeaders(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, saveEmailHeaders__typeInfo)) {
        setSaveEmailHeaders(__typeMapper.readBoolean(__in, saveEmailHeaders__typeInfo, boolean.class));
      }
    }

    /**
     * element : taskStatus of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo taskStatus__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","taskStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean taskStatus__is_set = false;

    private java.lang.String taskStatus;

    public java.lang.String getTaskStatus() {
      return taskStatus;
    }

    public void setTaskStatus(java.lang.String taskStatus) {
      this.taskStatus = taskStatus;
      taskStatus__is_set = true;
    }

    protected void setTaskStatus(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, taskStatus__typeInfo)) {
        setTaskStatus(__typeMapper.readString(__in, taskStatus__typeInfo, java.lang.String.class));
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
       __typeMapper.writeObject(__out, addressType__typeInfo, addressType, addressType__is_set);
       __typeMapper.writeString(__out, authorizedSenders__typeInfo, authorizedSenders, authorizedSenders__is_set);
       __typeMapper.writeString(__out, caseOrigin__typeInfo, caseOrigin, caseOrigin__is_set);
       __typeMapper.writeString(__out, caseOwner__typeInfo, caseOwner, caseOwner__is_set);
       __typeMapper.writeString(__out, caseOwnerType__typeInfo, caseOwnerType, caseOwnerType__is_set);
       __typeMapper.writeString(__out, casePriority__typeInfo, casePriority, casePriority__is_set);
       __typeMapper.writeBoolean(__out, createTask__typeInfo, createTask, createTask__is_set);
       __typeMapper.writeString(__out, emailAddress__typeInfo, emailAddress, emailAddress__is_set);
       __typeMapper.writeString(__out, routingName__typeInfo, routingName, routingName__is_set);
       __typeMapper.writeBoolean(__out, saveEmailHeaders__typeInfo, saveEmailHeaders, saveEmailHeaders__is_set);
       __typeMapper.writeString(__out, taskStatus__typeInfo, taskStatus, taskStatus__is_set);
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
        setAddressType(__in, __typeMapper);
        setAuthorizedSenders(__in, __typeMapper);
        setCaseOrigin(__in, __typeMapper);
        setCaseOwner(__in, __typeMapper);
        setCaseOwnerType(__in, __typeMapper);
        setCasePriority(__in, __typeMapper);
        setCreateTask(__in, __typeMapper);
        setEmailAddress(__in, __typeMapper);
        setRoutingName(__in, __typeMapper);
        setSaveEmailHeaders(__in, __typeMapper);
        setTaskStatus(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[EmailToCaseRoutingAddress ");
      sb.append(" addressType='").append(com.sforce.ws.util.Verbose.toString(addressType)).append("'\n");
      sb.append(" authorizedSenders='").append(com.sforce.ws.util.Verbose.toString(authorizedSenders)).append("'\n");
      sb.append(" caseOrigin='").append(com.sforce.ws.util.Verbose.toString(caseOrigin)).append("'\n");
      sb.append(" caseOwner='").append(com.sforce.ws.util.Verbose.toString(caseOwner)).append("'\n");
      sb.append(" caseOwnerType='").append(com.sforce.ws.util.Verbose.toString(caseOwnerType)).append("'\n");
      sb.append(" casePriority='").append(com.sforce.ws.util.Verbose.toString(casePriority)).append("'\n");
      sb.append(" createTask='").append(com.sforce.ws.util.Verbose.toString(createTask)).append("'\n");
      sb.append(" emailAddress='").append(com.sforce.ws.util.Verbose.toString(emailAddress)).append("'\n");
      sb.append(" routingName='").append(com.sforce.ws.util.Verbose.toString(routingName)).append("'\n");
      sb.append(" saveEmailHeaders='").append(com.sforce.ws.util.Verbose.toString(saveEmailHeaders)).append("'\n");
      sb.append(" taskStatus='").append(com.sforce.ws.util.Verbose.toString(taskStatus)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
