package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program2 {
	
	// to get the data type and date format correctly
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Viki\\eclipse-workspace\\MavenSampleProgram\\excel\\new.xlsx");
				
				FileInputStream  stream = new FileInputStream(file);
				// type of workbook
				
				Workbook workbook = new XSSFWorkbook(stream);
				
				Sheet sheet = workbook.getSheet("sheet1");
				//get physical number of rows and columns
				
				for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
					
					Row row = sheet.getRow(i);
					
					for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
						
						Cell cell = row.getCell(j);
						
						// to get the data type 1--->String , 0---->number
						
						int celltype = cell.getCellType();
						if(celltype==1) {
							
							String stringcellvalue = cell.getStringCellValue();
							System.out.println(stringcellvalue);
						} else if(DateUtil.isCellDateFormatted(cell)){ 
							 // date format type
							Date datecellvalue = cell.getDateCellValue();
							SimpleDateFormat datee = new SimpleDateFormat("DD-MMM-YYYY");
							String format = datee.format(datecellvalue);
							System.out.println(format);
							
						}

						else {
							
							double numbericcellvalue = cell.getNumericCellValue();
							long l = (long) numbericcellvalue;
							System.out.println(l);
						}
}
					
				}
	}
}

