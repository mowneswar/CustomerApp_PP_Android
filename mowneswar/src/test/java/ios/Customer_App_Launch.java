package ios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Customer_App_Launch {
	public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 11");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"18.1.1");
		capabilities.setCapability(MobileCapabilityType.UDID, "00008030-000A50D011D3802E"); 
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
		capabilities.setCapability("bundleId", "com.moniic.customer.pp");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"70000");
	
		AppiumDriver<MobileElement> driver = null;

       
           
            driver = new IOSDriver<MobileElement>(new URL("http://192.168.1.39:4723/"), capabilities);
            System.out.println("Connected to iOS device!");
            System.out.println("Launched the Moniic ios customer dev build app in ios simulator iphone 11 version 18.1.1");

            

         
        
    }
}
