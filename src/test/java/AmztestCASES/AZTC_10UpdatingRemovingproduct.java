package AmztestCASES;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.Amz_10Updating_item_quantities;

@Listeners(utility_package.Alisteners.class)

public class AZTC_10UpdatingRemovingproduct extends AmzLaunchQuit {

	@Test(retryAnalyzer=utility_package.Retry.class)

	public void TestSenario10() throws InterruptedException {
		Amz_10Updating_item_quantities a1 = new Amz_10Updating_item_quantities(driver);

		a1.search("Shoes");

		a1.ProductSelect();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> p1 = windows.iterator();

		String parent = p1.next();
		String child = p1.next();

		driver.switchTo().window(child);

		Select s1 = new Select(driver.findElement(By.id("quantity")));
		s1.selectByIndex(2);

		a1.addingcart();
		
		a1.movetocart();

		Set<String> windows2 = driver.getWindowHandles();

		Iterator<String> p2 = windows2.iterator();

		String parent1 = p2.next();
		String child1 = p2.next();

		driver.switchTo().window(child1);
	
		a1.removeproduct();

	}

}
