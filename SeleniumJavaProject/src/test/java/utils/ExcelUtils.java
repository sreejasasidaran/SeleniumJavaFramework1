package utils;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mongodb.client.model.Projections;

public class ExcelUtils {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet; 
	public static void main(String[] args) {
		getRowCount();
		getColCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}

	public ExcelUtils(String excelPath, String sheetName){

		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static int getRowCount()
	{
		int rowCount=0;
		try {

			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No.of row count = "+rowCount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowCount;
	}
	public static int getColCount()
	{
		int colCount=0;
		try {

			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No.of col count = "+colCount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colCount;
	}
	public static String getCellDataString(int rowNum, int colNum) {

		String cellData=null;
		try {

			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;

	}
	public static void getCellDataNumber(int rowNum, int colNum) {
		try {

			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}
}

