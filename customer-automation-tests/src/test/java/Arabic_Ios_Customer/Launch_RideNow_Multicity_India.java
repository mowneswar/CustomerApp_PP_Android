package Arabic_Ios_Customer;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Launch_RideNow_Multicity_India extends CustomerApp_Arabic_BaseClass{
	@BeforeClass
	public void testOnAppLaunch() throws MalformedURLException, InterruptedException, Exception {
		super.testOnAppLaunch();
	}
	
	@Test
	public void testOnIntroPage() throws InterruptedException {
		super.testOnIntroPage();
	}
	
	@Test(dependsOnMethods= {"testOnIntroPage"})
	public void testOnselectArabicLang() throws InterruptedException {
		super.testOnselectArabicLang();
	}
	
	@Test(dependsOnMethods= {"testOnselectArabicLang"})
	public void testonLetsgetstartedPage() throws InterruptedException {
		super.testonLetsgetstartedPage();
	}
	
	@Test(dependsOnMethods= {"testonLetsgetstartedPage"})
	public void testOnOTPloginPage() throws InterruptedException, IOException {
		super.testOnOTPloginPage();
	}
	
	@Test(dependsOnMethods= {"testOnOTPloginPage"})
	public void testOnMapAllowPopup() throws InterruptedException {
		super.testOnMapAllowPopup();
	}
	
	@Test(dependsOnMethods= {"testOnMapAllowPopup"})
	public void testOnNotificAllowPopup() throws InterruptedException {
		super.testOnNotificAllowPopup();
	}
	
	@Test(dependsOnMethods= {"testOnNotificAllowPopup"})
	public void testOnRideNowHomescreen() throws InterruptedException {
		super.testOnRideNowHomescreen();
	}
	
	@Test(dependsOnMethods= {"testOnRideNowHomescreen"})
	public void testOnWheretoPage_AD() throws InterruptedException {
		super.testOnWheretoPage_AD();
	}
	
	@Test(dependsOnMethods= {"testOnWheretoPage_AD"})
	public void testOnpickupPage() throws InterruptedException {
		super.testOnpickupPage();
	}
	
	@Test(dependsOnMethods= {"testOnpickupPage"})
	public void testOnchooseyourcarPageAD() throws InterruptedException {
		super.testOnchooseyourcarPageAD();
	}
	
	@Test (dependsOnMethods= {"testOnchooseyourcarPageAD"})
	public void testOnyourRidePageGpay() throws InterruptedException {
		super.testOnyourRidePageGpay();
	}
	
	@Test (dependsOnMethods= {"testOnyourRidePageGpay"})
	public void testOnpickupScreen() throws InterruptedException {
		super.testOnpickupScreen();
	}
	
	@Test (dependsOnMethods= {"testOnpickupScreen"})
	public void testOnexperiencefeedbackScreen() throws InterruptedException {
		super.testOnexperiencefeedbackScreen();
	}
}
