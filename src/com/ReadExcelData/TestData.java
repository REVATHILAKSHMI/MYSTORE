
package com.ReadExcelData;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class TestData {
public static void main(String[] args) throws InvalidFormatException, IOException {
		
		String path=System.getProperty("user.dir")+"\\TestData\\Testdata.xlsx";
		
		
		ReadExcelData data=new ReadExcelData(path);
		data.loadExcelfile();
		data.getData("TestData","TC02_EMAILID","AppUrl");
}
}