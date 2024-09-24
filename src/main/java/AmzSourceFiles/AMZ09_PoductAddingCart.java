package AmzSourceFiles;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Senarion 09-->Verify that items can be added to the shopping cart from product pages.

public class AMZ09_PoductAddingCart {

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBar;
	
	
	@FindBy (xpath ="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement selectproduct;
	
	@FindBy(xpath ="//input[@id='add-to-cart-button']")
	WebElement AddCart;
	
	

	public void searchbar(String Name) {
		searchBar.sendKeys(Name +Keys.ENTER);
	}
	
	
	
	public void ClickProduct ()
	{
		selectproduct.click();
	}
	
	
	public void AddCart ()
	{
		AddCart.click();
	}

	public AMZ09_PoductAddingCart(ChromeDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
