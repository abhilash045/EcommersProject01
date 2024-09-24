package AmztestCASES;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.AMZ09_PoductAddingCart;

//Senarion 09-->Verify that items can be added to the shopping cart from product pages.

@Listeners(utility_package.Alisteners.class)


public class AZTC_09ProductAddingCart extends AmzLaunchQuit {
	@Test(retryAnalyzer=utility_package.Retry.class)
	public void Productpage() {
		AMZ09_PoductAddingCart a1 = new AMZ09_PoductAddingCart(driver);

		a1.searchbar("Ben10 Watch");
		a1.ClickProduct();

		Set<String> window = driver.getWindowHandles();

		Iterator<String> c1 = window.iterator();

		String Parent = c1.next();
		String Child = c1.next();

		driver.switchTo().window(Child);

		a1.AddCart();
	}

}
