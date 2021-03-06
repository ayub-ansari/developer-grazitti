package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum TestLevel {


  
	/**
	 * Enumeration  : NoTestRun
	 */
	NoTestRun("NoTestRun"),

  
	/**
	 * Enumeration  : RunSpecifiedTests
	 */
	RunSpecifiedTests("RunSpecifiedTests"),

  
	/**
	 * Enumeration  : RunLocalTests
	 */
	RunLocalTests("RunLocalTests"),

  
	/**
	 * Enumeration  : RunAllTestsInOrg
	 */
	RunAllTestsInOrg("RunAllTestsInOrg"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (TestLevel e : EnumSet.allOf(TestLevel.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private TestLevel(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
