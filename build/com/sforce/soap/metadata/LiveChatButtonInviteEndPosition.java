package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum LiveChatButtonInviteEndPosition {


  
	/**
	 * Enumeration  : TopLeft
	 */
	TopLeft("TopLeft"),

  
	/**
	 * Enumeration  : Top
	 */
	Top("Top"),

  
	/**
	 * Enumeration  : TopRight
	 */
	TopRight("TopRight"),

  
	/**
	 * Enumeration  : Left
	 */
	Left("Left"),

  
	/**
	 * Enumeration  : Center
	 */
	Center("Center"),

  
	/**
	 * Enumeration  : Right
	 */
	Right("Right"),

  
	/**
	 * Enumeration  : BottomLeft
	 */
	BottomLeft("BottomLeft"),

  
	/**
	 * Enumeration  : Bottom
	 */
	Bottom("Bottom"),

  
	/**
	 * Enumeration  : BottomRight
	 */
	BottomRight("BottomRight"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (LiveChatButtonInviteEndPosition e : EnumSet.allOf(LiveChatButtonInviteEndPosition.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private LiveChatButtonInviteEndPosition(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
