package Testscript;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser  implements IRetryAnalyzer {
	int counter=0;
	int retrylimit=4;

		@Override
		public boolean retry(ITestResult result) {// "result"--parameter inbuilt to check the testcase failed or passed
			if (counter<retrylimit) {
				counter++;
				return true;
			}
			
		// TODO Auto-generated method stub
			return false;
		}

}
