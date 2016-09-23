package com.sforce.soap.metadata;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ListPlacement implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ListPlacement() {}

    /**
     * element : height of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo height__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","height","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean height__is_set = false;

    private int height;

    public int getHeight() {
      return height;
    }

    public void setHeight(int height) {
      this.height = height;
      height__is_set = true;
    }

    protected void setHeight(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, height__typeInfo)) {
        setHeight((int)__typeMapper.readInt(__in, height__typeInfo, int.class));
      }
    }

    /**
     * element : location of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo location__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","location","http://www.w3.org/2001/XMLSchema","string",1,1,true);

    private boolean location__is_set = false;

    private java.lang.String location;

    public java.lang.String getLocation() {
      return location;
    }

    public void setLocation(java.lang.String location) {
      this.location = location;
      location__is_set = true;
    }

    protected void setLocation(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, location__typeInfo)) {
        setLocation(__typeMapper.readString(__in, location__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : units of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private static final com.sforce.ws.bind.TypeInfo units__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","units","http://www.w3.org/2001/XMLSchema","string",0,1,true);

    private boolean units__is_set = false;

    private java.lang.String units;

    public java.lang.String getUnits() {
      return units;
    }

    public void setUnits(java.lang.String units) {
      this.units = units;
      units__is_set = true;
    }

    protected void setUnits(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, units__typeInfo)) {
        setUnits(__typeMapper.readString(__in, units__typeInfo, java.lang.String.class));
      }
    }

    /**
     * element : width of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private static final com.sforce.ws.bind.TypeInfo width__typeInfo =
      new com.sforce.ws.bind.TypeInfo("http://soap.sforce.com/2006/04/metadata","width","http://www.w3.org/2001/XMLSchema","int",0,1,true);

    private boolean width__is_set = false;

    private int width;

    public int getWidth() {
      return width;
    }

    public void setWidth(int width) {
      this.width = width;
      width__is_set = true;
    }

    protected void setWidth(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, width__typeInfo)) {
        setWidth((int)__typeMapper.readInt(__in, width__typeInfo, int.class));
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
       __typeMapper.writeInt(__out, height__typeInfo, height, height__is_set);
       __typeMapper.writeString(__out, location__typeInfo, location, location__is_set);
       __typeMapper.writeString(__out, units__typeInfo, units, units__is_set);
       __typeMapper.writeInt(__out, width__typeInfo, width, width__is_set);
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
        setHeight(__in, __typeMapper);
        setLocation(__in, __typeMapper);
        setUnits(__in, __typeMapper);
        setWidth(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ListPlacement ");
      sb.append(" height='").append(com.sforce.ws.util.Verbose.toString(height)).append("'\n");
      sb.append(" location='").append(com.sforce.ws.util.Verbose.toString(location)).append("'\n");
      sb.append(" units='").append(com.sforce.ws.util.Verbose.toString(units)).append("'\n");
      sb.append(" width='").append(com.sforce.ws.util.Verbose.toString(width)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

}
