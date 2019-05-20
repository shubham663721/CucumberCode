package MyCommonObject;




import java.util.Date;

import org.openqa.selenium.WebDriver;
import Selenium.SetUp;

	
	public class CommonPage extends SetUp{
		
		public static WebDriver driver;
		public static String scenarioName;
		public static int scenarioIndex;
		public static String featureName;
		static final ClassLoader loader = CommonPage.class.getClassLoader();
		public static String reportConfigPath = null;
		//String fileName;
		String status;
		
		private String fileName;
		private boolean isDirectory;
		private Date timestamp;
		private long sizeInBytes;

		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public boolean isDirectory() {
			return isDirectory;
		}
		public void isDirectory(boolean isDirectory) {
			this.isDirectory = isDirectory;
		}
		public Date getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(Date timestamp) {
			this.timestamp = timestamp;
		}
		public long getSizeInBytes() {
			return sizeInBytes;
		}
		public void setSizeInBytes(long sizeInBytes) {
			this.sizeInBytes = sizeInBytes;
		}
		
		
		
		
		
		/*@Override
		public String toString() {
			return "Pdf [fileName=" + fileName + ", status=" + status + "]";
		}*/

		@Override
		public String toString() {
			return "FileAttributes [fileName=" + fileName + ", isDirectory=" + isDirectory + ", timestamp=" + timestamp
					+ ", sizeInBytes=" + sizeInBytes + "]";
		}
		
		public void test_setUP() {
			try {
				
				Setup_Test();

			} catch (Exception e) {
				// Test Set up Fail
				e.printStackTrace();
			}
		}


	}