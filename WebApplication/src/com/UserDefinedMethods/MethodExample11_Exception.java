package com.UserDefinedMethods;

public class MethodExample11_Exception {
	//User Defined Method
	protected void division() {
	try
	{
	    int	var1=30;
	    int var2=0;
	    int var3;
	    var3=var1/var2;
	    System.out.println("The Value of Var3 after division: "+var3);
	}
	catch(Exception divisionException)
	{
		System.out.println(divisionException);
	}
	}
	//calling User Defined Method with Main Method By Creating an Object
	public static void main(String[]args) {
		MethodExample11_Exception m11=new MethodExample11_Exception();
		m11.division();
	}
}
	
