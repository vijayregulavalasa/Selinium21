package com.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeExceptionTest {

	public static void main(String[] args) throws InterruptedException,FileNotFoundException
	{
		System.out.println("start program");
		Thread.sleep(2000);

		File file = new File("D://Exception.txt");
		FileInputStream fis=new FileInputStream(file);
	}
}
