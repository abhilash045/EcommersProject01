package AmzSourceFiles;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ_ProductDetails {
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
	WebElement SelectProduct;
	
	@FindBy(xpath ="(//span[@id='acrCustomerReviewText'])[2]")
	WebElement review;
	
	

	public void search(String PName) {
		searchbox.sendKeys(PName +Keys.ENTER);
	}

	public void SelectProduct()
	{
		SelectProduct.click();
	}
	
	public void reviewview ()
	{
		review.click();
	}
	
	
	public AZ_ProductDetails(ChromeDriver driver) {
		
		PageFactory.initElements(driver, this);

	}

}
