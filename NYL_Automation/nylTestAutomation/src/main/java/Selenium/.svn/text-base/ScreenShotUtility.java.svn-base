package Selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;

public class ScreenShotUtility extends SetUp {
	Scenario scenario;
	

	public void GetScreenShot(WebDriver driver) throws Exception {
		try {
	        
	
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String name = new Object() {
			}.getClass().getEnclosingMethod().getName();
			String filePath = System.getProperty("user.dir") + "\\ScreenShot\\" +  System.currentTimeMillis() + ".png";
			FileUtils.copyFile(src, new File(filePath));
			//driver.close();
			Reporter.addScreenCaptureFromPath(filePath.toString());
			
		} catch (Exception e) {
			System.out.println("get screenshot");
		}
	}
	
	
	
	/*public void afterScenario() {
	    String browser = System.getProperty("selenium.browser");
	 log.debug("***** Executing After Scenario for " + scenario.getName() + " *****");
	 if (driver != null) {
	        if (scenario.isFailed()) {
	        	byte[] src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	        scenario.embed(src, "image/png");
	  }
	    }
	}
*/
	 
}
