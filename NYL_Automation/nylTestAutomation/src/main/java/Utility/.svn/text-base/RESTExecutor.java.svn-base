package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.record.aggregates.WorksheetProtectionBlock;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import MyCommonObject.CommonPage;
import Selenium.SetUp;
import Utility.FTPService;
import Utility.FTPServiceImpl;
import gherkin.lexer.It;
import Utility.ExcelUtility;

@Service("RESTExecutor")
public class RESTExecutor extends SetUp {
	
	private String sourceFolder;
	
	private String destinationFolder;
	
	private String[] sites;
	private String ftpUser;
	private String ftpPassword;
	private String ftpHost;
    private int ftpPort;
    private String keystoreLocation;
	private String reportsLocation;
	private String[] filterExt;
	private String receiptFileLocation;
	private String receiptFileName;
	private List<String> filterExtList= null;
	private RestTemplate restTemplate =null;
	private HttpHeaders headers = null;
	private HttpEntity<String> httpEntity = null;
	private FTPService service = null;
    private Integer threadCount;
	ThreadPoolExecutor executor;
	private String pdfDir;
	private String xmlDir;
	private String urldata;
	xmlAndPdfBeyondCompare beyoundCom=new xmlAndPdfBeyondCompare();
	private Map<String, List<String>> resources = null;
	//private List<String> filterExtList = new ArrayList<>(Arrays.asList(filterExt));
	public RESTExecutor() {
		setRESTProperties();
		restTemplate = new RestTemplate();
		headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		httpEntity = new HttpEntity<>(headers);
		service = new FTPServiceImpl();
		resources = new HashMap<String, List<String>>();
		
	}
	
	private void setRESTProperties() {
		propertyUtility utility = new propertyUtility();
		Properties props = utility.loadFtpData();
		
		sourceFolder = props.getProperty("SOURCE_FOLDER");
		
		destinationFolder = System.getProperty("user.dir")+props.getProperty("DESTINATION_FOLDER");
		
		sites = props.getProperty("SITES").split(",");
		ftpUser = props.getProperty("FTP_USER");
		ftpPassword = props.getProperty("FTP_PW");
		ftpHost = props.getProperty("FTP_HOST");
		ftpPort = Integer.parseInt(props.getProperty("FTP_PORT"));
		keystoreLocation = System.getProperty("user.dir")+props.getProperty("KEYSTORE_LOCATION");
		reportsLocation = props.getProperty("FTP_REPORTS_DIR");
		filterExt = props.getProperty("DL_FILE_EXT").split(",");
		receiptFileLocation = System.getProperty("user.dir")+props.getProperty("RECEIPT_FILE_LOCATION");
		receiptFileName = props.getProperty("RECEIPT_FILE_NAME");
		threadCount = Integer.valueOf(props.getProperty("NUM_DOWNLOAD_THREADS"));
		pdfDir= props.getProperty("PDF_DIR");
		xmlDir = props.getProperty("XML_DIR");
		urldata= props.getProperty("URL");
		
	}
	
	public String execute(String url, Map<String, Object> parameters) {		
		ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET,
				httpEntity, String.class, parameters);
		return responseEntity.getBody();
	}
	
	public void  generateReports(String[] sites) {
		Double randomNumber = Math.random();
		randomNumber = (randomNumber *357) * 10;
		Integer num = randomNumber.intValue();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dt = sdf.format(new Date());
		System.setProperty("javax.net.ssl.trustStore",keystoreLocation);
		
		for(String site : sites) {
			String url = urldata+num+"/"+site+"/"+dt;
			//https://adminpreview2.nylinsure2.com/NYLBatch/jobLauncher/appCreate/applicationCreation/TC21/AMA/2018-12-27
			System.out.print("calling "+url);
			Object response = execute(url,new HashMap<String,Object>());
			/*try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.println(" "+response);
		}
		
	}
	
	public void downloadReports() {
		getResources();
		executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(threadCount);
		filterExtList = new ArrayList<>(Arrays.asList(filterExt));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dt = sdf.format(new Date());
		service.connect(ftpUser, ftpPassword, ftpHost, ftpPort);
		boolean status = service.cd(reportsLocation+"/"+dt);
		if(status) {
			{
				service.cd(pdfDir);
				List<CommonPage> files = service.ls();
				for(CommonPage file : files) {
					if(file.isDirectory()) {
						service.cd(file.getFileName());
						List<CommonPage> siteFiles = service.ls();
						downloadFiles(siteFiles,file.getFileName());
					}
				}
			}
			
			{
				service.cd(reportsLocation+"/"+dt+"/"+xmlDir);
				//service.cd(xmlDir);
				List<CommonPage> files = service.ls();
				for(CommonPage file : files) {
					if(file.isDirectory()) {
						service.cd(file.getFileName());
						List<CommonPage> siteFiles = service.ls();
						downloadFiles(siteFiles,file.getFileName());
					}
				}
			}
			
			//ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(threadCount);
			/*for(String file : downloadFileList) {
				Task task = new Task(file);
				executor.execute(task);
			}*/
			
		}
		
		
	}
	private Map<String, List<String>> getResources(){	
		ExcelUtility util = new ExcelUtility();
		Workbook book = getWorkbook();		
		Sheet worksheet = book.getSheet("Receipt");		
		Map<String, Integer> tableHeaders = util.getTableHeaders(worksheet);
		Set<String> header = tableHeaders.keySet();
		for(String key : header) {
			int index = tableHeaders.get(key);
			List<String> columnData = util.getColumnData(worksheet, index);
			resources.put(key, columnData);
		}
		return resources;
	}
	public void downloadFiles(List<CommonPage> files, String siteName) {
		for(CommonPage attr : files) {
			System.out.println("cd "+service.currentRemoteDir()+"/"+attr.getFileName()+ " "+attr.isDirectory());
			if(attr.isDirectory()) {
				service.cd(attr.getFileName());
				List<CommonPage> remoteFiles = service.ls();
				downloadFiles(remoteFiles, siteName);
			}else {

				String fileExt = (attr.getFileName().substring(attr.getFileName().lastIndexOf('.')+1)).toUpperCase();
				String fileNameWithoutExt = attr.getFileName().substring(0, attr.getFileName().lastIndexOf("."));
				if(filterExtList == null ||  filterExtList.contains(fileExt)) {
					List<String> resourceData = resources.get(siteName);
					for(String data : resourceData) {
						String[] resourceArr = data.split(":");
						if(fileNameWithoutExt.equals(resourceArr[1].trim()+"_MEMBPYMT")
								|| fileNameWithoutExt.endsWith(resourceArr[1].trim()+"_AFI")
								||fileNameWithoutExt.endsWith(resourceArr[1].trim()+"_AFI_ACORD")) {
							service.download(attr.getFileName(), sourceFolder);
						}/*else if(fileNameWithoutExt.endsWith(resourceArr[1].trim()+"_AFI")) {
							service.download(attr.getFileName(), destinationFolder);
						}else if(fileNameWithoutExt.endsWith(resourceArr[1].trim()+"_AFI_ACORD")) {
							service.download(attr.getFileName(), destinationFolder);
						}*/
								
					}
					//System.out.println("downloading "+service.currentRemoteDir()+"/"+attr.getFileName());
					/*Task task = new Task(service.currentRemoteDir(), attr.getFileName());
					executor.execute(task);*/
					//downloadFileList.add(service.currentRemoteDir()+"/"+attr.getFileName());
					//service.download(attr.getFileName(), sourceFolder);//sourceFolder is place where files will be downloaded. 
																		//These files will be renamed and then moved to destinationFolder
				}
				
			
				}
				
			}
		
		service.cd("..");
	}
	
	private Workbook getWorkbook() {
		File file = new File(receiptFileLocation+receiptFileName);
		try(InputStream is = new FileInputStream(file);){
			return new HSSFWorkbook(is);
			//return book;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	private void renameAndMove() {
		File source = new File(sourceFolder);
		//File destination = new File(destinationFolder);
		Workbook book = getWorkbook();
		Sheet worksheet = book.getSheet("Receipt");
		ExcelUtility util = new ExcelUtility();
		Map<String, Integer> tableHeaders = util.getTableHeaders(worksheet);
		for(String site : sites) {
			Integer columnIndex = tableHeaders.get(site);
			if(columnIndex != null) {
				List<String> columnData = util.getColumnData(worksheet, columnIndex);
				for(String data : columnData) {
					String[] renameData = data.split(":");
					File[] sourceFiles = source.listFiles();
					if(sourceFiles.length > 0) {
						for(File sourceFile : sourceFiles) {
							if(sourceFile.isDirectory()) {
								continue;
							}
							String fileName = sourceFile.getName();
							String fileNameExt = fileName.substring(fileName.lastIndexOf('.')+1).toUpperCase();
							String fileNameWithoutExt = fileName.substring(0,fileName.lastIndexOf('.'));
							if(fileNameWithoutExt.equals(renameData[1].trim()+"_MEMBPYMT")) {
								boolean status = sourceFile.renameTo(new File(destinationFolder+renameData[0]+"_PYMT."+fileNameExt));
								//boolean status = sourceFile.renameTo(new File(destinationFolder+renameData[0]+"."+fileNameExt));
								System.out.println(site + " file moved to destination folder "+status);
								sourceFile.delete();
							}else if(fileNameWithoutExt.endsWith(renameData[1].trim()+"_AFI")) {
								boolean status = sourceFile.renameTo(new File(destinationFolder+renameData[0]+"."+fileNameExt));
								//boolean status = sourceFile.renameTo(new File(destinationFolder+renameData[0]+"_AFI."+fileNameExt));
								System.out.println(site + "file moved to destination folder "+status);
								sourceFile.delete();
							}else if(fileNameWithoutExt.endsWith(renameData[1].trim()+"_AFI_ACORD")) {
								boolean status = sourceFile.renameTo(new File(destinationFolder+renameData[0]+"."+fileNameExt));
								//boolean status = sourceFile.renameTo(new File(destinationFolder+renameData[0]+"_AFI_ACORD."+fileNameExt));
								System.out.println(site + "file moved to destination folder "+status);
								sourceFile.delete();
							}
						}
					}
				}
			}
		}
	}
	
	class Task implements Runnable{
		String filePath;
		String fileName;
		public Task(String filePath, String fileName) {
			this.filePath = filePath;
			this.fileName = fileName;
		}
		public void run() {
			//System.out.println("downloading "+filePath);
			System.out.println("downloading "+filePath+"/"+fileName);
			File file = new File(sourceFolder+fileName);
			if(file.exists()) {
				return;
			}
			FTPService ftpService = new FTPServiceImpl();
			ftpService.connect(ftpUser, ftpPassword, ftpHost, ftpPort);
			ftpService.cd(filePath);
			ftpService.download(fileName, sourceFolder);
			ftpService.disconnect();
		}
	}
	
	public void xmlAndpdfComparison() throws InterruptedException {
	//public static void main(String[] args) throws Exception {
	
	
	//@Test
		//public void runn() throws InterruptedException {
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//final RESTExecutor executor = (RESTExecutor) context.getBean("RESTExecutor");
		File dir = new File(sourceFolder);
		File[] files = dir.listFiles();
		for(File f : files) {
			if(f.isFile()) {
				f.delete();
			}
		}
		dir = new File(destinationFolder);
		files = dir.listFiles();
		for(File f : files) {
			if(f.isFile()) {
				f.delete();
			}
		}
		final RESTExecutor executor = new RESTExecutor();
		 executor.generateReports(executor.sites);
		 try {
				Thread.sleep(60*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 executor.downloadReports();
	
     
     
     executor.renameAndMove();
     executor.service.disconnect();
     beyoundCom.PDFCompare();
		
	}
	
}

