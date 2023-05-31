package Screenshot1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenersImplementations.class)
public class ScreenShot2 extends BaseClass {
	
	@Test()
	public void takeSS2() {
		Reporter.log("Taking Screenshot");
		driver.get("https://www.google.com");
		Assert.fail();
	}

}
