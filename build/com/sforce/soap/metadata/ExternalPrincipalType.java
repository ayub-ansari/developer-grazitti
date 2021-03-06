package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum ExternalPrincipalType {


  
	/**
	 * Enumeration  : Anonymous
	 */
	Anonymous("Anonymous"),

  
	/**
	 * Enumeration  : PerUser
	 */
	PerUser("PerUser"),

  
	/**
	 * Enumeration  : NamedUser
	 */
	NamedUser("NamedUser"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (ExternalPrincipalType e : EnumSet.allOf(ExternalPrincipalType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private ExternalPrincipalType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
