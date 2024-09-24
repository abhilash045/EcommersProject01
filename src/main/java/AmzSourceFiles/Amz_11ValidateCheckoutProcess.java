package AmzSourceFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Amz_11ValidateCheckoutProcess {

	@FindBy(xpath = "//span[@id='nav-cart-count']")
	WebElement Cart;

	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	WebElement proceed;

	@FindBy(xpath = "(//input[@name='submissionURL'])[2]")
	WebElement SAddress;

	@FindBy(xpath = "(//input[@data-testid='Address_selectShipToThisAddress'])")
	WebElement useAddress;

	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[8]")
	WebElement PaymentCod;

	@FindBy(xpath = "(//input[@class='a-button-input a-button-text'])[13]")
	WebElement proceedPayment;

	@Test(priority = 1)
	public void cart() {
		Cart.click();
	}

	@Test(priority = 2)
	public void proceedcart() {
		proceed.click();
	}

	@Test(priority = 3)
	public void Saddress() {
		SAddress.click();
	}

	@Test(priority = 4)
	public void useAddress() {
		useAddress.click();
	}

	@Test(priority = 5)
	public void Cod() {
		PaymentCod.click();
	}

	@Test(priority = 6)
	public void proceedPayment() {
		proceedPayment.click();
	}

	public Amz_11ValidateCheckoutProcess(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
