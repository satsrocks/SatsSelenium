package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook = null;
	static XSSFSheet sheet = null;
	
	public ExcelUtils(String excelPath, String sheetName){
		
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}

	public void getRowCount() {
	
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows in sheet is "+rows);
		
	}
	
	public void getcolCount() {
		
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of columns in sheet is "+cols);
		
	}
	
	public void getCellStringValue(int row, int col){
		
		String cellval = sheet.getRow(row).getCell(col).getStringCellValue();
		System.out.println("The cell content is "+cellval);
		
	}
	
	public void getCellNumericValue(int row, int col){

		double cellval1 = sheet.getRow(row).getCell(col).getNumericCellValue();
		System.out.println("The cell content is "+cellval1);
		
	}

}
