package AmzSourceFiles;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZ15_ReachCart {

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(xpath ="(//div[@class='a-section aok-relative s-image-square-aspect'])[2]")
	WebElement selectproduct;
	
	@FindBy(xpath ="(//a[@class='a-button-text'])[1]")
	WebElement addCart;
	

	public void search(String PName) {
		searchbox.sendKeys(PName + Keys.ENTER);
	}
	
	public void selectproduct() {
		selectproduct.click();
	}
	
	public void addcart ()
	{
		addCart.click();
	}

	public AMZ15_ReachCart(ChromeDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
