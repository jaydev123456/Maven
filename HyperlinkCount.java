package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperlinkCount {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> hyperlink = driver.findElements(By.tagName("a"));
		System.out.println("No of hyperlink:"+hyperlink.size());
		         //for get what are the Hyperlink available in a webpage
		for(WebElement link:hyperlink) {
			System.out.println(link.getText());
		}
		driver.close();
	}

}
