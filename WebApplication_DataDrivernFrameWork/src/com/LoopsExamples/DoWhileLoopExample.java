package com.LoopsExamples;

public class DoWhileLoopExample {
	
	public static void main(String []args) {
	
int index=2;
		
		do
		{
			System.out.println(index+ " WebDriver ");
			index=index+1;
			System.out.println(" The value of the  Index is :- "+index);
			
		}while(index>=6);
		
		System.out.println(" The index value is :- "+index );
		System.out.println(" **************************** ");
		
		
		do
		{
			System.out.println(index+ " Selenium ");
			index=index+1;
		//	System.out.println(" The value of the  Index is :- "+index);
			
		}while(index<=6);
	}
}