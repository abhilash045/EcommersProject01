package AmztestCASES;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.AmazonAddingCart;
import AmzSourceFiles.AmazonSearchProduct;
import AmzSourceFiles.Amazon_ProductSelecting;

@Listeners(utility_package.Alisteners.class)

public class AZTC_06SelectProduct extends AmzLaunchQuit {

	@Test(retryAnalyzer=utility_package.Retry.class)
	public void SelectProduct() throws InterruptedException {

		AmazonSearchProduct a2 = new AmazonSearchProduct(driver); 

		a2.search("Shoes");  //------->Search Shoes

		Amazon_ProductSelecting P1 = new Amazon_ProductSelecting(driver);

		P1.Pselect();   //-------> Select Product
		
		Set<String> s1 =driver.getWindowHandles();
		
		Iterator<String> windows =s1.iterator();
		
		String parent =windows.next();
		String child =windows.next();
		
		driver.switchTo().window(child);  //-->moving courser from homepage to child page
		
		Select size = new Select(driver.findElement(By.id("native_dropdown_selected_size_name")));
		
		size.selectByIndex(2);    //select the quantity
		
		Thread.sleep(2000);
		
		Select colour =new Select(driver.findElement(By.id("quantity")));
		
		colour.selectByIndex(2);
		
		AmazonAddingCart addingcart = new AmazonAddingCart(driver);
		addingcart.AddCart();
	

	}

}
