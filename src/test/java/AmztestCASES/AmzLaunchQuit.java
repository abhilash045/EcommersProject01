package AmztestCASES;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import utility_package.Alisteners;

@Listeners(utility_package.Alisteners.class)

public class AmzLaunchQuit extends Alisteners {

	@BeforeMethod
	public void AmzLaunch() {

		/*
		 * ChromeOptions option=new ChromeOptions(); option.addArguments("--headless");
		 * driver= new ChromeDriver(option);
		 */

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

	}

	@AfterMethod
	public static void AmzQuit() throws InterruptedException {

		//driver.quit();

	}

}
