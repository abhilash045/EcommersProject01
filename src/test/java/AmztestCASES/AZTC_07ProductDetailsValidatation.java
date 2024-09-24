package AmztestCASES;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.AZ_ProductDetails;

@Listeners(utility_package.Alisteners.class)


public class AZTC_07ProductDetailsValidatation extends AmzLaunchQuit {
	@Test(retryAnalyzer=utility_package.Retry.class)
	public void PDetails() {
		AZ_ProductDetails A1 = new AZ_ProductDetails(driver);
		A1.search("THE REAL YOGI");
		A1.SelectProduct();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> I1 = windows.iterator();

		String Parent = I1.next();
		String Child = I1.next();

		driver.switchTo().window(Child);

		WebElement pricetag = driver.findElement(
				By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']"));

		System.out.println("Price Tag is Displayed " +pricetag.isDisplayed()); // price tag is vissable
		System.out.println(pricetag.getText()); // //price is Displayed

		WebElement review = driver.findElement(By.xpath("//div[@id='detailBulletsWrapper_feature_div']"));

		System.out.println("Review is Displayed " + review.isDisplayed());
		System.out.println(review.getText());

		A1.reviewview();

		Select s1 = new Select(driver.findElement(By.xpath("//select[@name='quantity']")));
		s1.selectByIndex(2);

	}

}
