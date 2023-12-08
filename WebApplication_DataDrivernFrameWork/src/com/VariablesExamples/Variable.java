package com.VariablesExamples;

public class Variable {
	
	public static void main(String [] args)
	{
		// System.out.println(" This is a Java Program to Learn Variables Concept ");
		
		// Syntax: dataType variableName=value
		
		byte byteVariable=20;
		
		//System.out.println(" The value of the variable byteVariable is :- ");
		//System.out.println(byteVariable);
		
		System.out.println(" The value of the variable byteVariable is :- "+byteVariable);
		
		byteVariable=30;
		System.out.println(" The value of the variable byteVariable is :- "+byteVariable);
		
		// A variable should be declared with a dataType
		// Its not mandatroy to assign a value to a variableName
		// Once a variable is declared with a dataType , and if the same variableName is used
		//      else where in the Java Class - that variableName need not be declread again
		//  Variable is capable of storing only one value at a time
		// variable will always hold the latest value assigned into it
		// variable is a Temp Memory storage location
		
		short shortVariable=100;
		System.out.println(" The value of the variable shortVariable is :- "+shortVariable);
		
		long longVariable=500; 
		System.out.println(" The value of the variable longVariable is :- "+longVariable);
		
		int intVariable=60;	
		System.out.println(" The value of the variable intVariable is :- "+intVariable);
		
		double doubleVariable=70.123456789123456789;
		System.out.println(" The value of the variable doubleVariable is :- "+doubleVariable);
		
		float floatVariable=70.123451f;
		System.out.println(" The value of the variable floatVariable is :- "+floatVariable);
		
		char charVariable='A';
		System.out.println(" The value of the variable charVariable is :- "+charVariable);
		
		float asciiVariable='A';
		System.out.println(" The value of the variable asciiVariable is :- "+asciiVariable);
		
		String junkVariable="lkjlkj4565456#$#$#$";
		System.out.println(" The value of the variable junkVariable is :- "+junkVariable);
				
		String var="20";
		System.out.println(" The value of the variable var is :- "+var);
		
		String stringVariable="abcd";
		System.out.println("value of string Variable "+stringVariable);
		
		String groupOfWords="This is my Selenium WebDriver Scrpit Learning Process implementing Java Programing language";
		System.out.println(" The value of the variable groupOfWords is :- "+groupOfWords);
		
		String value="true";
		System.out.println(" The value of the variable value is :- "+value);
		
		boolean booleanVariable=true;
		 booleanVariable=false;
		
	System.out.println(" The value of the variable booleanVariable is :- "+booleanVariable);
		
		
		
	}

}

