package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum SamlSubjectType {


  
	/**
	 * Enumeration  : Username
	 */
	Username("Username"),

  
	/**
	 * Enumeration  : FederationId
	 */
	FederationId("FederationId"),

  
	/**
	 * Enumeration  : UserId
	 */
	UserId("UserId"),

  
	/**
	 * Enumeration  : SpokeId
	 */
	SpokeId("SpokeId"),

  
	/**
	 * Enumeration  : CustomAttribute
	 */
	CustomAttribute("CustomAttribute"),

  
	/**
	 * Enumeration  : PersistentId
	 */
	PersistentId("PersistentId"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (SamlSubjectType e : EnumSet.allOf(SamlSubjectType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private SamlSubjectType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
