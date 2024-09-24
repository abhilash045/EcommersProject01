package AmztestCASES;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.AMZ15_ReachCart;

//Senario 15 ---->Reach till cart page without login in amazon application

@Listeners(utility_package.Alisteners.class)

public class AZTC_15ReachCart extends AmzLaunchQuit {

	@Test(retryAnalyzer = utility_package.Retry.class)
	public void ReachCart() {

		AMZ15_ReachCart a1 = new AMZ15_ReachCart(driver);
		a1.search("Remot control Car");
		a1.selectproduct();

		Set<String> window = driver.getWindowHandles();

		Iterator<String> c1 = window.iterator();

		String Parent = c1.next();
		String Child = c1.next();

		driver.switchTo().window(Child);

		a1.addcart();

	}

}
