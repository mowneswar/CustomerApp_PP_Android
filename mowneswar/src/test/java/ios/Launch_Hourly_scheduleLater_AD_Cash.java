package ios;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Launch_Hourly_scheduleLater_AD_Cash extends customerapplaunch {
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
	public void testOnHomeScreenHourly_ScheduleLaterBtn() throws InterruptedException {
		super.testOnHomeScreenHourly_ScheduleLaterBtn();
	}
	@Test(dependsOnMethods = {"testOnHomeScreenHourly_ScheduleLaterBtn"})
	public void testOnHomeScreenHourlyPickupFromPage_AD() throws InterruptedException {
		super.testOnHomeScreenHourlyPickupFromPage_AD();
	}
	@Test(dependsOnMethods = {"testOnHomeScreenHourlyPickupFromPage_AD"})
	 public void testOncarselectionPage() throws InterruptedException {
		super.testOncarselectionPage();
	}
	@Test(dependsOnMethods = {"testOncarselectionPage"})
	public void testOnChauffeurNotes() throws InterruptedException {
		super.testOnChauffeurNotes();
	}
	@Test(dependsOnMethods = {"testOnChauffeurNotes"})
	public void testOnpaymentPageforcash() throws InterruptedException {
		super.testOnpaymentPageforcash();
	}
	@Test(dependsOnMethods = {"testOnpaymentPageforcash"})
	public void testOnphourlySelectionPage() throws InterruptedException {
		super.testOnphourlySelectionPage();
	}
	@Test(dependsOnMethods = {"testOnphourlySelectionPage"})
	public void testOn_okBtnScheduleLater() throws InterruptedException {
		super.testOn_okBtnScheduleLater();
	}
}
