package com.StringComparision;

public class StringComparisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1="LiveTech";
		String string2="LiveTech";
	
		if(string1.equals(string2))
		{
			System.out.println("string1 variable value is EQUAL to String2 variable Value");
		}else
		{
			System.out.println("\"string1 variable value is NOT EQUAL to String2 variable Value\"");
		}
		System.out.println(" ########################################## ");
		System.out.println();
		
		String string3="LiveTech";
		String string4="Livetech";
		if(string3.equals(string4))
		{
			System.out.println(" string3 variable value is EQUAL to string4 variable value ");
		}
		else
		{
			System.out.println(" string3 variable value is NOT EQUAL to string4 variable value ");
		}
		

		System.out.println(" ########################################## ");
		System.out.println();
		
		
		String string5="LiveTech"; // expected text - client
		String string6="LIVETECH"; // actual text - developer developed
		if(string6.equalsIgnoreCase(string5))
		{
			System.out.println(" string6 variable value is EQUAL to string5 variable value ");
		}
		else
		{
			System.out.println(" string6 variable value is NOT EQUAL to string5 variable value ");
		}
		
		
		String string7="LiveTech"; // expected text - client
		String string8="Tech"; // actual text - developer developed
		
		if(string8.contains(string7))
		{
			System.out.println(" String8 variable value Contains String7 variable value ");
		}
		else
		{
			System.out.println(" String8 variable value Does NOT Contains String7 variable value ");
		}
		
		
		System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$$$44 ");
		
		
		
		String string9="LiveTech"; // expected text - client
		String string10="Tech"; // actual text - developer developed
		
		if(string9.contains(string10))
		{
			System.out.println(" String9 variable value Contains String10 variable value ");
		}
		else
		{
			System.out.println(" String9 variable value Does NOT Contains String10 variable value ");
		}
		
	}

}
