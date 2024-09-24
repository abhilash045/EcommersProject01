package AmzSourceFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Amazon_ProductSelecting {

	@FindBy(xpath = "(//div[@Class='a-section aok-relative s-image-tall-aspect'])[2]")
	WebElement selectProduct;

	
	public void Pselect() {
		selectProduct.click();
	}

	public Amazon_ProductSelecting(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
