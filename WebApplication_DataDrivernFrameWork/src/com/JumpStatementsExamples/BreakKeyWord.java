package com.JumpStatementsExamples;

public class BreakKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=5;i++) 
		{
			System.out.println(i+ " selenium");
			if(i==3)
			{
				System.out.println(i+ " WebDriver");
				break;  
// Break Keyword immediately terminated the program execution right
//   away even if the condition is still true 
			}
			System.out.println("Load Runner");
		}
		
	}

}
