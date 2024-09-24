package AmzSourceFiles;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AmazonAddingCart {

	@FindBy(id = "add-to-cart-button")
	WebElement AddCart;
	
	public void AddCart() {
		AddCart.sendKeys(Keys.ENTER);

	}

	public AmazonAddingCart(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
