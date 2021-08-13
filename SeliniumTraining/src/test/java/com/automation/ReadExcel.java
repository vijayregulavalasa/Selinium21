package com.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub 
		
		File file=new File("D:\\InterviewDocuments\\TestData\\Input.xlsx");
		
		FileInputStream inputStream=new FileInputStream(file);
		
		Workbook wb=WorkbookFactory.create(file);
		int noofSheets=wb.getNumberOfSheets();
		System.out.println("No of sheets :" + noofSheets);
		Sheet ws=wb.getSheet("Sheet1");
		
		int dataRow=ws.getPhysicalNumberOfRows();
		System.out.println("No of data rows :"+ dataRow);
		int firstRowNumber=ws.getFirstRowNum();
		int lastRowNumber=ws.getLastRowNum();
		
		System.out.println("First Row number :"+ firstRowNumber);
		System.out.println("Last Row number :"+ lastRowNumber);
		
	
		int secondRowCellCount=ws.getRow(1).getPhysicalNumberOfCells();
		System.out.println("SecondRowCellCount:" +secondRowCellCount);
		System.out.println(ws.getRow(1).getFirstCellNum());
		System.out.println(ws.getRow(1).getLastCellNum());
		//Exception in thread "main" java.io.FileNotFoundException: D:\InterviewDocuments\TestData\InputExcel.xlsx 
		//(The process cannot access the file because it is being used by another process)
		
		for(int i=ws.getFirstRowNum();i<=ws.getLastRowNum();i++) {
			
			for(int j=ws.getRow(i).getFirstCellNum();j<ws.getRow(i).getLastCellNum();j++) {
				
				System.out.print(ws.getRow(i).getCell(j) + "\t");
			}
			System.out.println();
		}
		
		ws.getRow(0).createCell(6).setCellValue("Execution Status");
		ws.getRow(1).createCell(6).setCellValue("Pass");
		//FileOutputStream outputStream=new FileOutputStream(file);
		//wb.write(outputStream);
		wb.close();
		
	}

}
