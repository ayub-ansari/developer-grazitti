package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum AuthenticationProtocol {


  
	/**
	 * Enumeration  : NoAuthentication
	 */
	NoAuthentication("NoAuthentication"),

  
	/**
	 * Enumeration  : Oauth
	 */
	Oauth("Oauth"),

  
	/**
	 * Enumeration  : Password
	 */
	Password("Password"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (AuthenticationProtocol e : EnumSet.allOf(AuthenticationProtocol.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private AuthenticationProtocol(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
