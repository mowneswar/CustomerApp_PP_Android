package ios;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
public class customer {
	public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 11");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"17.5");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
		capabilities.setCapability(MobileCapabilityType.APP, "com.mowneswar.apple-samplecode.UICatalog");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"70000");
	
		AppiumDriver<MobileElement> driver = null;

       
           
            driver = new IOSDriver<MobileElement>(new URL("http://192.168.1.39:4723/"), capabilities);
            System.out.println("Connected to iOS device!");
            System.out.println("Launched the Moniic ios customer dev build app in ios simulator iphone 11 version 17.5");

            

         
        
    }
}
