package com.JumpStatementsExamples;

public class ContinueExample {

	public static void main(String[]args) {
	
		for(int i=2;i<=4; i++)
		{	
			System.out.println(i+ "Selenium");
			if(i<=3)
			{
				System.out.println(i+ "webdriver");
				continue;
				// will skip the current statements and will be continued
		        // rest of the iterations based on the condition
			}
			System.out.println("@@@@@@@@@@@@@@@@");
		}
	
		for(int i=1;i<=3;i++)
		{
			System.out.println(i+" Selenium ");
			if(i==3)
			{
				System.out.println(i+" WebDriver ");
				continue;
			}
			System.out.println(i+" LoadRunner ");
			
		}
	}
	
		
	
}
