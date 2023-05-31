package BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class Priority  {

	@Test(priority = 1)
	void test1() {
		Reporter.log("Jai",true);
	}
	
	@Test(priority = 3,dependsOnMethods = "DependsOnMethod1.test2")
	void test3() {
		Reporter.log("Ram",true);
	}
	
	
	@Test(priority = 2)
	void test2() {
		Reporter.log("Shree",true);
	}
}
