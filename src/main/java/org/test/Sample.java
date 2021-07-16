package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Sample {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Viki\\eclipse-workspace\\MavenSampleProgram\\excel\\new.xlsx");
		
		FileInputStream  stream = new FileInputStream(file);
		
		// type of workbook
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("sheet1");
		
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		System.out.println(cell);
		
		
		
		
		
		
		
	}
	

}
