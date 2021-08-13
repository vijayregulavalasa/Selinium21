package com.automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 4, 7, 2 };

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++)
			list.add(arr[i]);

		System.out.println(Collections.max(list));
		Collections.sort(list);
		
		
		for(int i=0;i<list.size()-1;i++) 
		{
			
					for(int j=i+1;i<list.size()-1;i++) 
					{
						if(list.get(list.size()-1)==list.get(i) +list.get(j)) {
							System.out.println(list.get(i) +"  " + list.get(j));
							break;
						}
					
				}

		}
	}
}


