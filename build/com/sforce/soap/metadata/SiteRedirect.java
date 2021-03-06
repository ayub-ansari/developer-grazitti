package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum SiteRedirect {


  
	/**
	 * Enumeration  : Permanent
	 */
	Permanent("Permanent"),

  
	/**
	 * Enumeration  : Temporary
	 */
	Temporary("Temporary"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (SiteRedirect e : EnumSet.allOf(SiteRedirect.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private SiteRedirect(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
