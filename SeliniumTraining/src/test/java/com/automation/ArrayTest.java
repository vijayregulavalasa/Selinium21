package com.automation;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// one dimensinal array
		int[] empid = new int[5];
		empid[0] = 1;
		empid[1] = 2;
		empid[2] = 3;
		empid[3] = 4;
		empid[4] = 5;

		System.out.println(empid[0]);
		System.out.println(empid[1]);
		System.out.println(empid[2]);
		System.out.println(empid[3]);
		System.out.println(empid[4]);
		System.out.println(empid.length);

		int[] num = { 100, 200, 300, 400, 500 };

		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		System.out.println(empid.length);

		// Two dimensional array

		String[][] testdata = new String[2][3];
		testdata[0][0] = "vijay";
		testdata[0][1] = "Ajay";
		testdata[0][2] = "Jai";
		testdata[1][0] = "Ramcharan";
		testdata[1][1] = "NTR";
		testdata[1][2] = "Rajamouli";
		System.out.println("testdata[0][0] " + testdata[0][0]);
		System.out.println("testdata[0][1] " + testdata[0][1]);
		System.out.println("testdata[0][2] " + testdata[0][2]);
		System.out.println("testdata[1][0] " + testdata[1][0]);
		System.out.println("testdata[1][1] " + testdata[1][1]);
		System.out.println("testdata[1][2] " + testdata[1][2]);
 
		System.out.println("Length of row " + testdata.length);
		System.out.println("Length of column " + testdata[1].length);

		// exceptions
		// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

		String[][] names = { { "Testscript", "username", "password" }, { "TC_001", "Admin", "xxxxx" } };
		System.out.println("names[0][0] " + names[0][0]);
		System.out.println("names[0][1] " + names[0][1]);
		System.out.println("names[0][2] " + names[0][2]);
		System.out.println("names[1][0] " + names[1][0]);
		System.out.println("names[1][1] " + names[1][1]);
		System.out.println("names[1][2] " + names[1][2]);
		System.out.println("Length of row " + names.length);
		System.out.println("Length of column " + names[0].length);
	}

}
