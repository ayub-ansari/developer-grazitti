package com.sforce.soap.apex;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class CompileIssue implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public CompileIssue() {}

    /**
     * element : column of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo column__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/08/apex","column","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean column__is_set = false;

    private int column;

    public int getColumn() {
      return column;
    }

    public void setColumn(int column) {
      this.column = column;
      column__is_set = true;
    }

    protected void setColumn(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, column__typeInfo)) {
        setColumn((int)__typeMapper.readInt(__in, column__typeInfo, int.class));
      }
    }

    /**
     * element : line of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo line__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/08/apex","line","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean line__is_set = false;

    private int line;

    public int getLine() {
      return line;
    }

    public void setLine(int line) {
      this.line = line;
      line__is_set = true;
    }

    protected void setLine(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, line__typeInfo)) {
        setLine((int)__typeMapper.readInt(__in, line__typeInfo, int.class));
      }
    }

    /**
     * element : message of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo message__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/08/apex","message","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean message__is_set = false;

    private java.lang.String message;

    public java.lang.String getMessage() {
      return message;
    }

    public void setMessage(java.lang.String message) {
      this.message = message;
      message__is_set = true;
    }

    protected void setMessage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, message__typeInfo)) {
        setMessage(__typeMapper.readString(__in, message__typeInfo, java.lang.String.class));
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
       __typeMapper.writeInt(__out, column__typeInfo, column, column__is_set);
       __typeMapper.writeInt(__out, line__typeInfo, line, line__is_set);
       __typeMapper.writeString(__out, message__typeInfo, message, message__is_set);
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
        setColumn(__in, __typeMapper);
        setLine(__in, __typeMapper);
        setMessage(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[CompileIssue ");
      sb.append(" column='").append(com.sforce.ws.util.Verbose.toString(column)).append("'\n");
      sb.append(" line='").append(com.sforce.ws.util.Verbose.toString(line)).append("'\n");
      sb.append(" message='").append(com.sforce.ws.util.Verbose.toString(message)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
