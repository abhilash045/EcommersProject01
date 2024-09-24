package AmzSourceFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZ_12PaymentPageValidation {

	@FindBy(xpath = "//span[@id='nav-cart-count']")
	WebElement Cart;

	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	WebElement proceed;

	@FindBy(xpath = "(//input[@data-testid='Address_selectShipToThisAddress'])")
	WebElement useAddress;

	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement amazonpay;

	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement BajajFinserv;

	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement CCredit;

	@FindBy(xpath = "(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")
	WebElement CDetails;

	@FindBy(xpath = "//button[@class=' a-button-close a-declarative']")
	WebElement CClose;

	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement NetBanking;

	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[6]")
	WebElement UpIapps;

	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[7]")
	WebElement EMIPayment;

	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[8]")
	WebElement CODPayment;

	public void cart() {
		Cart.click();
	}

	public void proceed() {
		proceed.click();
	}

	public void useAddress() {
		useAddress.click();
	}

	public void amzpay() {
		amazonpay.click();
	}

	public void BajajFinserv() {
		BajajFinserv.click();
	}

	public void CCredit() {
		CCredit.click();
	}

	public void CDetails() {
		CDetails.click();
	}

	public void CClose() {
		CClose.click();
	}

	public void NetBanking() {
		NetBanking.click();
	}

	public void UpIapps() {
		UpIapps.click();
	}

	public void EMIPayment() {
		EMIPayment.click();
	}

	public void CODPayment() {
		CODPayment.click();
	}

	public AMZ_12PaymentPageValidation(ChromeDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
