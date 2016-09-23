package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum FeedItemDisplayFormat {


  
	/**
	 * Enumeration  : Default
	 */
	Default("Default"),

  
	/**
	 * Enumeration  : HideBlankLines
	 */
	HideBlankLines("HideBlankLines"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (FeedItemDisplayFormat e : EnumSet.allOf(FeedItemDisplayFormat.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private FeedItemDisplayFormat(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
