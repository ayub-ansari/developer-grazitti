package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum SamlType {


  
	/**
	 * Enumeration  : SAML1_1
	 */
	SAML1_1("SAML1_1"),

  
	/**
	 * Enumeration  : SAML2_0
	 */
	SAML2_0("SAML2_0"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (SamlType e : EnumSet.allOf(SamlType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private SamlType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
