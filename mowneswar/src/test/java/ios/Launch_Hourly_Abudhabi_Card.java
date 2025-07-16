package ios;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Launch_Hourly_Abudhabi_Card extends customerapplaunch{
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
	 public void testOn_AD_WhereToPage() throws InterruptedException {
		super.testOn_AD_WhereToPage();
	}
	@Test(dependsOnMethods = {"testOn_AD_WhereToPage"})
	 public void testOnFeedBackPage() throws InterruptedException {
		 super.testOnFeedBackPage();
	 }
}
