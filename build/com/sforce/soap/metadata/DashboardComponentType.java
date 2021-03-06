package com.sforce.soap.metadata;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum DashboardComponentType {


  
	/**
	 * Enumeration  : Bar
	 */
	Bar("Bar"),

  
	/**
	 * Enumeration  : BarGrouped
	 */
	BarGrouped("BarGrouped"),

  
	/**
	 * Enumeration  : BarStacked
	 */
	BarStacked("BarStacked"),

  
	/**
	 * Enumeration  : BarStacked100
	 */
	BarStacked100("BarStacked100"),

  
	/**
	 * Enumeration  : Column
	 */
	Column("Column"),

  
	/**
	 * Enumeration  : ColumnGrouped
	 */
	ColumnGrouped("ColumnGrouped"),

  
	/**
	 * Enumeration  : ColumnStacked
	 */
	ColumnStacked("ColumnStacked"),

  
	/**
	 * Enumeration  : ColumnStacked100
	 */
	ColumnStacked100("ColumnStacked100"),

  
	/**
	 * Enumeration  : Line
	 */
	Line("Line"),

  
	/**
	 * Enumeration  : LineGrouped
	 */
	LineGrouped("LineGrouped"),

  
	/**
	 * Enumeration  : Pie
	 */
	Pie("Pie"),

  
	/**
	 * Enumeration  : Table
	 */
	Table("Table"),

  
	/**
	 * Enumeration  : Metric
	 */
	Metric("Metric"),

  
	/**
	 * Enumeration  : Gauge
	 */
	Gauge("Gauge"),

  
	/**
	 * Enumeration  : LineCumulative
	 */
	LineCumulative("LineCumulative"),

  
	/**
	 * Enumeration  : LineGroupedCumulative
	 */
	LineGroupedCumulative("LineGroupedCumulative"),

  
	/**
	 * Enumeration  : Scontrol
	 */
	Scontrol("Scontrol"),

  
	/**
	 * Enumeration  : VisualforcePage
	 */
	VisualforcePage("VisualforcePage"),

  
	/**
	 * Enumeration  : Donut
	 */
	Donut("Donut"),

  
	/**
	 * Enumeration  : Funnel
	 */
	Funnel("Funnel"),

  
	/**
	 * Enumeration  : ColumnLine
	 */
	ColumnLine("ColumnLine"),

  
	/**
	 * Enumeration  : ColumnLineGrouped
	 */
	ColumnLineGrouped("ColumnLineGrouped"),

  
	/**
	 * Enumeration  : ColumnLineStacked
	 */
	ColumnLineStacked("ColumnLineStacked"),

  
	/**
	 * Enumeration  : ColumnLineStacked100
	 */
	ColumnLineStacked100("ColumnLineStacked100"),

  
	/**
	 * Enumeration  : Scatter
	 */
	Scatter("Scatter"),

  
	/**
	 * Enumeration  : ScatterGrouped
	 */
	ScatterGrouped("ScatterGrouped"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (DashboardComponentType e : EnumSet.allOf(DashboardComponentType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private DashboardComponentType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
