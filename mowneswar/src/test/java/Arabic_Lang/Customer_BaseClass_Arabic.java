package Arabic_Lang;

import static java.time.Duration.ofMillis;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Customer_BaseClass_Arabic {
	AppiumDriver<MobileElement> driver = null;

	@BeforeClass
	public void setUp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 16 Pro Max");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "18.3");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		capabilities.setCapability("bundleId", "com.moniic.customer.pp");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000"); 


		driver = new IOSDriver<MobileElement>(new URL("http://192.168.1.35:4723/"), capabilities);
		System.out.println("Connected to iOS device simulator!");
		System.out.println("Launched the app on iOS simulator iPhone 16 pro max version 18.3.1");
		Thread.sleep(15000);
	}



	public void testOnLetsGoPage() throws InterruptedException {

		MobileElement letsGoBtn = driver.findElementByAccessibilityId("LET'S GO 󰅂");
		letsGoBtn.click();
		Thread.sleep(5000);



	}
	public void testOnLanguagePage() throws InterruptedException {
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence langtap = new Sequence(finger, 1);
		langtap.addAction(finger.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 390, 100));
		langtap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		langtap.addAction(new Pause(finger, Duration.ofMillis(100)));
		langtap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Arrays.asList(langtap));
		Thread.sleep(5000);


		PointerInput ProceedBtn = new PointerInput(PointerInput.Kind.TOUCH, "ProceedBtn");
		Sequence arabicBtn = new Sequence(ProceedBtn, 1);
		arabicBtn.addAction(ProceedBtn.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 38, 745));
		arabicBtn.addAction(ProceedBtn.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		arabicBtn.addAction(new Pause(ProceedBtn, Duration.ofMillis(100)));
		arabicBtn.addAction(ProceedBtn.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Arrays.asList(arabicBtn));
		Thread.sleep(5000);

	}

	public void testOnLetsgetStartedexistAccntPage() throws InterruptedException {
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence tap = new Sequence(finger, 1);
		tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 227, 185));
		tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tap.addAction(new Pause(finger, Duration.ofMillis(100)));
		tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Arrays.asList(tap));
		Thread.sleep(5000);


		driver.findElementByAccessibilityId("5").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("2").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("0").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("0").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("0").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("0").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("9").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("6").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("7").click();
		Thread.sleep(1000);



		PointerInput ProceedBtn = new PointerInput(PointerInput.Kind.TOUCH, "ProceedBtn");
		Sequence tap2 = new Sequence(ProceedBtn, 1);
		tap2.addAction(ProceedBtn.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 217, 546));
		tap2.addAction(ProceedBtn.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tap2.addAction(new Pause(ProceedBtn, Duration.ofMillis(100)));
		tap2.addAction(ProceedBtn.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Arrays.asList(tap2));
		Thread.sleep(5000);
	}
	/////////////Login and New Registration starts here ////////////
	public void testOnLetsgetStartedPage() throws InterruptedException {
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence tap = new Sequence(finger, 1);
		tap.addAction(finger.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 227, 185));
		tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tap.addAction(new Pause(finger, Duration.ofMillis(100)));
		tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Arrays.asList(tap));
		Thread.sleep(5000);


		driver.findElementByAccessibilityId("5").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("2").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("0").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("0").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("0").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("9").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("9").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("6").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("8").click();
		Thread.sleep(5000);



		PointerInput ProceedBtn = new PointerInput(PointerInput.Kind.TOUCH, "ProceedBtn");
		Sequence tap2 = new Sequence(ProceedBtn, 1);
		tap2.addAction(ProceedBtn.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 217, 546));
		tap2.addAction(ProceedBtn.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tap2.addAction(new Pause(ProceedBtn, Duration.ofMillis(100)));
		tap2.addAction(ProceedBtn.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Arrays.asList(tap2));
		Thread.sleep(5000);
	}
	public void testOnOtpPage() throws InterruptedException {
		driver.findElement(By.className("XCUIElementTypeTextField")).click();
		Thread.sleep(3000);

		driver.findElementByAccessibilityId("2").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("3").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("4").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("8").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("7").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("6").click();
		Thread.sleep(13000);




	}
	public void testOnAddressyouPage() throws InterruptedException {

		MobileElement selectBtn = driver.findElementByAccessibilityId("Abbr");
		selectBtn.click();
		Thread.sleep(2000);

		MobileElement mrBtn = driver.findElementByAccessibilityId("سيد");
		mrBtn.click();
		Thread.sleep(2000);

		MobileElement firstNameBlk = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"الاسم الأول\"`]"));
		firstNameBlk.click();
		Thread.sleep(2000);
		firstNameBlk.sendKeys("Kk");
		Thread.sleep(2000);


		MobileElement lastNameBlk = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"الاسم الأخير\"`]"));
		lastNameBlk.click();
		Thread.sleep(2000);
		lastNameBlk.sendKeys("Pearldon");
		Thread.sleep(2000);

		MobileElement continueBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == 'استمر 󰅁'`][3]"));
		continueBtn.click();
		Thread.sleep(2000);

	}

	public void testOnhowAddressyouPage() throws InterruptedException {
		MobileElement enteryourMailBlk = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"أدخل بريدك الإلكتروني\"`]"));
		enteryourMailBlk.click();
		Thread.sleep(2000);
		enteryourMailBlk.sendKeys("Klpearldon@yopmail.com");
		Thread.sleep(2000);

		MobileElement continueBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"استمر 󰅁\"`][3]"));
		continueBtn.click();
		Thread.sleep(2000);
	}

	/////////////Login and New Registration ends here ////////////















	public void testOnSideBarBtn() throws InterruptedException {

		MobileElement sideBarMenuBtn = driver.findElementByXPath("(//XCUIElementTypeOther[@name='Compass My location Google Maps Bottom Sheet Bottom Sheet'])[10]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]");
		sideBarMenuBtn.click();
		Thread.sleep(15000);





	}

	public void testOnAccountArwBtn() throws InterruptedException {

		MobileElement profileArrwBtn = driver.findElementByXPath("//XCUIElementTypeOther[@name='مساء الخير, Karakudi Pearlraja 󰅁']");
		profileArrwBtn.click();
		Thread.sleep(12000);





	}
	public void testOneditProfilePageArwBtn() throws InterruptedException {

		MobileElement editprofilePicArw = driver.findElementByXPath("(//XCUIElementTypeOther[@name='Karakudi Pearlraja 󰅁'])[2]");
		editprofilePicArw.click();
		Thread.sleep(5000);


		MobileElement editprofilePicBtn = driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"إضافة صورة للملف الشخصي JPEG أو PNG. الحد الأقصى 5 ميغابايت\"])[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
		editprofilePicBtn.click();
		Thread.sleep(5000);

		MobileElement takePhotoBtn = driver.findElementByAccessibilityId("التقط صورة");
		takePhotoBtn.click();
		Thread.sleep(5000);


		MobileElement editprofileBackBtn = driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"الملف الشخصي\"])[2]/XCUIElementTypeOther");
		editprofileBackBtn.click();
		Thread.sleep(5000);

	}
	public void testOneditPhoneNumPageArwBtn() throws InterruptedException {


		MobileElement editphonenumArw = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"+971 520009968 󰅁\"`][2]"));
		editphonenumArw.click();
		Thread.sleep(5000);
		MobileElement editphonenumBackBtn = driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"رقم الهاتف\"])[2]/XCUIElementTypeOther");
		editphonenumBackBtn.click();
		Thread.sleep(5000);


	}

	public void testOneditEmailPageArwBtn() throws InterruptedException {
		MobileElement editEmailArw = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"karaikudipearl@yopmail.com اضغط على الرابط للتحقق 󰅁\"`][2]"));
		editEmailArw.click();
		Thread.sleep(5000);





		PointerInput cancel = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence tap = new Sequence(cancel, 1);
		tap.addAction(cancel.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 50, 217));
		tap.addAction(cancel.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tap.addAction(new Pause(cancel, Duration.ofMillis(100)));
		tap.addAction(cancel.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Arrays.asList(tap));
		Thread.sleep(5000);





		PointerInput pointer = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence tap2 = new Sequence(pointer, 1);
		tap2.addAction(pointer.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 318, 219));
		tap2.addAction(pointer.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tap2.addAction(new Pause(pointer, Duration.ofMillis(100)));
		tap2.addAction(pointer.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Arrays.asList(tap2));
		Thread.sleep(5000);





		String input = "Kkdon";
		for (char ch : input.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(ch)).click();
			Thread.sleep(500); 
		}

		MobileElement moreBtn = driver.findElementByAccessibilityId("more");
		moreBtn.click();
		Thread.sleep(5000);

		driver.findElementByAccessibilityId("@").click();
		Thread.sleep(6000);


		MobileElement moreBtn2 = driver.findElementByAccessibilityId("more");
		moreBtn2.click();
		Thread.sleep(6000);


		String input2 = "yopmail";
		for (char cha : input2.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}

		MobileElement moreBtn3 = driver.findElementByAccessibilityId("more");
		moreBtn3.click();
		Thread.sleep(5000);
		driver.findElementByAccessibilityId(".").click();
		Thread.sleep(6000);

		MobileElement moreBtn4 = driver.findElementByAccessibilityId("more");
		moreBtn4.click();
		Thread.sleep(5000);

		String input3 = "com";
		for (char chr: input3.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(chr)).click();
			Thread.sleep(500); 
		}



		MobileElement updateBtn = driver.findElementByAccessibilityId("تحديث");
		updateBtn.click();
		Thread.sleep(8000);



		MobileElement editEmailPageBackBtn = driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"البريد الإلكتروني\"])[2]/XCUIElementTypeOther");
		editEmailPageBackBtn.click();
		Thread.sleep(5000);
	}








	public void testOnPaymentsMethodsArwBtn() throws InterruptedException {
		MobileElement paymentsMethodsArwBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"طرق الدفع 󰅁\"`][2]"));
		paymentsMethodsArwBtn.click();
		Thread.sleep(5000);

		MobileElement addPaymentMethodBtn = driver.findElementByAccessibilityId("إضافة طريقة الدفع");
		addPaymentMethodBtn.click();
		Thread.sleep(5000);

		////////  add card payment //////
		PointerInput pointer = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence tapcredit = new Sequence(pointer, 1);
		tapcredit.addAction(pointer.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 372, 820));
		tapcredit.addAction(pointer.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tapcredit.addAction(new Pause(pointer, Duration.ofMillis(100)));
		tapcredit.addAction(pointer.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Arrays.asList(tapcredit));
		Thread.sleep(5000);
		//////// add card Number////////

		PointerInput pointer2 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence tapcardNumber = new Sequence(pointer2, 1);
		tapcardNumber.addAction(pointer2.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 357, 192));
		tapcardNumber.addAction(pointer2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tapcardNumber.addAction(new Pause(pointer2, Duration.ofMillis(100)));
		tapcardNumber.addAction(pointer2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(tapcardNumber));
		Thread.sleep(5000);

		String cardNum = "5555555555554444";
		for (char cha : cardNum.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}
		Thread.sleep(5000);



		/////// expires date/////////////
		PointerInput pointer3 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence expiryNumber = new Sequence(pointer3, 1);
		expiryNumber.addAction(pointer3.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 168, 300));
		expiryNumber.addAction(pointer3.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		expiryNumber.addAction(new Pause(pointer3, Duration.ofMillis(100)));
		expiryNumber.addAction(pointer3.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(expiryNumber));
		Thread.sleep(5000);

		String expDate = "0528";
		for (char cha : expDate.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		///////// cvv Number/////////

		PointerInput pointer4 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence cvvNumber = new Sequence(pointer4, 1);
		cvvNumber.addAction(pointer4.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 326, 300));
		cvvNumber.addAction(pointer4.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		cvvNumber.addAction(new Pause(pointer4, Duration.ofMillis(100)));
		cvvNumber.addAction(pointer4.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(cvvNumber));
		Thread.sleep(5000);

		String cvv = "323";
		for (char cha : cvv.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}
		///////// Card Name/////////

		PointerInput pointer5 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence cardName = new Sequence(pointer5, 1);
		cardName.addAction(pointer5.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 336, 405));
		cardName.addAction(pointer5.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		cardName.addAction(new Pause(pointer5, Duration.ofMillis(100)));
		cardName.addAction(pointer5.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(cardName));
		Thread.sleep(5000);

		String Name = "Donrajan";
		for (char cha : Name.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}

		PointerInput pointer6 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceed = new Sequence(pointer6, 1);
		proceed.addAction(pointer6.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 221, 621));
		proceed.addAction(pointer6.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceed.addAction(new Pause(pointer6, Duration.ofMillis(100)));
		proceed.addAction(pointer6.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceed));
		Thread.sleep(10000);

		/////// card authorised successfully////////

		PointerInput pointer7 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence okBtn = new Sequence(pointer7, 1);
		okBtn.addAction(pointer7.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 124, 900));
		okBtn.addAction(pointer7.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		okBtn.addAction(new Pause(pointer7, Duration.ofMillis(100)));
		okBtn.addAction(pointer7.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(okBtn));
		Thread.sleep(10000);


		//////// delete card///////
		PointerInput pointer8 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence deleteBtn = new Sequence(pointer8, 1);
		deleteBtn.addAction(pointer8.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 56, 265));
		deleteBtn.addAction(pointer8.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		deleteBtn.addAction(new Pause(pointer8, Duration.ofMillis(100)));
		deleteBtn.addAction(pointer8.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(deleteBtn));
		Thread.sleep(8000);




		PointerInput pointer9 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence removeBtn = new Sequence(pointer9, 1);
		removeBtn.addAction(pointer9.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 130, 909));
		removeBtn.addAction(pointer9.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		removeBtn.addAction(new Pause(pointer9, Duration.ofMillis(100)));
		removeBtn.addAction(pointer9.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(removeBtn));
		Thread.sleep(8000);

		PointerInput pointer10 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence okremoveBtn = new Sequence(pointer10, 1);
		okremoveBtn.addAction(pointer10.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 222, 858));
		okremoveBtn.addAction(pointer10.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		okremoveBtn.addAction(new Pause(pointer10, Duration.ofMillis(100)));
		okremoveBtn.addAction(pointer10.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(okremoveBtn));
		Thread.sleep(8000);





	}

	public void testOnprefrenceArwBtn() throws InterruptedException {
		MobileElement prefrenceArwBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"إعدادات 󰅁\"`][2]"));
		prefrenceArwBtn.click();
		Thread.sleep(5000);

	}

	public void testOncopilotArwBtn() throws InterruptedException {
		MobileElement copilotArwBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Co-pilot إعدادات إدارة تفضيلات رحلاتك\"`][2]"));
		copilotArwBtn .click();
		Thread.sleep(5000);


		MobileElement moonroofcloseBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"moonroof-switch-selector\"`]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]"));
		moonroofcloseBtn  .click();
		Thread.sleep(5000);

		MobileElement moonroofopenBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"moonroof-switch-selector\"`]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]"));
		moonroofopenBtn  .click();
		Thread.sleep(5000);

		MobileElement moonroofpartialBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"moonroof-switch-selector\"`]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]"));
		moonroofpartialBtn .click();
		Thread.sleep(5000);


		MobileElement bluetoothBtn = driver.findElementByAccessibilityId("بلوتوث طلب");
		bluetoothBtn.click();
		Thread.sleep(5000);


		MobileElement wifiBtn = driver.findElementByAccessibilityId("واي فاي طلب");
		wifiBtn.click();
		Thread.sleep(8000);

		MobileElement quiterideBtn = driver.findElementByAccessibilityId("رحلة هادئة إيقاف");
		quiterideBtn .click();
		Thread.sleep(5000);

		MobileElement tempIncreasegBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"21°C\"`][1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"));
		tempIncreasegBtn .click();
		Thread.sleep(5000);

		MobileElement tempdecreasegBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"22°C\"`][1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]"));
		tempdecreasegBtn  .click();
		Thread.sleep(5000);

		MobileElement fandecreaseBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"21°C\"`][1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]"));
		fandecreaseBtn.click();
		Thread.sleep(5000);


		MobileElement fanincreaseBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"21°C\"`][1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]"));
		fanincreaseBtn.click();
		Thread.sleep(5000);


		MobileElement applyPreferenceBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"تطبيق التفضيلات\"`][2]"));
		applyPreferenceBtn.click();
		Thread.sleep(5000);

		MobileElement applyPreferenceokBtn = driver.findElementByAccessibilityId("حسنًا");
		applyPreferenceokBtn.click();
		Thread.sleep(5000);
	}

	public void testOnLangBtn() throws InterruptedException {
		PointerInput pointer11 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence langselectBtn = new Sequence(pointer11, 1);
		langselectBtn.addAction(pointer11.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 59, 289));
		langselectBtn.addAction(pointer11.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		langselectBtn.addAction(new Pause(pointer11, Duration.ofMillis(100)));
		langselectBtn.addAction(pointer11.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(langselectBtn));
		Thread.sleep(8000);


		MobileElement frenchLangBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Français\"`][1]"));
		frenchLangBtn .click();
		Thread.sleep(5000);




		driver.perform(Arrays.asList(langselectBtn));
		Thread.sleep(8000);



		MobileElement englishLangBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"English\"`][1]"));
		englishLangBtn  .click();
		Thread.sleep(10000);




	}


	public void testOnOthersPrefenceBtn() throws InterruptedException {
		PointerInput pointer12 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence darkModeBtn = new Sequence(pointer12, 1);
		darkModeBtn .addAction(pointer12.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 53, 562));
		darkModeBtn .addAction(pointer12.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		darkModeBtn .addAction(new Pause(pointer12, Duration.ofMillis(100)));
		darkModeBtn .addAction(pointer12.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(darkModeBtn ));
		Thread.sleep(8000);


		PointerInput pointer13 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence lightModeBtn = new Sequence(pointer13, 1);
		lightModeBtn .addAction(pointer13.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 50, 480));
		lightModeBtn.addAction(pointer13.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		lightModeBtn .addAction(new Pause(pointer13, Duration.ofMillis(100)));
		lightModeBtn .addAction(pointer13.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(lightModeBtn ));
		Thread.sleep(8000);


		PointerInput pointer14 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence adjustModeBtn = new Sequence(pointer14, 1);
		adjustModeBtn .addAction(pointer14.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 50, 646));
		adjustModeBtn.addAction(pointer14.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		adjustModeBtn .addAction(new Pause(pointer14, Duration.ofMillis(100)));
		adjustModeBtn .addAction(pointer14.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(adjustModeBtn));
		Thread.sleep(8000);



		PointerInput pointer15 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence emailSubBtn = new Sequence(pointer15, 1);
		emailSubBtn .addAction(pointer15.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 48, 740));
		emailSubBtn.addAction(pointer15.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		emailSubBtn .addAction(new Pause(pointer15, Duration.ofMillis(100)));
		emailSubBtn .addAction(pointer15.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(emailSubBtn));
		Thread.sleep(10000);



		MobileElement preferencePageBackBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"إعدادات\"`][2]/XCUIElementTypeOther"));
		preferencePageBackBtn .click();
		Thread.sleep(5000);



	}
	public void testOnSavedLogoutArwBtn() throws InterruptedException {
		MobileElement logoutArwBtn = driver.findElement(MobileBy.iOSClassChain("*/XCUIElementTypeOther[`name == \"Supprimer le compte 󰅂\"`][2]"));
		logoutArwBtn .click();
		Thread.sleep(5000);
		

		PointerInput pointer15 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence congBtn = new Sequence(pointer15, 1);
		congBtn .addAction(pointer15.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 320, 900));
		congBtn.addAction(pointer15.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		congBtn.addAction(new Pause(pointer15, Duration.ofMillis(100)));
		congBtn.addAction(pointer15.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(congBtn));
		Thread.sleep(10000);



	}
	public void testOnSavedLocArwBtn() throws InterruptedException {

		MobileElement savedLocArwBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"المواقع المحفوظة 󰅁\"`][2]"));
		savedLocArwBtn.click();
		Thread.sleep(5000);


		MobileElement savedLocPageBackBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"المواقع المحفوظة\"`][2]/XCUIElementTypeOther"));
		savedLocPageBackBtn.click();
		Thread.sleep(5000);
	}

	public void testOnLogoutArwBtn() throws InterruptedException {
		MobileElement logoutArwBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"تسجيل الخروج 󰅁\"`][2]"));
		logoutArwBtn.click();
		Thread.sleep(5000);


		PointerInput pointer16 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence logoutBtn = new Sequence(pointer16, 1);
		logoutBtn .addAction(pointer16.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 320, 900));
		logoutBtn.addAction(pointer16.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		logoutBtn .addAction(new Pause(pointer16, Duration.ofMillis(100)));
		logoutBtn .addAction(pointer16.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(logoutBtn));
		Thread.sleep(10000);

	}

	public void testOnMyactivityArwBtn() throws InterruptedException {
		MobileElement myActivityArwBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"نشاطي 󰅁\"`][2]"));
		myActivityArwBtn.click();
		Thread.sleep(5000);

		MobileElement pastRidesBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"الرحلات السابقة\"`]"));
		pastRidesBtn.click();
		Thread.sleep(5000);

		MobileElement upcomingRidesBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"الرحلات القادمة\"`]"));
		upcomingRidesBtn.click();
		Thread.sleep(5000);

		MobileElement myactivityPageBackBtn = driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"نشاطي\"])[2]/XCUIElementTypeOther");
		myactivityPageBackBtn.click();
		Thread.sleep(5000);
	}

	public void testOnHekpCenterArwBtn() throws InterruptedException {
		MobileElement helpCenterArwBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"مركز المساعدة 󰅁\"`][2]"));
		helpCenterArwBtn.click();
		Thread.sleep(5000);

		MobileElement needHelpArwBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"هل تحتاج مساعدة؟ هل تواجه مشكلة؟ دعنا نساعدك\"`][2]"));
		needHelpArwBtn.click();
		Thread.sleep(5000);

		MobileElement needHelpBackBtn = driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"مركز المساعدة\"])[2]/XCUIElementTypeOther");
		needHelpBackBtn.click();
		Thread.sleep(5000);

		MobileElement termsofserviceArwBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name =='شروط الخدمة'`][2]"));
		termsofserviceArwBtn.click();
		Thread.sleep(8000);

		MobileElement termsofserviceBackBtn = driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"شروط الخدمة\"])[2]/XCUIElementTypeOther");
		termsofserviceBackBtn.click();
		Thread.sleep(5000);

		MobileElement privacyPolicyArwBtn = driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"سياسة الخصوصية\"`][2]"));
		privacyPolicyArwBtn.click();
		Thread.sleep(8000);

		MobileElement privacyPolicyBackBtn = driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"سياسة الخصوصية\"])[2]/XCUIElementTypeOther");
		privacyPolicyBackBtn.click();
		Thread.sleep(5000);

		MobileElement helpCenterPageBackBtn = driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"مركز المساعدة\"])[2]/XCUIElementTypeOther");
		helpCenterPageBackBtn.click();
		Thread.sleep(5000);
	}

	public void testOnHomeScreenHourlyBtn() throws InterruptedException {
		PointerInput pointer18 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence HourlyBtn = new Sequence(pointer18, 1);
		HourlyBtn.addAction(pointer18.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 332, 568));
		HourlyBtn .addAction(pointer18.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		HourlyBtn .addAction(new Pause(pointer18, Duration.ofMillis(100)));
		HourlyBtn .addAction(pointer18.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(HourlyBtn));
		Thread.sleep(10000);


		PointerInput pointer22 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence HourlypickupBtn = new Sequence(pointer22, 1);
		HourlypickupBtn.addAction(pointer22.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 373, 665));
		HourlypickupBtn .addAction(pointer22.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		HourlypickupBtn .addAction(new Pause(pointer22, Duration.ofMillis(100)));
		HourlypickupBtn .addAction(pointer22.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(HourlypickupBtn));
		Thread.sleep(10000);
	}


	public void testOnHomeScreenHourly_ScheduleLaterBtn() throws InterruptedException {
		PointerInput pointer181 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence HourlyBtn = new Sequence(pointer181, 1);
		HourlyBtn.addAction(pointer181.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 332, 568));
		HourlyBtn .addAction(pointer181.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		HourlyBtn .addAction(new Pause(pointer181, Duration.ofMillis(100)));
		HourlyBtn .addAction(pointer181.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(HourlyBtn));
		Thread.sleep(10000);


		PointerInput pointer220 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence scedulelaterBtn = new Sequence(pointer220, 1);
		scedulelaterBtn.addAction(pointer220.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 142, 665));
		scedulelaterBtn .addAction(pointer220.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		scedulelaterBtn .addAction(new Pause(pointer220, Duration.ofMillis(100)));
		scedulelaterBtn .addAction(pointer220.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(scedulelaterBtn));
		Thread.sleep(10000);


		PointerInput pointer2201 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer2201, 1);
		proceedBtn.addAction(pointer2201.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 215, 900));
		proceedBtn .addAction(pointer2201.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn .addAction(new Pause(pointer2201, Duration.ofMillis(100)));
		proceedBtn .addAction(pointer2201.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn));
		Thread.sleep(10000);
	}


	public void testOnHomeScreenHourlyPickupFromPage() throws InterruptedException {
		PointerInput pointer23 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence HourlypickupCurrentLoc = new Sequence(pointer23, 1);
		HourlypickupCurrentLoc.addAction(pointer23.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 265, 806));
		HourlypickupCurrentLoc .addAction(pointer23.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		HourlypickupCurrentLoc .addAction(new Pause(pointer23, Duration.ofMillis(100)));
		HourlypickupCurrentLoc .addAction(pointer23.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(HourlypickupCurrentLoc));
		Thread.sleep(10000);


		String pickUpFrom = "Bhurjkhalifa";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		PointerInput pointer24 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence bhurjkhalifaLoc = new Sequence(pointer23, 1);
		bhurjkhalifaLoc.addAction(pointer24.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 335, 265));
		bhurjkhalifaLoc .addAction(pointer24.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		bhurjkhalifaLoc .addAction(new Pause(pointer24, Duration.ofMillis(100)));
		bhurjkhalifaLoc .addAction(pointer24.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(bhurjkhalifaLoc));
		Thread.sleep(10000);


		PointerInput pointer25 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer25, 1);
		proceedBtn .addAction(pointer25.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 875));
		proceedBtn  .addAction(pointer25.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer25, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer25.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);
	}
	//////////Dubai International Airport Pickup////////////

	public void testOnHomeScreenHourly_DIA_PickupFromPage() throws InterruptedException {
		PointerInput pointer23 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence HourlypickupCurrentLoc = new Sequence(pointer23, 1);
		HourlypickupCurrentLoc.addAction(pointer23.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 265, 806));
		HourlypickupCurrentLoc .addAction(pointer23.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		HourlypickupCurrentLoc .addAction(new Pause(pointer23, Duration.ofMillis(100)));
		HourlypickupCurrentLoc .addAction(pointer23.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(HourlypickupCurrentLoc));
		Thread.sleep(10000);


		String pickUpFrom = "Dubaiinternationalairport";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		PointerInput pointer24 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence diaLoc = new Sequence(pointer23, 1);
		diaLoc.addAction(pointer24.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 335, 265));
		diaLoc .addAction(pointer24.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		diaLoc .addAction(new Pause(pointer24, Duration.ofMillis(100)));
		diaLoc .addAction(pointer24.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(diaLoc));
		Thread.sleep(10000);



	}
	public void testOnHomeScreenHourly_DIA_PickupTerminal1() throws InterruptedException {

		PointerInput pointer256 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence terninaldropdownBtn = new Sequence(pointer256, 1);
		terninaldropdownBtn .addAction(pointer256.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 50, 790));
		terninaldropdownBtn  .addAction(pointer256.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		terninaldropdownBtn  .addAction(new Pause(pointer256, Duration.ofMillis(100)));
		terninaldropdownBtn .addAction(pointer256.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(terninaldropdownBtn));
		Thread.sleep(10000);


		PointerInput pointer257 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence terminal1Btn = new Sequence(pointer257, 1);
		terminal1Btn.addAction(pointer257.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 315, 625));
		terminal1Btn.addAction(pointer257.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		terminal1Btn.addAction(new Pause(pointer257, Duration.ofMillis(100)));
		terminal1Btn.addAction(pointer257.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(terminal1Btn));
		Thread.sleep(10000);


		PointerInput pointer258 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer258, 1);
		proceedBtn .addAction(pointer258.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 216, 874));
		proceedBtn  .addAction(pointer258.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer258, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer258.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);





	}

	public void testOnHomeScreenHourly_DIA_PickupTerminal2() throws InterruptedException {

		PointerInput pointer256 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence terninaldropdownBtn = new Sequence(pointer256, 1);
		terninaldropdownBtn .addAction(pointer256.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 50, 790));
		terninaldropdownBtn  .addAction(pointer256.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		terninaldropdownBtn  .addAction(new Pause(pointer256, Duration.ofMillis(100)));
		terninaldropdownBtn .addAction(pointer256.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(terninaldropdownBtn));
		Thread.sleep(10000);


		PointerInput pointer257 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence terminal2Btn = new Sequence(pointer257, 1);
		terminal2Btn.addAction(pointer257.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 315, 675));
		terminal2Btn.addAction(pointer257.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		terminal2Btn.addAction(new Pause(pointer257, Duration.ofMillis(100)));
		terminal2Btn.addAction(pointer257.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(terminal2Btn));
		Thread.sleep(10000);


		PointerInput pointer258 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer258, 1);
		proceedBtn .addAction(pointer258.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 216, 874));
		proceedBtn  .addAction(pointer258.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer258, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer258.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(15000);





	}
	public void testOnHomeScreenHourly_DIA_PickupTerminal3() throws InterruptedException {

		PointerInput pointer256 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence terninaldropdownBtn = new Sequence(pointer256, 1);
		terninaldropdownBtn .addAction(pointer256.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 50, 790));
		terninaldropdownBtn  .addAction(pointer256.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		terninaldropdownBtn  .addAction(new Pause(pointer256, Duration.ofMillis(100)));
		terninaldropdownBtn .addAction(pointer256.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(terninaldropdownBtn));
		Thread.sleep(10000);


		PointerInput pointer257 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence terminal3Btn = new Sequence(pointer257, 1);
		terminal3Btn.addAction(pointer257.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 315, 725));
		terminal3Btn.addAction(pointer257.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		terminal3Btn.addAction(new Pause(pointer257, Duration.ofMillis(100)));
		terminal3Btn.addAction(pointer257.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(terminal3Btn));
		Thread.sleep(10000);


		PointerInput pointer258 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer258, 1);
		proceedBtn .addAction(pointer258.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 216, 874));
		proceedBtn  .addAction(pointer258.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer258, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer258.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);





	}
	////////////////Dubai mall pickup for hourly/////////
	public void testOnHomeScreenHourly_DM_PickupFromPage() throws InterruptedException {
		PointerInput pointer231 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence HourlypickupCurrentLoc = new Sequence(pointer231, 1);
		HourlypickupCurrentLoc.addAction(pointer231.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 265, 806));
		HourlypickupCurrentLoc .addAction(pointer231.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		HourlypickupCurrentLoc .addAction(new Pause(pointer231, Duration.ofMillis(100)));
		HourlypickupCurrentLoc .addAction(pointer231.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(HourlypickupCurrentLoc));
		Thread.sleep(10000);


		String pickUpFrom = "Dubaimall";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		PointerInput pointer241 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence dmLoc = new Sequence(pointer241, 1);
		dmLoc.addAction(pointer241.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 335, 265));
		dmLoc .addAction(pointer241.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		dmLoc .addAction(new Pause(pointer241, Duration.ofMillis(100)));
		dmLoc .addAction(pointer241.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(dmLoc));
		Thread.sleep(10000);



	}
	public void testOnHomeScreenHourly_DM_Pickup_CinemaParking() throws InterruptedException {

		PointerInput pointer256 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence locdownBtn = new Sequence(pointer256, 1);
		locdownBtn .addAction(pointer256.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 50, 790));
		locdownBtn  .addAction(pointer256.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		locdownBtn  .addAction(new Pause(pointer256, Duration.ofMillis(100)));
		locdownBtn .addAction(pointer256.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(locdownBtn));
		Thread.sleep(10000);


		PointerInput pointer257 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence cinemaParkingBtn = new Sequence(pointer257, 1);
		cinemaParkingBtn.addAction(pointer257.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 320, 574));
		cinemaParkingBtn.addAction(pointer257.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		cinemaParkingBtn.addAction(new Pause(pointer257, Duration.ofMillis(100)));
		cinemaParkingBtn.addAction(pointer257.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(cinemaParkingBtn));
		Thread.sleep(10000);


		PointerInput pointer258 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer258, 1);
		proceedBtn .addAction(pointer258.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 223, 874));
		proceedBtn  .addAction(pointer258.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer258, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer258.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);





	}
	public void testOnHomeScreenHourly_DM_Pickup_FA_Parking() throws InterruptedException {
		PointerInput pointer256 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence locdownBtn = new Sequence(pointer256, 1);
		locdownBtn .addAction(pointer256.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 50, 790));
		locdownBtn  .addAction(pointer256.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		locdownBtn  .addAction(new Pause(pointer256, Duration.ofMillis(100)));
		locdownBtn .addAction(pointer256.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(locdownBtn));
		Thread.sleep(10000);


		PointerInput pointer257 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence FA_ParkingBtn = new Sequence(pointer257, 1);
		FA_ParkingBtn.addAction(pointer257.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 310, 626));
		FA_ParkingBtn.addAction(pointer257.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		FA_ParkingBtn.addAction(new Pause(pointer257, Duration.ofMillis(100)));
		FA_ParkingBtn.addAction(pointer257.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(FA_ParkingBtn));
		Thread.sleep(10000);


		PointerInput pointer258 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer258, 1);
		proceedBtn .addAction(pointer258.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 223, 874));
		proceedBtn  .addAction(pointer258.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer258, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer258.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);
	}


	public void testOnHomeScreenHourly_DM_Pickup_Du_LglParking() throws InterruptedException {

		PointerInput pointer256 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence locdownBtn = new Sequence(pointer256, 1);
		locdownBtn .addAction(pointer256.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 50, 790));
		locdownBtn  .addAction(pointer256.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		locdownBtn  .addAction(new Pause(pointer256, Duration.ofMillis(100)));
		locdownBtn .addAction(pointer256.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(locdownBtn));
		Thread.sleep(10000);


		PointerInput pointer257 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence Du_LglParkingBtn = new Sequence(pointer257, 1);
		Du_LglParkingBtn.addAction(pointer257.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 305, 674));
		Du_LglParkingBtn.addAction(pointer257.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		Du_LglParkingBtn.addAction(new Pause(pointer257, Duration.ofMillis(100)));
		Du_LglParkingBtn.addAction(pointer257.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(Du_LglParkingBtn));
		Thread.sleep(10000);


		PointerInput pointer258 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer258, 1);
		proceedBtn .addAction(pointer258.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 223, 874));
		proceedBtn  .addAction(pointer258.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer258, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer258.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);





	}

	public void testOnHomeScreenHourly_DM_Pickup_ZabeelParking() throws InterruptedException {

		PointerInput pointer256 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence locdownBtn = new Sequence(pointer256, 1);
		locdownBtn .addAction(pointer256.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 50, 790));
		locdownBtn  .addAction(pointer256.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		locdownBtn  .addAction(new Pause(pointer256, Duration.ofMillis(100)));
		locdownBtn .addAction(pointer256.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(locdownBtn));
		Thread.sleep(10000);


		PointerInput pointer257 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence ZabeelParkingBtn = new Sequence(pointer257, 1);
		ZabeelParkingBtn.addAction(pointer257.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 225, 725));
		ZabeelParkingBtn.addAction(pointer257.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		ZabeelParkingBtn.addAction(new Pause(pointer257, Duration.ofMillis(100)));
		ZabeelParkingBtn.addAction(pointer257.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(ZabeelParkingBtn));
		Thread.sleep(10000);


		PointerInput pointer258 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer258, 1);
		proceedBtn .addAction(pointer258.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 223, 874));
		proceedBtn  .addAction(pointer258.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer258, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer258.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);





	}

	/////////////// Airport pick up note////////////////   
	public void testOncAPUPage() throws InterruptedException {
		PointerInput pointerAPU = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence apuBtn = new Sequence(pointerAPU, 1);
		apuBtn .addAction(pointerAPU.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 588));
		apuBtn.addAction(pointerAPU.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		apuBtn.addAction(new Pause(pointerAPU, Duration.ofMillis(100)));
		apuBtn.addAction(pointerAPU.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(apuBtn));
		Thread.sleep(10000);


		PointerInput pointerFnu = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence flightNumBtn = new Sequence(pointerFnu, 1);
		flightNumBtn .addAction(pointerFnu.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 90, 390));
		flightNumBtn.addAction(pointerFnu.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		flightNumBtn.addAction(new Pause(pointerFnu, Duration.ofMillis(100)));
		flightNumBtn.addAction(pointerFnu.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(flightNumBtn));
		Thread.sleep(10000);



		String Fnumber = "Onefourtwothree";
		for (char cha :Fnumber.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}

		PointerInput pointername = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence nameBtn = new Sequence(pointername, 1);
		nameBtn .addAction(pointername.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 88, 406));
		nameBtn.addAction(pointername.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		nameBtn.addAction(new Pause(pointername, Duration.ofMillis(100)));
		nameBtn.addAction(pointername.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(nameBtn));
		Thread.sleep(10000);


		String name = "Muthugajaraja";
		for (char cha : name.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}



		PointerInput pointercontinueBtn = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence continueBtn3 = new Sequence(pointercontinueBtn, 1);
		continueBtn3.addAction(pointercontinueBtn.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 221, 610));
		continueBtn3.addAction(pointercontinueBtn.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		continueBtn3.addAction(new Pause(pointercontinueBtn, Duration.ofMillis(100)));
		continueBtn3.addAction(pointercontinueBtn.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(continueBtn3));
		Thread.sleep(10000);


	}




	//////////////Hourly start trip pickup popup/////////
	public void testOnpickuppopUpBar() throws InterruptedException {

		PointerInput pointer00 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence okBtn = new Sequence(pointer00, 1);
		okBtn  .addAction(pointer00.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),221, 883));
		okBtn .addAction(pointer00.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		okBtn .addAction(new Pause(pointer00, Duration.ofMillis(100)));
		okBtn .addAction(pointer00.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(okBtn ));
		Thread.sleep(20000);



		PointerInput pointer0 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence popUpBtn = new Sequence(pointer0, 1);
		popUpBtn .addAction(pointer0.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),200, 870));
		popUpBtn.addAction(pointer0.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		popUpBtn.addAction(new Pause(pointer0, Duration.ofMillis(100)));
		popUpBtn.addAction(pointer0.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(popUpBtn));
		Thread.sleep(20000);
	}
	/////////////Hourly start trip early////////////
	public void testOnStarttriEarlyBtn() throws InterruptedException {
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(finger, 1);

		int startX = 215;  // adjust based on your screen
		int startY = 846;
		int endY = 414;

		swipe.addAction(finger.createPointerMove(ofMillis(0), PointerInput.Origin.viewport(), startX, startY));
		swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		swipe.addAction(finger.createPointerMove(ofMillis(500), PointerInput.Origin.viewport(), startX, endY));
		swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(List.of(swipe));
		Thread.sleep(2000);
		driver.perform(List.of(swipe));
		Thread.sleep(2000);


		PointerInput pointer02 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence startBtn = new Sequence(pointer02, 1);
		startBtn .addAction(pointer02.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),307, 770));
		startBtn .addAction(pointer02.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		startBtn  .addAction(new Pause(pointer02, Duration.ofMillis(100)));
		startBtn .addAction(pointer02.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(startBtn));
		Thread.sleep(10000);


		PointerInput pointer03 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence yesBtn = new Sequence(pointer03, 1);
		yesBtn .addAction(pointer03.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),132, 912));
		yesBtn .addAction(pointer03.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		yesBtn  .addAction(new Pause(pointer03, Duration.ofMillis(100)));
		yesBtn .addAction(pointer03.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(yesBtn));
		Thread.sleep(10000);



		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe1 = new Sequence(finger1, 1);

		int startX1 = 846;  // adjust based on your screen
		int startY1 = 215;
		int endY1 = 414;

		swipe1.addAction(finger1.createPointerMove(ofMillis(0), PointerInput.Origin.viewport(), startX1, startY1));
		swipe1.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		swipe1.addAction(finger1.createPointerMove(ofMillis(500), PointerInput.Origin.viewport(), startX1, endY1));
		swipe1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(List.of(swipe1));
		Thread.sleep(2000);
		driver.perform(List.of(swipe1));
		Thread.sleep(2000);
	}




	////////start trip early cancel////////////
	public void testOnStartTripcancelbookingPage() throws InterruptedException {
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(finger, 1);

		int startX = 215;  // adjust based on your screen
		int startY = 846;
		int endY = 414;

		swipe.addAction(finger.createPointerMove(ofMillis(0), PointerInput.Origin.viewport(), startX, startY));
		swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		swipe.addAction(finger.createPointerMove(ofMillis(500), PointerInput.Origin.viewport(), startX, endY));
		swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(List.of(swipe));
		Thread.sleep(2000);
		driver.perform(List.of(swipe));
		Thread.sleep(2000);


		PointerInput pointer02 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence startBtn = new Sequence(pointer02, 1);
		startBtn .addAction(pointer02.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),307, 770));
		startBtn .addAction(pointer02.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		startBtn  .addAction(new Pause(pointer02, Duration.ofMillis(100)));
		startBtn .addAction(pointer02.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(startBtn));
		Thread.sleep(10000);


		PointerInput pointer03 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence yesBtn = new Sequence(pointer03, 1);
		yesBtn .addAction(pointer03.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),132, 912));
		yesBtn .addAction(pointer03.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		yesBtn  .addAction(new Pause(pointer03, Duration.ofMillis(100)));
		yesBtn .addAction(pointer03.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(yesBtn));
		Thread.sleep(10000);


		PointerInput pointer04 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence cancelBookingBtn = new Sequence(pointer04, 1);
		cancelBookingBtn .addAction(pointer04.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),327, 866));
		cancelBookingBtn .addAction(pointer04.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		cancelBookingBtn.addAction(new Pause(pointer04, Duration.ofMillis(100)));
		cancelBookingBtn.addAction(pointer04.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(cancelBookingBtn));
		Thread.sleep(10000);

		PointerInput pointer05 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence cancelBookingyesBtn = new Sequence(pointer05, 1);
		cancelBookingyesBtn .addAction(pointer05.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),320, 882));
		cancelBookingyesBtn .addAction(pointer05.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		cancelBookingyesBtn.addAction(new Pause(pointer05, Duration.ofMillis(100)));
		cancelBookingyesBtn.addAction(pointer05.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(cancelBookingyesBtn));
		Thread.sleep(10000);


		PointerInput pointer06 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence reasonBtn = new Sequence(pointer06, 1);
		reasonBtn .addAction(pointer06.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),400, 672));
		reasonBtn .addAction(pointer06.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		reasonBtn.addAction(new Pause(pointer06, Duration.ofMillis(100)));
		reasonBtn.addAction(pointer06.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(reasonBtn));
		Thread.sleep(10000);
		PointerInput pointer07 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence conreasonBtn = new Sequence(pointer07, 1);
		conreasonBtn .addAction(pointer07.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),222, 900));
		conreasonBtn .addAction(pointer07.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		conreasonBtn.addAction(new Pause(pointer07, Duration.ofMillis(100)));
		conreasonBtn.addAction(pointer07.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(conreasonBtn));
		Thread.sleep(10000);
	}
	////////////payment incomplete pay now//////////////
	public void testOnPayNowPageCard() throws InterruptedException {
		PointerInput pointer0 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence payNowBtn = new Sequence(pointer0, 1);
		payNowBtn .addAction(pointer0.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),222, 466));
		payNowBtn.addAction(pointer0.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		payNowBtn.addAction(new Pause(pointer0, Duration.ofMillis(100)));
		payNowBtn.addAction(pointer0.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(payNowBtn));
		Thread.sleep(10000);




		PointerInput pointer0100= new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence cardBtn = new Sequence(pointer0100, 1);
		cardBtn .addAction(pointer0.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),110, 183));
		cardBtn.addAction(pointer0100.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		cardBtn.addAction(new Pause(pointer0100, Duration.ofMillis(100)));
		cardBtn.addAction(pointer0100.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(cardBtn));
		Thread.sleep(16000);


		PointerInput pointer02 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence confirmBtn = new Sequence(pointer02, 1);
		confirmBtn .addAction(pointer02.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),325, 873));
		confirmBtn.addAction(pointer02.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		confirmBtn.addAction(new Pause(pointer02, Duration.ofMillis(100)));
		confirmBtn.addAction(pointer02.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(confirmBtn));

	}


	public void testOnPayNowPageApplePay() throws InterruptedException {
		PointerInput pointer0 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence payNowBtn1 = new Sequence(pointer0, 1);
		payNowBtn1 .addAction(pointer0.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),222, 466));
		payNowBtn1.addAction(pointer0.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		payNowBtn1.addAction(new Pause(pointer0, Duration.ofMillis(100)));
		payNowBtn1.addAction(pointer0.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(payNowBtn1));
		Thread.sleep(10000);




		PointerInput pointer01001= new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence appleBtn = new Sequence(pointer01001, 1);
		appleBtn .addAction(pointer01001.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),105, 265));
		appleBtn.addAction(pointer01001.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		appleBtn.addAction(new Pause(pointer01001, Duration.ofMillis(100)));
		appleBtn.addAction(pointer01001.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(appleBtn));
		Thread.sleep(16000);


		PointerInput pointer02 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence confirmBtn = new Sequence(pointer02, 1);
		confirmBtn .addAction(pointer02.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),325, 873));
		confirmBtn.addAction(pointer02.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		confirmBtn.addAction(new Pause(pointer02, Duration.ofMillis(100)));
		confirmBtn.addAction(pointer02.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(confirmBtn));

	}
	/////////// first class car selection for start trip early////////////


	public void testOncarselectionPage1() throws InterruptedException {
		PointerInput pointer0 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence firstclassBtn = new Sequence(pointer0, 1);
		firstclassBtn .addAction(pointer0.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(),220, 657));
		firstclassBtn  .addAction(pointer0.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		firstclassBtn  .addAction(new Pause(pointer0, Duration.ofMillis(100)));
		firstclassBtn .addAction(pointer0.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(firstclassBtn));
		Thread.sleep(20000);
	}

	////////// hourly schedule later car selection///////

	public void testOncarselectionPage() throws InterruptedException {
		PointerInput pointer0 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence firstclassBtn = new Sequence(pointer0, 1);
		firstclassBtn .addAction(pointer0.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 150, 248));
		firstclassBtn  .addAction(pointer0.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		firstclassBtn  .addAction(new Pause(pointer0, Duration.ofMillis(100)));
		firstclassBtn .addAction(pointer0.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(firstclassBtn));
		Thread.sleep(25000);
	}


	public void testOnpaymentPageforcash() throws InterruptedException {

		PointerInput pointer01345 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence selectionBtn = new Sequence(pointer01345, 1);
		selectionBtn .addAction(pointer01345.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 375, 905));
		selectionBtn  .addAction(pointer01345.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		selectionBtn .addAction(new Pause(pointer01345, Duration.ofMillis(100)));
		selectionBtn .addAction(pointer01345.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(selectionBtn));
		Thread.sleep(10000);



		PointerInput pointer0211 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence cashBtn1 = new Sequence(pointer0211, 1);
		cashBtn1 .addAction(pointer0211.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 344, 625));
		cashBtn1 .addAction(pointer0211.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		cashBtn1.addAction(new Pause(pointer0211, Duration.ofMillis(100)));
		cashBtn1.addAction(pointer0211.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(cashBtn1));
		Thread.sleep(10000);



		PointerInput pointer03 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence confirmBtn = new Sequence(pointer03, 1);
		confirmBtn .addAction(pointer03.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 897));
		confirmBtn .addAction(pointer03.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		confirmBtn .addAction(new Pause(pointer03, Duration.ofMillis(100)));
		confirmBtn .addAction(pointer03.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(confirmBtn));
		Thread.sleep(10000);

		PointerInput pointer04 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence confirmclassBtn = new Sequence(pointer04, 1);
		confirmclassBtn .addAction(pointer04.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 177, 901));
		confirmclassBtn .addAction(pointer04.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		confirmclassBtn .addAction(new Pause(pointer04, Duration.ofMillis(100)));
		confirmclassBtn.addAction(pointer04.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(confirmclassBtn));
		Thread.sleep(30000);
	}
	public void testOnpaymentPageforcard() throws InterruptedException {

		PointerInput pointer01 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence selectBtn = new Sequence(pointer01, 1);
		selectBtn .addAction(pointer01.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 375, 905));
		selectBtn  .addAction(pointer01.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		selectBtn .addAction(new Pause(pointer01, Duration.ofMillis(100)));
		selectBtn .addAction(pointer01.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(selectBtn));
		Thread.sleep(10000);



		PointerInput pointer02 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence cardBtn = new Sequence(pointer02, 1);
		cardBtn .addAction(pointer02.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 279, 693));
		cardBtn .addAction(pointer02.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		cardBtn .addAction(new Pause(pointer02, Duration.ofMillis(100)));
		cardBtn .addAction(pointer02.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(cardBtn));
		Thread.sleep(10000);



		PointerInput pointer03 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence confirmBtn = new Sequence(pointer03, 1);
		confirmBtn .addAction(pointer03.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 897));
		confirmBtn .addAction(pointer03.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		confirmBtn .addAction(new Pause(pointer03, Duration.ofMillis(100)));
		confirmBtn .addAction(pointer03.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(confirmBtn));
		Thread.sleep(10000);

		PointerInput pointer04 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence confirmclassBtn = new Sequence(pointer04, 1);
		confirmclassBtn .addAction(pointer04.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 177, 901));
		confirmclassBtn .addAction(pointer04.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		confirmclassBtn .addAction(new Pause(pointer04, Duration.ofMillis(100)));
		confirmclassBtn.addAction(pointer04.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(confirmclassBtn));
		Thread.sleep(30000);
	}

	public void testOnpaymentPageforapplePay() throws InterruptedException {

		PointerInput pointer01 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence selectBtn = new Sequence(pointer01, 1);
		selectBtn .addAction(pointer01.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 375, 905));
		selectBtn  .addAction(pointer01.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		selectBtn .addAction(new Pause(pointer01, Duration.ofMillis(100)));
		selectBtn .addAction(pointer01.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(selectBtn));
		Thread.sleep(10000);



		PointerInput pointer02 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence payBtn = new Sequence(pointer02, 1);
		payBtn .addAction(pointer02.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 315, 764));
		payBtn .addAction(pointer02.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		payBtn .addAction(new Pause(pointer02, Duration.ofMillis(100)));
		payBtn .addAction(pointer02.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(payBtn));
		Thread.sleep(10000);



		PointerInput pointer03 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence confirmBtn = new Sequence(pointer03, 1);
		confirmBtn .addAction(pointer03.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 897));
		confirmBtn .addAction(pointer03.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		confirmBtn .addAction(new Pause(pointer03, Duration.ofMillis(100)));
		confirmBtn .addAction(pointer03.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(confirmBtn));
		Thread.sleep(10000);

		PointerInput pointer04 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence confirmclassBtn = new Sequence(pointer04, 1);
		confirmclassBtn .addAction(pointer04.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 177, 901));
		confirmclassBtn .addAction(pointer04.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		confirmclassBtn .addAction(new Pause(pointer04, Duration.ofMillis(100)));
		confirmclassBtn.addAction(pointer04.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(confirmclassBtn));
		Thread.sleep(30000);
	}
	public void testOnChauffeurNotes() throws InterruptedException {
		PointerInput pointer021 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence addnoteBtn = new Sequence(pointer021, 1);
		addnoteBtn .addAction(pointer021.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 123, 841));
		addnoteBtn.addAction(pointer021.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		addnoteBtn .addAction(new Pause(pointer021, Duration.ofMillis(100)));
		addnoteBtn.addAction(pointer021.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(addnoteBtn));
		Thread.sleep(10000);

		PointerInput pointer0221 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence yournoteBtn = new Sequence(pointer0221, 1);
		yournoteBtn .addAction(pointer0221.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 373, 373));
		yournoteBtn.addAction(pointer0221.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		yournoteBtn .addAction(new Pause(pointer0221, Duration.ofMillis(100)));
		yournoteBtn.addAction(pointer0221.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(yournoteBtn));
		Thread.sleep(10000);

		String pickUpFrom = "Paneertikka";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}

		PointerInput pointer0321 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer0321, 1);
		proceedBtn .addAction(pointer0321.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 214, 610));
		proceedBtn.addAction(pointer0321.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn .addAction(new Pause(pointer0321, Duration.ofMillis(100)));
		proceedBtn.addAction(pointer0321.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn));
		Thread.sleep(10000);

	}
	public void testOnphourlySelectionPage() throws InterruptedException {
		PointerInput pointer018 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence onehourBtn = new Sequence(pointer018, 1);
		onehourBtn  .addAction(pointer018.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 168, 654));
		onehourBtn  .addAction(pointer018.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		onehourBtn  .addAction(new Pause(pointer018, Duration.ofMillis(100)));
		onehourBtn .addAction(pointer018.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(onehourBtn ));
		Thread.sleep(10000);


		PointerInput pointer77 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence confirmBtn = new Sequence( pointer77, 1);
		confirmBtn  .addAction( pointer77.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 163, 912));
		confirmBtn  .addAction( pointer77.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		confirmBtn  .addAction(new Pause( pointer77, Duration.ofMillis(100)));
		confirmBtn .addAction( pointer77.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(confirmBtn));
		Thread.sleep(40000);
	}

	public void testOnpickUpPage() throws InterruptedException {
		PointerInput pointer77 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence oBtn = new Sequence( pointer77, 1);
		oBtn.addAction( pointer77.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 200, 809));
		oBtn.addAction( pointer77.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		oBtn.addAction(new Pause( pointer77, Duration.ofMillis(100)));
		oBtn.addAction( pointer77.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(oBtn));
		Thread.sleep(120000);
	}
	////////////// Hourly stops ////////////////
	public void testOnWhereToPage() throws InterruptedException {
		PointerInput pointer055 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence whereToBtn = new Sequence( pointer055, 1);
		whereToBtn  .addAction( pointer055.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 400, 490));
		whereToBtn  .addAction( pointer055.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		whereToBtn .addAction(new Pause( pointer055, Duration.ofMillis(100)));
		whereToBtn.addAction( pointer055.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(whereToBtn));
		Thread.sleep(10000);

		PointerInput pointer099 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence addstop1 = new Sequence( pointer099, 1);
		addstop1  .addAction( pointer099.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 280, 235));
		addstop1 .addAction( pointer099.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		addstop1 .addAction(new Pause( pointer099, Duration.ofMillis(100)));
		addstop1.addAction( pointer099.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(addstop1));
		Thread.sleep(10000);

		String stop1 = "Dubaimall";
		for (char cha : stop1.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}
		PointerInput pointer100 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence addstop1con = new Sequence( pointer100, 1);
		addstop1con  .addAction( pointer100.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 344, 310));
		addstop1con .addAction( pointer100.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		addstop1con .addAction(new Pause( pointer100, Duration.ofMillis(100)));
		addstop1con.addAction( pointer100.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(addstop1con));
		Thread.sleep(10000);

		PointerInput pointer1100 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence addstop2 = new Sequence( pointer1100, 1);
		addstop2  .addAction( pointer1100.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 290, 300));
		addstop2 .addAction( pointer1100.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		addstop2.addAction(new Pause( pointer1100, Duration.ofMillis(100)));
		addstop2.addAction( pointer1100.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(addstop2));
		Thread.sleep(10000);

		String stop2 = "Palmjumeirah";
		for (char cha : stop2.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}
		PointerInput pointer800 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence addstop2con = new Sequence( pointer800, 1);
		addstop2con  .addAction( pointer800.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 344, 310));
		addstop2con .addAction( pointer800.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		addstop2con .addAction(new Pause( pointer800, Duration.ofMillis(100)));
		addstop2con.addAction( pointer800.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(addstop2con));
		Thread.sleep(10000);




		PointerInput pointer1200 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence addstop3 = new Sequence( pointer1200, 1);
		addstop3  .addAction( pointer1200.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 292, 365));
		addstop3 .addAction( pointer1200.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		addstop3.addAction(new Pause( pointer1200, Duration.ofMillis(100)));
		addstop3.addAction( pointer1200.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(addstop3));
		Thread.sleep(10000);

		String stop3 = "Dubaiwaterfront";
		for (char cha : stop3.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}
		PointerInput pointer8100 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence addstop3con = new Sequence( pointer8100, 1);
		addstop3con  .addAction( pointer8100.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 344, 310));
		addstop3con .addAction( pointer8100.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		addstop3con .addAction(new Pause( pointer8100, Duration.ofMillis(100)));
		addstop3con.addAction( pointer8100.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(addstop3con));
		Thread.sleep(10000);

		PointerInput pointer98 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence updateBtn = new Sequence( pointer98, 1);
		updateBtn  .addAction( pointer98.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 224, 904));
		updateBtn .addAction( pointer98.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		updateBtn .addAction(new Pause( pointer98, Duration.ofMillis(100)));
		updateBtn.addAction( pointer98.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(updateBtn));
		Thread.sleep(25000);


		PointerInput pointer8200 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence whereto2Btn = new Sequence( pointer8200, 1);
		whereto2Btn.addAction( pointer8200.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 400, 490));
		whereto2Btn.addAction( pointer8200.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		whereto2Btn .addAction(new Pause( pointer8200, Duration.ofMillis(100)));
		whereto2Btn.addAction( pointer8200.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(whereto2Btn));
		Thread.sleep(10000);

		PointerInput pointer098 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence addstop4 = new Sequence( pointer098, 1);
		addstop4  .addAction( pointer098.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 262, 431));
		addstop4 .addAction( pointer098.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		addstop4.addAction(new Pause( pointer098, Duration.ofMillis(100)));
		addstop4.addAction( pointer098.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(addstop4));
		Thread.sleep(10000);


		String stop4 = "Dubaiaquarium";
		for (char cha : stop4.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}
		PointerInput pointer999 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence addstop4con = new Sequence( pointer999, 1);
		addstop4con  .addAction( pointer999.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 344, 310));
		addstop4con .addAction( pointer999.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		addstop4con.addAction(new Pause( pointer999, Duration.ofMillis(100)));
		addstop4con.addAction( pointer999.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(addstop4con));
		Thread.sleep(10000);

		driver.perform(Arrays.asList(updateBtn));
		Thread.sleep(35000); 

	}
	public void testOnQuickFeedBackPage() throws InterruptedException {
		PointerInput pointer111 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence subBtn = new Sequence( pointer111, 1);
		subBtn.addAction( pointer111.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 767));
		subBtn .addAction( pointer111.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		subBtn.addAction(new Pause( pointer111, Duration.ofMillis(100)));
		subBtn.addAction( pointer111.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(subBtn));
		Thread.sleep(10000);
	}

	public void testOnFeedBackPage() throws InterruptedException {
		PointerInput pointer112 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence starBtn = new Sequence( pointer112, 1);
		starBtn.addAction( pointer112.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 221, 429));
		starBtn.addAction( pointer112.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		starBtn.addAction(new Pause( pointer112, Duration.ofMillis(100)));
		starBtn.addAction( pointer112.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(starBtn));
		Thread.sleep(10000);

		PointerInput pointer113 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence submitBtn = new Sequence( pointer112, 1);
		submitBtn.addAction( pointer113.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 217, 911));
		submitBtn.addAction( pointer113.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		submitBtn.addAction(new Pause( pointer113, Duration.ofMillis(100)));
		submitBtn.addAction( pointer113.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(submitBtn));
		Thread.sleep(10000);
	}








	//////////////////Ride Now ////////////////////////

	public void testOnHomeScreenRideNow_ScheduleLaterBtn() throws InterruptedException {
		PointerInput pointer220 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence scedulelaterBtn = new Sequence(pointer220, 1);
		scedulelaterBtn.addAction(pointer220.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 320, 665));
		scedulelaterBtn .addAction(pointer220.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		scedulelaterBtn .addAction(new Pause(pointer220, Duration.ofMillis(100)));
		scedulelaterBtn .addAction(pointer220.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(scedulelaterBtn));
		Thread.sleep(10000);


		PointerInput pointer2201 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer2201, 1);
		proceedBtn.addAction(pointer2201.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 215, 900));
		proceedBtn .addAction(pointer2201.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn .addAction(new Pause(pointer2201, Duration.ofMillis(100)));
		proceedBtn .addAction(pointer2201.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn));
		Thread.sleep(10000);
	}
	public void testOnHomeScreen_RideNow_DIA_WhereToPage() throws InterruptedException {
		PointerInput pointer2201 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence currentLocBtn = new Sequence(pointer2201, 1);
		currentLocBtn.addAction(pointer2201.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 160, 180));
		currentLocBtn.addAction(pointer2201.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		currentLocBtn.addAction(new Pause(pointer2201, Duration.ofMillis(100)));
		currentLocBtn.addAction(pointer2201.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(currentLocBtn));
		Thread.sleep(10000);


		String pickUpFrom = "Dubaiinternationalairport";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		PointerInput pointer24 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence diaLoc = new Sequence(pointer24, 1);
		diaLoc.addAction(pointer24.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 195, 330));
		diaLoc.addAction(pointer24.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		diaLoc.addAction(new Pause(pointer24, Duration.ofMillis(100)));
		diaLoc.addAction(pointer24.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(diaLoc));
		Thread.sleep(10000);


		PointerInput pointer = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence destinationBlk = new Sequence(pointer, 1);
		destinationBlk.addAction(pointer.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 160, 240));
		destinationBlk.addAction(pointer.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		destinationBlk.addAction(new Pause(pointer, Duration.ofMillis(100)));
		destinationBlk.addAction(pointer.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(destinationBlk));
		Thread.sleep(10000);



		String toBlk = "Palmjumeirah";
		for (char cha : toBlk.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}

		PointerInput pointer1 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence palmLoc = new Sequence(pointer1, 1);
		palmLoc.addAction(pointer1.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 150, 325));
		palmLoc.addAction(pointer1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		palmLoc.addAction(new Pause(pointer1, Duration.ofMillis(100)));
		palmLoc.addAction(pointer1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(palmLoc));
		Thread.sleep(10000);

	}


	public void testOnHomeScreen_RideNow_DM_WhereToPage() throws InterruptedException {
		PointerInput pointer2201 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence currentLocBtn = new Sequence(pointer2201, 1);
		currentLocBtn.addAction(pointer2201.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 160, 180));
		currentLocBtn.addAction(pointer2201.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		currentLocBtn.addAction(new Pause(pointer2201, Duration.ofMillis(100)));
		currentLocBtn.addAction(pointer2201.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(currentLocBtn));
		Thread.sleep(10000);


		String pickUpFrom = "Dubaimall";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		PointerInput pointer24 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence diaLoc = new Sequence(pointer24, 1);
		diaLoc.addAction(pointer24.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 195, 330));
		diaLoc.addAction(pointer24.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		diaLoc.addAction(new Pause(pointer24, Duration.ofMillis(100)));
		diaLoc.addAction(pointer24.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(diaLoc));
		Thread.sleep(10000);


		PointerInput pointer = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence destinationBlk = new Sequence(pointer, 1);
		destinationBlk.addAction(pointer.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 160, 240));
		destinationBlk.addAction(pointer.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		destinationBlk.addAction(new Pause(pointer, Duration.ofMillis(100)));
		destinationBlk.addAction(pointer.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(destinationBlk));
		Thread.sleep(10000);



		String toBlk = "Palmjumeirah";
		for (char cha : toBlk.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}

		PointerInput pointer1 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence palmLoc = new Sequence(pointer1, 1);
		palmLoc.addAction(pointer1.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 150, 325));
		palmLoc.addAction(pointer1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		palmLoc.addAction(new Pause(pointer1, Duration.ofMillis(100)));
		palmLoc.addAction(pointer1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(palmLoc));
		Thread.sleep(10000);

	}


	///////// Multicity /////////////////
	public void testOnHomeScreen_RideNow_NewYork_WhereToPage() throws InterruptedException {
		PointerInput pointer2201 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence currentLocBtn = new Sequence(pointer2201, 1);
		currentLocBtn.addAction(pointer2201.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 160, 180));
		currentLocBtn.addAction(pointer2201.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		currentLocBtn.addAction(new Pause(pointer2201, Duration.ofMillis(100)));
		currentLocBtn.addAction(pointer2201.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(currentLocBtn));
		Thread.sleep(10000);


		String pickUpFrom = "Downtownnewyork";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		PointerInput pointer24 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence diaLoc = new Sequence(pointer24, 1);
		diaLoc.addAction(pointer24.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 195, 330));
		diaLoc.addAction(pointer24.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		diaLoc.addAction(new Pause(pointer24, Duration.ofMillis(100)));
		diaLoc.addAction(pointer24.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(diaLoc));
		Thread.sleep(10000);


		PointerInput pointer = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence destinationBlk = new Sequence(pointer, 1);
		destinationBlk.addAction(pointer.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 160, 240));
		destinationBlk.addAction(pointer.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		destinationBlk.addAction(new Pause(pointer, Duration.ofMillis(100)));
		destinationBlk.addAction(pointer.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(destinationBlk));
		Thread.sleep(10000);



		String toBlk = "Brooklynheightsnewyork";
		for (char cha : toBlk.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}

		PointerInput pointer1 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence palmLoc = new Sequence(pointer1, 1);
		palmLoc.addAction(pointer1.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 150, 325));
		palmLoc.addAction(pointer1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		palmLoc.addAction(new Pause(pointer1, Duration.ofMillis(100)));
		palmLoc.addAction(pointer1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(palmLoc));
		Thread.sleep(10000);

		PointerInput pointer258 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer258, 1);
		proceedBtn .addAction(pointer258.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 216, 874));
		proceedBtn  .addAction(pointer258.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer258, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer258.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);

	}

	public void testOnHomeScreen_RideNow_LA_WhereToPage() throws InterruptedException {
		PointerInput pointer2201 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence currentLocBtn = new Sequence(pointer2201, 1);
		currentLocBtn.addAction(pointer2201.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 160, 180));
		currentLocBtn.addAction(pointer2201.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		currentLocBtn.addAction(new Pause(pointer2201, Duration.ofMillis(100)));
		currentLocBtn.addAction(pointer2201.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(currentLocBtn));
		Thread.sleep(10000);


		String pickUpFrom = "Littletokyo";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		PointerInput pointer24 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence diaLoc = new Sequence(pointer24, 1);
		diaLoc.addAction(pointer24.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 195, 330));
		diaLoc.addAction(pointer24.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		diaLoc.addAction(new Pause(pointer24, Duration.ofMillis(100)));
		diaLoc.addAction(pointer24.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(diaLoc));
		Thread.sleep(10000);


		PointerInput pointer = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence destinationBlk = new Sequence(pointer, 1);
		destinationBlk.addAction(pointer.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 160, 240));
		destinationBlk.addAction(pointer.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		destinationBlk.addAction(new Pause(pointer, Duration.ofMillis(100)));
		destinationBlk.addAction(pointer.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(destinationBlk));
		Thread.sleep(10000);



		String toBlk = "Fashiondistrict";
		for (char cha : toBlk.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}

		PointerInput pointer1 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence palmLoc = new Sequence(pointer1, 1);
		palmLoc.addAction(pointer1.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 150, 325));
		palmLoc.addAction(pointer1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		palmLoc.addAction(new Pause(pointer1, Duration.ofMillis(100)));
		palmLoc.addAction(pointer1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(palmLoc));
		Thread.sleep(10000);

		PointerInput pointer258 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer258, 1);
		proceedBtn .addAction(pointer258.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 216, 874));
		proceedBtn  .addAction(pointer258.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer258, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer258.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);

	}

	public void testOnHomeScreen_RideNow_AD_WhereToPage() throws InterruptedException {
		PointerInput pointer2201 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence currentLocBtn = new Sequence(pointer2201, 1);
		currentLocBtn.addAction(pointer2201.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 160, 180));
		currentLocBtn.addAction(pointer2201.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		currentLocBtn.addAction(new Pause(pointer2201, Duration.ofMillis(100)));
		currentLocBtn.addAction(pointer2201.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(currentLocBtn));
		Thread.sleep(10000);


		String pickUpFrom = "Abudhabigolfclub";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		PointerInput pointer24 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence diaLoc = new Sequence(pointer24, 1);
		diaLoc.addAction(pointer24.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 195, 330));
		diaLoc.addAction(pointer24.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		diaLoc.addAction(new Pause(pointer24, Duration.ofMillis(100)));
		diaLoc.addAction(pointer24.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(diaLoc));
		Thread.sleep(10000);


		PointerInput pointer = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence destinationBlk = new Sequence(pointer, 1);
		destinationBlk.addAction(pointer.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 160, 240));
		destinationBlk.addAction(pointer.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		destinationBlk.addAction(new Pause(pointer, Duration.ofMillis(100)));
		destinationBlk.addAction(pointer.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(destinationBlk));
		Thread.sleep(10000);



		String toBlk = "Delmaparkabudhabi";
		for (char cha : toBlk.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}
		Thread.sleep(5000);
		PointerInput pointer1 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence palmLoc = new Sequence(pointer1, 1);
		palmLoc.addAction(pointer1.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 150, 325));
		palmLoc.addAction(pointer1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		palmLoc.addAction(new Pause(pointer1, Duration.ofMillis(100)));
		palmLoc.addAction(pointer1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(palmLoc));
		Thread.sleep(10000);

		PointerInput pointer258 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer258, 1);
		proceedBtn .addAction(pointer258.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 216, 874));
		proceedBtn  .addAction(pointer258.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer258, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer258.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);

	}
	public void testOnHomeScreen_RideNow_IND_WhereToPage() throws InterruptedException {
		PointerInput pointer2201 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence currentLocBtn = new Sequence(pointer2201, 1);
		currentLocBtn.addAction(pointer2201.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 160, 180));
		currentLocBtn.addAction(pointer2201.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		currentLocBtn.addAction(new Pause(pointer2201, Duration.ofMillis(100)));
		currentLocBtn.addAction(pointer2201.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(currentLocBtn));
		Thread.sleep(10000);


		String pickUpFrom = "Madiwalabusstop";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		PointerInput pointer24 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence diaLoc = new Sequence(pointer24, 1);
		diaLoc.addAction(pointer24.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 195, 330));
		diaLoc.addAction(pointer24.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		diaLoc.addAction(new Pause(pointer24, Duration.ofMillis(100)));
		diaLoc.addAction(pointer24.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(diaLoc));
		Thread.sleep(10000);


		PointerInput pointer = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence destinationBlk = new Sequence(pointer, 1);
		destinationBlk.addAction(pointer.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 160, 240));
		destinationBlk.addAction(pointer.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		destinationBlk.addAction(new Pause(pointer, Duration.ofMillis(100)));
		destinationBlk.addAction(pointer.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(destinationBlk));
		Thread.sleep(10000);



		String toBlk = "Indiranagar";
		for (char cha : toBlk.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}

		PointerInput pointer1 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence palmLoc = new Sequence(pointer1, 1);
		palmLoc.addAction(pointer1.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 150, 325));
		palmLoc.addAction(pointer1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		palmLoc.addAction(new Pause(pointer1, Duration.ofMillis(100)));
		palmLoc.addAction(pointer1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(palmLoc));
		Thread.sleep(10000);

		PointerInput pointer258 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer258, 1);
		proceedBtn .addAction(pointer258.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 216, 874));
		proceedBtn  .addAction(pointer258.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer258, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer258.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);

	}
	////////////// RideNow///////////
	public void testOnHomeScreen_RideNow() throws InterruptedException {
		PointerInput pointer258 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer258, 1);
		proceedBtn .addAction(pointer258.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 95, 665));
		proceedBtn  .addAction(pointer258.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer258, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer258.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
                          //////////Hourly Multicity /////////////
	public void testOnHomeScreenHourlyPickupFromPage_AD() throws InterruptedException {
		PointerInput pointer23 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence HourlypickupCurrentLoc = new Sequence(pointer23, 1);
		HourlypickupCurrentLoc.addAction(pointer23.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 802));
		HourlypickupCurrentLoc .addAction(pointer23.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		HourlypickupCurrentLoc .addAction(new Pause(pointer23, Duration.ofMillis(100)));
		HourlypickupCurrentLoc .addAction(pointer23.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(HourlypickupCurrentLoc));
		Thread.sleep(10000);


		String pickUpFrom = "Abudhabigolfclub";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		PointerInput pointer24 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence adLoc = new Sequence(pointer23, 1);
		adLoc.addAction(pointer24.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 131, 265));
		adLoc .addAction(pointer24.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		adLoc .addAction(new Pause(pointer24, Duration.ofMillis(100)));
		adLoc .addAction(pointer24.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(adLoc));
		Thread.sleep(10000);


		PointerInput pointer25 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer25, 1);
		proceedBtn .addAction(pointer25.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 877));
		proceedBtn  .addAction(pointer25.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer25, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer25.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);
	}
	public void testOnHomeScreenHourlyPickupFromPage_IND() throws InterruptedException {
		PointerInput pointer23 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence HourlypickupCurrentLoc = new Sequence(pointer23, 1);
		HourlypickupCurrentLoc.addAction(pointer23.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 802));
		HourlypickupCurrentLoc .addAction(pointer23.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		HourlypickupCurrentLoc .addAction(new Pause(pointer23, Duration.ofMillis(100)));
		HourlypickupCurrentLoc .addAction(pointer23.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(HourlypickupCurrentLoc));
		Thread.sleep(10000);


		String pickUpFrom = "Madiwalabusstop";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		PointerInput pointer24 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence indLoc = new Sequence(pointer23, 1);
		indLoc.addAction(pointer24.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 131, 265));
		indLoc .addAction(pointer24.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		indLoc .addAction(new Pause(pointer24, Duration.ofMillis(100)));
		indLoc .addAction(pointer24.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(indLoc));
		Thread.sleep(10000);


		PointerInput pointer25 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer25, 1);
		proceedBtn .addAction(pointer25.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 877));
		proceedBtn  .addAction(pointer25.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer25, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer25.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);
	}
	public void testOnHomeScreenHourlyPickupFromPage_NY() throws InterruptedException {
		PointerInput pointer23 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence HourlypickupCurrentLoc = new Sequence(pointer23, 1);
		HourlypickupCurrentLoc.addAction(pointer23.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 802));
		HourlypickupCurrentLoc .addAction(pointer23.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		HourlypickupCurrentLoc .addAction(new Pause(pointer23, Duration.ofMillis(100)));
		HourlypickupCurrentLoc .addAction(pointer23.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(HourlypickupCurrentLoc));
		Thread.sleep(10000);


		String pickUpFrom = "Downtownnewyork";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		PointerInput pointer24 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence indLoc = new Sequence(pointer23, 1);
		indLoc.addAction(pointer24.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 131, 265));
		indLoc .addAction(pointer24.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		indLoc .addAction(new Pause(pointer24, Duration.ofMillis(100)));
		indLoc .addAction(pointer24.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(indLoc));
		Thread.sleep(10000);


		PointerInput pointer25 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer25, 1);
		proceedBtn .addAction(pointer25.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 877));
		proceedBtn  .addAction(pointer25.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer25, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer25.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);
	}
	
	public void testOnHomeScreenHourlyPickupFromPage_LA() throws InterruptedException {
		PointerInput pointer23 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence HourlypickupCurrentLoc = new Sequence(pointer23, 1);
		HourlypickupCurrentLoc.addAction(pointer23.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 802));
		HourlypickupCurrentLoc .addAction(pointer23.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		HourlypickupCurrentLoc .addAction(new Pause(pointer23, Duration.ofMillis(100)));
		HourlypickupCurrentLoc .addAction(pointer23.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(HourlypickupCurrentLoc));
		Thread.sleep(10000);


		String pickUpFrom = "Littletokyo";
		for (char cha : pickUpFrom.toCharArray()) {
			driver.findElementByAccessibilityId(String.valueOf(cha)).click();
			Thread.sleep(500); 
		}


		PointerInput pointer24 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence indLoc = new Sequence(pointer23, 1);
		indLoc.addAction(pointer24.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 131, 265));
		indLoc .addAction(pointer24.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		indLoc .addAction(new Pause(pointer24, Duration.ofMillis(100)));
		indLoc .addAction(pointer24.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(indLoc));
		Thread.sleep(10000);


		PointerInput pointer25 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence proceedBtn = new Sequence(pointer25, 1);
		proceedBtn .addAction(pointer25.createPointerMove(Duration.ofMillis(0),
				PointerInput.Origin.viewport(), 220, 877));
		proceedBtn  .addAction(pointer25.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		proceedBtn  .addAction(new Pause(pointer25, Duration.ofMillis(100)));
		proceedBtn  .addAction(pointer25.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(proceedBtn ));
		Thread.sleep(10000);
	}
}
