package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRCT_HomePage_HeaderBlock_LinksCount {

	public static void main(String[] args) {
		
		//Automating the Browser
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		//Navigating to TRSRTC With URL
		String ApplicationURLAddress="https://www.tsrtconline.in/oprs-web/";
		driver.get(ApplicationURLAddress);
		
		//Identifying the Header Block of the Application
		//<div class="menu-wrap">
		//Locator Class; Selector = "menu-wrap"
		 By tsrtc_HeaderblockProperty=By.className("menu-wrap");
		 WebElement tsrtc_Headerblock=driver.findElement(tsrtc_HeaderblockProperty);
		 
		 //Identifying the properties of elements of the Header Block
		
	  /*<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
		<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
		<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
		<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
		<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
		<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> --></div>*/
		
		By headerBlockLinksProperty=By.tagName("a");
		
		//Goto Header Block and find the Elements of the Header Block
		List<WebElement> tsrtc_HeaderBlockLinks =tsrtc_Headerblock.findElements(headerBlockLinksProperty);
		
		//Number of Elements Stored in the array of List(tsrtc_HeaderBlockLinks)
		int tsrtc_HeaderBlockLinks_Count=tsrtc_HeaderBlockLinks.size();
		System.out.println("The Number of Links in the Header Block of TSRTC Application is : "+tsrtc_HeaderBlockLinks_Count);
		
		driver.quit();
		
				
	}
}
