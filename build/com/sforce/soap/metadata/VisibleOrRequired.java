package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum VisibleOrRequired {


  
	/**
	 * Enumeration  : VisibleOptional
	 */
	VisibleOptional("VisibleOptional"),

  
	/**
	 * Enumeration  : VisibleRequired
	 */
	VisibleRequired("VisibleRequired"),

  
	/**
	 * Enumeration  : NotVisible
	 */
	NotVisible("NotVisible"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (VisibleOrRequired e : EnumSet.allOf(VisibleOrRequired.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private VisibleOrRequired(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
