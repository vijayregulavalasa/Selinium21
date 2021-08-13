package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MitraTekTest {
	
	 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,22,9,33,21,50,41,60,22,68,90};
		int lengthLongSeq=LongestIncreasingSequence(arr);
		System.out.println(lengthLongSeq);
	  

	}
	
	
	  static int LongestIncreasingSequence(int arr[])
	    {
		  int lis[] = new int[arr.length];
	        int i, j, max = 0;
	        
	        /* Initialize LIS values for all indexes */
	        for (i = 0; i < arr.length; i++)
	            lis[i] = 1;
	  
	        /* Compute optimized LIS values in bottom up manner */
	        for (i = 1; i < arr.length; i++)
	            for (j = 0; j < i; j++)
	                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
	                    lis[i] = lis[j] + 1;
	  
	        /* Pick maximum of all LIS values */
	        for (i = 0; i < arr.length; i++)
	            if (max < lis[i])
	                max = lis[i];
	  
	        return max;

}
}