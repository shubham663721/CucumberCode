package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class SetUp {

	private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();
	public static WebDriver getDriver() {
		return threadLocal.get();
	}

	public static void setDriver(WebDriver driver) {
		threadLocal.set(driver);
	}

	public static WebDriver driver;
	private boolean isApp;
	private boolean isBrowser = true;
	private boolean isMobBrowser = false;
	private String browserName = null;
	private String appURLfirstPart=null;
	private String appURLEndPart=null;
	private String applicationPackageName = null;
	private String applicationMainActivity = null;
	private DesiredCapabilities capabilities = null;
	public String extentConfigPath = null;
	public static String testDataFilePath = null;


	
	private final Logger log =LogManager.getLogger(SetUp.class.getName());



	public void loadProperties() {
		try {

			File configFile = new File(System.getProperty("user.dir")+"//config.xml");
			InputStream reader = new FileInputStream(configFile);
			Properties props = new Properties();
			props.loadFromXML(reader);

			// Setting all the properties
			browserName = props.getProperty("browser");
			appURLfirstPart = props.getProperty("appURLfirstPart");
			appURLEndPart=   props.getProperty("appURLEndPart");
			isApp = Boolean.parseBoolean(props.getProperty("isApp"));
			applicationPackageName = props.getProperty("appPackage");
			applicationMainActivity = props.getProperty("appActivity");
			extentConfigPath = props.getProperty(extentConfigPath);
			testDataFilePath = props.getProperty("testDataFilePath");

			
			reader.close();
		} catch (Exception e) {
			// File is not present, check the path
		}
	}


	public WebDriver Setup_Test() {

		try {
			loadProperties();
			switch (browserName.toUpperCase()) {
			case "IE":
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//libs//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				setDriver(driver);
				break;

			case "CHROME":
				//System.getProperty("user.dir")+"//config.xml"
				//D:\\Swati\\Software\\chromedriver_win32\\chromedriver.exe
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//libs//chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				setDriver(driver);
				break;

			case "FIREFOX":

				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//libs//geckodriver.exe");


				FirefoxProfile profile = new FirefoxProfile();
				FirefoxOptions options = new FirefoxOptions();
				options.setAcceptInsecureCerts(true);
				options.setProfile(profile);
				driver = new FirefoxDriver(options);

				setDriver(driver);
				break;

			case "ANDROID":

				//capabilities = new DesiredCapabilities();

				// Set the Desired Capabilities
				capabilities.setCapability("deviceName", "5554:Test_device");
				//capabilities.setCapability("udid", "ZY223GGNR5");
				capabilities.setCapability("platformName", "Android");
				capabilities.setCapability("platformVersion", "6.0");
				capabilities.setCapability("noReset", "true");

				// Used in iOS, to dismiss all alerts
				// capabilities.setCapability("autoAcceptAlerts","true");

				// Used in Android, to dismiss all alerts
				capabilities.setCapability("autoGrantPermissions", "true");

				if (isApp) {
					capabilities.setCapability("appPackage", applicationPackageName);
					capabilities.setCapability("appActivity", applicationMainActivity);

					// Running scripts on mobile browsers
					isBrowser = false;
				} else {
					capabilities.setCapability("browserName", "chrome");
					isMobBrowser = true;
				}
				driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
				break;

			case "KOBITON":
				String kobitonServerUrl = "https://shalinirajeev:03c87ebc-b5f9-485d-98ca-87e8b5d5e57f@api.kobiton.com/wd/hub";

				//DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("sessionName", "HomesiteMobileAutomation");
				capabilities.setCapability("sessionDescription", "Demo");
				capabilities.setCapability("deviceOrientation", "portrait");
				capabilities.setCapability("captureScreenshots", true);

				if (isApp) {

					capabilities.setCapability("app", "kobiton-store:6164");
					capabilities.setCapability("deviceGroup", "KOBITON");
					capabilities.setCapability("deviceName", "Galaxy S7");
					capabilities.setCapability("platformVersion", "7.0");
					capabilities.setCapability("platformName", "Android");

					capabilities.setCapability("autoGrantPermissions", "true");
					// capabilities.setCapability("noReset", "true");
					capabilities.setCapability("appPackage", applicationPackageName);
					capabilities.setCapability("appActivity", applicationMainActivity);

					// Running scripts on mobile browsers
					isBrowser = false;
				} else {

					capabilities.setCapability("browserName", "chrome");
					capabilities.setCapability("deviceGroup", "KOBITON");
					// For deviceName, platformVersion Kobtion supports wildcard
					// character *, with 3 formats: *text, text* and *text*
					// If there is no *, Kobiton will match the exact text provided
					capabilities.setCapability("deviceName", "Galaxy S5");
					capabilities.setCapability("platformVersion", "6.0.1");
					capabilities.setCapability("platformName", "Android");
					isBrowser = true;
					isMobBrowser = true;
				}

				driver = new AndroidDriver<MobileElement>(new URL(kobitonServerUrl), capabilities);
				break;

			case "IPHONE":
				break;

			case "CHROMEMOBILEEMULATION":

				System.setProperty("webdriver.chrome.driver", "C:\\ITAF_Repository\\libs\\chromedriver.exe");

				Map<String, String> mobileEmulation = new HashMap<String,String>();
				mobileEmulation.put("deviceName", "iPhone 6");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
				driver = new ChromeDriver(chromeOptions);
				isMobBrowser = true;
				break;

			case "ANDROIDAPPIUM":

				String appiumServerURL = "http://127.0.0.1:4723/wd/hub";

				DesiredCapabilities capabilitiesAndroid = new DesiredCapabilities();
				capabilitiesAndroid.setCapability("browserName", "chrome");
				capabilitiesAndroid.setCapability("deviceName", "5554:Test_Device");
				capabilitiesAndroid.setCapability("platformVersion", "6.0");
				capabilitiesAndroid.setCapability("platformName", "Android");

				driver = new AppiumDriver<WebElement>(new URL(appiumServerURL), capabilitiesAndroid);
				driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
				Thread.sleep(10000);
				break;

			default:
				System.out.println("No setting found");
			}
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
			// Environment launched error
		}
		return driver;
	}

	public void NavigateURL(WebDriver driver, String website) {
		try{
			loadProperties();
		log.debug("Navigating to URL");



			String URL = "https://" + website + ".nylinsure2.com/";

			// String URL = "https://" + website + "-mdl1.nylinsure2.com/";
			// String URL = "http://" + website + "preview2.nylinsure2.com/";
			// String URL = appURLfirstPart + website + appURLEndPart;

		

		

		driver.get(URL);
			if (!isMobBrowser) {

				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			}
			else if(isMobBrowser)
			{
				driver.manage().window().setSize(new Dimension(400,736));
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			}
		}catch(Exception e){
			log.error("Not able to Navigate the URL"+e.getMessage());
		}

		log.info("Navigate URL successfully");
	}

	public String toString1() {
		// TODO Auto-generated method stub
		return null;
	}


}
