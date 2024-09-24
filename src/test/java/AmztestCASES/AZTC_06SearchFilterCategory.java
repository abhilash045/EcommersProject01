package AmztestCASES;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.AmazonSearchFilters;
import junit.framework.Assert;

@Listeners(utility_package.Alisteners.class)

public class AZTC_06SearchFilterCategory extends AmzLaunchQuit {

	@Test // (retryAnalyzer = utility_package.Retry.class)
	public void Scategory() throws InterruptedException {

		AmazonSearchFilters a1 = new AmazonSearchFilters(driver);
		Thread.sleep(2000);
		a1.SearchFilter01();
		Thread.sleep(2000);
		a1.SearchFilter("Books");
		Thread.sleep(2000);
		a1.sort().click();
		boolean sort = a1.sort().isEnabled();
		if (sort == true) {
			System.out.println("sort is enabled");

		} else {
			System.out.println("sort is disabled");
		}
		Thread.sleep(4000);

		boolean pricesselect = a1.priceselect().isDisplayed();

		if (pricesselect == true) {
			System.out.println("pricesselect is Displayed ");
		} else {
			System.out.println("pricesselect is not Displayed");
		}
	}

}
