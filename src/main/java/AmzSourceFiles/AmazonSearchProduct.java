package AmzSourceFiles;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchProduct {


	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;

	public void search(String PName) {
		searchbox.sendKeys(PName +Keys.ENTER);
	}

	public AmazonSearchProduct(ChromeDriver driver) {
		
		PageFactory.initElements(driver, this);

	}

}
