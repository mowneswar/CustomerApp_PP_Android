package Arabic_Ios_Customer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
public class CustomerApp_Arabic_BaseClass {
		public AppiumDriver<WebElement> driver;
		public void testOnAppLaunch() throws MalformedURLException, InterruptedException, Exception {
			DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setCapability("platformName", "Android");
		    capabilities.setCapability("platformVersion", "15"); 
		    capabilities.setCapability("deviceName", "emulator-5554");
		    capabilities.setCapability("appPackage", "com.moniic.customer.pp");
		    capabilities.setCapability("appActivity", "com.moniic.customer.MainActivity");
		    capabilities.setCapability("automationName", "UiAutomator2");
		    driver = new AppiumDriver<>(new URL("http://192.168.1.5:4723/"), capabilities);
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    
		    System.out.println("CUSTOMER APP LAUNCHED SUCCESSFULLY");


		}
	public void testOnIntroPage() throws InterruptedException {

			WebElement Letsgobtn=driver.findElement(By.xpath("(//android.widget.TextView[@index='1'])[1]"));
			Letsgobtn.click();
			Thread.sleep(3000);
		}
	public void testOnselectArabicLang() throws InterruptedException {

		WebElement englishbtn=driver.findElement(By.xpath("//android.widget.TextView[@index='1' and @text='English']"));
		englishbtn.click();
		Thread.sleep(15000);
		//select the language manually//



	}
	public void testonLetsgetstartedPage() throws InterruptedException {
		WebElement cDropDownBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[2]"));
		cDropDownBtn.click();
		Thread.sleep(3000);
		WebElement searchBlk= driver.findElement(By.xpath("(//android.widget.EditText[@index='0'])[2]"));
		searchBlk.click();
		Thread.sleep(3000);
		searchBlk.sendKeys("971");
		Thread.sleep(3000);
		WebElement counWidget = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[5]"));
		counWidget.click();
		Thread.sleep(3000);
		WebElement numBar = driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
		numBar.click();
		Thread.sleep(3000);
		numBar.sendKeys("520000960");
		Thread.sleep(6000);
		WebElement prcdBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[9]"));
		prcdBtn.click();
		Thread.sleep(6000);
	}
	public void testOnOTPloginPage() throws InterruptedException, IOException {
		WebElement otpNumBox1 = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(19)"));
		otpNumBox1.click();
		Thread.sleep(1000);


		String otp = "234876";
		String deviceId = "emulator-5554";
		sendOTP(otp, deviceId);
		System.out.println("OTP Entered Successfully");
		Thread.sleep(3000);
	}
	private void sendOTP(String otp, String deviceId) throws IOException, InterruptedException {
		String adbCommand = "adb -s " + deviceId + " shell input text " + otp;
		executeADBCommand(adbCommand);
	}

	private void executeADBCommand(String adbCommand) throws IOException, InterruptedException {
		System.out.println("Executing adb command: " + adbCommand);
		Process process = Runtime.getRuntime().exec(adbCommand);
		process.waitFor();


		try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println("ADB Output: " + line);
			}
		}


		try (BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
			String line;
			while ((line = errorReader.readLine()) != null) {
				System.err.println("ADB Error: " + line);
			}
		}
	}
	public void testOnaddressyouPage() throws InterruptedException {
		WebElement annoDropDownBtn= driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
		annoDropDownBtn.click();
		Thread.sleep(3000);
		WebElement annoMrBtn= driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[1]"));
		annoMrBtn.click();
		Thread.sleep(3000);


		WebElement firstnameBlk= driver.findElement(By.xpath("(//android.widget.EditText[@index='0'])[1]"));
		firstnameBlk.click();
		Thread.sleep(3000);
		firstnameBlk.sendKeys("King");
		Thread.sleep(8000);

		WebElement lastnameBlk = driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']/android.widget.EditText[@index='0']"));
		lastnameBlk.click();
		Thread.sleep(3000);
		lastnameBlk.sendKeys("Khan");

		Thread.sleep(6000);
		WebElement continueBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[30]"));
		continueBtn.click();
		Thread.sleep(6000);

	}
	public void testletsstayconnectedPage() throws InterruptedException {
		WebElement mailBlk = driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
		mailBlk.click();
		Thread.sleep(6000);
		mailBlk.sendKeys("Khandara@yopmail.com");
		Thread.sleep(3000);
		WebElement continue2Btn = driver.findElement(By.xpath("(//android.widget.TextView[@index='1'])[2]"));
		continue2Btn.click();

	}

	public void testOnMapAllowPopup() throws InterruptedException {
		WebElement whileuseBtn = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		whileuseBtn.click();
		Thread.sleep(3000);

	}
	public void testOnNotificAllowPopup() throws InterruptedException {
		WebElement alwBtn = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
		alwBtn.click();
		Thread.sleep(12000);

	}
	/////////////Side Bar///////////////
	public void testOnsideBar() throws InterruptedException {
		WebElement sidebarBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='0']"));
		sidebarBtn.click();
		Thread.sleep(6000);


		WebElement profarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='2'])[4]"));
		profarwBtn.click();
		Thread.sleep(3000);
	}

	/////////Logout/////////////////
		public void testOnLogout() throws InterruptedException {
			WebElement logoutBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[14]"));
			logoutBtn.click();
			Thread.sleep(3000);
			WebElement conlogoutBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[2]"));
			conlogoutBtn.click();
			Thread.sleep(8000);
		}

	//////////links of terms and policy/////////////////////

		public void testIntroPageGoogleLinks() throws InterruptedException {
			WebElement privacypolicyLink = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[2]"));
			privacypolicyLink.click();
			Thread.sleep(5000);
			driver.launchApp();
			Thread.sleep(5000);
			WebElement termsofserviceLink = driver.findElement(By.xpath("//android.widget.TextView[@index='2']"));
			termsofserviceLink.click();
			Thread.sleep(5000);
			driver.launchApp();
			Thread.sleep(5000);
			WebElement Letsgobtn=driver.findElement(By.xpath("(//android.widget.TextView[@index='1'])[1]"));
			Letsgobtn.click();
			Thread.sleep(3000);
		}
		//////////////sidebar menu /////////////////
		public void testOnAccountPage() throws InterruptedException {
			WebElement profarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0'])[2]"));
			profarwBtn.click();
			Thread.sleep(3000);
		}
		public void testOnprofilepage() throws InterruptedException {
			WebElement picnamearwBtn = driver.findElement(By.xpath("(//android.view.View[@index='0'])[3]"));
			picnamearwBtn.click();
			Thread.sleep(3000);

			WebElement takepicBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[1]"));
			takepicBtn.click();
			Thread.sleep(3000);

			WebElement allwtakepicBtn = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
			allwtakepicBtn.click();
			Thread.sleep(3000);


			WebElement clickpicBtn = driver.findElement(By.id("com.android.camera:id/shutter_button"));
			clickpicBtn.click();
			Thread.sleep(3000);

			WebElement okpicBtn = driver.findElement(By.id("com.android.camera:id/done_button_ic"));
			okpicBtn.click();
			Thread.sleep(3000);

			WebElement crtpicBtn = driver.findElement(By.id("com.moniic.customer.pp:id/menu_crop"));
			crtpicBtn.click();
			Thread.sleep(3000);

			WebElement updateBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[6]"));
			updateBtn.click();
			Thread.sleep(5000);


			WebElement okupdateBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[1]"));
			okupdateBtn.click();
			Thread.sleep(5000);


			WebElement bckarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[23]"));
			bckarwBtn.click();
			Thread.sleep(3000);
		}
		public void testOnphonenumPage() throws InterruptedException {
			WebElement accNumarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='1']/android.widget.TextView[@index='0'])[2]"));
			accNumarwBtn.click();
			Thread.sleep(3000);

			WebElement needhelpBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[32]"));
			needhelpBtn.click();
			Thread.sleep(3000);

			WebElement backarwBtn2 = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[22]"));
			backarwBtn2.click();
			Thread.sleep(3000);

			WebElement accNumbackarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[22]"));
			accNumbackarwBtn.click();
			Thread.sleep(3000);

		}

		public void testOnemailPage() throws InterruptedException {
			WebElement emailarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='1']/android.widget.TextView[@index='0'])[3]"));
			emailarwBtn.click();
			Thread.sleep(3000);

			WebElement emailclrBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[26]"));
			emailclrBtn.click();
			Thread.sleep(3000);
			WebElement emailBar = driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
			emailBar.click();
			Thread.sleep(3000);
			emailBar.sendKeys("donkingaak@yopmail.com");
			WebElement emailupBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@index='1']/android.widget.TextView"));
			emailupBtn.click();
			Thread.sleep(8000);


			WebElement emailupBackArw = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[23]"));
			emailupBackArw.click();
			Thread.sleep(3000);
		}



		//////add payment and delete////////
		public void testOnpaymentsPage() throws InterruptedException {
			WebElement paymentsarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='1']/android.widget.TextView[@index='0'])[4]"));
			paymentsarwBtn.click();
			Thread.sleep(5000);

			WebElement addapaymetBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@index='7']/android.view.ViewGroup[@index='0']/android.view.View"));
			addapaymetBtn.click();
			Thread.sleep(5000);

			//debit or credit add
			WebElement selecttypeBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='2'])[1]"));
			selecttypeBtn.click();
			Thread.sleep(3000);

			WebElement cardnumBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='0'])[1]"));
			cardnumBlk.click();
			Thread.sleep(3000);
			cardnumBlk.sendKeys("5555555555554444");
			Thread.sleep(5000);


			WebElement expDate = driver.findElement(By.xpath("//android.widget.EditText[@index='0' and @clickable='true' and @enabled='true' and @focusable='true']"));
			expDate.click();
			Thread.sleep(3000);

			expDate.sendKeys("06 / 28");
			Thread.sleep(3000);

			WebElement cvvBlk = driver.findElement(By.xpath("(//android.view.ViewGroup/android.widget.EditText[@index='0'])[2]"));
			cvvBlk.click();
			Thread.sleep(3000);
			cvvBlk.sendKeys("123");
			Thread.sleep(3000);


			WebElement namecardBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='0'])[3]"));
			namecardBlk.click();
			Thread.sleep(3000);
			namecardBlk.sendKeys("Muthuramsinghaiyan");
			Thread.sleep(5000);

			WebElement cardprcdBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0' and @clickable='false' and @enabled='true' and @focusable='false'])[6]"));
			cardprcdBtn.click();
			Thread.sleep(3000);
			//make card primary
			WebElement makePrimaryBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[2]"));
			makePrimaryBtn.click();
			Thread.sleep(3000);

			// delete card
			WebElement deletecardBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[47]"));
			deletecardBtn.click();
			Thread.sleep(3000);

			WebElement removecardconfBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[1]"));
			removecardconfBtn.click();
			Thread.sleep(3000);

			WebElement paybackarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[23]"));
			paybackarwBtn.click();
			Thread.sleep(3000);

		}

		///////////////////My activity Page///////////////////////
		public void testOnMyactivityPage() throws InterruptedException {
			WebElement mycativityArwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0'])[4]"));
			mycativityArwBtn.click();
			Thread.sleep(3000);
			WebElement pastRideBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
			pastRideBtn.click();
			Thread.sleep(3000);
			WebElement upcomingBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[2]"));
			upcomingBtn.click();
			Thread.sleep(3000);
			WebElement myactivitybackarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[22]"));
			myactivitybackarwBtn.click();
			Thread.sleep(3000);
		}
		public void testOnHelpcenterPage() throws InterruptedException {
			WebElement sidebarBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='0']"));
			sidebarBtn.click();
			Thread.sleep(6000);
			WebElement helpcenterArwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0'])[5]"));
			helpcenterArwBtn.click();
			Thread.sleep(3000);
			WebElement needhelpArwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[28]"));
			needhelpArwBtn.click();
			Thread.sleep(3000);
			WebElement needhelpbackArwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[22]"));
			needhelpbackArwBtn.click();
			Thread.sleep(3000);

			WebElement termserviceArwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[34]"));
			termserviceArwBtn.click();
			Thread.sleep(3000);

			WebElement termservicebackArwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[22]"));
			termservicebackArwBtn.click();
			Thread.sleep(3000);

			WebElement privacyArwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[40]"));
			privacyArwBtn.click();
			Thread.sleep(3000);

			WebElement privacybackArwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[22]"));
			privacybackArwBtn.click();
			Thread.sleep(3000);

			WebElement helpcenterbackarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[22]"));
			helpcenterbackarwBtn.click();
			Thread.sleep(3000);
		}

			public void testOnpreferenceothersPage() throws InterruptedException {
				WebElement preferencesarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0'])[6]"));
				preferencesarwBtn.click();
				Thread.sleep(3000);



				WebElement lightModeBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[47]"));
				lightModeBtn.click();
				Thread.sleep(6000);

				WebElement darkModeBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[52]"));
				darkModeBtn.click();
				Thread.sleep(6000);


				WebElement adjustModeBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[59]"));
				adjustModeBtn.click();
				Thread.sleep(6000);

				WebElement emailsubBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[66]"));
				emailsubBtn.click();
				Thread.sleep(6000);

				WebElement preferencebackarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[22]"));
				 preferencebackarwBtn.click();
				 Thread.sleep(6000);
			}

			public void testOnpreferencecopilotPage() throws InterruptedException {
				WebElement preferencesarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0'])[6]"));
				preferencesarwBtn.click();
				Thread.sleep(3000);

				WebElement copilotpreferencesarwBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[28]"));
				copilotpreferencesarwBtn.click();
				Thread.sleep(3000);

				WebElement moonroofcloseBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[32]"));
				moonroofcloseBtn.click();
				Thread.sleep(3000);

				WebElement moonroofcoveredBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[33]"));
				moonroofcoveredBtn.click();
				Thread.sleep(3000);

				WebElement moonroofcloseedBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[34]"));
				moonroofcloseedBtn.click();
				Thread.sleep(3000);

				WebElement blueToothBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[35]"));
				blueToothBtn.click();
				Thread.sleep(3000);

				WebElement wifiBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[39]"));
				wifiBtn.click();
				Thread.sleep(3000);

				WebElement quiteRideBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[42]"));
				quiteRideBtn.click();
				Thread.sleep(3000);

				WebElement increasefanspeedBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='2'])[6]"));
				increasefanspeedBtn.click();
				Thread.sleep(3000);
				increasefanspeedBtn.click();
				Thread.sleep(3000);

				WebElement decreasefanspeedBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0'])[34]"));
				decreasefanspeedBtn.click();
				Thread.sleep(3000);

				WebElement increasetempBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='2'])[8]"));
				increasetempBtn.click();
				Thread.sleep(3000);
				increasetempBtn.click();


				WebElement decreasetempBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='2'])[9]"));
				decreasetempBtn.click();
				Thread.sleep(3000);


					new TouchAction<>(driver)
					.press(PointOption.point(650, 1859))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
					.moveTo(PointOption.point(382, 1844))
					.release()
					.perform();
					System.out.println("Ambience Colour: green");
					Thread.sleep(3000);

					WebElement applyPreBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[6]"));
					applyPreBtn.click();
					Thread.sleep(3000);
					WebElement oKBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[2]"));
		            oKBtn.click();
		            Thread.sleep(3000);
		            WebElement backarwncopilotBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[22]"));
		            backarwncopilotBtn.click();
		            Thread.sleep(3000);



			}




			//////////////////////////////Hourly////////////////////////////////////////
			public void testOnHourlyHomescreen() throws InterruptedException {
				WebElement hourlyBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[2]"));
				hourlyBtn.click();
				Thread.sleep(3000);
				/////Pickup from?////////
				WebElement PickupfromBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
				PickupfromBtn.click();
				Thread.sleep(6000);

			}

			/////pickup from page proceed button////////

			public void testOnHourlyPickupPage() throws InterruptedException {


				WebElement proceedBtn = driver.findElement(By.xpath("(//android.view.View[@index='0'])[3]"));
				proceedBtn.click();
				Thread.sleep(3000);



			}
			///////Terminal 1 pick up /////
			public void testOnHourlyTerm1PickupPage() throws InterruptedException {
				WebElement drpDownBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
				drpDownBtn.click();
				Thread.sleep(3000);

				WebElement term1Btn = driver.findElement(By.xpath("//android.widget.TextView[@text='DXB Arrival - Terminal 1']"));
				term1Btn.click();
				Thread.sleep(3000);

				WebElement proceedBtn = driver.findElement(By.xpath("(//android.view.View[@index='0'])[3]"));
				proceedBtn.click();
				Thread.sleep(5000);
			}
			///////////Terminal 2/////////
			public void testOnHourlyTerm2PickupPage() throws InterruptedException {
				WebElement drpDownBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
				drpDownBtn.click();
				Thread.sleep(3000);

				WebElement term1Btn = driver.findElement(By.xpath("//android.widget.TextView[@text='DXB Arrival - Terminal 2']"));
				term1Btn.click();
				Thread.sleep(3000);

				WebElement proceedBtn = driver.findElement(By.xpath("(//android.view.View[@index='0'])[3]"));
				proceedBtn.click();
				Thread.sleep(5000);
			}
		///////Terminal 3 pick up /////
			public void testOnHourlyTerm3PickupPage() throws InterruptedException {
				WebElement drpDownBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
				drpDownBtn.click();
				Thread.sleep(3000);

				WebElement term1Btn = driver.findElement(By.xpath("//android.widget.TextView[@text='DXB Arrival - Terminal 3']"));
				term1Btn.click();
				Thread.sleep(3000);

				WebElement proceedBtn = driver.findElement(By.xpath("(//android.view.View[@index='0'])[3]"));
				proceedBtn.click();
				Thread.sleep(8000);
			}
		//////Dubai mall cinema parking p3 parking /////
			public void testOnDubaiMall_Cin_P3() throws InterruptedException {
				WebElement locationArwBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
				locationArwBtn.click();
				Thread.sleep(3000);
				WebElement cinemaParkingBlk = driver.findElement(By.xpath("//android.widget.TextView[@text='Cinema Parking P3']"));
				cinemaParkingBlk.click();
				Thread.sleep(3000);
				WebElement proceedBtn = driver.findElement(By.xpath("(//android.view.View[@index='0'])[3]"));
				proceedBtn.click();
				Thread.sleep(5000);

			}
			//////Dubai Mall Fashion Avenue Mall///////
			public void testOnDubaiMall_FashionAveParking() throws InterruptedException {
				WebElement locationArwBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
				locationArwBtn.click();
				Thread.sleep(3000);
				WebElement FashionAveParkingBlk = driver.findElement(By.xpath("//android.widget.TextView[@text='Fashion Avenue Parking']"));
				FashionAveParkingBlk.click();
				Thread.sleep(3000);
				WebElement proceedBtn = driver.findElement(By.xpath("(//android.view.View[@index='0'])[3]"));
				proceedBtn.click();
				Thread.sleep(3000);

			}
			////////DU LowerGround Level//////
			public void testOnDubaiMall_DuLGLevel() throws InterruptedException {
				WebElement locationArwBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
				locationArwBtn.click();
				Thread.sleep(3000);
				WebElement DuLGLevelBlk = driver.findElement(By.xpath("//android.widget.TextView[@text='Du - Lower Ground Level']"));
				DuLGLevelBlk.click();
				Thread.sleep(3000);
				WebElement proceedBtn = driver.findElement(By.xpath("(//android.view.View[@index='0'])[3]"));
				proceedBtn.click();
				Thread.sleep(3000);

			}
			///////Dubai mall Zabel parking pickup location/////////
			public void testDubaiMall_zabeelParking() throws InterruptedException {
				WebElement locationArwBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
				locationArwBtn.click();
				Thread.sleep(3000);
				WebElement zabeelParkingBlk = driver.findElement(By.xpath("//android.widget.TextView[@text='Zabeel Parking']"));
				zabeelParkingBlk.click();
				Thread.sleep(3000);
				WebElement proceedBtn = driver.findElement(By.xpath("(//android.view.View[@index='0'])[3]"));
				proceedBtn.click();
				Thread.sleep(3000);

			}
			//////choose car first class////
			public void testOnchooseyourcarPage() throws InterruptedException {

				WebElement classBtn = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='First Class']"));
				classBtn.click();
				Thread.sleep(8000);


			}
			//////choose cash payment////////
			public void testOnyourRidePageCash() throws InterruptedException {
				WebElement paymentBtn = driver.findElement(By.xpath("(//android.view.View[@index='0'])[12]"));
				paymentBtn.click();
				Thread.sleep(3000);
				WebElement cashpaymentBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
				cashpaymentBtn .click();
				Thread.sleep(3000);
				WebElement confirmcashpaymentBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[6]"));
				confirmcashpaymentBtn.click();
				Thread.sleep(3000);
				WebElement addNotesBtn = driver.findElement(By.xpath("(//android.view.View[@index='0'])[9]"));
				addNotesBtn.click();
				Thread.sleep(6000);
				WebElement yourNotesBlk = driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
				yourNotesBlk.click();
				Thread.sleep(6000);
				yourNotesBlk.sendKeys(" I need Pet Carrier as well as a Paneer tikka during travel");
				Thread.sleep(3000);
				WebElement addNotesproceedBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[7]"));
				addNotesproceedBtn.click();
				Thread.sleep(6000);
				WebElement bookClassBtn = driver.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
				bookClassBtn.click();
				Thread.sleep(15000);
			}
			/////////for card payment//////////
			public void testOnyourRidePageCard() throws InterruptedException {
				WebElement paymentBtn2 = driver.findElement(By.xpath("(//android.view.View[@index='0'])[12]"));
				paymentBtn2.click();
				Thread.sleep(3000);
				WebElement selectpaymentBtn2 = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='**** **** **** 4444']"));
				selectpaymentBtn2 .click();
				Thread.sleep(3000);

				WebElement confirmcardpaymentBtn2 = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[6]"));
				confirmcardpaymentBtn2.click();
				Thread.sleep(3000);

				WebElement addNotesBtn2 = driver.findElement(By.xpath("(//android.view.View[@index='0'])[9]"));
				addNotesBtn2.click();
				Thread.sleep(6000);
				WebElement yourNotesBlk2 = driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
				yourNotesBlk2.click();
				Thread.sleep(6000);
				yourNotesBlk2.sendKeys(" I need Pet Carrier as well as a Paneer tikka during travel");
				Thread.sleep(3000);
				WebElement addNotesproceedBtn2 = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[7]"));
				addNotesproceedBtn2.click();
				Thread.sleep(6000);
				WebElement bookClassBtn2 = driver.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
				bookClassBtn2.click();
				Thread.sleep(8000);

			}
			/////////GpayPayment Method///////////
			public void testOnyourRidePageGpay() throws InterruptedException {
				WebElement paymentBtn3 = driver.findElement(By.xpath("(//android.view.View[@index='0'])[12]"));
				paymentBtn3.click();
				Thread.sleep(3000);
				WebElement selectpaymentBtn3 = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='**** **** **** 4242']"));
				selectpaymentBtn3 .click();
				Thread.sleep(3000);

				WebElement confirmgpaypaymentBtn3 = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[6]"));
				confirmgpaypaymentBtn3.click();
				Thread.sleep(3000);
				WebElement addNotesBtn3 = driver.findElement(By.xpath("(//android.view.View[@index='0'])[9]"));
				addNotesBtn3.click();
				Thread.sleep(6000);
				WebElement yourNotesBlk3 = driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
				yourNotesBlk3.click();
				Thread.sleep(6000);
				yourNotesBlk3.sendKeys(" I need Pet Carrier as well as a Paneer tikka during travel");
				Thread.sleep(3000);
				WebElement addNotesproceedBtn3 = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[7]"));
				addNotesproceedBtn3.click();
				Thread.sleep(6000);
				WebElement bookClassBtn3 = driver.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
				bookClassBtn3.click();
				Thread.sleep(8000);


			}
			///////// Hourly dubai airport///pickup
			public void testOnHourlyDIAHomeScreen() throws InterruptedException {
				WebElement currentLocBlk = driver.findElement(By.xpath("//android.widget.TextView[@text='Current Location']"));
				currentLocBlk.click();
				Thread.sleep(3000);
				WebElement yourcurrentLocBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[1]"));
				yourcurrentLocBlk.click();
				Thread.sleep(3000);
				yourcurrentLocBlk.sendKeys("Dubai International Airport (DXB)");
				WebElement dubaiairportLoc = driver.findElement(By.xpath("//android.widget.TextView[@text='Dubai International Airport (DXB)']"));
				dubaiairportLoc.click();
				Thread.sleep(3000);
			}
	         ///////// Hourly dubai airport///pickup
			public void testOnHourlyDubaiMallHomeScreen() throws InterruptedException {
				WebElement currentLocBlk = driver.findElement(By.xpath("//android.widget.TextView[@text='Current Location']"));
				currentLocBlk.click();
				Thread.sleep(3000);
				WebElement yourcurrentLocBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[1]"));
				yourcurrentLocBlk.click();
				Thread.sleep(3000);
				yourcurrentLocBlk.sendKeys("Dubai Mall");
				WebElement dubaiairportLoc = driver.findElement(By.xpath("//android.widget.TextView[@text='Dubai Mall']"));
				dubaiairportLoc.click();
				Thread.sleep(3000);
			}


			////////airport pickup notes//////
			public void testOnRideNow_DAP_APU_Page() throws InterruptedException {
				WebElement apuBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
				apuBtn.click();
				Thread.sleep(3000);
				WebElement flightnumBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='0'])[1]"));
				flightnumBlk.click();
				Thread.sleep(3000);
				flightnumBlk.sendKeys("Boeing 737");
				Thread.sleep(3000);
				WebElement travelerNameBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='0'])[2]"));
				travelerNameBlk.click();
				Thread.sleep(3000);
				travelerNameBlk.sendKeys("George Muthu Pnadian");
				Thread.sleep(3000);
				WebElement otherNoteBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='0'])[3]"));
				 otherNoteBlk.click();
				Thread.sleep(6000);
				 otherNoteBlk.sendKeys("George Muthu Pnadian needs a paneer tikka during travel");
				Thread.sleep(5000);


				WebElement conBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[6]"));
				conBtn.click();
				Thread.sleep(5000);

			}
			public void testOnDIAyourRidePageGpay() throws InterruptedException {
				WebElement paymentBtn3 = driver.findElement(By.xpath("(//android.view.View[@index='0'])[12]"));
				paymentBtn3.click();
				Thread.sleep(5000);
				WebElement selectpaymentBtn3 = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='**** **** **** 4242']"));
				selectpaymentBtn3 .click();
				Thread.sleep(3000);

				WebElement confirmgpaypaymentBtn3 = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[6]"));
				confirmgpaypaymentBtn3.click();
				Thread.sleep(3000);
				WebElement bookClassBtn3 = driver.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
				bookClassBtn3.click();
				Thread.sleep(8000);

			}
			public void testOnDIAyourRidePageCard() throws InterruptedException {
				WebElement paymentBtn3 = driver.findElement(By.xpath("(//android.view.View[@index='0'])[12]"));
				paymentBtn3.click();
				Thread.sleep(5000);
				WebElement selectpaymentBtn3 = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='**** **** **** 4444']"));
				selectpaymentBtn3 .click();
				Thread.sleep(6000);

				WebElement confirmCardpaymentBtn3 = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[6]"));
				confirmCardpaymentBtn3.click();
				Thread.sleep(3000);
				WebElement bookClassBtn3 = driver.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
				bookClassBtn3.click();
				Thread.sleep(8000);

			}
			public void testOnDIAyourRidePageCash() throws InterruptedException {
				WebElement paymentBtn3 = driver.findElement(By.xpath("(//android.view.View[@index='0'])[12]"));
				paymentBtn3.click();
				Thread.sleep(5000);
				WebElement selectpaymentBtn3 = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
				selectpaymentBtn3 .click();
				Thread.sleep(3000);

				WebElement confirmCardpaymentBtn3 = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[6]"));
				confirmCardpaymentBtn3.click();
				Thread.sleep(3000);
				WebElement bookClassBtn3 = driver.findElement(By.xpath("(//android.view.View[@index='0'])[11]"));
				bookClassBtn3.click();
				Thread.sleep(8000);

			}
				///////select duration////////

			public void testOnHourlyselectDurationPage() throws InterruptedException {

				WebElement durationBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[36]"));
				durationBtn.click();
				Thread.sleep(5000);

				WebElement bookdurationBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[53]"));
				bookdurationBtn.click();
				Thread.sleep(5000);
			}
			/////////otp share pickupscreen///////
			public void testOnpickupScreen() throws InterruptedException {
				WebElement yourOTP = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[6]"));
				yourOTP.click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
			}
			///////////manage your route screen/////////////
			public void testOnHourlysManageYourPage() throws InterruptedException {



				WebElement wheretoBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[32]"));
				wheretoBtn.click();
				Thread.sleep(5000);
				WebElement tapaddstopBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[4]"));
				tapaddstopBtn.click();
				Thread.sleep(5000);
				WebElement tapstop1Btn = driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
				tapstop1Btn.sendKeys("Dubai waterfront");
				Thread.sleep(3000);
				WebElement tapstop1Loc = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Dubai Waterfront']"));
				tapstop1Loc.click();
				Thread.sleep(3000);



				tapaddstopBtn.click();
				Thread.sleep(3000);
				tapstop1Btn.sendKeys("Palm jumeirah");
				WebElement tapstop2Loc = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Palm Jumeirah']"));
				tapstop2Loc.click();
				Thread.sleep(3000);

				WebElement tapaddstop3Btn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[5]"));
				tapaddstop3Btn.click();
				Thread.sleep(3000);
				tapstop1Btn.sendKeys("Dubai Mall");
				WebElement tapstop3Loc = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Dubai Mall']"));
				tapstop3Loc.click();
				Thread.sleep(3000);

				WebElement updateLocation1 = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[6]"));
				updateLocation1.click();
				Thread.sleep(30000);




				wheretoBtn.click();
				Thread.sleep(5000);

				WebElement tapstop4Loc = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[6]"));
				tapstop4Loc.click();
				Thread.sleep(3000);
				tapstop1Btn.sendKeys("Dubai Water Canal");
				Thread.sleep(3000);
				WebElement destLoc = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Dubai Water Canal']"));
				destLoc.click();
				Thread.sleep(3000);
				WebElement updateLocation2 = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[8]"));
				updateLocation2.click();
				Thread.sleep(30000);






			}
			public void testOnquicfeedbackScreen() throws InterruptedException {
				WebElement submitfeedbackBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[7]"));
				submitfeedbackBtn.click();
				Thread.sleep(8000);

			}
			public void testOnexperiencefeedbackScreen() throws InterruptedException {



				WebElement threestarBtn = driver.findElement(By.xpath("(//android.widget.ImageView[@index='0'])[4]"));
				threestarBtn.clear();
				Thread.sleep(3000);
				WebElement submitfeedbackBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[5]"));
				submitfeedbackBtn.click();
				Thread.sleep(6000);


			}
			/////////////Hourly Schedule Later/////////////

			public void testOnscheduleLater() throws InterruptedException {
				WebElement hourlyBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[2]"));
				hourlyBtn.click();
				Thread.sleep(3000);
			}
			public void testOnScheduleRide() throws InterruptedException {

				tapRepeatedlyUntilElementFound(driver, "اليوم, Select Day");
				tapRepeatedlyUntilElementFoundtime(driver, "٧, Select Hour");
				tapRepeatedlyUntilElementFoundminutes(driver, "٢٧, Select Minutes");
				tapRepeatedlyUntilElementFoundampm(driver,"م , Select AM/PM");

			    WebElement conBtn=driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[7]"));
				conBtn.click();
				Thread.sleep(8000);
			}
		private static void tapRepeatedlyUntilElementFound(AppiumDriver<WebElement> driver2, String targetContentDesc) {

		    int maxAttempts = 31;
		    int tapDelay = 0;

		    boolean elementFound = false;

		    for (int i = 0; i < maxAttempts; i++) {
		        try {
		            WebElement element = driver2.findElement(MobileBy.AccessibilityId(targetContentDesc));
		            element.click();
		            System.out.println("Found and selected element with content description: " + targetContentDesc);
		            elementFound = true;
		            break;
		        } catch (NoSuchElementException e) {

		            new TouchAction<>(driver2)
		                .tap(PointOption.point(408, 1589))
		                .perform();

		            try {
		                Thread.sleep(tapDelay);
		            } catch (InterruptedException ie) {
		                ie.printStackTrace();
		            }
		        } catch (TimeoutException te) {
		            break;
		        } catch (Exception ex) {
		            break;
		        }
		    }


		}
		private static void tapRepeatedlyUntilElementFoundtime(AppiumDriver<WebElement> driver3, String targetContentDesc) {

		    int maxAttempts = 20;
		    int tapDelay = 0;

		    boolean elementFound = false;

		    for (int i = 0; i < maxAttempts; i++) {
		        try {
		            WebElement element = driver3.findElement(MobileBy.AccessibilityId(targetContentDesc));
		            element.click();
		            System.out.println("Found and selected element with content description: " + targetContentDesc);
		            elementFound = true;
		            break;
		        } catch (NoSuchElementException e) {

		            new TouchAction<>(driver3)
		                .tap(PointOption.point(602, 1589))
		                .perform();

		            try {
		                Thread.sleep(tapDelay);
		            } catch (InterruptedException ie) {
		                ie.printStackTrace();
		            }
		        } catch (TimeoutException te) {
		            break;
		        } catch (Exception ex) {
		            break;
		        }
		    }


		}
		private static void tapRepeatedlyUntilElementFoundminutes(AppiumDriver<WebElement> driver3, String targetContentDesc) {

		    int maxAttempts = 60;
		    int tapDelay = 0;

		    boolean elementFound = false;

		    for (int i = 0; i < maxAttempts; i++) {
		        try {
		            WebElement element = driver3.findElement(MobileBy.AccessibilityId(targetContentDesc));
		            element.click();
		            System.out.println("Found and selected element with content description: " + targetContentDesc);
		            elementFound = true;
		            break;
		        } catch (NoSuchElementException e) {

		            new TouchAction<>(driver3)
		                .tap(PointOption.point(685, 1585))
		                .perform();

		            try {
		                Thread.sleep(tapDelay);
		            } catch (InterruptedException ie) {
		                ie.printStackTrace();
		            }
		        } catch (TimeoutException te) {
		            break;
		        } catch (Exception ex) {
		            break;
		        }
		    }


		}
		private static void tapRepeatedlyUntilElementFoundampm(AppiumDriver<WebElement>  driver, String targetAmPm) throws InterruptedException {
		    int maxAttempts = 2;
		    int tapDelay = 0;
		    boolean AmPmFound = false;

		    for (int i = 0; i < maxAttempts; i++) {
		        try {

		            WebElement element = driver.findElement(MobileBy.AccessibilityId(targetAmPm));
		            element.click();
		            System.out.println("Found and selected AM/PM: " + targetAmPm);
		            AmPmFound = true;
		            break;
		        } catch (NoSuchElementException e) {
		            if (i % 2 == 0) {
		                // Tap up on even attempts (simulates tap up)
		                new TouchAction<>(driver)
		                    .tap(PointOption.point(817, 1392))
		                    .release()
		                    .perform();

		            } else {
		                // Tap down on odd attempts (simulates tap down)
		                new TouchAction<>(driver)
		                    .tap(PointOption.point(807, 1582))
		                    .release()
		                    .perform();

		            }


		            Thread.sleep(tapDelay);
		        }
		    }

		    if (!AmPmFound) {
		        System.out.println("AM/PM: " + targetAmPm );
		    }
		}

		//////////Payment Incomplete///////////////
		public void testOnPaymentIncomplete() throws InterruptedException {

			WebElement scrollupsheet = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0'])[4]"));
			scrollupsheet .click();
			Thread.sleep(6000);

			new TouchAction<>(driver)
			   .press(PointOption.point(533, 1671))
			   .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			   .moveTo(PointOption.point(547, 1224))
			   .release()
			   .perform();

			WebElement cancelBookingBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[13]"));
			cancelBookingBtn.click();
			Thread.sleep(3000);
			WebElement cancelBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
			cancelBtn.click();
			Thread.sleep(6000);
			WebElement cancelrea2Btn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[33]"));
			cancelrea2Btn.click();
			Thread.sleep(6000);
			WebElement canceltripBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[8]"));
			canceltripBtn.click();
			Thread.sleep(6000);
			WebElement payNowBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[5]"));
			payNowBtn.click();
			Thread.sleep(3000);
			WebElement  payNowGpay  = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0'])[2]"));
			payNowGpay.click();
			Thread.sleep(3000);
			WebElement  confirmGpay  = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[2]"));
			confirmGpay.click();
			Thread.sleep(3000);

		}

	public void testOnPaymentIncompleteCardpay() throws InterruptedException {

			WebElement scrollupsheet = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0'])[4]"));
			scrollupsheet .click();
			Thread.sleep(6000);

			new TouchAction<>(driver)
			   .press(PointOption.point(533, 1671))
			   .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			   .moveTo(PointOption.point(547, 1224))
			   .release()
			   .perform();
			Thread.sleep(3000);
			WebElement cancelBookingBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[13]"));
			cancelBookingBtn.click();
			Thread.sleep(3000);
			WebElement cancelBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
			cancelBtn.click();
			Thread.sleep(6000);
			WebElement cancelrea2Btn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[33]"));
			cancelrea2Btn.click();
			Thread.sleep(6000);
			WebElement canceltripBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[8]"));
			canceltripBtn.click();
			Thread.sleep(6000);
			WebElement payNowBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[5]"));
			payNowBtn.click();
			Thread.sleep(3000);
			WebElement  payNowcardpay  = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0'])[1]"));
			payNowcardpay.click();
			Thread.sleep(3000);
			WebElement  confirmcardpay  = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[2]"));
			confirmcardpay.click();
			Thread.sleep(3000);

		}
			///////////Hourly Start Trip Early///////////////
	public void testOnOkschedulepage() throws InterruptedException {
		WebElement okBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
		okBtn .click();
		Thread.sleep(10000);


	}

	public void testOnPickupPopup() throws InterruptedException {
		WebElement PickupPopupBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='1'])[16]"));
		PickupPopupBtn .click();
		Thread.sleep(8000);

	}

	public void testMinimizeAndMaximize() throws InterruptedException {
	    // Minimize the app
	    driver.runAppInBackground(Duration.ofSeconds(5));  // Minimize the app indefinitely
	    System.out.println("App minimized");

	    // Wait for a few seconds
	    Thread.sleep(3000);

	    // Maximize (bring the app back to foreground)
	    driver.activateApp("com.moniic.customer.pp");  // Relaunch the app to foreground
	    System.out.println("App maximized (back to foreground)");

	    // Continue with further actions, if needed
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	public void testOnstartTripEarlyPaymentIncomplete() throws InterruptedException {
		WebElement scrollupsheet = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0'])[5]"));
		scrollupsheet .click();
		Thread.sleep(6000);



		new TouchAction<>(driver)
		   .press(PointOption.point(533, 1671))
		   .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		   .moveTo(PointOption.point(547, 1224))
		   .release()
		   .perform();

		WebElement starttripBtn = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='ابدأ الرحلة مبكرًا؟']"));
		starttripBtn.click();
		Thread.sleep(8000);
		WebElement readystartBtn = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='نعم']"));
		readystartBtn.click();
		Thread.sleep(8000);

		WebElement cancelBookingBtn = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='إلغاء الحجز']"));
		cancelBookingBtn.click();
		Thread.sleep(3000);
		WebElement cancelBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
		cancelBtn.click();
		Thread.sleep(6000);
		WebElement cancelrea2Btn = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[33]"));
		cancelrea2Btn.click();
		Thread.sleep(6000);
		WebElement canceltripBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[8]"));
		canceltripBtn.click();
		Thread.sleep(6000);
		WebElement payNowBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[5]"));
		payNowBtn.click();
		Thread.sleep(6000);
		WebElement  payNowGpay  = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0'])[2]"));
		payNowGpay.click();
		Thread.sleep(3000);
		WebElement  confirmGpay  = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[2]"));
		confirmGpay.click();
		Thread.sleep(3000);
	}
	public void testOnstartTripEarlycomplete() throws InterruptedException {

		WebElement scrollupsheet = driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0'])[5]"));
		scrollupsheet .click();
		Thread.sleep(6000);
		new TouchAction<>(driver)
		   .press(PointOption.point(533, 1671))
		   .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		   .moveTo(PointOption.point(547, 1224))
		   .release()
		   .perform();
		WebElement starttripBtn = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='ابدأ الرحلة مبكرًا؟']"));
		starttripBtn.click();
		Thread.sleep(6000);
		WebElement readystartBtn = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='نعم']"));
		readystartBtn.click();
		Thread.sleep(30000);
		}
	///////////RideNow Where to page/////////////
	public void testOnRideNowWheretoPage() throws InterruptedException {
		WebElement yourcurrentLocBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[1]"));
		yourcurrentLocBlk.click();
		Thread.sleep(6000);
		yourcurrentLocBlk.sendKeys("Bhurj Khalifa");
		Thread.sleep(6000);
		WebElement currentLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Burj Khalifa']"));
		currentLocName.click();
		Thread.sleep(3000);
		WebElement destinationBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[2]"));
		destinationBlk.click();
		Thread.sleep(6000);
		destinationBlk.sendKeys("Palm Jumeirah");
		Thread.sleep(6000);
		WebElement destinationLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Palm Jumeirah']"));
		destinationLocName.click();
		Thread.sleep(3000);



	}
	public void testOnOkschedulepageRideNow() throws InterruptedException {
		WebElement okBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[4]"));
		okBtn .click();
		Thread.sleep(30000);


	}
	public void testOnpickupPage() throws InterruptedException {

		WebElement pickupProceedBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[4]"));
		pickupProceedBtn.click();
		Thread.sleep(8000);


	}





	/////////////////////RideNow////////////////////
	public void testOnRideNowHomescreen() throws InterruptedException {
	WebElement whereToBtn = driver.findElement(By.xpath("(//android.widget.TextView[@index='0'])[3]"));
	whereToBtn.click();
	Thread.sleep(3000);

	}
	public void testOnRideNowWheretoPage_DAP() throws InterruptedException {
		WebElement yourcurrentLocBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[1]"));
		yourcurrentLocBlk.click();
		Thread.sleep(6000);
		yourcurrentLocBlk.sendKeys("Dubai International Airport (DXB)");
		Thread.sleep(6000);
		WebElement currentLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Dubai International Airport (DXB)']"));
		currentLocName.click();
		Thread.sleep(3000);
		WebElement destinationBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[2]"));
		destinationBlk.click();
		Thread.sleep(6000);
		destinationBlk.sendKeys("Palm Jumeirah");
		Thread.sleep(6000);
		WebElement destinationLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Palm Jumeirah']"));
		destinationLocName.click();
		Thread.sleep(3000);



	}
	public void testOnRideNow_DAP_Page() throws InterruptedException {
		WebElement terminalPrcd = driver.findElement(By.xpath("//android.widget.TextView[@text='PROCEED']"));
		terminalPrcd.click();
		Thread.sleep(3000);

	}
	//////////Dubai mall pickup/////////
	public void testOnWheretoPage_DubaiMall() throws InterruptedException {
		WebElement yourcurrentLocBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[1]"));
		yourcurrentLocBlk.click();
		Thread.sleep(6000);
		yourcurrentLocBlk.sendKeys("Dubai Mall");
		Thread.sleep(6000);
		WebElement currentLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Dubai Mall']"));
		currentLocName.click();
		Thread.sleep(3000);
		WebElement destinationBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[2]"));
		destinationBlk.click();
		Thread.sleep(6000);
		destinationBlk.sendKeys("Palm Jumeirah");
		Thread.sleep(6000);
		WebElement destinationLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Palm Jumeirah']"));
		destinationLocName.click();
		Thread.sleep(3000);

	}
	////////////Multicity////////////
	public void testOnWheretoPage_India() throws InterruptedException {
		WebElement yourcurrentLocBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[1]"));
		yourcurrentLocBlk.click();
		Thread.sleep(6000);
		yourcurrentLocBlk.sendKeys("Madiwala");
		Thread.sleep(6000);
		WebElement currentLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Madiwala']"));
		currentLocName.click();
		Thread.sleep(3000);
		WebElement destinationBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[2]"));
		destinationBlk.click();
		Thread.sleep(6000);
		destinationBlk.sendKeys("Lulu Mall Bengaluru");
		Thread.sleep(6000);
		WebElement destinationLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Lulu Mall Bengaluru']"));
		destinationLocName.click();
		Thread.sleep(3000);

	}
	//////Newyork///////////////////
	public void testOnWheretoPage_NY() throws InterruptedException {
		WebElement yourcurrentLocBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[1]"));
		yourcurrentLocBlk.click();
		Thread.sleep(6000);
		yourcurrentLocBlk.sendKeys("Civic centre newyork");
		Thread.sleep(6000);
		WebElement currentLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Civic Center']"));
		currentLocName.click();
		Thread.sleep(3000);
		WebElement destinationBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[2]"));
		destinationBlk.click();
		Thread.sleep(6000);
		destinationBlk.sendKeys("Jersey City");
		Thread.sleep(6000);
		WebElement destinationLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Jersey City']"));
		destinationLocName.click();
		Thread.sleep(3000);

	}
	////////////Abudhabi///////////////////
	public void testOnWheretoPage_AD() throws InterruptedException {
		WebElement yourcurrentLocBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[1]"));
		yourcurrentLocBlk.click();
		Thread.sleep(6000);
		yourcurrentLocBlk.sendKeys("Abu Dhabi Country Club");
		Thread.sleep(6000);
		WebElement currentLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Abu Dhabi Country Club']"));
		currentLocName.click();
		Thread.sleep(3000);
		WebElement destinationBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[2]"));
		destinationBlk.click();
		Thread.sleep(6000);
		destinationBlk.sendKeys("Khalidiyah Mall abudhabi");
		Thread.sleep(6000);
		WebElement destinationLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Khalidiyah Mall']"));
		destinationLocName.click();
		Thread.sleep(3000);

	}
	////////////Losangels//////////////////
	public void testOnWheretoPage_LA() throws InterruptedException {
		WebElement yourcurrentLocBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[1]"));
		yourcurrentLocBlk.click();
		Thread.sleep(6000);
		yourcurrentLocBlk.sendKeys("Downtown Losangels");
		Thread.sleep(6000);
		WebElement currentLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Downtown']"));
		currentLocName.click();
		Thread.sleep(3000);
		WebElement destinationBlk = driver.findElement(By.xpath("(//android.widget.EditText[@index='1'])[2]"));
		destinationBlk.click();
		Thread.sleep(6000);
		destinationBlk.sendKeys("Vincent Price Art Museum");
		Thread.sleep(6000);
		WebElement destinationLocName = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Vincent Price Art Museum']"));
		destinationLocName.click();
		Thread.sleep(3000);

	}
	///////Abu Dhabi//////////////
	public void testOnchooseyourcarPageAD() throws InterruptedException {

		WebElement classBtn = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='royal class 999']"));
		classBtn.click();
		Thread.sleep(8000);


	}
	///////Los angels/////////////
	public void testOnchooseyourcarPageLA() throws InterruptedException {

		WebElement classBtn = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Benz cat']"));
		classBtn.click();
		Thread.sleep(8000);


	}
	///////Newyork/////////
	public void testOnchooseyourcarPageNY() throws InterruptedException {

		WebElement classBtn = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='Luxury Class']"));
		classBtn.click();
		Thread.sleep(8000);


	}
	//////choose car first class for india ////
		public void testOnchooseyourcarPageIndia() throws InterruptedException {

			WebElement classBtn = driver.findElement(By.xpath("//android.widget.TextView[@index='0' and @text='India luxury']"));
			classBtn.click();
			Thread.sleep(8000);


		}
}
