package English_Android_Customer;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Launch_RideNow_DM_DuLGL_Gpay extends CustomerApp_English_BaseClass{
	@BeforeClass
	public void setUp() throws Exception {
		super.setUp();
	}
	@Test
	public void testOnIntroPage() throws InterruptedException {
		super.testIntroPage();
	}
	@Test (dependsOnMethods= {"testOnIntroPage"})
	public void testOnLetsgetstartedPage() throws InterruptedException {
		super.testLetsgetstartedPage();
	}
	
	@Test (dependsOnMethods= {"testOnLetsgetstartedPage"})
	public void testOnOTPlogin_Simu() throws InterruptedException, IOException {
		super.testOnOTPlogin_Simu();
	}
	
	@Test (dependsOnMethods= {"testOnOTPlogin_Simu"})
	public void testOnMapAllow() throws InterruptedException {
		super.testOnMapAllow();
	}
	
	@Test (dependsOnMethods= {"testOnMapAllow"})
	public void testOnNotificAllow() throws InterruptedException{
		super.testOnNotificAllow();
	}
	
	@Test (dependsOnMethods= {"testOnNotificAllow"})
	public void testOnRideNowHomescreen() throws InterruptedException {
		super.testOnRideNowHomescreen();
	}
	
	@Test (dependsOnMethods= {"testOnRideNowHomescreen"})
	public void testOnWheretoPage_DubaiMall() throws InterruptedException {
		super.testOnWheretoPage_DubaiMall();

	}
	@Test (dependsOnMethods= {"testOnWheretoPage_DubaiMall"})
	public void testOnDubaiMall_DuLGLevel() throws InterruptedException {
		super.testOnDubaiMall_DuLGLevel();
	}
	@Test (dependsOnMethods= {"testOnDubaiMall_DuLGLevel"})
	public void testOnchooseyourcarPage() throws InterruptedException {

		super.testOnchooseyourcarPage();
	}
	@Test (dependsOnMethods= {"testOnchooseyourcarPage"})
	public void testOnyChauffeur_Notes() throws InterruptedException {
		super.testOnyChauffeur_Notes();
	}
	@Test (dependsOnMethods= {"testOnyChauffeur_Notes"})
	public void testOnyourRidePageGpay() throws InterruptedException {
		super.testOnyourRidePageGpay();
	}
	
	@Test (dependsOnMethods= {"testOnyourRidePageGpay"})
	public void testOnpickupScreen() throws InterruptedException {

		super.testOnpickupScreen();
	}
	
	@Test (dependsOnMethods= {"testOnpickupScreen"})
	public void testOnquicfeedbackScreen() throws InterruptedException {
		super.testOnquicfeedbackScreen();
	}

	
	@Test (dependsOnMethods= {"testOnquicfeedbackScreen"})
	public void testOnexperiencefeedbackScreen() throws InterruptedException {
		super.testOnexperiencefeedbackScreen();
	}
}
