package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum ActionLinkExecutionsAllowed {


  
	/**
	 * Enumeration  : Once
	 */
	Once("Once"),

  
	/**
	 * Enumeration  : OncePerUser
	 */
	OncePerUser("OncePerUser"),

  
	/**
	 * Enumeration  : Unlimited
	 */
	Unlimited("Unlimited"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (ActionLinkExecutionsAllowed e : EnumSet.allOf(ActionLinkExecutionsAllowed.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private ActionLinkExecutionsAllowed(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
