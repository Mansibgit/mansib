package utility;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelRead {
	XSSFWorkbook file;
	XSSFSheet s;
	public String readExcel(String path,String string,int r,int c) throws IOException {
	FileInputStream fin=new FileInputStream(path);
		file=new XSSFWorkbook(fin);
		s=file.getSheet(string);
		String data=s.getRow(r).getCell(c).getStringCellValue();
		file.close();
		return data;
		
	}
	public int getLastRow1(String path,String Sheetname) throws IOException {
		FileInputStream fin=new FileInputStream(path);
		file=new XSSFWorkbook(fin);
		s=file.getSheet("sheet1");
		int LastRow=s.getLastRowNum();
		
		return LastRow;
		
	}
	public static void main( String args[]) throws IOException {
		
         ExcelRead e=new ExcelRead();
	int LastRow=e.getLastRow1("C:\\Users\\HP\\OneDrive\\Documents\\seleniums2.xlsx", "sheet1");
	for(int i=0;i<=LastRow;i++) {
		
		String Username=e.readExcel("C:\\Users\\HP\\OneDrive\\Documents\\seleniums2.xlsx","sheet1",i,0);
		String Password=e.readExcel("C:\\Users\\HP\\OneDrive\\Documents\\seleniums2.xlsx", "sheet1", i,1);
		System.out.println("Usermane"+i+" "+Username+ "");
		System.out.println("Password"+i+" "+Password+"");
}
}}

