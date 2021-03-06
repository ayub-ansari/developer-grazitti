package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum PlatformActionListContext {


  
	/**
	 * Enumeration  : ListView
	 */
	ListView("ListView"),

  
	/**
	 * Enumeration  : RelatedList
	 */
	RelatedList("RelatedList"),

  
	/**
	 * Enumeration  : ListViewRecord
	 */
	ListViewRecord("ListViewRecord"),

  
	/**
	 * Enumeration  : RelatedListRecord
	 */
	RelatedListRecord("RelatedListRecord"),

  
	/**
	 * Enumeration  : Record
	 */
	Record("Record"),

  
	/**
	 * Enumeration  : FeedElement
	 */
	FeedElement("FeedElement"),

  
	/**
	 * Enumeration  : Chatter
	 */
	Chatter("Chatter"),

  
	/**
	 * Enumeration  : Global
	 */
	Global("Global"),

  
	/**
	 * Enumeration  : Flexipage
	 */
	Flexipage("Flexipage"),

  
	/**
	 * Enumeration  : MruList
	 */
	MruList("MruList"),

  
	/**
	 * Enumeration  : MruRow
	 */
	MruRow("MruRow"),

  
	/**
	 * Enumeration  : RecordEdit
	 */
	RecordEdit("RecordEdit"),

  
	/**
	 * Enumeration  : Photo
	 */
	Photo("Photo"),

  
	/**
	 * Enumeration  : BannerPhoto
	 */
	BannerPhoto("BannerPhoto"),

  
	/**
	 * Enumeration  : ObjectHomeChart
	 */
	ObjectHomeChart("ObjectHomeChart"),

  
	/**
	 * Enumeration  : ListViewDefinition
	 */
	ListViewDefinition("ListViewDefinition"),

  
	/**
	 * Enumeration  : Dockable
	 */
	Dockable("Dockable"),

  
	/**
	 * Enumeration  : Lookup
	 */
	Lookup("Lookup"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (PlatformActionListContext e : EnumSet.allOf(PlatformActionListContext.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private PlatformActionListContext(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
