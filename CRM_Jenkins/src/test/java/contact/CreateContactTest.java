package contact;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactTest {
	@Test(groups = "Smoke Test")
	public void createContact() {
		Reporter.log("contact created successfully", true);
			}
}
