package AmztestCASES;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AmzSourceFiles.AZ02_LoginPage;
import AmzSourceFiles.AZ_ManageProfile;
import utility_package.DataDrivenTesting;

//Senarion 4 --> Check if a user can successfully edit their profile information?

@Listeners(utility_package.Alisteners.class)
public class AZTC_04Profilemanage extends AmzLaunchQuit {

	@Test//(retryAnalyzer=utility_package.Retry.class)
	public void Profile() throws IOException, InterruptedException {

		DataDrivenTesting d1 = new DataDrivenTesting();
		d1.DTT();

		AZ02_LoginPage a1 = new AZ02_LoginPage(driver);
		Thread.sleep(4000);
		a1.accountList(driver);
		Thread.sleep(3000);
		a1.sign();
		Thread.sleep(3000);
		a1.email_id();
		Thread.sleep(5000);
		a1.password();

		Thread.sleep(2000);

		AZ_ManageProfile p1 = new AZ_ManageProfile(driver);
		Thread.sleep(3000);
		p1.accountList(driver);
		Thread.sleep(3000);
		p1.MProfile();
		Thread.sleep(3000);

		p1.Pview();

	}

}
