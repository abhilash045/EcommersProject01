package AmzSourceFiles;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AZ_SortingPage {

	@FindBy(id = "twotabsearchtextbox")
	WebElement search;

	@FindBy(id = "searchDropdownBox")
	WebElement search01;

	@FindBy(id = "searchDropdownBox")
	WebElement dropdown;

	@FindBy(xpath = "(//span[@class='a-button-text a-declarative'])")
	WebElement sort;

	@FindBy(xpath = "//select[@name='s']")
	WebElement priceselect;

	public void SearchFilter() {

		search.click();
		search.sendKeys("books" + Keys.ENTER);

	}

	public void SearchFilter01(String Book) throws InterruptedException {

		Select s1 = new Select(dropdown);

		Thread.sleep(5000);

		s1.selectByVisibleText(Book);

	}

	public void sortproduct(ChromeDriver driver) {
		sort.click();

	}

	public void priceHigh() {
		Select s1 = new Select(priceselect);
		s1.selectByVisibleText("Price: High to Low");
		
	}
	
	public void priceLess() {
		Select s1 = new Select(priceselect);
		s1.selectByVisibleText("Price: Low to High");
		
	}
	
	public void Costomerreview() {
		Select s1 = new Select(priceselect);
		s1.selectByVisibleText("Avg. Customer Review");
		
	}
	
	
	public void Newest_Arrival() {
		Select s1 = new Select(priceselect);
		s1.selectByVisibleText("Newest Arrivals");
		
	}
	
	public void BestSeller() {
		Select s1 = new Select(priceselect);
		s1.selectByVisibleText("Price: High to Low");
		
	}
	

	public AZ_SortingPage(ChromeDriver driver) {

		PageFactory.initElements(driver, this);
	}
}
