package BatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TestNGDemo  {



	@Test(priority = 1,invocationCount = 3)
	public void test1() {
		Reporter.log("1");
	}
	
	@Test(priority = 3)
	public void test3() {
		Reporter.log("3");
	}
	
	@Test(priority = 2,invocationCount = 0)
	public void test2() {
		Reporter.log("2");
	}
	
	@Test(priority = 4, enabled = false)
	void test4(){
		Reporter.log("4");
	}
	
	@Test(priority = 5, invocationCount = 3)
	void print5() {
		Reporter.log("5",true);
	}

}
