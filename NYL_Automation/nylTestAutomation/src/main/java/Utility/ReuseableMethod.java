package Utility;


//import static org.junit.jupiter.api.Assumptions.assumingThat;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Selenium.ScreenShotUtility;
import Selenium.SetUp;

public class ReuseableMethod extends SetUp {
	
	
	
	public WebDriver driver = getDriver();
	ScreenShotUtility utility=new ScreenShotUtility();
	 Actions actionObject = new Actions(driver);
	 public static HashMap<Integer,String> emailMap=new HashMap<Integer,String>();
	 
	 private final Logger log =LogManager.getLogger(ReuseableMethod.class.getName());
	 
	 public String RandomEmail(WebElement Object) 
	 {
		 String email = null;
		try {
			  Random rad = new Random();
		        for (int j=1; j<=1; j++ )
		        {
		        	 email="username1"+rad.nextInt(10000)+"@mail.com";
		        System.out.print("email generated:" +email);  
		        Object.sendKeys(email);
		        }
		         
		} catch (Exception e){
			e.printStackTrace();
			
		}
	return email;	 
		
	 }
	 
	 
	 public String getemail(){
	     
		 Thread currentThread = Thread.currentThread();
	     int threadID = currentThread.hashCode();

	    System.out.println("Thread id in getemail: "+threadID);
	     return  emailMap.get(threadID);
	}
	
	public void addemail(String emailid){
		 Thread currentThread = Thread.currentThread();
	     int threadID = currentThread.hashCode();
	     
	     emailMap.put(threadID,emailid);
	     System.out.println("Thread id in addemail: "+threadID);
	     
	     System.out.println("Stored email Id's: " +emailMap);
	     
	}
	 
	
	 public  void Slider(WebElement Object, double d) 
	 {
		try {
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			   //WebElement a = driver.findElement(By.xpath(OR.getProperty(object)));
			 String percent1="'left:"+ d+"%;'";
			 
			 String val= "arguments[0].setAttribute('style',"+percent1+")";
			   js.executeScript(val,Object);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	 }
	 public  void RefreshBrowser() throws InterruptedException {
			driver.navigate().refresh();
			Alert al= driver.switchTo().alert();
			al.accept();
			Thread.sleep(2000);
			
		}
		
		
		public  void scrollDown(WebElement Object) 
		 {
			try {
		 	System.out.println("\nScroll down ");
		     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Object);
		     Thread.sleep(1000);
		   // System.out.println("Get text of button-------"+Object.getText());
		    // ApplyNowInfo.click();
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		 }
		
		public  void scrollatTop() 
		 {
			try {
		 	System.out.println("Scroll To the Top ");
		 	
		     ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,-400)", "");
		    
		    // System.out.println("Get text of button-------"+Object.getText());
		    // ApplyNowInfo.click();
		     Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		 }
		
		 public  void dropDown(WebElement Object,String Data1 ) {
			 try {
			  Select s = new Select(Object);
		 		List<WebElement> dd=s.getOptions();
		 		System.out.println(dd.size());
		 		for(int i=0;i<dd.size();i++){
		 			System.out.println(dd.get(i).getText());
		 			System.out.println(Data1);
		 			if(dd.get(i).getText().trim().equalsIgnoreCase(Data1))
		 				//Thread.sleep(500);
		 				
		 			{
		 				
		 				s.selectByVisibleText(Data1);
		 				//Thread.sleep(3000);
		 				
		 				break;
		 				
		 			}
		 			
		 		}
			 } catch (Exception e) {
				 e.printStackTrace();
			  
		  }
		 }
		 public  void dropDown_select_byPartialText(WebElement Object,String Data1 ) {
			 try {
			  Select s = new Select(Object);
		 		List<WebElement> dd=s.getOptions();
		 		
		 		for(int i=0;i<dd.size();i++){
		 			
		 			if(dd.get(i).getText().contains(Data1))
		 			{
	
		 				s.selectByVisibleText(Data1);

		 				break;
		 				
		 			}
		 			
		 		}
			 } catch (Exception e) {
				 e.printStackTrace();
			  
		  }
		 }
		 public  void dropDownselectbyvalue(WebElement Object,String Data1 ) {
			 try {
			
			  Select select= new Select(Object);
			  
			  if (Data1.contains("$")||Data1.contains(","))
			  {
				  String DataNew=Data1;
				  String DataNew1= DataNew.replace("$", "");
				  DataNew=DataNew1.replaceAll(",","");
				  DataNew.trim();
				  
				  String ObjectNew=	Object.getText().replace("$", "");
				  ObjectNew=ObjectNew.replaceAll(",", "");

				select.selectByValue(DataNew);
			 Thread.sleep(1000);
			  }
			  else{
				  select.selectByValue(Data1);
				  
			  }
		 		
			 } catch (Exception e) {
				 e.printStackTrace();
			  
		  }
		 }
		 	
		 public  List<WebElement> dropDowngetOption(WebElement Object ) {
			 List<WebElement> options = new ArrayList<WebElement>();
			 try {
			 
			  Select select= new Select(Object);
			  options=	select.getOptions();
			 Thread.sleep(1000);
		 	
		 		
			 } catch (Exception e) {
				 e.printStackTrace();
			  
		  }
			return options;
		 }
		 
		 public  void Clickbutton(WebElement Object) 
		 {
			try {
		 	System.out.println("Click button ");
		 	((JavascriptExecutor) driver).executeScript("arguments[0].click();", Object);
		  //   System.out.println("Get text of button-------"+Object.getText());
		    // ApplyNowInfo.click();
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		 }
		 
		 public void select_Benefit_Amount_slider(WebElement upArrow,String Data, WebElement amount,WebElement downArrow){
				
				try {
					

					log.debug("Select Benefit amount");
					scrollDown(upArrow);
				
					String a=Data;
					String data1=a.replace("$","");
					a=data1.replaceAll(",", "");
					a.trim();
					int benefit = Integer.parseInt(a);
					String am1=	amount.getText().replace("$", "");
					am1=am1.replaceAll(",", "");
				
					
				int amountshown=Integer.parseInt(am1);
				
				log.debug("Amount Shown in slider=" + amountshown + "\nBenefit Amount is "+benefit );
					if(amountshown<benefit)
					{
						
						while(amountshown!=benefit)
						{
							((JavascriptExecutor) driver).executeScript("arguments[0].click();", upArrow);

							am1=amount.getText().replace("$", "");
							am1=am1.replace(",", "");
							amountshown=Integer.parseInt(am1);
						System.out.println("Amount Shown in slider=" + amountshown + " and Benefit Amount is "+benefit);
						} 
					}
					else if(amountshown==benefit)
					{
						log.info("Amount matched, No need to slide");
					}
					else
					{
						while(amountshown!=benefit)
						{
							((JavascriptExecutor) driver).executeScript("arguments[0].click();", downArrow);
							//Thread.sleep(500);
							am1=amount.getText().replace("$", "");
							am1=am1.replace(",", "");
							amountshown=Integer.parseInt(am1);
							System.out.println("Amount Shown in slider=" + amountshown + " and Benefit Amount is "+benefit);
						}
						
					}
					log.info("Slider is slided till given amount|| Pass");
					
				}catch (Exception e) {
					
					log.info("Slider is slided till given amount|| Fail");
					e.printStackTrace();
				}
				
			}
		
		public void switchTo_ChildWindow() throws InterruptedException
		{
			Thread.sleep(1000);
		
			Set <String> handles =driver.getWindowHandles();
			 Iterator<String> it = handles.iterator();
			 //iterate through your windows
			 System.out.println(handles.size());
			 while (it.hasNext()){
				 String parent = it.next();			
			 String newwin = it.next();
			 System.out.println(driver.switchTo().window(newwin).getTitle());
			
			 }
			
		}
	
		
		 
		 public  void PDFvalidation(WebElement Object) throws InterruptedException, IOException, AWTException {
			 		Object.isDisplayed();
				 Object.click();
				 Thread.sleep(8000);
				 Set <String> handles =driver.getWindowHandles();
				 Iterator<String> it = handles.iterator();
				 //iterate through your windows
				 while (it.hasNext()){
				 String parent = it.next();
				 String newwin = it.next();
				 driver.switchTo().window(newwin);
				 System.out.println(driver.getCurrentUrl());
				 Thread.sleep(8000);
				 
				 //java.lang.Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\AutoIT\\AutoItProg.exe");
				 //java.lang.Runtime.getRuntime().exec("C:\\Users\\swati663419\\Desktop\\AutoItProg.exe");
				 
				 
				 
				 
				 
				 Robot robot = new Robot();

				    // Press Ctrl+S
				    robot.keyPress(KeyEvent.VK_CONTROL);
				    robot.keyPress(KeyEvent.VK_S);
				    robot.keyRelease(KeyEvent.VK_CONTROL);
				    robot.keyRelease(KeyEvent.VK_S);

				    Thread.sleep(5000);
				    
				    robot.keyPress(KeyEvent.VK_ENTER);
				    robot.keyRelease(KeyEvent.VK_ENTER);
				    
		           Thread.sleep(5000);
		           driver.close();
		           driver.switchTo().window(parent);
				}
	             
			  
		  }
		 
		 public void selectSinglevalue(WebElement Object1,WebElement Object2,String data) throws Exception
			{
			 
			if(Object1.getAttribute("value").equalsIgnoreCase(data))
				{
					
					Object1.click();
				}
				else
				{
					
					Object2.click();
				}
			Thread.sleep(500);
			}
			
		 
		 public void select_Single_value_Icon(WebElement value,WebElement Object2,WebElement Object3, String data ) throws Exception
			{
		Thread.sleep(500);
			if(value.getAttribute("value").equalsIgnoreCase(data))
				{
					Object2.isDisplayed();
					Object2.click();
				}
				else
				{
					Object3.isDisplayed();
					Object3.click();
				}
			Thread.sleep(500);
			}

		 
		 public String Enter_Current_System_Date() throws InterruptedException {
				
					Date date = new Date();
					DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
					
					
					String today=dateFormat.format(date).replaceAll("\\s","");
					System.out.println(" System Current Date:" +today);
					
					Thread.sleep(1000);

					today.trim();
					return today; 		

					
				
		 }

		 
		 public  void Select_value_by_Up_Down_arrow() throws InterruptedException 
		 {

			 
			
			try {
				Thread.sleep(1000);
				 actionObject.sendKeys(Keys.ARROW_DOWN);
				 Thread.sleep(1000);
				 actionObject.sendKeys(Keys.ENTER).build().perform();
				 Thread.sleep(1000);
			} catch (Exception e) {
				//e.printStackTrace();
				
				
				Thread.sleep(1000);	
				actionObject.sendKeys(Keys.ARROW_UP);
				Thread.sleep(1000);
				 actionObject.sendKeys(Keys.ENTER).build().perform();
				 Thread.sleep(1000);
				
			}
		 }			 
		 
		 public String Enter_customized_previous_Date(String Data)  {
			
				DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				Calendar cal = Calendar.getInstance();
				String dateval=Data.substring((Data.indexOf("-")+1));
				String d1[],y[],m[],d[];
				String date1=null, month=null, year=null,s = null;
				
				if(dateval.startsWith(" "))
				{ 
				dateval=dateval.substring(dateval.indexOf(" ")+1);
			}
				if(dateval.contains("days"))	
				{
					
					d1=dateval.split("days");
					 dateval=d1[0];
					 }
				
				else if(dateval.contains("Days"))
				{
					 d1=dateval.split("Days");
					 dateval=d1[0];
					}
				if (dateval.contains("Y/")&&dateval.contains("M/")&&dateval.contains("D"))
				{
					y=dateval.split("Y");
					year=y[0];
					year=year.trim();
					month=dateval.substring((dateval.indexOf("/")+1), dateval.indexOf("M"));
					m=month.split("M");
					month=m[0];
					month=month.trim();
					date1=dateval.substring((dateval.indexOf("M")+2), dateval.indexOf("D"));
					d=date1.split("D");
					date1=d[0];
					date1=date1.trim();
						
				}
				 if (dateval.contains("Y-")&&dateval.contains("M-")&&dateval.contains("D"))
				{
					y=dateval.split("Y");
					year=y[0];
					year=year.trim();
					month=dateval.substring((dateval.indexOf("-")+1), dateval.indexOf("M"));
					m=month.split("M");
					month=m[0];
					month=month.trim();
					date1=dateval.substring((dateval.indexOf("M")+2), dateval.indexOf("D"));
					d=date1.split("D");
					date1=d[0];
					date1=date1.trim();
					
				}
				
				 if(dateval.contains("y/")&&dateval.contains("m/")&&dateval.contains("d"))
				{
					y=dateval.split("y");
					year=y[0];
					year=year.trim();
					month=dateval.substring((dateval.indexOf("/")+1), dateval.indexOf("m"));
					m=month.split("m");
					month=m[0];
					month=month.trim();
					date1=dateval.substring((dateval.indexOf("m")+2), dateval.indexOf("d"));
					d=date1.split("d");
					date1=d[0];
					date1=date1.trim();
				}
				 if(dateval.contains("y-")&&dateval.contains("m-")&&dateval.contains("d"))
					{
						y=dateval.split("y");
						year=y[0];
						year=year.trim();
						month=dateval.substring((dateval.indexOf("-")+1), dateval.indexOf("m"));
						m=month.split("m");
						month=m[0];
						month=month.trim();
						date1=dateval.substring((dateval.indexOf("m")+2), dateval.indexOf("d"));
						d=date1.split("d");
						date1=d[0];
						date1=date1.trim();
					} 
				 
				System.out.println("date: "+ dateval );
				if(dateval.endsWith(" "))
				{
					System.out.println("ends with");
					d1=dateval.split(" ");
					date1=d1[0];
					
				}
					try
					{
						if(month==null)
						{
							month="00";
						}
						if(year==null)
						{
							year="00";
						}
					if(date1==null)
					{date1="00";
					}
						int mon=Integer.parseInt(month);
						cal.add(Calendar.MONTH, -mon);
						int day=Integer.parseInt(date1);
					      cal.add(Calendar.DAY_OF_MONTH, -day);
					      int year1=Integer.parseInt(year);
					      cal.add(Calendar.YEAR, -year1);
					
					Date date = cal.getTime();
				
					s=dateFormat.format(date);
					Thread.sleep(1000);
				    System.out.println("Customized date: " + s);
					
					
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				return s;
			 
		 }	 
		 
		/*public void enterDate_by_JavaScript(String locator,String data)
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			
			data=data.substring(0, 2)+"/"+data.substring(2, 4)+"/"+data.substring(4, data.length());
			
			System.out.println("date "+data);
			//((JavascriptExecutor) driver).executeScript(js, object);
			//jse.executeAsyncScript("arguments[0].value="+data,object); 
			
			jse.executeScript("document.getElementById('"+locator+"').value=\'"+data+"\';"); 
			
		}*/
		 
		 /*public void datePicker(WebElement calendarBtn, String year,String month, String day,WebElement back, String date) throws InterruptedException, ParseException
		 {
			 String date1=date.substring(2, 4);
			 String year1=date.substring(4, date.length());
			 SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
			 date=date.substring(0, 2)+"-"+date.substring(2, 4)+"-"+date.substring(4, date.length());
			 DateFormat dateFormat = new SimpleDateFormat("MMM");
			 Date d = sdf.parse(date);
			 
			 
			 String mon=dateFormat.format(d);
			 System.out.println("Month name: "+mon); 
			 System.out.println("Year: "+year1);
			 System.out.println("date: "+date1);
			 calendarBtn.click();
			 Thread.sleep(1000);
			 
			 List<WebElement> yearList=new ArrayList<>();
			 yearList.addAll(driver.findElements(By.xpath(year)));
			 
			 List<WebElement> monthList=new ArrayList<>();
			 monthList.addAll(driver.findElements(By.xpath(month)));
			 
			 List<WebElement> dayList=new ArrayList<>();
			 dayList.addAll(driver.findElements(By.xpath(day)));
			 
			 for(WebElement x:yearList)
			 {
				 if(x.getText().equals(year1))
				 {
					 System.out.println(x.getText());
					 x.click();
					 Thread.sleep(1000);
				 }
				 else
				 {
					 back.click();
					 yearList.addAll(driver.findElements(By.xpath(year)));
				 }
				 
			 }
			 
			 
			 
		 }*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		

		 
}
