package utils;

public class ExcelUtilsDemo {


	public static void main(String[] args) {

		ExcelUtils excel = new ExcelUtils("C:\\Users\\SREEJA\\workspace\\SeleniumJavaProject\\Excel\\Data.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getColCount();
		excel.getCellDataNumber(1,1);
		excel.getCellDataString(0,0);
	}
}
