package AmztestCASES;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.AZ14_RatingPage;
import AmzSourceFiles.AZ02_LoginPage;
import utility_package.DataDrivenTesting;

@Listeners(utility_package.Alisteners.class)

public class AZTC_14RatingPage extends AmzLaunchQuit {

	@Test // (retryAnalyzer=utility_package.Retry.class)
	public void ratingpage() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting d1 = new DataDrivenTesting();
		d1.DTT();

		AZ02_LoginPage a1 = new AZ02_LoginPage(driver);

		a1.accountList(driver);
		a1.sign();
		a1.email_id();
		Thread.sleep(4000);
		a1.password();

		AZ14_RatingPage a2 = new AZ14_RatingPage(driver);
		Thread.sleep(4000);
		a2.Oders();
		Thread.sleep(4000);

//		a2.review();
//		Thread.sleep(4000);
//		a2.rating();
//		Thread.sleep(4000);
//		a2.radiobutton();
//		Thread.sleep(4000);
//		a2.FeedBack("Great Book");
//		Thread.sleep(4000);
//		a2.submitButton();

	}

}
