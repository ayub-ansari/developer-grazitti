package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class PasswordPolicies implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public PasswordPolicies() {}

    /**
     * element : apiOnlyUserHomePageURL of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo apiOnlyUserHomePageURL__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","apiOnlyUserHomePageURL","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean apiOnlyUserHomePageURL__is_set = false;

    private java.lang.String apiOnlyUserHomePageURL;

    public java.lang.String getApiOnlyUserHomePageURL() {
      return apiOnlyUserHomePageURL;
    }

    public void setApiOnlyUserHomePageURL(java.lang.String apiOnlyUserHomePageURL) {
      this.apiOnlyUserHomePageURL = apiOnlyUserHomePageURL;
      apiOnlyUserHomePageURL__is_set = true;
    }

    protected void setApiOnlyUserHomePageURL(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, apiOnlyUserHomePageURL__typeInfo)) {
        setApiOnlyUserHomePageURL(__typeMapper.readString(__in, apiOnlyUserHomePageURL__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : complexity of type {http://soap.sforce.com/2006/04/metadata}Complexity
     * java type: com.sforce.soap.metadata.Complexity
     */
    private static final com.sforce.ws.bind.TypeInfo complexity__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","complexity","http://soap.sforce.com/2006/04/metadata","Complexity",0,1,true);

    private boolean complexity__is_set = false;

    private com.sforce.soap.metadata.Complexity complexity;

    public com.sforce.soap.metadata.Complexity getComplexity() {
      return complexity;
    }

    public void setComplexity(com.sforce.soap.metadata.Complexity complexity) {
      this.complexity = complexity;
      complexity__is_set = true;
    }

    protected void setComplexity(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, complexity__typeInfo)) {
        setComplexity((com.sforce.soap.metadata.Complexity)__typeMapper.readObject(__in, complexity__typeInfo, com.sforce.soap.metadata.Complexity.class));
      }
    }

    /**
     * element : expiration of type {http://soap.sforce.com/2006/04/metadata}Expiration
     * java type: com.sforce.soap.metadata.Expiration
     */
    private static final com.sforce.ws.bind.TypeInfo expiration__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","expiration","http://soap.sforce.com/2006/04/metadata","Expiration",0,1,true);

    private boolean expiration__is_set = false;

    private com.sforce.soap.metadata.Expiration expiration;

    public com.sforce.soap.metadata.Expiration getExpiration() {
      return expiration;
    }

    public void setExpiration(com.sforce.soap.metadata.Expiration expiration) {
      this.expiration = expiration;
      expiration__is_set = true;
    }

    protected void setExpiration(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, expiration__typeInfo)) {
        setExpiration((com.sforce.soap.metadata.Expiration)__typeMapper.readObject(__in, expiration__typeInfo, com.sforce.soap.metadata.Expiration.class));
      }
    }

    /**
     * element : historyRestriction of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo historyRestriction__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","historyRestriction","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean historyRestriction__is_set = false;

    private java.lang.String historyRestriction;

    public java.lang.String getHistoryRestriction() {
      return historyRestriction;
    }

    public void setHistoryRestriction(java.lang.String historyRestriction) {
      this.historyRestriction = historyRestriction;
      historyRestriction__is_set = true;
    }

    protected void setHistoryRestriction(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, historyRestriction__typeInfo)) {
        setHistoryRestriction(__typeMapper.readString(__in, historyRestriction__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : lockoutInterval of type {http://soap.sforce.com/2006/04/metadata}LockoutInterval
     * java type: com.sforce.soap.metadata.LockoutInterval
     */
    private static final com.sforce.ws.bind.TypeInfo lockoutInterval__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","lockoutInterval","http://soap.sforce.com/2006/04/metadata","LockoutInterval",0,1,true);

    private boolean lockoutInterval__is_set = false;

    private com.sforce.soap.metadata.LockoutInterval lockoutInterval;

    public com.sforce.soap.metadata.LockoutInterval getLockoutInterval() {
      return lockoutInterval;
    }

    public void setLockoutInterval(com.sforce.soap.metadata.LockoutInterval lockoutInterval) {
      this.lockoutInterval = lockoutInterval;
      lockoutInterval__is_set = true;
    }

    protected void setLockoutInterval(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, lockoutInterval__typeInfo)) {
        setLockoutInterval((com.sforce.soap.metadata.LockoutInterval)__typeMapper.readObject(__in, lockoutInterval__typeInfo, com.sforce.soap.metadata.LockoutInterval.class));
      }
    }

    /**
     * element : maxLoginAttempts of type {http://soap.sforce.com/2006/04/metadata}MaxLoginAttempts
     * java type: com.sforce.soap.metadata.MaxLoginAttempts
     */
    private static final com.sforce.ws.bind.TypeInfo maxLoginAttempts__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","maxLoginAttempts","http://soap.sforce.com/2006/04/metadata","MaxLoginAttempts",0,1,true);

    private boolean maxLoginAttempts__is_set = false;

    private com.sforce.soap.metadata.MaxLoginAttempts maxLoginAttempts;

    public com.sforce.soap.metadata.MaxLoginAttempts getMaxLoginAttempts() {
      return maxLoginAttempts;
    }

    public void setMaxLoginAttempts(com.sforce.soap.metadata.MaxLoginAttempts maxLoginAttempts) {
      this.maxLoginAttempts = maxLoginAttempts;
      maxLoginAttempts__is_set = true;
    }

    protected void setMaxLoginAttempts(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, maxLoginAttempts__typeInfo)) {
        setMaxLoginAttempts((com.sforce.soap.metadata.MaxLoginAttempts)__typeMapper.readObject(__in, maxLoginAttempts__typeInfo, com.sforce.soap.metadata.MaxLoginAttempts.class));
      }
    }

    /**
     * element : minimumPasswordLength of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo minimumPasswordLength__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","minimumPasswordLength","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean minimumPasswordLength__is_set = false;

    private java.lang.String minimumPasswordLength;

    public java.lang.String getMinimumPasswordLength() {
      return minimumPasswordLength;
    }

    public void setMinimumPasswordLength(java.lang.String minimumPasswordLength) {
      this.minimumPasswordLength = minimumPasswordLength;
      minimumPasswordLength__is_set = true;
    }

    protected void setMinimumPasswordLength(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, minimumPasswordLength__typeInfo)) {
        setMinimumPasswordLength(__typeMapper.readString(__in, minimumPasswordLength__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : minimumPasswordLifetime of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo minimumPasswordLifetime__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","minimumPasswordLifetime","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean minimumPasswordLifetime__is_set = false;

    private boolean minimumPasswordLifetime;

    public boolean getMinimumPasswordLifetime() {
      return minimumPasswordLifetime;
    }

    public boolean isMinimumPasswordLifetime() {
      return minimumPasswordLifetime;
    }

    public void setMinimumPasswordLifetime(boolean minimumPasswordLifetime) {
      this.minimumPasswordLifetime = minimumPasswordLifetime;
      minimumPasswordLifetime__is_set = true;
    }

    protected void setMinimumPasswordLifetime(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, minimumPasswordLifetime__typeInfo)) {
        setMinimumPasswordLifetime(__typeMapper.readBoolean(__in, minimumPasswordLifetime__typeInfo, boolean.class));
      }
    }

    /**
     * element : obscureSecretAnswer of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private static final com.sforce.ws.bind.TypeInfo obscureSecretAnswer__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","obscureSecretAnswer","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

    private boolean obscureSecretAnswer__is_set = false;

    private boolean obscureSecretAnswer;

    public boolean getObscureSecretAnswer() {
      return obscureSecretAnswer;
    }

    public boolean isObscureSecretAnswer() {
      return obscureSecretAnswer;
    }

    public void setObscureSecretAnswer(boolean obscureSecretAnswer) {
      this.obscureSecretAnswer = obscureSecretAnswer;
      obscureSecretAnswer__is_set = true;
    }

    protected void setObscureSecretAnswer(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, obscureSecretAnswer__typeInfo)) {
        setObscureSecretAnswer(__typeMapper.readBoolean(__in, obscureSecretAnswer__typeInfo, boolean.class));
      }
    }

    /**
     * element : passwordAssistanceMessage of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo passwordAssistanceMessage__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","passwordAssistanceMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean passwordAssistanceMessage__is_set = false;

    private java.lang.String passwordAssistanceMessage;

    public java.lang.String getPasswordAssistanceMessage() {
      return passwordAssistanceMessage;
    }

    public void setPasswordAssistanceMessage(java.lang.String passwordAssistanceMessage) {
      this.passwordAssistanceMessage = passwordAssistanceMessage;
      passwordAssistanceMessage__is_set = true;
    }

    protected void setPasswordAssistanceMessage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, passwordAssistanceMessage__typeInfo)) {
        setPasswordAssistanceMessage(__typeMapper.readString(__in, passwordAssistanceMessage__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : passwordAssistanceURL of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo passwordAssistanceURL__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","passwordAssistanceURL","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean passwordAssistanceURL__is_set = false;

    private java.lang.String passwordAssistanceURL;

    public java.lang.String getPasswordAssistanceURL() {
      return passwordAssistanceURL;
    }

    public void setPasswordAssistanceURL(java.lang.String passwordAssistanceURL) {
      this.passwordAssistanceURL = passwordAssistanceURL;
      passwordAssistanceURL__is_set = true;
    }

    protected void setPasswordAssistanceURL(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, passwordAssistanceURL__typeInfo)) {
        setPasswordAssistanceURL(__typeMapper.readString(__in, passwordAssistanceURL__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : questionRestriction of type {http://soap.sforce.com/2006/04/metadata}QuestionRestriction
     * java type: com.sforce.soap.metadata.QuestionRestriction
     */
    private static final com.sforce.ws.bind.TypeInfo questionRestriction__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","questionRestriction","http://soap.sforce.com/2006/04/metadata","QuestionRestriction",0,1,true);

    private boolean questionRestriction__is_set = false;

    private com.sforce.soap.metadata.QuestionRestriction questionRestriction;

    public com.sforce.soap.metadata.QuestionRestriction getQuestionRestriction() {
      return questionRestriction;
    }

    public void setQuestionRestriction(com.sforce.soap.metadata.QuestionRestriction questionRestriction) {
      this.questionRestriction = questionRestriction;
      questionRestriction__is_set = true;
    }

    protected void setQuestionRestriction(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, questionRestriction__typeInfo)) {
        setQuestionRestriction((com.sforce.soap.metadata.QuestionRestriction)__typeMapper.readObject(__in, questionRestriction__typeInfo, com.sforce.soap.metadata.QuestionRestriction.class));
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
       __typeMapper.writeString(__out, apiOnlyUserHomePageURL__typeInfo, apiOnlyUserHomePageURL, apiOnlyUserHomePageURL__is_set);
       __typeMapper.writeObject(__out, complexity__typeInfo, complexity, complexity__is_set);
       __typeMapper.writeObject(__out, expiration__typeInfo, expiration, expiration__is_set);
       __typeMapper.writeString(__out, historyRestriction__typeInfo, historyRestriction, historyRestriction__is_set);
       __typeMapper.writeObject(__out, lockoutInterval__typeInfo, lockoutInterval, lockoutInterval__is_set);
       __typeMapper.writeObject(__out, maxLoginAttempts__typeInfo, maxLoginAttempts, maxLoginAttempts__is_set);
       __typeMapper.writeString(__out, minimumPasswordLength__typeInfo, minimumPasswordLength, minimumPasswordLength__is_set);
       __typeMapper.writeBoolean(__out, minimumPasswordLifetime__typeInfo, minimumPasswordLifetime, minimumPasswordLifetime__is_set);
       __typeMapper.writeBoolean(__out, obscureSecretAnswer__typeInfo, obscureSecretAnswer, obscureSecretAnswer__is_set);
       __typeMapper.writeString(__out, passwordAssistanceMessage__typeInfo, passwordAssistanceMessage, passwordAssistanceMessage__is_set);
       __typeMapper.writeString(__out, passwordAssistanceURL__typeInfo, passwordAssistanceURL, passwordAssistanceURL__is_set);
       __typeMapper.writeObject(__out, questionRestriction__typeInfo, questionRestriction, questionRestriction__is_set);
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
        setApiOnlyUserHomePageURL(__in, __typeMapper);
        setComplexity(__in, __typeMapper);
        setExpiration(__in, __typeMapper);
        setHistoryRestriction(__in, __typeMapper);
        setLockoutInterval(__in, __typeMapper);
        setMaxLoginAttempts(__in, __typeMapper);
        setMinimumPasswordLength(__in, __typeMapper);
        setMinimumPasswordLifetime(__in, __typeMapper);
        setObscureSecretAnswer(__in, __typeMapper);
        setPasswordAssistanceMessage(__in, __typeMapper);
        setPasswordAssistanceURL(__in, __typeMapper);
        setQuestionRestriction(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[PasswordPolicies ");
      sb.append(" apiOnlyUserHomePageURL='").append(com.sforce.ws.util.Verbose.toString(apiOnlyUserHomePageURL)).append("'\n");
      sb.append(" complexity='").append(com.sforce.ws.util.Verbose.toString(complexity)).append("'\n");
      sb.append(" expiration='").append(com.sforce.ws.util.Verbose.toString(expiration)).append("'\n");
      sb.append(" historyRestriction='").append(com.sforce.ws.util.Verbose.toString(historyRestriction)).append("'\n");
      sb.append(" lockoutInterval='").append(com.sforce.ws.util.Verbose.toString(lockoutInterval)).append("'\n");
      sb.append(" maxLoginAttempts='").append(com.sforce.ws.util.Verbose.toString(maxLoginAttempts)).append("'\n");
      sb.append(" minimumPasswordLength='").append(com.sforce.ws.util.Verbose.toString(minimumPasswordLength)).append("'\n");
      sb.append(" minimumPasswordLifetime='").append(com.sforce.ws.util.Verbose.toString(minimumPasswordLifetime)).append("'\n");
      sb.append(" obscureSecretAnswer='").append(com.sforce.ws.util.Verbose.toString(obscureSecretAnswer)).append("'\n");
      sb.append(" passwordAssistanceMessage='").append(com.sforce.ws.util.Verbose.toString(passwordAssistanceMessage)).append("'\n");
      sb.append(" passwordAssistanceURL='").append(com.sforce.ws.util.Verbose.toString(passwordAssistanceURL)).append("'\n");
      sb.append(" questionRestriction='").append(com.sforce.ws.util.Verbose.toString(questionRestriction)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
