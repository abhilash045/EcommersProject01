package AmzSourceFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

;

public class AZ_ManageProfile {

	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	WebElement AccountandList;

	@FindBy(xpath = "//button[.='Manage Profiles']")
	WebElement Manage_Profiles;

	@FindBy(linkText = "//a[@href='/slc/hub?disablePicker=1&shoppingAs=1&ref=sl_ph_navpicker']")
	WebElement profileview;

	public void accountList(ChromeDriver driver) {

		Actions a1 = new Actions(driver);
		a1.moveToElement(AccountandList).perform();

	}

	public void MProfile() {

		Manage_Profiles.click();

	}

	public void Pview() {
		profileview.click();
	}

	public AZ_ManageProfile(ChromeDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
