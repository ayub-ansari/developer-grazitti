package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum PageComponentType {


  
	/**
	 * Enumeration  : links
	 */
	links("links"),

  
	/**
	 * Enumeration  : htmlArea
	 */
	htmlArea("htmlArea"),

  
	/**
	 * Enumeration  : imageOrNote
	 */
	imageOrNote("imageOrNote"),

  
	/**
	 * Enumeration  : visualforcePage
	 */
	visualforcePage("visualforcePage"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (PageComponentType e : EnumSet.allOf(PageComponentType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private PageComponentType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
