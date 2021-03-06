package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum APIAccessLevel {


  
	/**
	 * Enumeration  : Unrestricted
	 */
	Unrestricted("Unrestricted"),

  
	/**
	 * Enumeration  : Restricted
	 */
	Restricted("Restricted"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (APIAccessLevel e : EnumSet.allOf(APIAccessLevel.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private APIAccessLevel(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
