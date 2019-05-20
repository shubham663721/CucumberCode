package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class propertyUtility {

	
	public static String LoadProperties( String keyProperty) {
		String value = null;
		try {
			File configFile = new File(System.getProperty("user.dir") + "/config.xml");

			InputStream reader = new FileInputStream(configFile);
			Properties props = new Properties();
			props.loadFromXML(reader);

			value = props.getProperty(keyProperty);
			reader.close();
		} catch (Exception e) {
			// File is not present, check the path
		}
		return value;
	}
	
	public String Load_MessageFile_Data(String keyProperty) throws Exception {
		String value = null;
		InputStream reader = null;
		try {
			File MessageFile = new File(System.getProperty("user.dir") + "/Messages.properties");

			 reader = new FileInputStream(MessageFile);
			Properties props = new Properties();
			props.load(reader);

			value = props.getProperty(keyProperty);
			
		} catch (Exception e) {
			throw e;
		}
		finally
		{
			reader.close();
		}
		return value;
	}
	
	public Properties loadFtpData()  {
		//Map<String, String> ftpProperties = new HashMap<>();
		
		Properties props = new Properties();
		File MessageFile = new File(System.getProperty("user.dir") + "/resources.properties");
		try( InputStream reader = new FileInputStream(MessageFile);) {
			props.load(reader);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return props;
	}
}



