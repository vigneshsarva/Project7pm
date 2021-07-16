package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program3 {
	
	// to read and replace a data in the excel sheet
	
public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Viki\\eclipse-workspace\\MavenSampleProgram\\excel\\new.xlsx");
				
				FileInputStream  stream = new FileInputStream(file);
				// type of workbook
				
				Workbook workbook = new XSSFWorkbook(stream);
				
				Sheet sheet = workbook.getSheet("sheet1");
				
				Row row = sheet.getRow(3);
				
				Cell cell = row.getCell(0);
				String stringcellvalue = cell.getStringCellValue();
				
				if(stringcellvalue.equals("Phyton")) {
					cell.setCellValue("javaselenium");
				}
				
				// to update or write or create data in the excel sheet with the required value
				
				FileOutputStream stream2 = new FileOutputStream(file);
				
				workbook.write(stream2);;
				
				System.out.println("done");
				
				
}
	

}
