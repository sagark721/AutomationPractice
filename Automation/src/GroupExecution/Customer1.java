package GroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer1 {

	@Test(groups = {"smoke","regression"})
	void createCust() {
		Reporter.log("Customer Created",true);
	}
	
	@Test(groups="regression")
	void modifyCust() {
		Reporter.log("Customer Modified",true);
	}
	
	@Test(groups= {"regression","functional"})
	void deleteCust() {
		Reporter.log("Customer Deleted",true);
	}
}
