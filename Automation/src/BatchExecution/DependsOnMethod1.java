package BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class DependsOnMethod1{

	@Test(dependsOnMethods = {"test3","test2"})
	void test1() {
		Reporter.log("Shivay",true);
	}
	
	@Test
	void test2() {
		Reporter.log("Om",true);
	}
	
	@Test(dependsOnMethods = "test2")
	void test3(){
		Reporter.log("Namah",true);
	}
}
