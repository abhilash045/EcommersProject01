package AmztestCASES;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.AMZ_12PaymentPageValidation;
import AmzSourceFiles.AZ02_LoginPage;
import utility_package.DataDrivenTesting;

@Listeners(utility_package.Alisteners.class)

public class AZTC_12PaymentPage extends AmzLaunchQuit {

	@Test // (retryAnalyzer=utility_package.Retry.class)
	public void payment() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting d1 = new DataDrivenTesting();
		d1.DTT();

		AZ02_LoginPage a1 = new AZ02_LoginPage(driver);

		a1.accountList(driver);
		a1.sign();
		a1.email_id();
		Thread.sleep(4000);
		a1.password();

		AMZ_12PaymentPageValidation a2 = new AMZ_12PaymentPageValidation(driver);

		a2.cart();
		a2.proceed();
		a2.useAddress();
		Thread.sleep(4000);
		a2.amzpay();
		Thread.sleep(4000);
		a2.BajajFinserv();
		Thread.sleep(4000);
		a2.NetBanking();
		Thread.sleep(10000);
		a2.UpIapps();
		Thread.sleep(4000);
		a2.EMIPayment();
		Thread.sleep(4000);
		a2.CODPayment();

	}

}
