package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface IDescribeLayoutRow  {

      /**
       * element : layoutItems of type {urn:partner.soap.sforce.com}DescribeLayoutItem
       * java type: com.sforce.soap.partner.DescribeLayoutItem[]
       */

      public com.sforce.soap.partner.IDescribeLayoutItem[] getLayoutItems();

      public void setLayoutItems(com.sforce.soap.partner.IDescribeLayoutItem[] layoutItems);

      /**
       * element : numItems of type {http://www.w3.org/2001/XMLSchema}int
       * java type: int
       */

      public int getNumItems();

      public void setNumItems(int numItems);


}
