package com.automation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreateWorkbook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Workbook worbook= WorkbookFactory.create(false);
		Sheet ws=worbook.createSheet("Sheet1");
		Row rowzero=ws.createRow(0);
		rowzero.createCell(0).setCellValue("TestCase1");
		rowzero.createCell(1).setCellValue("UserName");
		rowzero.createCell(2).setCellValue("Password");
		
		Row rowFirst=ws.createRow(1);
		rowFirst.createCell(0).setCellValue("TestCase1");
		rowFirst.createCell(1).setCellValue("UserName");
		rowFirst.createCell(2).setCellValue("Password");
		
		worbook.write(new FileOutputStream("D:\\InterviewDocuments\\TestData\\CreateExcel.xls"));
		worbook.close();
		
		
	}

}
