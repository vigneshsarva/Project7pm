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

public class Program4 {
	
	// to create new sheet and write data on that sheet
public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Viki\\eclipse-workspace\\MavenSampleProgram\\excel\\new.xlsx");
				
				FileInputStream  stream = new FileInputStream(file);
				// type of workbook
				
				Workbook workbook = new XSSFWorkbook(stream);
				
				Sheet createsheet = workbook.createSheet("Newsheet3");
				Row createrow = createsheet.createRow(3);
				Cell createcell = createrow.createCell(3);
				createcell.setCellValue("frameworkclass");
				
				//Sheet createsheet1 = workbook.createSheet("Newsheet1");
		//Row createrow1 = createsheet.createRow(4);
		//		Cell createcell1 = createrow.createCell(4);
	//	createcell1.setCellValue("framework1");
				
				// to update or write or create data in the excel sheet with the required value
				
				FileOutputStream stream2 = new FileOutputStream(file);
				workbook.write(stream2);
				System.out.println("done");
				
						
						
						
}

}
