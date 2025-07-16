package RG_CUS_PP_IOS_ENG;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tc_03_S1  extends BaseClass_Eng{
	@BeforeClass
    public void setUp() throws MalformedURLException, InterruptedException {
		super.setUp();
	}
	@Test
	public void testOnLetsGoPage() throws InterruptedException {
		super.testOnLetsGoPage();
	}
	@Test(dependsOnMethods = {"testOnLetsGoPage"})
	public void testOnLetsgetStartedPage() throws InterruptedException {
		super.testOnLetsgetStartedPage();
	}
	@Test(dependsOnMethods = {"testOnLetsgetStartedPage"})
	public void testOnOtpPage() throws InterruptedException {
		super.testOnOtpPage();
	}
	@Test(dependsOnMethods = {"testOnOtpPage"})
	public void testOnAddressyouPage() throws InterruptedException {
		super.testOnAddressyouPage();
	}
	@Test(dependsOnMethods = {"testOnAddressyouPage"})
	public void testOnhowAddressyouPage() throws InterruptedException {
		super.testOnhowAddressyouPage();
	}
}
