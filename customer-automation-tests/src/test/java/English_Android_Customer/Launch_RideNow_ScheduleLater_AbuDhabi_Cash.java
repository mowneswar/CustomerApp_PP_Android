package English_Android_Customer;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Launch_RideNow_ScheduleLater_AbuDhabi_Cash extends CustomerApp_English_BaseClass{
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
	public void testOnscheduleLater() throws InterruptedException {
		super.testOnscheduleLater();
	}
	@Test(dependsOnMethods = {"testOnscheduleLater"})
	public void testScheduleLaterFlow() throws InterruptedException {
		super.testScheduleLaterFlow();
	}
	@Test(dependsOnMethods = {"testScheduleLaterFlow"})
	public void testOnWheretoPage_AD() throws InterruptedException {
		super.testOnWheretoPage_AD();
	}
	
	@Test (dependsOnMethods= {"testOnWheretoPage_AD"})
	public void testOnchooseyourcarPage_AD() throws InterruptedException {

		super.testOnchooseyourcarPage_AD();
	}
	@Test (dependsOnMethods= {"testOnchooseyourcarPage_AD"})
	public void testOnyChauffeur_Notes() throws InterruptedException {
		super.testOnyChauffeur_Notes();
	}
	@Test (dependsOnMethods= {"testOnyChauffeur_Notes"})
	public void testOnyourRidePageCash() throws InterruptedException {
		super.testOnyourRidePageCash();
	}
}
