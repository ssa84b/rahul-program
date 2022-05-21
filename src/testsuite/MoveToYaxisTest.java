package testsuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToYaxisTest {
//PROGRAM TO CLICK ON THE PARTICULAR CO-ORDINATES OF THE TARGET WEBELEMENT
	@Test
	public static void moveToXYaxis() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.qspiders.com/");
		
		WebElement coursesLink = driver.findElement(By.xpath("//span[text()='Courses']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(coursesLink, 0, 50).perform();// +ve y-axis
		driver.quit();
	}
}