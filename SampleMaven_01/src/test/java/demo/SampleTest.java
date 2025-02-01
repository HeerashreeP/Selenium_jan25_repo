package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void launch() {
		Reporter.log("SampleTest class executed", true);
		Reporter.log("Modification done in GitHub", true);
		Reporter.log("Changes in Sample Test after 1st push", true);
	}

}
