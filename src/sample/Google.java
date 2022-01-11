package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Google {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//it will open the goggle page
		driver.get("http://google.com"); 
		//we expect the title “Google “ should be present 
		String Expectedtitle = "Google";
		//it will fetch the actual title 
		String Actualtitle = driver.getTitle();
		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
		//it will compare actual title and expected title
		Assert.assertEquals(Actualtitle, Expectedtitle);
		//print out the result
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
		driver.quit();
		
	}

}
