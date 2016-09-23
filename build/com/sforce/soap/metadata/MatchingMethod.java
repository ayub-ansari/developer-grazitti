package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum MatchingMethod {


  
	/**
	 * Enumeration  : Exact
	 */
	Exact("Exact"),

  
	/**
	 * Enumeration  : FirstName
	 */
	FirstName("FirstName"),

  
	/**
	 * Enumeration  : LastName
	 */
	LastName("LastName"),

  
	/**
	 * Enumeration  : CompanyName
	 */
	CompanyName("CompanyName"),

  
	/**
	 * Enumeration  : Phone
	 */
	Phone("Phone"),

  
	/**
	 * Enumeration  : City
	 */
	City("City"),

  
	/**
	 * Enumeration  : Street
	 */
	Street("Street"),

  
	/**
	 * Enumeration  : Zip
	 */
	Zip("Zip"),

  
	/**
	 * Enumeration  : Title
	 */
	Title("Title"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (MatchingMethod e : EnumSet.allOf(MatchingMethod.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private MatchingMethod(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
