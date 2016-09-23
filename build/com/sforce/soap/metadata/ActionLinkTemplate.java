package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ActionLinkTemplate implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ActionLinkTemplate() {}

    /**
     * element : actionUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo actionUrl__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","actionUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean actionUrl__is_set = false;

    private java.lang.String actionUrl;

    public java.lang.String getActionUrl() {
      return actionUrl;
    }

    public void setActionUrl(java.lang.String actionUrl) {
      this.actionUrl = actionUrl;
      actionUrl__is_set = true;
    }

    protected void setActionUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, actionUrl__typeInfo)) {
        setActionUrl(__typeMapper.readString(__in, actionUrl__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : headers of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo headers__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","headers","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean headers__is_set = false;

    private java.lang.String headers;

    public java.lang.String getHeaders() {
      return headers;
    }

    public void setHeaders(java.lang.String headers) {
      this.headers = headers;
      headers__is_set = true;
    }

    protected void setHeaders(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, headers__typeInfo)) {
        setHeaders(__typeMapper.readString(__in, headers__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : isConfirmationRequired of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo isConfirmationRequired__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","isConfirmationRequired","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean isConfirmationRequired__is_set = false;

    private boolean isConfirmationRequired;

    public boolean getIsConfirmationRequired() {
      return isConfirmationRequired;
    }

    public boolean isIsConfirmationRequired() {
      return isConfirmationRequired;
    }

    public void setIsConfirmationRequired(boolean isConfirmationRequired) {
      this.isConfirmationRequired = isConfirmationRequired;
      isConfirmationRequired__is_set = true;
    }

    protected void setIsConfirmationRequired(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, isConfirmationRequired__typeInfo)) {
        setIsConfirmationRequired(__typeMapper.readBoolean(__in, isConfirmationRequired__typeInfo, boolean.class));
      }
    }

    /**
     * element : isGroupDefault of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo isGroupDefault__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","isGroupDefault","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

    private boolean isGroupDefault__is_set = false;

    private boolean isGroupDefault;

    public boolean getIsGroupDefault() {
      return isGroupDefault;
    }

    public boolean isIsGroupDefault() {
      return isGroupDefault;
    }

    public void setIsGroupDefault(boolean isGroupDefault) {
      this.isGroupDefault = isGroupDefault;
      isGroupDefault__is_set = true;
    }

    protected void setIsGroupDefault(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, isGroupDefault__typeInfo)) {
        setIsGroupDefault(__typeMapper.readBoolean(__in, isGroupDefault__typeInfo, boolean.class));
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
     * element : labelKey of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo labelKey__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","labelKey","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean labelKey__is_set = false;

    private java.lang.String labelKey;

    public java.lang.String getLabelKey() {
      return labelKey;
    }

    public void setLabelKey(java.lang.String labelKey) {
      this.labelKey = labelKey;
      labelKey__is_set = true;
    }

    protected void setLabelKey(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, labelKey__typeInfo)) {
        setLabelKey(__typeMapper.readString(__in, labelKey__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : linkType of type {http://soap.sforce.com/2006/04/metadata}ActionLinkType
     * java type: com.sforce.soap.metadata.ActionLinkType
     */
    private static final com.sforce.ws.bind.TypeInfo linkType__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","linkType","http://soap.sforce.com/2006/04/metadata","ActionLinkType",1,1,true);

    private boolean linkType__is_set = false;

    private com.sforce.soap.metadata.ActionLinkType linkType;

    public com.sforce.soap.metadata.ActionLinkType getLinkType() {
      return linkType;
    }

    public void setLinkType(com.sforce.soap.metadata.ActionLinkType linkType) {
      this.linkType = linkType;
      linkType__is_set = true;
    }

    protected void setLinkType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, linkType__typeInfo)) {
        setLinkType((com.sforce.soap.metadata.ActionLinkType)__typeMapper.readObject(__in, linkType__typeInfo, com.sforce.soap.metadata.ActionLinkType.class));
      }
    }

    /**
     * element : method of type {http://soap.sforce.com/2006/04/metadata}ActionLinkHttpMethod
     * java type: com.sforce.soap.metadata.ActionLinkHttpMethod
     */
    private static final com.sforce.ws.bind.TypeInfo method__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","method","http://soap.sforce.com/2006/04/metadata","ActionLinkHttpMethod",1,1,true);

    private boolean method__is_set = false;

    private com.sforce.soap.metadata.ActionLinkHttpMethod method;

    public com.sforce.soap.metadata.ActionLinkHttpMethod getMethod() {
      return method;
    }

    public void setMethod(com.sforce.soap.metadata.ActionLinkHttpMethod method) {
      this.method = method;
      method__is_set = true;
    }

    protected void setMethod(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, method__typeInfo)) {
        setMethod((com.sforce.soap.metadata.ActionLinkHttpMethod)__typeMapper.readObject(__in, method__typeInfo, com.sforce.soap.metadata.ActionLinkHttpMethod.class));
      }
    }

    /**
     * element : position of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo position__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","position","http://www.w3.org/2001/XMLSchema","int",1,1,true);

    private boolean position__is_set = false;

    private int position;

    public int getPosition() {
      return position;
    }

    public void setPosition(int position) {
      this.position = position;
      position__is_set = true;
    }

    protected void setPosition(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, position__typeInfo)) {
        setPosition((int)__typeMapper.readInt(__in, position__typeInfo, int.class));
      }
    }

    /**
     * element : requestBody of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo requestBody__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","requestBody","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean requestBody__is_set = false;

    private java.lang.String requestBody;

    public java.lang.String getRequestBody() {
      return requestBody;
    }

    public void setRequestBody(java.lang.String requestBody) {
      this.requestBody = requestBody;
      requestBody__is_set = true;
    }

    protected void setRequestBody(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, requestBody__typeInfo)) {
        setRequestBody(__typeMapper.readString(__in, requestBody__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : userAlias of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo userAlias__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","userAlias","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean userAlias__is_set = false;

    private java.lang.String userAlias;

    public java.lang.String getUserAlias() {
      return userAlias;
    }

    public void setUserAlias(java.lang.String userAlias) {
      this.userAlias = userAlias;
      userAlias__is_set = true;
    }

    protected void setUserAlias(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, userAlias__typeInfo)) {
        setUserAlias(__typeMapper.readString(__in, userAlias__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : userVisibility of type {http://soap.sforce.com/2006/04/metadata}ActionLinkUserVisibility
     * java type: com.sforce.soap.metadata.ActionLinkUserVisibility
     */
    private static final com.sforce.ws.bind.TypeInfo userVisibility__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","userVisibility","http://soap.sforce.com/2006/04/metadata","ActionLinkUserVisibility",1,1,true);

    private boolean userVisibility__is_set = false;

    private com.sforce.soap.metadata.ActionLinkUserVisibility userVisibility;

    public com.sforce.soap.metadata.ActionLinkUserVisibility getUserVisibility() {
      return userVisibility;
    }

    public void setUserVisibility(com.sforce.soap.metadata.ActionLinkUserVisibility userVisibility) {
      this.userVisibility = userVisibility;
      userVisibility__is_set = true;
    }

    protected void setUserVisibility(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, userVisibility__typeInfo)) {
        setUserVisibility((com.sforce.soap.metadata.ActionLinkUserVisibility)__typeMapper.readObject(__in, userVisibility__typeInfo, com.sforce.soap.metadata.ActionLinkUserVisibility.class));
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
       __typeMapper.writeString(__out, actionUrl__typeInfo, actionUrl, actionUrl__is_set);
       __typeMapper.writeString(__out, headers__typeInfo, headers, headers__is_set);
       __typeMapper.writeBoolean(__out, isConfirmationRequired__typeInfo, isConfirmationRequired, isConfirmationRequired__is_set);
       __typeMapper.writeBoolean(__out, isGroupDefault__typeInfo, isGroupDefault, isGroupDefault__is_set);
       __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
       __typeMapper.writeString(__out, labelKey__typeInfo, labelKey, labelKey__is_set);
       __typeMapper.writeObject(__out, linkType__typeInfo, linkType, linkType__is_set);
       __typeMapper.writeObject(__out, method__typeInfo, method, method__is_set);
       __typeMapper.writeInt(__out, position__typeInfo, position, position__is_set);
       __typeMapper.writeString(__out, requestBody__typeInfo, requestBody, requestBody__is_set);
       __typeMapper.writeString(__out, userAlias__typeInfo, userAlias, userAlias__is_set);
       __typeMapper.writeObject(__out, userVisibility__typeInfo, userVisibility, userVisibility__is_set);
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
        setActionUrl(__in, __typeMapper);
        setHeaders(__in, __typeMapper);
        setIsConfirmationRequired(__in, __typeMapper);
        setIsGroupDefault(__in, __typeMapper);
        setLabel(__in, __typeMapper);
        setLabelKey(__in, __typeMapper);
        setLinkType(__in, __typeMapper);
        setMethod(__in, __typeMapper);
        setPosition(__in, __typeMapper);
        setRequestBody(__in, __typeMapper);
        setUserAlias(__in, __typeMapper);
        setUserVisibility(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ActionLinkTemplate ");
      sb.append(" actionUrl='").append(com.sforce.ws.util.Verbose.toString(actionUrl)).append("'\n");
      sb.append(" headers='").append(com.sforce.ws.util.Verbose.toString(headers)).append("'\n");
      sb.append(" isConfirmationRequired='").append(com.sforce.ws.util.Verbose.toString(isConfirmationRequired)).append("'\n");
      sb.append(" isGroupDefault='").append(com.sforce.ws.util.Verbose.toString(isGroupDefault)).append("'\n");
      sb.append(" label='").append(com.sforce.ws.util.Verbose.toString(label)).append("'\n");
      sb.append(" labelKey='").append(com.sforce.ws.util.Verbose.toString(labelKey)).append("'\n");
      sb.append(" linkType='").append(com.sforce.ws.util.Verbose.toString(linkType)).append("'\n");
      sb.append(" method='").append(com.sforce.ws.util.Verbose.toString(method)).append("'\n");
      sb.append(" position='").append(com.sforce.ws.util.Verbose.toString(position)).append("'\n");
      sb.append(" requestBody='").append(com.sforce.ws.util.Verbose.toString(requestBody)).append("'\n");
      sb.append(" userAlias='").append(com.sforce.ws.util.Verbose.toString(userAlias)).append("'\n");
      sb.append(" userVisibility='").append(com.sforce.ws.util.Verbose.toString(userVisibility)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
