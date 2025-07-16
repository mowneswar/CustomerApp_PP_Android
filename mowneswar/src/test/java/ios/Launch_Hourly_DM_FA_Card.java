package ios;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Launch_Hourly_DM_FA_Card extends customerapplaunch{
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
	public void testOnHomeScreenHourlyBtn() throws InterruptedException {
		super.testOnHomeScreenHourlyBtn();
	}
	@Test(dependsOnMethods = {"testOnHomeScreenHourlyBtn"})
	public void testOnHomeScreenHourly_DM_PickupFromPage() throws InterruptedException {
		super.testOnHomeScreenHourly_DM_PickupFromPage();
	}
	@Test(dependsOnMethods = {"testOnHomeScreenHourly_DM_PickupFromPage"})
	public void testOnHomeScreenHourly_DM_Pickup_FA_Parking() throws InterruptedException {
		super.testOnHomeScreenHourly_DM_Pickup_FA_Parking();
	}
	@Test(dependsOnMethods = {"testOnHomeScreenHourly_DM_Pickup_FA_Parking"})
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
	public void testOnphourlySelectionPage() throws InterruptedException {
		super.testOnphourlySelectionPage();
	}
	@Test(dependsOnMethods = {"testOnphourlySelectionPage"})
	 public void testOnpickUpPage() throws InterruptedException {
		 super.testOnpickUpPage();
	 }
	@Test(dependsOnMethods = {"testOnpickUpPage"})
	 public void testOnWhereToPage() throws InterruptedException {
		super.testOnWhereToPage();
	}
	@Test(dependsOnMethods = {"testOnWhereToPage"})
	public void testOnQuickFeedBackPage() throws InterruptedException {
		super.testOnQuickFeedBackPage();
	}
	@Test(dependsOnMethods = {"testOnQuickFeedBackPage"})
	 public void testOnFeedBackPage() throws InterruptedException {
		 super.testOnFeedBackPage();
	 }
}
