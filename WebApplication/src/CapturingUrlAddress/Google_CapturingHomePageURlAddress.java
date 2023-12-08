package CapturingUrlAddress;


import org.openqa.selenium.chrome.ChromeDriver;

public class Google_CapturingHomePageURlAddress {
	public static void main(String[] args) {
				
	//Automating the Chrome browser browser
System.setProperty("webdriver.chrome.driver", "E:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	//Expected title shoould have google
		String Expectedtitle="google";
		System.out.println("The Expected title of current web page is : "+Expectedtitle);
	
	//client Url Address mentioned below
		String ApplicationUrl="http://google.com";
		System.out.println("The Expected Url Address is : " +ApplicationUrl);

		//Navigate to application url Address
		driver.navigate().to(ApplicationUrl);
	
	//getting the title of current page
		String Actualtiltle=driver.getTitle();
		System.out.println("The actual Title of current webpage is : " +Actualtiltle);
	
	//getting current page actaul URL Address
		String ActualUrlAddress=driver.getCurrentUrl();
		System.out.println("Actual URL address of Current page is: " +ActualUrlAddress);
	
	//as per client: Expected url address - should had google.com
	//Creating a variable to comapre with Actaul URL Address
		String ExpectedUrlContain="google.com";	
		System.out.println("The Expected Url Contains : "+ExpectedUrlContain);
		
		
	if(Actualtiltle.contains(Actualtiltle))
	{
		System.out.println("Actual title of webpage matched with expected: Pass");
	}
	else
	{
		System.out.println("Actual title of webpage Not Matched with expected: Fail");
	}

	if(ActualUrlAddress.contains(ExpectedUrlContain))
			{
			System.out.println("Actual web page Url Matched : Pass");
			}
	else
	{
		System.out.println("Actual web page Url Not Matched : Fail");
	}
	driver.close();
	
		
		
		
		
	}
	
}
