package AmztestCASES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonParallelBrowsingTesting {

	WebDriver driver;

	@Test
	@Parameters("Browser")
	public void AirLineParallelTesting(String NameofBrowser) throws InterruptedException {

		if (NameofBrowser.equals("Chrome")) {

			driver = new ChromeDriver();
		}

		if (NameofBrowser.equals("edge")) {
			driver = new EdgeDriver();
		}

		if (NameofBrowser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get("https://www.amazon.in");

		WebElement w1 = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));

		Actions a1 = new Actions(driver);
		a1.moveToElement(w1).perform();

		Thread.sleep(2000);

		WebElement w2 = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		w2.click();
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("pasikantiabhilash@gmail.com");
		Thread.sleep(2000);

		WebElement continuebutton = driver.findElement(By.xpath("//input[@id='continue']"));
		continuebutton.click();
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("9866093612Abhi");
		Thread.sleep(2000);

		WebElement Signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		Signin.click();
		Thread.sleep(5000);

		driver.quit();
	}

}
