package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum ApexCodeUnitStatus {


  
	/**
	 * Enumeration  : Inactive
	 */
	Inactive("Inactive"),

  
	/**
	 * Enumeration  : Active
	 */
	Active("Active"),

  
	/**
	 * Enumeration  : Deleted
	 */
	Deleted("Deleted"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (ApexCodeUnitStatus e : EnumSet.allOf(ApexCodeUnitStatus.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private ApexCodeUnitStatus(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
