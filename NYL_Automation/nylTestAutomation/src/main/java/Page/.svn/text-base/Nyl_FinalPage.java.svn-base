package Page;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.pdfbox.util.PDFTextStripper;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



import MyCommonObject.CommonPage;
import Selenium.ScreenShotUtility;
import Selenium.SetUp;
//import Utility.Excel_Utility;
import Utility.xmlAndPdfBeyondCompare;
import Utility.ReuseableMethod;
import Utility.ExcelUtility;
public class Nyl_FinalPage extends SetUp {
	

	private final Logger log =LogManager.getLogger(Nyl_FinalPage.class.getName());

	public Nyl_FinalPage() {
		driver = getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}
	
	ReuseableMethod reuseMethod = new ReuseableMethod();
	ScreenShotUtility screenShotUtility = new ScreenShotUtility();
	xmlAndPdfBeyondCompare PDFbeyondCompare= new xmlAndPdfBeyondCompare();
	//PDFCompareTest pdfcompare=new PDFCompareTest();
	
	
	@FindBy(xpath="//a[@id='consentPdf']")
	WebElement application;
	
	@FindBy(xpath="//div[@id='lblThankYou']/label")
	WebElement ReceiptNumMobile;
	
	@FindBy(xpath="//div[@class='dispay-receipt-no']/p")
	WebElement WaepaReceiptNum;
	
	@FindBy(xpath="(//a//font[contains(text(),'IMPORTANT NOTICE') or contains(text(),'Important Notice')])[1]")
	WebElement Important_Notice;
	@FindBy(xpath="//div[@*='lblSignAuthMsg']//label/ul/b[contains(text(),'CONSENT')]")
	WebElement consentHeader;
	
	
	public boolean click_on_Application_and_Validate_the_signature_from_the_PDF(String pdfScenario) throws Exception{
		
		try {
			log.debug("Click on application and validate the PDF");
			//reuseMethod.scrollDown(WaepaReceiptNum);
			      reuseMethod.PDFvalidation(application);
			
		           String home = System.getProperty("user.home");
		          String pdfDirectory=System.getProperty("user.dir");
		           Path temp =Files.move
		        		      (Paths.get(home+"/Downloads/params.pdf"),
		        		      Paths.get(pdfDirectory+"/NYL_Repository/BeyondTest/Expected/"+pdfScenario+".pdf"));
		          /* Path temp =Files.move
		        		      (Paths.get(home+"/Downloads/params.pdf"),
		        		      Paths.get(pdfDirectory+"PDFList/abe.pdf"));*/
		           Thread.sleep(5000);
		           PDFbeyondCompare.PDFCompare();
	
					 Thread.sleep(2000);
					 
					//file.delete();
			
			 
		log.info("PDF validation successfully");
		return true;
		}catch (Exception e) {
			log.error("Not able to validate PDF || Fail"+e.getMessage());
			 throw(e);
		}
		
		
	}
public boolean click_on_Application_and_validate_PDF_Mobile(String pdfScenario) throws Exception{
		
		try {
			log.debug("Click on application and validate the PDF");
			reuseMethod.scrollDown(ReceiptNumMobile);
			      reuseMethod.PDFvalidation(application);
			
		           String home = System.getProperty("user.home");
		          String pdfDirectory=System.getProperty("user.dir");
		           Path temp =Files.move
		        		      (Paths.get(home+"/Downloads/params.pdf"),
		        		      Paths.get(pdfDirectory+"/NYL_Repository/BeyondTest/Expected/"+pdfScenario+".pdf"));
		          /* Path temp =Files.move
		        		      (Paths.get(home+"/Downloads/params.pdf"),
		        		      Paths.get(pdfDirectory+"PDFList/abe.pdf"));*/
		           Thread.sleep(5000);
		           PDFbeyondCompare.PDFCompare();
		
			 
		log.info("PDF validation successfully");
		return true;
		}catch (Exception e) {
			log.error("Not able to validate Important Notice PDF || Fail"+e.getMessage());
			 throw(e);
		}
		
		
	}

public boolean verify_Important_Notice_from_PDF(String pdfScenario,String pdfName) throws Exception{
	
	try {
		log.debug("Click on application and validate the PDF");
		reuseMethod.scrollDown(Important_Notice);
		      reuseMethod.PDFvalidation(Important_Notice);
		    
	           String home = System.getProperty("user.home");
	          String pdfDirectory=System.getProperty("user.dir");
	          
	           Path temp =Files.move
	        		      (Paths.get(home+"/Downloads/"+pdfName+".pdf"),
	        		      Paths.get(pdfDirectory+"/NYL_Repository/BeyondTest/Expected/"+pdfScenario+".pdf"),StandardCopyOption.REPLACE_EXISTING);
	                    /* Path temp =Files.move
	        		      (Paths.get(home+"/Downloads/params.pdf"),
	        		      Paths.get(pdfDirectory+"PDFList/abe.pdf"));*/
	           Thread.sleep(5000);
	          // PDFbeyondCompare.PDFCompare();
	          
             
	           Thread.sleep(2000);
				 
			
		
		 
	log.info("PDF validation successfully");
	return true;
	}catch (Exception e) {
		log.error("Not able to validate PDF || Fail"+e.getMessage());
		 throw(e);
	}
	
	
}

public boolean verify_Important_Notice_from_PDF_mobile(String pdfScenario,String pdfName) throws Exception{
	
	try {
		log.debug("Click on application and validate the PDF");
		reuseMethod.scrollDown(consentHeader);
		      reuseMethod.PDFvalidation(Important_Notice);
		    
	           String home = System.getProperty("user.home");
	          String pdfDirectory=System.getProperty("user.dir");
	          
	           Path temp =Files.move
	        		      (Paths.get(home+"/Downloads/"+pdfName+".pdf"),
	        		      Paths.get(pdfDirectory+"/NYL_Repository/BeyondTest/Expected/"+pdfScenario+".pdf"),StandardCopyOption.REPLACE_EXISTING);
	                    /* Path temp =Files.move
	        		      (Paths.get(home+"/Downloads/params.pdf"),
	        		      Paths.get(pdfDirectory+"PDFList/abe.pdf"));*/
	           Thread.sleep(5000);
	          // PDFbeyondCompare.PDFCompare();
	          
             
	           Thread.sleep(2000);
				 
			
		
		 
	log.info("PDF validation successfully");
	return true;
	}catch (Exception e) {
		log.error("Not able to validate PDF || Fail"+e.getMessage());
		 throw(e);
	}
	
	
}

	
}