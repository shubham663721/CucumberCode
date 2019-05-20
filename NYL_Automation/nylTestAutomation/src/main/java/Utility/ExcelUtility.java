package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Selenium.SetUp;

public class ExcelUtility extends SetUp  {
	File excelFile = null;
	HSSFWorkbook workbook=null;
	HSSFSheet sheet1=null;
	HSSFRow row1, row, row2;
	HSSFCell cell, cell1, cell2;
	FileOutputStream fileout = null;
	//FileInputStream filein = null;
	
	
	
	int TotalRow;
    int TotalCol;
    String result = "";
    int resultCol = -1;
    
    private static HashMap<Integer, String> scenarios;

   	public WebDriver driver = getDriver();
	
	
	public Map<String, Integer> getTableHeaders(Sheet worksheet){
		
		Row row = worksheet.getRow(0);
		int lastCellNumber = row.getLastCellNum();
		Map<String, Integer> headers = new HashedMap<>(lastCellNumber);
		for(int i= 0; i < lastCellNumber; i++) {
			if(row.getCell(i) != null) {
				headers.put(row.getCell(i).toString(), i);
			}
		}
		return Collections.unmodifiableMap(headers);
	}
	
	public List<String> getColumnData(Sheet worksheet, int columnIndex){		
		int lastRowNumber = worksheet.getLastRowNum();
		List<String> records = new ArrayList<>(lastRowNumber);
		//Iterator<Row> rowIterator = worksheet.iterator();
		for(int i = 1; i <=lastRowNumber; i++) {
			Row currentRow = worksheet.getRow(i);
			if(currentRow != null) {
				Cell currentCell = currentRow.getCell(columnIndex);
				if(currentCell == null || currentCell.toString().equals("")) {
					break;
				}else {
					records.add(currentCell.toString());
				}
			}
		}
		/*while(rowIterator.hasNext()) {
			Row currentRow = rowIterator.next();
			if(currentRow != null) {
				Cell currentCell = currentRow.getCell(columnIndex);
				if(currentCell == null || currentCell.toString().equals("")) {
					break;
				}else {
					records.add(currentCell.toString());
				}
			}
		}*/
		return Collections.unmodifiableList(records);
		
	}
	private File setFilePath() {
		String userDirectory = System.getProperty("user.dir");
		// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
		//XSSFWorkbook workbook = new XSSFWorkbook();
		//XSSFSheet sheet = workbook.createSheet("Receipt_Number");
		String path = userDirectory + File.separator + "Receipt" + /* dateFormat.format(new Date())+ */".xls";
		excelFile = new File(path);
		return excelFile;
	}

	public void Write_Receipt_Number(String website, String data, String seprate) throws IOException, Exception {
		FileInputStream filein = null;
		excelFile = setFilePath();
		workbook = new HSSFWorkbook();
		String ScenarioId = getScenario();
		//data = ScenarioId + ": " + data;
		data = ScenarioId +seprate+ ": " + data;
		System.out.println("Inside write_receipt :" + website+ " "+data);
		//String website="waepa";
		//String data="WAEPASC01: 100000065195";
				
		boolean recCreated = false;
		if (excelFile.exists() == false) {

			sheet1 = workbook.createSheet("Receipt");
			// NPOIFSFileSystem fs = new NPOIFSFileSystem(excelFile);

			String name[] = { "ABE", "APTA", "WAEPA", "ACS", "APK", "AMA", "AICHE", "AIA", "ACSE", "NADA",
					"AAFPINS", "CHEMISTS", "TIE", "APSIT", "AAO", "ITFP", "IBM", "LIFERING", "LSBA-GI", "GEOCARE",
					"OPIT", "TSCPA", "CAAGI", "REAGIT", "CRBG", "CSEA", "AAPGI", "nada-employee", "AAP", "SPE",
					"CAA", "CAA-GI", "MERCER", "OMA", "NYSBA", "WAEPAGI", "AVMAlifetrust", "CALBAR", "NYLDEMO",
					"ITFP", "ITFPSI", "HPSO", "RUAA", "IEEE", "ACOG", "NYLTEST", "NYLJET", "MAPSI" };

			row1 = sheet1.createRow(0);
			for (int i = 0; i < name.length; i++) {
				cell1 = row1.createCell((short) i);
				cell1.setCellValue(name[i]);
			}
			fileout = new FileOutputStream(excelFile, true);
			workbook.write(fileout);
			// fileout.close();
		}

		// fileout = new FileOutputStream(excelFile,true);
		filein = new FileInputStream(excelFile);

		// POIFSFileSystem fs = new POIFSFileSystem(filein);
		// workbook=new HSSFWorkbook((POIFSFileSystem) fs.getRoot(), true);
		workbook = new HSSFWorkbook(filein);
		sheet1 = workbook.getSheet("Receipt");
		row = sheet1.getRow(0);
		
		
		TotalRow = sheet1.getLastRowNum();
	    HSSFRow headerRow =sheet1.getRow(0);
	    for (Cell cell : headerRow){
	        result = cell.getStringCellValue();
	        if (result.equalsIgnoreCase(website)){
	            resultCol = cell.getColumnIndex();
	            break;
	         }
	    }
		
	    if (resultCol == -1){
	        System.out.println("Result column not found in sheet");
	        return;
	    }   
	    for(int count = 1;count<=sheet1.getLastRowNum();count++){
	    	Row currentRow = sheet1.getRow(count);
	    	if(currentRow != null) {
	    		Cell cell = currentRow.getCell(resultCol);
	    		if(cell != null) {
	    			if(cell.getCellTypeEnum().equals(CellType.BLANK)) {
		    			cell.setCellValue(data);
		    			recCreated = true;
		    			break;
	    			}else {
	    				continue;
	    			}
	    		}else {
	    			Cell newCell = currentRow.createCell(resultCol);
	    			newCell.setCellValue(data);
	    			recCreated = true;
	    			break;
	    		}
	    	}
	    }
	    if(!recCreated) {
	    	Row currentRow = sheet1.createRow(sheet1.getLastRowNum()+1);
		    Cell currentCell = currentRow.createCell(resultCol);
		    currentCell.setCellValue(data);
	    }
	    
	    filein.close();
	    FileOutputStream outputStream = new FileOutputStream(excelFile);
	    workbook.write(outputStream);
	    outputStream.close();
	    
	    
		
	}

	public String getScenario() {
		Thread currentThread = Thread.currentThread();
		int threadID = currentThread.hashCode();
		return scenarios.get(threadID);
	}

	public void addScenario(String scenario) {
		scenarios = new HashMap<Integer, String>();
		Thread currentThread = Thread.currentThread();
		int threadID = currentThread.hashCode();
		int index = scenario.indexOf("<");
		String scenario_id = scenario.substring(scenario.indexOf("<") + 1, scenario.indexOf(">"));
		System.out.println(scenario_id);
		scenarios.put(threadID, scenario_id);
	}
	
	

public void deleteExcelData() throws IOException {

	FileInputStream file = null;
	HSSFWorkbook wb = null;
	FileOutputStream out = null;
	try {
		file = new FileInputStream(new File(System.getProperty("user.dir") + "\\Receipt.xls"));

		wb = new HSSFWorkbook(file);
		HSSFSheet sheet = wb.getSheetAt(0);

		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			deleteRow(sheet, row);
		}

		out = new FileOutputStream(new File(System.getProperty("user.dir") + "\\Receipt.xls"));
		wb.write(out);

	} catch (Exception e) {
	} finally {
		if (file != null)
			file.close();
		if (out != null)
			out.close();
		if (wb != null)
			wb.close();
	}

}

private void deleteRow(HSSFSheet sheet, Row row) {
	int lastRowNum = sheet.getLastRowNum();
	if (lastRowNum != 0 && lastRowNum > 0) {
		int rowIndex = row.getRowNum();
		Row removingRow = sheet.getRow(rowIndex);
		if (removingRow != null) {
			sheet.removeRow(removingRow);
			System.out.println("Deleting.... ");
		}
	}

}

	
	
}
