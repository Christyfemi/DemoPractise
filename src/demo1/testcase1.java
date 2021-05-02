package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
	 // i want to set up my location
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Christy\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		//driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		//Thread.sleep(3000L);
//		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("BABY COAT");
//		driver.findElement(By.cssSelector("#gh-ac")).click();
//		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Olufemi");
//		driver.findElement(By.linkText("register")).click();
//		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Adeniyi");
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.name("firstname")).sendKeys("Olufemi");
        //driver.findElement(By.name("lastname")).sendKeys("Adekomaya");
		// how to use ID
//		 driver.findElement(By.id("gh-ac")).click();
//		 driver.findElement(By.id("gh-ac")).sendKeys("Mr Saheriff");
		 //driver.findElement(By.linkText("Sign in")).click();
		 //driver.findElement(By.linkText("register")).click();
		 
		 //driver.findElement(By.name("Email")).sendKeys("femiadekomaya@yahoo.com");
		
		
		
		
		

		driver.findElement(By.id("gh-cat")).click(); // THIS IS TO ALLOW THE DROPDOWN TO COME DOWN
        
		//Select a = new Select(driver.findElement(By.id("gh-cat")));
		//a.selectByVisibleText("Business & Industrial");
		Thread.sleep(2000L);
	
		// or by index value
		//a.selectByIndex(5);
		Select items=new Select(driver.findElement(By.id("gh-cat")));
		items.selectByVisibleText("Business & Industrial");
		
		
		
		driver.findElement(By.id("gh-btn")).click();
		
		

	}

}
