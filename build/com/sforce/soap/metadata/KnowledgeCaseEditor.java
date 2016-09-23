package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum KnowledgeCaseEditor {


  
	/**
	 * Enumeration  : simple
	 */
	simple("simple"),

  
	/**
	 * Enumeration  : standard
	 */
	standard("standard"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (KnowledgeCaseEditor e : EnumSet.allOf(KnowledgeCaseEditor.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private KnowledgeCaseEditor(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
