package com.ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;




public class ReadExcelData {

	private String filepath;
	private boolean filestatus;
	private XSSFWorkbook   workbook;
		
		
		
		ReadExcelData(String filepath1)
		{
			this.filepath=filepath1;
		}
		
		
		public  void loadExcelfile() throws InvalidFormatException, IOException 
		{
			System.out.println("file loaded succesfully.........");
			File f= new File(filepath);
		
		filestatus=fileExist();
				
		if(filestatus)
		{
			FileInputStream fis =new FileInputStream(f);
			workbook=new XSSFWorkbook(f);
			
			System.out.println("Excel file is loaded succussfully");
			
		}else
		{
			System.out.println("File is not found "+filepath);
		}
		
		
		}

	public boolean fileExist()
	{
		boolean status=true;
		
		
		File f= new File(filepath);

	if(!f.exists())
	{
		status=false;
	}

	return status;
	}

	public int rowCount(String Sheetname)
	{
	XSSFSheet sheet=workbook.getSheet(Sheetname);
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println("row count is:"+rowcount);
	return rowcount;
	
	}

	public int colCount(String Sheetname)
	{
		XSSFSheet sheet=workbook.getSheet(Sheetname);
		int colcount=sheet.getRow(rowCount(Sheetname)-1).getPhysicalNumberOfCells();
		System.out.println("coulumn count is:"+colcount);
		return colcount;
		
	}

	public int getTestcaseposition(String Sheetname,String Testcasename){
	int found=0;
	int rowcount= rowCount(Sheetname);
	for(int i=1;i<=rowcount-1;i++)
		{
		XSSFSheet sheet=workbook.getSheet(Sheetname);
			
			String crnttest_case=sheet.getRow(i).getCell(0).getStringCellValue();
		
			if(crnttest_case.trim().equals(Testcasename.trim()))
		{
			found=i;
			
			System.out.println(Testcasename);
				break;
			}
			
		}
		
	
		
	return found;
		
	}
	public int getcolpositin(String Sheetname,String colname){
		int found=0;
	int colcount=	rowCount(Sheetname);
		for(int i=1;i<=colcount-1;i++)
		{
			XSSFSheet sheet=workbook.getSheet(Sheetname);
			
			String crnttest_colum=sheet.getRow(0).getCell(i).getStringCellValue();
			
			if(crnttest_colum.trim().equals(colname.trim()))
			{
				found=i;
				
				System.out.println(colname);
				break;
			}
			
		}
		
		
		
		return found;
		
	}


	public String getData(String Sheetname,String Testcasename,String colname)
{
		String data="";
		int test_case_position=getTestcaseposition(Sheetname,Testcasename);
	int col_position=getcolpositin(Sheetname,colname);
		
		if(!((test_case_position==0)&&(col_position==0)))
	{
			
			switch (workbook.getSheet(Sheetname).getRow(test_case_position).getCell(col_position).getCellTypeEnum()) {
		
			case STRING:
			data=workbook.getSheet(Sheetname).getRow(test_case_position).getCell(col_position).getStringCellValue();
			
			break;
			case NUMERIC:
			int numdata=(int)workbook.getSheet(Sheetname).getRow(test_case_position).getCell(col_position).getNumericCellValue();
				
			data = Integer.toString(numdata);
				break;
				
				default:
			
			break;
			
			}
			
		}else
		{
			System.out.println("no data exist for the test case:"+Testcasename+"in the sheet:"+Sheetname);
		}
		
		
		
		return filepath;
		
	}
}
	

