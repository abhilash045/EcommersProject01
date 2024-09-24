package AmzSourceFiles;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/*Test updating item quantities and removing items from the cart*/

public class Amz_10Updating_item_quantities {

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;

	@FindBy(xpath = "(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]")
	WebElement product;

	@FindBy(id = "add-to-cart-button")
	WebElement addCart;
	
	
	@FindBy(id ="sw-gtc")
	WebElement GotoCart;
	
	
	@FindBy(xpath= "(//input[@class='a-color-link'])[1]")
	WebElement removeproduct;

	@Test(priority  =1) 
	public void search(String PName) {
		searchbox.sendKeys(PName + Keys.ENTER);
	}
	
	@Test(priority  =2) 
	public void ProductSelect() {
		product.click();
	}

	@Test(priority  =3) 
	public void addingcart() {
		addCart.click();
	}
	
	@Test(priority  =4) 
	public void movetocart()
	{
		GotoCart.click();
	}
	
	@Test(priority  =5) 
	public void removeproduct()
	{
		removeproduct.click();
	}
	
	
	

	public Amz_10Updating_item_quantities(ChromeDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
