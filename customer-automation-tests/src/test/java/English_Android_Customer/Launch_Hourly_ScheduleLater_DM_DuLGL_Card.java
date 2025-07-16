package English_Android_Customer;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Launch_Hourly_ScheduleLater_DM_DuLGL_Card extends CustomerApp_English_BaseClass{
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
	public void testOnHourlyscheduleLater() throws InterruptedException {
		super.testOnHourlyscheduleLater();
	}
	@Test (dependsOnMethods= {"testOnHourlyscheduleLater"})
	public void testScheduleLaterFlow() throws InterruptedException {
		super.testScheduleLaterFlow();
		
	}
	
	@Test (dependsOnMethods= {"testScheduleLaterFlow"})
	public void testOnHourlyPickupPageDubaiMall() throws InterruptedException {
		super.testOnHourlyPickupPageDubaiMall();
	}
	
	@Test(dependsOnMethods= {"testOnHourlyPickupPageDubaiMall"})
	public void testOnDubaiMall_DuLGLevel() throws InterruptedException {
		super.testOnDubaiMall_DuLGLevel();
	}
	
	@Test(dependsOnMethods= {"testOnDubaiMall_DuLGLevel"})
	public void testOnchooseyourcarPage() throws InterruptedException {
		super.testOnchooseyourcarPage();
	}
	
	@Test (dependsOnMethods= {"testOnchooseyourcarPage"})
	public void testOnyChauffeur_Notes() throws InterruptedException {
		super.testOnyChauffeur_Notes();
	}
	@Test (dependsOnMethods= {"testOnyChauffeur_Notes"})
	public void testOnyourRidePageCard() throws InterruptedException {
		super.testOnyourRidePageCard();
	}
	
	@Test (dependsOnMethods= {"testOnyourRidePageCard"})
	public void testOnHourlyselectDurationPage() throws InterruptedException {
		super.testOnHourlyselectDurationPage();
		
	}
}
