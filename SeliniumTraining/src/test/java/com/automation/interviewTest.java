package com.automation;

import java.util.Arrays;
import java.util.LinkedList;





public class interviewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] array={1,2,0,7,0,6};
		
		int firstZeroIndex=Arrays.asList(array).indexOf(0);
		int secondZeroIndex=Arrays.asList(array).lastIndexOf(0);
		int sevenIndex=Arrays.asList(array).indexOf(7);
		
		if(firstZeroIndex<secondZeroIndex && secondZeroIndex<sevenIndex) 
			System.out.println("in order");
		else 
			System.out.println("not in order");
		
		
		
		
		

	/*	
LinkedList<Integer> l=new LinkedList<>();

for(int i=0 ;i<array.length;i++) {
	

		l.add(i);


	}

for(int i=0 ;i<array.length;i++) {
	
	if(array[i] ==7) {
		l.add(i);
		}

	}




if((l.get(0)<l.get(1)) && (l.get(1)<l.get(2))) {
	System.out.println("in order");
	
}else {
	System.out.println("not in order");
	
	
	String[] colours = { "Red", "Orange", "Yellow", "Green" };

	int indexOfYellow = ArrayUtils.indexOf(colours, "Yellow");;
	
}


	*/
	}

}
