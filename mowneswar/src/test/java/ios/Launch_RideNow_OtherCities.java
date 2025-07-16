package ios;

import org.testng.annotations.Test;

public class Launch_RideNow_OtherCities extends customerapplaunch{
	public void testOnHomeScreen_RideNow() throws InterruptedException {
		super.testOnHomeScreen_RideNow();
	}
	@Test(dependsOnMethods = {"testOnHomeScreen_RideNow"})
	public void testOnHomeScreen_RideNow_Burj_WhereToPage() throws InterruptedException {
		super.testOnHomeScreen_RideNow_Burj_WhereToPage();
	}
	@Test(dependsOnMethods = {"testOnHomeScreen_RideNow_IND_WhereToPage"})
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
	public void testOnFeedBackPage() throws InterruptedException {
		super.testOnFeedBackPage();
	}
}
