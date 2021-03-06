package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface IFlowInterviewScreenField  {

      /**
       * element : choices of type {urn:partner.soap.sforce.com}FlowInterviewChoice
       * java type: com.sforce.soap.partner.FlowInterviewChoice[]
       */

      public com.sforce.soap.partner.IFlowInterviewChoice[] getChoices();

      public void setChoices(com.sforce.soap.partner.IFlowInterviewChoice[] choices);

      /**
       * element : dataType of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getDataType();

      public void setDataType(java.lang.String dataType);

      /**
       * element : errorMessages of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String[]
       */

      public java.lang.String[] getErrorMessages();

      public void setErrorMessages(java.lang.String[] errorMessages);

      /**
       * element : fieldType of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getFieldType();

      public void setFieldType(java.lang.String fieldType);

      /**
       * element : helpText of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getHelpText();

      public void setHelpText(java.lang.String helpText);

      /**
       * element : isRequired of type {http://www.w3.org/2001/XMLSchema}boolean
       * java type: boolean
       */

      public boolean getIsRequired();

      public boolean isIsRequired();

      public void setIsRequired(boolean isRequired);

      /**
       * element : isValidValue of type {http://www.w3.org/2001/XMLSchema}boolean
       * java type: boolean
       */

      public boolean getIsValidValue();

      public boolean isIsValidValue();

      public void setIsValidValue(boolean isValidValue);

      /**
       * element : label of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getLabel();

      public void setLabel(java.lang.String label);

      /**
       * element : name of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getName();

      public void setName(java.lang.String name);

      /**
       * element : value of type {http://www.w3.org/2001/XMLSchema}anyType
       * java type: java.lang.Object
       */

      public java.lang.Object getValue();

      public void setValue(java.lang.Object value);


}
