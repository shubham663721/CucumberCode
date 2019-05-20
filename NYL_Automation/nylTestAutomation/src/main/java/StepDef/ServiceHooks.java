package StepDef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import Selenium.SetUp;
import Utility.ExcelUtility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class ServiceHooks extends SetUp {
	public WebDriver driver;

	ExcelUtility tutil = new ExcelUtility();

	
	private final Logger log =LogManager.getLogger(ServiceHooks.class.getName());
	
	
	
	@Before
	public void startTest(Scenario scenario)
	{
		tutil.addScenario(scenario.getName()); 
		
	}
	
	@After
	public void endTest(Scenario scenario) {
		
		driver =getDriver(); 
	if (scenario.isFailed()) {

			try {
				log.info(scenario.getName() + " is Failed");
				
				
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		        scenario.embed(screenshot, "image/png");
			} catch (WebDriverException e) {
				scenario.write("Embed Failed " + e.getMessage());
			}

		/*} else {
			try {
				log.info(scenario.getName() + " is pass");
				scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}*/
		}




		// driver.close();



		// driver.quit();


	}


}
