package Spanish_Lang;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Launch_RideNow_ScheduleLater_StartTripEarly extends Customer_BaseClass_Spanish{
	@BeforeClass
    public void setUp() throws MalformedURLException, InterruptedException {
		super.setUp();
	}
	@Test
	public void testOnLetsGoPage() throws InterruptedException {
		super.testOnLetsGoPage();
	}
	@Test(dependsOnMethods = {"testOnLetsGoPage"})
	public void testOnLanguagePage() throws InterruptedException {
		super.testOnLanguagePage();
	}
	@Test(dependsOnMethods = {"testOnLanguagePage"})
	
	public void testOnLetsgetStartedPage() throws InterruptedException {
		super.testOnLetsgetStartedPage();
	}
	@Test(dependsOnMethods = {"testOnLetsgetStartedPage"})
	public void testOnOtpPage() throws InterruptedException {
		super.testOnOtpPage();
	}
	@Test(dependsOnMethods = {"testOnOtpPage"})
	 public void testOnHomeScreenRideNow_ScheduleLaterBtn() throws InterruptedException {
		super.testOnHomeScreenRideNow_ScheduleLaterBtn();
	}
	@Test(dependsOnMethods = {"testOnHomeScreenRideNow_ScheduleLaterBtn"})
	public void testOnHomeScreen_RideNow_DIA_WhereToPage() throws InterruptedException {
		super.testOnHomeScreen_RideNow_DIA_WhereToPage();
	}
	@Test(dependsOnMethods = {"testOnHomeScreen_RideNow_DIA_WhereToPage"})
	public void testOnHomeScreenHourly_DIA_PickupTerminal2() throws InterruptedException {
		super.testOnHomeScreenHourly_DIA_PickupTerminal2();
	}
	@Test(dependsOnMethods = {"testOnHomeScreenHourly_DIA_PickupTerminal2"})
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
	public void testOnpickuppopUpBar() throws InterruptedException {
		super.testOnpickuppopUpBar();	
	}
	@Test(dependsOnMethods = {"testOnpickuppopUpBar"})
	public void testOnStarttriEarlyBtn() throws InterruptedException {
		super.testOnStarttriEarlyBtn();
	}
	@Test(dependsOnMethods = {"testOnStarttriEarlyBtn"})
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
