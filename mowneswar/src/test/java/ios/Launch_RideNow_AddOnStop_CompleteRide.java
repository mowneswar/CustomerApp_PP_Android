package ios;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Launch_RideNow_AddOnStop_CompleteRide extends customerapplaunch {
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
	public void testOnHomeScreen_RideNow() throws InterruptedException {
		super.testOnHomeScreen_RideNow();
	}
	@Test(dependsOnMethods = {"testOnHomeScreen_RideNow"})
	public void testOnHomeScreen_RideNow_DM_WhereToPage() throws InterruptedException {
		super.testOnHomeScreen_RideNow_DM_WhereToPage();
	}
	@Test(dependsOnMethods = {"testOnHomeScreen_RideNow_DM_WhereToPage"})
	public void testOnHomeScreenHourly_DM_Pickup_ZabeelParking() throws InterruptedException {
		super.testOnHomeScreenHourly_DM_Pickup_ZabeelParking();
	}
	@Test(dependsOnMethods = {"testOnHomeScreenHourly_DM_Pickup_ZabeelParking"})
    public void testOncarselectionPage() throws InterruptedException {
		super.testOncarselectionPage();
	}
	@Test(dependsOnMethods = {"testOncarselectionPage"})
	public void testOnChauffeurNotes() throws InterruptedException {
		super.testOnChauffeurNotes();
	}
	@Test(dependsOnMethods = {"testOnChauffeurNotes"})
	public void testOnpaymentPageforcard() throws InterruptedException {
		super.testOnpaymentPageforcard();
	}
	@Test(dependsOnMethods = {"testOnpaymentPageforcard"})
	
	public void testOnpickUpPage() throws InterruptedException {
		super.testOnpickUpPage();
	}
	@Test(dependsOnMethods = {"testOnpickUpPage"})
	public void testOn_RideNow_AddOnStops() throws InterruptedException {
		super.testOn_RideNow_AddOnStops();
	}
	@Test(dependsOnMethods = {"testOn_RideNow_AddOnStops"})
	public void testOnQuickFeedBackPage() throws InterruptedException {
		super.testOnQuickFeedBackPage();
	}
	
	@Test(dependsOnMethods = {"testOnQuickFeedBackPage"})
	public void testOnFeedBackPage() throws InterruptedException {
		super.testOnFeedBackPage();
	}
	
}
