package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart_Test {
	
	@Test(groups = "smoke")
	public void m1_Test() {
		System.out.println("Hiii from Flipkart");
	}
	
	@Test(groups = "system")
	public void goToTheApplication_Test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.quit();
	}
}
