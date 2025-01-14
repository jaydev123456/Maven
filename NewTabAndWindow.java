package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabAndWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.makemytrip.com");
		 System.out.println(driver.getTitle());
		 //driver.switchTo().newWindow(WindowType.TAB);
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 driver.get("https://www.facebook.com");
		 System.out.println(driver.getTitle());
		 driver.quit();
		 

	}

}
