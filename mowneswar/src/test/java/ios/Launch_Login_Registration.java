package ios;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.interactions.PointerInput;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.Pause;

public class Launch_Login_Registration extends customerapplaunch{
	@BeforeClass
    public void setUp() throws MalformedURLException, InterruptedException {
		super.setUp();
	}
	@Test
	public void testOnLetsGoPage() throws InterruptedException {
		super.testOnLetsGoPage();
	}
	@Test(dependsOnMethods = {"testOnLetsGoPage"})
	public void testOnLetsgetStartedPage() throws InterruptedException {
		super.testOnLetsgetStartedPage();
	}
	@Test(dependsOnMethods = {"testOnLetsgetStartedPage"})
	public void testOnOtpPage() throws InterruptedException {
		super.testOnOtpPage();
	}
	@Test(dependsOnMethods = {"testOnOtpPage"})
	public void testOnAddressyouPage() throws InterruptedException {
		super.testOnAddressyouPage();
	}
	@Test(dependsOnMethods = {"testOnAddressyouPage"})
	public void testOnhowAddressyouPage() throws InterruptedException {
		super.testOnhowAddressyouPage();
	}
}
