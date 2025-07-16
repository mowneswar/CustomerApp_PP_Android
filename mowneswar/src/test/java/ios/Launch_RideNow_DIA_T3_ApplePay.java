package ios;

import org.testng.annotations.Test;

public class Launch_RideNow_DIA_T3_ApplePay  extends customerapplaunch{
	public void testOnHomeScreen_RideNow() throws InterruptedException {
		super.testOnHomeScreen_RideNow();
	}
	@Test(dependsOnMethods = {"testOnHomeScreen_RideNow"})
	public void testOnHomeScreen_RideNow_DIA_WhereToPage() throws InterruptedException {
		super.testOnHomeScreen_RideNow_DIA_WhereToPage();
	}
	@Test(dependsOnMethods = {"testOnHomeScreen_RideNow_DIA_WhereToPage"})
	public void testOnHomeScreenHourly_DIA_PickupTerminal3() throws InterruptedException {
		super.testOnHomeScreenHourly_DIA_PickupTerminal3();
	}
	@Test(dependsOnMethods = {"testOnHomeScreenHourly_DIA_PickupTerminal3"})
	public void testOncAPUPage() throws InterruptedException {
		super.testOncAPUPage();
	}
	@Test(dependsOnMethods = {"testOncAPUPage"})
    public void testOncarselectionPage() throws InterruptedException {
		super.testOncarselectionPage();
	}
	@Test(dependsOnMethods = {"testOncarselectionPage"})
	public void testOnpaymentPageforapplePay() throws InterruptedException {
		super.testOnpaymentPageforapplePay();
	}
	@Test(dependsOnMethods = {"testOnpaymentPageforapplePay"})
	
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
