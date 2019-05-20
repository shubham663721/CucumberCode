package Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Selenium.SetUp;

public class xmlAndPdfBeyondCompare extends SetUp{
		
		public void PDFCompare() {
			
			int exitVal = 1;
            try {
                            Runtime rt = Runtime.getRuntime();
                            Process pr = rt.exec(System.getProperty("user.dir")+"\\NYL_Repository\\BeyondTest\\execute.bat");
                            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                            String line = null;
                            while ((line = input.readLine()) != null) {
                                            System.out.println(line);
                            }
                            exitVal = pr.waitFor();
                            System.out.println("Exited with error code " + exitVal);
            } catch (Exception e) {
                            System.out.println(e.toString());
                            e.printStackTrace();
            }
}
		

			
			
}