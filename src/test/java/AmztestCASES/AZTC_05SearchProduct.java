package AmztestCASES;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.AmazonSearchProduct;
import AmzSourceFiles.AZ02_LoginPage;
import utility_package.DataDrivenTesting;

//Senerio  05 -->Test searching for products using its name like shoe? 


@Listeners(utility_package.Alisteners.class)

public class AZTC_05SearchProduct extends AmzLaunchQuit {

	@Test(retryAnalyzer=utility_package.Retry.class)

	public void search() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting d1 = new DataDrivenTesting();
		d1.DTT();

		AZ02_LoginPage a1 = new AZ02_LoginPage(driver);
		Thread.sleep(2000);
		a1.accountList(driver);
		Thread.sleep(2000);
		a1.sign();
		Thread.sleep(2000);
		a1.email_id();
		Thread.sleep(4000);

		a1.password();

		AmazonSearchProduct a2 = new AmazonSearchProduct(driver);

		Thread.sleep(3000);
		a2.search("Shoes");
	}

}
