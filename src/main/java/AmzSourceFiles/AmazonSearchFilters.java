package AmzSourceFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonSearchFilters {

	@FindBy(id = "twotabsearchtextbox")
	WebElement search;

	@FindBy(id = "searchDropdownBox")
	WebElement search01;

	@FindBy(id = "searchDropdownBox")
	WebElement dropdown;

	@FindBy(xpath = "(//span[@class='a-button-text a-declarative'])")
	WebElement sort;

	@FindBy(xpath = "//div[@class='a-popover-inner']")
	WebElement priceselect;

	@Test(priority = 1)
	public void SearchFilter(String Name) {

		search.click();
		search.sendKeys(Name + Keys.ENTER);

	}

	@Test(priority = 2)
	public void SearchFilter01() throws InterruptedException {

		Select s1 = new Select(dropdown);

		Thread.sleep(5000);

		s1.selectByVisibleText("Books");

	}

	@Test(priority = 3)
	public WebElement sort() {
		return sort;
	}

	@Test(priority = 4)
	public WebElement priceselect() {

		return priceselect;
	}

	public AmazonSearchFilters(ChromeDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
