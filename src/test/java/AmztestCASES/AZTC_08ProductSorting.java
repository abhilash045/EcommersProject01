package AmztestCASES;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.AZ_SortingPage;

@Listeners(utility_package.Alisteners.class)

public class AZTC_08ProductSorting extends AmzLaunchQuit {

	@Test(retryAnalyzer = utility_package.Retry.class)
	public void sort() throws InterruptedException {

		AZ_SortingPage a1 = new AZ_SortingPage(driver);

		a1.SearchFilter01("Books");

		a1.SearchFilter();

		a1.sortproduct(driver);

		a1.priceHigh();

		Thread.sleep(2000);

		a1.priceLess();

		Thread.sleep(2000);

		a1.BestSeller();

		Thread.sleep(2000);

		a1.Costomerreview();

	}

}
