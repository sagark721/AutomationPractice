package GroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Project1 {
	
	@Test(groups={"regression","smoke"})
	void createProj() {
		Reporter.log("Project Created",true);
	}
	
	@Test(groups="regression")
	void modifyProj() {
		Reporter.log("Project Modified",true);
	}
	
	@Test(groups={"regression","functional"})
	void deleteProj() {
		Reporter.log("Project Deleted",true);
	}

}
