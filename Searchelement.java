package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Searchelement {
 public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com/");
	WebElement searchbox = driver.findElement(By.xpath("//textarea[@name='q']"));
	searchbox.sendKeys("DRDO");
	searchbox.sendKeys(Keys.ENTER);
	                     //another way
	driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("ISRO",Keys.ENTER);
	driver.close();
	
}
}
