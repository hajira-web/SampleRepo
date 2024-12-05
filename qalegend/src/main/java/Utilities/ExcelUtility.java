package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	static FileInputStream f;
	static XSSFWorkbook w;//handling xl file
	static XSSFSheet sh;//xl file sheet
	
	public static String getStringData(int a,int b,String path,String sheetname) throws IOException {
		f=new FileInputStream(System.getProperty("user.dir")+path);
		w=new XSSFWorkbook(f);
		sh=w.getSheet(sheetname);
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		
		return c.getStringCellValue();
		}
	
	public static String getIntegerData(int a,int b,String path,String sheetname) throws IOException {
		f=new FileInputStream(System.getProperty("user.dir")+path);
		w=new XSSFWorkbook(f);
		sh=w.getSheet(sheetname);
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);
		}
	

}
