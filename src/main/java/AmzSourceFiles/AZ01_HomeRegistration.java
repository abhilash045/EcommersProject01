package AmzSourceFiles;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import utility_package.Alisteners;

@Listeners(utility_package.Alisteners.class)

public class AZ01_HomeRegistration extends Alisteners{ 


	// step 1 find elements

	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement AccountandList;

	@FindBy(linkText = ("Start here."))
	WebElement startHere;

	@FindBy(id = "ap_customer_name")
	WebElement name;

	@FindBy(name = "email")
	WebElement email_id;

	@FindBy(name = "password")
	WebElement pswd;

	@FindBy(xpath = "//span[@class='a-button a-button-span12 a-button-primary auth-requires-verify-modal']")
	WebElement Verfy;

	// step2 create methods

	public void accountList(ChromeDriver driver) throws InterruptedException {

		Actions a1 = new Actions(driver);
		a1.moveToElement(AccountandList).perform();

		Thread.sleep(2000);

	}

	public void startHere() {

		startHere.click();
	}

	public void name(String Name) {
		name.sendKeys(Name);

	}

	public void email(String i) {
		email_id.sendKeys(i);
	}

	public void password(String Name) {

		pswd.sendKeys(Name);
	}

	public void verfie() {
		Verfy.click();
	}

	// step -3

	public AZ01_HomeRegistration(ChromeDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
