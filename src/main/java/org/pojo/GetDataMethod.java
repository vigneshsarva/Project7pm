package org.pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClassNew;

public class GetDataMethod {

	
	public static String getData(int row, int cell) throws IOException {
		
		File loc = new File("C:\\Users\\Viki\\eclipse-workspace\\MavenSampleProgram\\excel\\new.xlsx");
		FileInputStream  stream = new FileInputStream(loc);
		// type of workbook
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("sheet1");
		
		Row r = sheet.getRow(row);
		Cell c = r.getCell(cell);
		int CellType = c.getCellType();
		String value = null;
		if(CellType==1) {
			
			String stringcellvalue = c.getStringCellValue();
			System.out.println(stringcellvalue);
		} else if(DateUtil.isCellDateFormatted(c)){ 
			 // date format type
			Date datecellvalue = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("mm/dd/yyyy");
			value = sim.format(datecellvalue);
		}else {
			
			double numericCellValue = c.getNumericCellValue();
			
			long l = (long) numericCellValue;
			value = String.valueOf(1);
			
		}
		
					
		return value;
	}
		
}
	
	
