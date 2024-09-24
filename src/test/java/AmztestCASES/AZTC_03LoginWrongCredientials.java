package AmztestCASES;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.AZ02_LoginPage;
import utility_package.DataDrivenTesting;

//Senarion-->3  Ensure login fails with incorrect email or password.?

@Listeners(utility_package.Alisteners.class) // importing listners

public class AZTC_03LoginWrongCredientials extends AmzLaunchQuit {

	@Test//(retryAnalyzer = utility_package.Retry.class)
	public void test1() throws InterruptedException, EncryptedDocumentException, IOException {

		DataDrivenTesting d1 = new DataDrivenTesting();
		d1.DTT01();

		AZ02_LoginPage a1 = new AZ02_LoginPage(driver);

		Thread.sleep(3000);
		a1.accountList(driver);
		Thread.sleep(3000);
		a1.sign();
		Thread.sleep(3000);
		a1.email_id02();
		Thread.sleep(000);

		a1.password02();

		String title = driver.getTitle();

		Assert.assertEquals(title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

	}

}
