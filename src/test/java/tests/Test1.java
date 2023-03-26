package tests;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Test1 {
	
	@Test
	public void method1() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		RemoteWebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
		
	
	}

}
