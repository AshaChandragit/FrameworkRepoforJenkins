package organisation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateOrgTest {
@Test(groups = "Smoke Test")
	public void createOrganisation() {
Reporter.log("organisation created", true);
	String URL=System.getProperty("Url");
	String BROWSER=System.getProperty("Pwd");
	String Username=System.getProperty("Url");
	String PWD=System.getProperty("Url");
	
	System.out.println("Url is "+URL);
	System.out.println("Browser is "+BROWSER);
	System.out.println("Username is "+Username);
	System.out.println("Password is "+PWD);
}
}
