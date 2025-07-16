package ios;

import org.testng.annotations.Test;

public class Launch_RideNow_AD_ApplePay  extends customerapplaunch{
	public void testOnHomeScreen_RideNow () throws InterruptedException {
		super.testOnHomeScreen_RideNow();
	}
	@Test(dependsOnMethods = {"testOnHomeScreen_RideNow"})
	public void testOnHomeScreen_RideNow_AD_WhereToPage() throws InterruptedException {
		super.testOnHomeScreen_RideNow_AD_WhereToPage();
	}
	@Test(dependsOnMethods = {"testOnHomeScreen_RideNow_NewYork_WhereToPage"})
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
	public void testOnFeedBackPage() throws InterruptedException {
		super.testOnFeedBackPage();
	}
}
