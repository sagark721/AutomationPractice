package BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DisableTestCase {

	@Test(priority = 1)
	void test1() {
		Reporter.log("Om");
	}
	
	@Test(priority = 2)
	void test2() {
		Reporter.log("Shivay");
	}
	
	@Test(priority = 3 , enabled = false)
	void test3() {
		Reporter.log("Namah");
	}
}
