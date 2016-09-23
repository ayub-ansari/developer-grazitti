package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public class ListViewRecord implements com.sforce.ws.bind.XMLizable , IListViewRecord{

    /**
     * Constructor
     */
    public ListViewRecord() {}

    /**
     * element : columns of type {urn:partner.soap.sforce.com}ListViewRecordColumn
     * java type: com.sforce.soap.partner.ListViewRecordColumn[]
     */
    private static final com.sforce.ws.bind.TypeInfo columns__typeInfo =
      new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","columns","urn:partner.soap.sforce.com","ListViewRecordColumn",1,-1,true);

    private boolean columns__is_set = false;

    private com.sforce.soap.partner.ListViewRecordColumn[] columns = new com.sforce.soap.partner.ListViewRecordColumn[0];

    @Override
    public com.sforce.soap.partner.ListViewRecordColumn[] getColumns() {
      return columns;
    }

    @Override
    public void setColumns(com.sforce.soap.partner.IListViewRecordColumn[] columns) {
      this.columns = castArray(com.sforce.soap.partner.ListViewRecordColumn.class, columns);
      columns__is_set = true;
    }

    protected void setColumns(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, columns__typeInfo)) {
        setColumns((com.sforce.soap.partner.ListViewRecordColumn[])__typeMapper.readObject(__in, columns__typeInfo, com.sforce.soap.partner.ListViewRecordColumn[].class));
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
       __typeMapper.writeObject(__out, columns__typeInfo, columns, columns__is_set);
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
        setColumns(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[ListViewRecord ");
      sb.append(" columns='").append(com.sforce.ws.util.Verbose.toString(columns)).append("'\n");
      sb.append("]\n");
      return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private <T,U> T[] castArray(Class<T> clazz, U[] array) {
        if (array == null) {
            return null;
        }
        T[] retVal = (T[]) java.lang.reflect.Array.newInstance(clazz, array.length);
        for (int i=0; i < array.length; i++) {
            retVal[i] = (T)array[i];
        }

        return retVal;
	}
}
