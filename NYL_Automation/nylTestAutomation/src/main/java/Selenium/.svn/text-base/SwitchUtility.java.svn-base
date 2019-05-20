package Selenium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SwitchUtility {

	
	public static void switchToContext(WebDriver driver, String context) throws Exception {
		try {
			RemoteExecuteMethod executeMethod = new RemoteExecuteMethod((RemoteWebDriver) driver);
			Map<String, String> params = new HashMap<String, String>();
			params.put("name", context);
			executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getCurrentContextHandle(WebDriver driver) throws Exception {
		try {
			RemoteExecuteMethod executeMethod = new RemoteExecuteMethod((RemoteWebDriver) driver);
			String context = (String) executeMethod.execute(DriverCommand.GET_CURRENT_CONTEXT_HANDLE, null);
			return context;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<String> getContextHandles(WebDriver driver) throws Exception {
		try {
			RemoteExecuteMethod executeMethod = new RemoteExecuteMethod((RemoteWebDriver) driver);
			List<String> contexts = (List<String>) executeMethod.execute(DriverCommand.GET_CONTEXT_HANDLES, null);
			return contexts;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

}
