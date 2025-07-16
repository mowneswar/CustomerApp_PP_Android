package ios;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Launch_RideNow_ScheduleLater_StartTripEarly_Incomplete extends customerapplaunch {
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
	public void testOnpaymentPageforCash() throws InterruptedException {
		super.testOnpaymentPageforcash();
	}
	@Test(dependsOnMethods = {"testOnpaymentPageforCash"})
	public void testOnpickuppopUpBar() throws InterruptedException {
		super.testOnpickuppopUpBar();	
	}
	@Test(dependsOnMethods = {"testOnpickuppopUpBar"})
	public void testOnStartTripcancelbookingPage() throws InterruptedException {
		super.testOnStartTripcancelbookingPage();
	}
	@Test(dependsOnMethods = {"testOnStartTripcancelbookingPage"})
	public void testOnPayNowPageCard() throws InterruptedException {
		super.testOnPayNowPageCard();
		
	}
}
