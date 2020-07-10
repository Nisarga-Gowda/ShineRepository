package MyTestPages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileL {
	public String getCellData(String excelpath,String sheet,int row,int cell)throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook w=WorkbookFactory.create(fis);
		String excelVal=w.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		
		return excelVal;
		
	}
	
	public int getRowCount(String excelpath,String sheet) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook w = WorkbookFactory.create(fis);
		int rowNum = w.getSheet(sheet).getLastRowNum();
		return rowNum;
		
	}
	
	public void setCellData(String excelpath,String sheet,int row,int cell,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
		
		FileOutputStream fos=new FileOutputStream(excelpath);
		wb.write(fos);
		wb.close();
		
	}
	public String getPropValue(String propPath,String key)throws Throwable
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties p=new Properties();
		p.load(fis);
		String propValue=p.getProperty(key,"Incorrect Key");
		return propValue;
		
	}
}






