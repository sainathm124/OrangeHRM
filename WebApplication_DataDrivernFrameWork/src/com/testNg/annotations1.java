package com.testNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class annotations1 {
	@AfterTest
	public void Launchingthebowser() 
	{
	System.out.println("*********successfully Bwoser Launched********");	
	}
	@Test(priority=1,description="Gmail application Login")
	public void GmailLogin()
	{
		System.out.println("Gmail application Login");
	}
	@Test(enabled=false,description="Gmail application Composing")
	public void GmailApplicationcomposingmail() 
	{
		System.out.println("Gmail application composing ");
	}
	@Test(priority=3,description="Gmail application Draft")
	public void GmailapplicationDrafmail() 
	{
	System.out.println("Gmail application Draft ");	
	}
	@Test(priority=3,description="Gmail application SentItems")
	public void GmailApplicationSentmail() 
	{
	System.out.println("Gmail application SentItems");	
	}
	@AfterTest
	public void GmailApplicationClose() 
	{
	System.out.println("Application Gmail Closed");	
	}
}
