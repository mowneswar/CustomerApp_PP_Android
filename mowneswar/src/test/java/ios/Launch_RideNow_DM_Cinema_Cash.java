package ios;

import org.testng.annotations.Test;

public class Launch_RideNow_DM_Cinema_Cash extends customerapplaunch{
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
	public void testOnpaymentPageforcash() throws InterruptedException {
		super.testOnpaymentPageforcash();
	}
	@Test(dependsOnMethods = {"testOnpaymentPageforcash"})
	
	public void testOnpickUpPage() throws InterruptedException {
		super.testOnpickUpPage();
	}
	@Test(dependsOnMethods = {"testOnpickUpPage"})
	public void testOnQuickFeedBackPage() throws InterruptedException {
		super.testOnQuickFeedBackPage();
	}
	@Test(dependsOnMethods = {"testOnQuickFeedBackPage"})
	public void testOnFeedBackPage() throws InterruptedException {
		super.testOnFeedBackPage();
	}
}
