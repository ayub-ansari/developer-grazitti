package com.sforce.soap.partner;

/**
 * Generated by ComplexTypeCodeGenerator.java. Please do not edit.
 */
public interface IRenderEmailTemplateBodyResult  {

      /**
       * element : errors of type {urn:partner.soap.sforce.com}RenderEmailTemplateError
       * java type: com.sforce.soap.partner.RenderEmailTemplateError[]
       */

      public com.sforce.soap.partner.IRenderEmailTemplateError[] getErrors();

      public void setErrors(com.sforce.soap.partner.IRenderEmailTemplateError[] errors);

      /**
       * element : mergedBody of type {http://www.w3.org/2001/XMLSchema}string
       * java type: java.lang.String
       */

      public java.lang.String getMergedBody();

      public void setMergedBody(java.lang.String mergedBody);

      /**
       * element : success of type {http://www.w3.org/2001/XMLSchema}boolean
       * java type: boolean
       */

      public boolean getSuccess();

      public boolean isSuccess();

      public void setSuccess(boolean success);


}
