package BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(priority = 1, invocationCount = 2)
	void test1() {
		Reporter.log("Jai");
	}
	
	
	@Test(priority = 3)
	void test2() {
		Reporter.log("Ram");
	}
	
	
	@Test(priority = 2)
	void test3() {
		Reporter.log("Shree");
	}
	
	
}
