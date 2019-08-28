package retryLogic;



import org.testng.Assert;
import org.testng.annotations.Test;

public class retryFailedTest {

	
	@Test//(retryAnalyzer=Analyzer.retryAnalyzer.class)
	public void Test1()
	{
		System.out.println("Test1");
		Assert.assertEquals(true, false);
		
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2");
		Assert.assertEquals(true, false);
		
	}
	
	
	@Test
	public void Test3()
	{
		System.out.println("Test3");
		Assert.assertEquals(true, true);
	}
}
