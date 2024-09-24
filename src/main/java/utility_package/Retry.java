package utility_package;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {

		int current_count = 0;
		int retry_count = 2;

		if (current_count < retry_count) {
			
			retry_count++;

			return true;
		}

		return false;
	}

}
