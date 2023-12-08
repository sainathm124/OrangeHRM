package com.DecisionMakingExamples;

public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/*
  		NestedIf
  		if(condition)
  		{
  		 Statement/Statements
  			if(condition)
  			{
  			Statement/Statements
  			}
  		}				*/
	
		int var1=30;
		int var2=25;
		int var3=10;
		
		if(var1>var2)
		{
			System.out.println("Var1 variable value is greater value");
				if (var2>var3) 
				{
				System.out.println("var2 variable value is greate than var3");
				
					if(var3>var1) 
					{
						System.out.println("The value of var3 is greater value");	
					}
			}
			
			
		}

	}
}
