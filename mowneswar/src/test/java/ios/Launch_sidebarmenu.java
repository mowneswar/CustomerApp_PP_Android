package ios;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Launch_sidebarmenu extends customerapplaunch {
	@BeforeClass
    public void setUp() throws MalformedURLException, InterruptedException {
		super.setUp();
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
	@Test(dependsOnMethods = {"testOnOtpPage"})
	public void testOnSideBarBtn() throws InterruptedException {
		super.testOnSideBarBtn();
	}
	@Test(dependsOnMethods = {"testOnSideBarBtn"})
	public void testOnHekpCenterArwBtn() throws InterruptedException {
		super.testOnHekpCenterArwBtn();
	}

}
