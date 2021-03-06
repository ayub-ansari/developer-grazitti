package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum DeploymentStatus {


  
	/**
	 * Enumeration  : InDevelopment
	 */
	InDevelopment("InDevelopment"),

  
	/**
	 * Enumeration  : Deployed
	 */
	Deployed("Deployed"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (DeploymentStatus e : EnumSet.allOf(DeploymentStatus.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private DeploymentStatus(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
