package AmztestCASES;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.Amz_11ValidateCheckoutProcess;
import AmzSourceFiles.AZ02_LoginPage;
import utility_package.DataDrivenTesting;


@Listeners(utility_package.Alisteners.class)


public class AZTC_11ValidateCheckoutProcesss extends AmzLaunchQuit {

	@Test(retryAnalyzer=utility_package.Retry.class)
	public void Validate() throws EncryptedDocumentException, IOException {

		DataDrivenTesting d1 = new DataDrivenTesting();
		d1.DTT();

		AZ02_LoginPage a1 = new AZ02_LoginPage(driver);

		a1.accountList(driver);
		a1.sign();
		a1.email_id();

		a1.password();

		Amz_11ValidateCheckoutProcess a2 = new Amz_11ValidateCheckoutProcess(driver);

		a2.cart();

		a2.proceedcart();
		
		a2.Saddress();
		a2.useAddress();
		
		a2.Cod();
		
		a2.proceedPayment();

	}

}
