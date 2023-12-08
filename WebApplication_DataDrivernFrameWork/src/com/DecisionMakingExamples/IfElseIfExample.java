package com.DecisionMakingExamples;

public class IfElseIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 if(condition)
		 {
		 Statements/Statement
		 }
		 else
		 if(condition)
		 {
		 statement/statements
		 }
		 else */
		
		int var1=5;
		int var2=2;
		int var3=6;
		
		if(var1>var2 && var1>var3)
		{
			System.out.println("var1 is greater" );
		
		}
		else
			if(var2>var3)
			{
				System.out.println("var2 is greater ");
			}
			else
			{
				System.out.println("var3 greater");
			}
		}
			
	}

