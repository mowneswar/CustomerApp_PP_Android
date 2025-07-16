package ios;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Launch_Login extends customerapplaunch{
	@BeforeClass
    public void setUp() throws MalformedURLException, InterruptedException {
		super.setUp();
		super.testOnLetsGoPage();
		super.testOnLetsgetStartedexistAccntPage();
		super.testOnOtpPage();
		
	}
	@Test
	public void testOnLetsGoPage() throws InterruptedException {
		super.testOnLetsGoPage();
	}
	@Test(dependsOnMethods = {"testOnLetsGoPage"})
	public void testOnLetsgetStartedexistAccntPage() throws InterruptedException {
		super.testOnLetsgetStartedexistAccntPage();
	}
	@Test(dependsOnMethods = {"testOnLetsgetStartedexistAccntPage"})
	public void testOnOtpPage() throws InterruptedException {
		super.testOnOtpPage();
	}
	
}
