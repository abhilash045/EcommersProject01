package AmzSourceFiles;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_package.DataDrivenTesting;

public class AZ02_LoginPage extends DataDrivenTesting {

	// step 1 find elements

	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement AccountandList;

	@FindBy(xpath = "(//span[@class='nav-action-inner'])[1]")
	WebElement SiginButton;

	@FindBy(className = "a-input-text")
	WebElement Email;

	@FindBy(id = "ap_password")
	WebElement Pass;

	@FindBy(xpath = "//span[@.=Sign in") 
	WebElement submitbutton;

	// step2 create methods 

	public void accountList(ChromeDriver driver) {

		Actions a1 = new Actions(driver);
		a1.moveToElement(AccountandList).perform();

	}

	public void sign() {
		SiginButton.click();
	}

	public void email_id() {
		Email.sendKeys(un + Keys.ENTER);
	}

	public void password() {
		Pass.sendKeys(pswd + Keys.ENTER);
	}
	
	
	public void email_id02() {
		Email.sendKeys(uname + Keys.ENTER);
	}

	public void password02() {
		Pass.sendKeys(pswd1 + Keys.ENTER);
	}



	// step--3

	public AZ02_LoginPage(ChromeDriver driver) {
			PageFactory.initElements(driver, this);
		}

}
