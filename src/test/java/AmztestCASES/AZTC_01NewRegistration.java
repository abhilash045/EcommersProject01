package AmztestCASES;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.AZ01_HomeRegistration;

@Listeners(utility_package.Alisteners.class) // -->it should be out side class
public class AZTC_01NewRegistration extends AmzLaunchQuit {

	@Test(retryAnalyzer = utility_package.Retry.class)
	public void testacase02() throws InterruptedException {

		AZ01_HomeRegistration h1 = new AZ01_HomeRegistration(driver);

		h1.accountList(driver);
		h1.startHere();
		h1.name("Abhilash");
		Thread.sleep(2000);
		h1.email("6300338809");
		Thread.sleep(2000);
		h1.password("Abhilash1432");
		Thread.sleep(2000);

		h1.verfie();

	}
}
