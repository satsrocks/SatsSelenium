package utils;

public class ExcelUtilsDemo {

	private static String projectPath = System.getProperty("user.dir");

	public static void main(String[] args) {

		ExcelUtils excel = new ExcelUtils(projectPath+"/excel/data.xlsx", "Sheet1");

		excel.getRowCount();
		excel.getcolCount();
		excel.getCellStringValue(2, 1);
		excel.getCellNumericValue(3, 1);
		excel.getCellStringValue(3, 1);

	}

}
