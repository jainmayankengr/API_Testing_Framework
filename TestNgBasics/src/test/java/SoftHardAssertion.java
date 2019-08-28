import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHardAssertion {
	
	SoftAssert softAssert = new SoftAssert(); // Create a soft assert object to run soft assertion.

	@Test
	public void Test1()
	{
		System.out.println("Open Browser");
		//Assert.assertEquals(true, false);	// Hard Assertion, test case gets terminated if this fails.
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click signin");
		
		
		//Assert.assertEquals(true, false);
		System.out.println("validateHomePage");
		
		softAssert.assertEquals(true, false); // soft Assertion, program won't terminate.
		
		System.out.println("go to deal page");
		System.out.println("create deal");
		
		softAssert.assertEquals(true, false);
		
		System.out.println("go to contacts page");
		System.out.println("create a contact");
		
		softAssert.assertEquals(true, false);
		
		softAssert.assertAll(); // This will show the real picture of the assertion pass/fail in soft assertion
	}
}
