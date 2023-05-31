package GroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Task1 {
	
	@Test(groups={"regression","smoke"})
	void createTask() {
		Reporter.log("Task Created",true);
	}
	
	@Test(groups="regression")
	void modifyTask() {
		Reporter.log("Task Modified",true);
	}
	
	@Test(groups={"regression","functional"})
	void deleteTask() {
		Reporter.log("Task Deleted",true);
	}

}
