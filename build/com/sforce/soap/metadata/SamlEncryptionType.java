package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum SamlEncryptionType {


  
	/**
	 * Enumeration  : AES_128
	 */
	AES_128("AES_128"),

  
	/**
	 * Enumeration  : AES_256
	 */
	AES_256("AES_256"),

  
	/**
	 * Enumeration  : Triple_Des
	 */
	Triple_Des("Triple_Des"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (SamlEncryptionType e : EnumSet.allOf(SamlEncryptionType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private SamlEncryptionType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
