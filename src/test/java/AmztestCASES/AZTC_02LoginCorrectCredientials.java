package AmztestCASES;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.AZ02_LoginPage;
import utility_package.DataDrivenTesting;

//P01-->Senerio2.... Verfie login with correct email id and password and check weather testcase passed /failed

@Listeners(utility_package.Alisteners.class)

public class AZTC_02LoginCorrectCredientials extends AmzLaunchQuit {

	@Test(retryAnalyzer = utility_package.Retry.class) // ------------>retryanlyzer
	public void test1() throws InterruptedException, EncryptedDocumentException, IOException {

		DataDrivenTesting d1 = new DataDrivenTesting();
		d1.DTT();

		AZ02_LoginPage a1 = new AZ02_LoginPage(driver);
		Thread.sleep(3000);
		a1.accountList(driver);
		Thread.sleep(3000);
		a1.sign();
		Thread.sleep(3000);
		a1.email_id();
		Thread.sleep(4000);
		a1.password();

	}

}
