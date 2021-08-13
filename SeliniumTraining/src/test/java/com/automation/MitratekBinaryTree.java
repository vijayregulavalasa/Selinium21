package com.automation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class MitratekBinaryTree {

	public static void main(String[] args) {

		HashSet<String> uniqueParents = new HashSet();
		int parentCount = 0;
		boolean binaryTree = true;
		// TODO Auto-generated method stub

		String[] binary2 = new String[] { "(1,2)", "(3,2)", "(2,12)", "(5,2)" };
		String[] binary = new String[] { "(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)","(4,5)"};

		String[] parents = new String[binary.length];
		String[] child = new String[binary.length];
		String[] temp = new String[2];

		for (int i = 0; i < binary.length; i++) {

			child[i] = binary[i].substring(1, 2);
			parents[i] = binary[i].substring(3, 4);
			uniqueParents.add(parents[i]);

			System.out.println(child[i] + ", " + parents[i]);

		}
		System.out.println(uniqueParents);
		for (String parent : uniqueParents) {
			parentCount = 0;
					for (int j = 0; j < binary.length; j++) {
							if (parent.equals(parents[j])) {
								parentCount=parentCount + 1;
								System.out.println("entered");
							}
						}
				if (parentCount > 2) {
					binaryTree = false;
					
					
				break;
				
				}
				
				

		}
		
		System.out.println(binaryTree);
	}

}
