package com.automation;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.testng.annotations.*;

public class ArrayList {

	@Test	
	  public void Test()
	  {
		// TODO Auto-generated method stub
		
		List<String> list=new java.util.ArrayList();
		
		System.out.println("List is empty: "+ list.isEmpty());
		System.out.println("Size of Array List: " + list.size());
		list.add("Uft");
		list.add("Selenium");
		list.add("RFT");
		list.add("white");
		Collections.sort(list);
		
		System.out.println("List is empty: "+ list.isEmpty());
		System.out.println("Size of Array List: " + list.size());
		System.out.println("Array list objects: "+ list);
		
		List list1=new java.util.LinkedList();
		list1.add("UFT");
		list1.add("15.1");
		list1.add("Selinium");
		list1.add(3.148);
		System.out.println("Size of Linked List: " +list.size());
		System.out.println("linkedlist objects: " + list1);
		System.out.println("print list");
		for(Object i:list1) {
	
			System.out.println(i);
		}
		
		
		Set<String> set=new HashSet();
		System.out.println("Hashset is empty: "+ set.isEmpty());
		System.out.println("Hashset size: "+ set.size());
		
		set.add("UFT");
		set.add("Selinium");
		set.add("RFT");
		set.add("Selinium");
		System.out.println("Size of Hashset: "+ set.size());
		System.out.println("Hashset is empty: "+ set.isEmpty());
		System.out.println("Hashset objects: " + set);
		
		
		Set<String> set1=new TreeSet<String>();
		System.out.println("Treeset is empty: " +set1.isEmpty());
		System.out.println("Tresset size: "+set1.size());
		set1.add("vijay");
		set1.add("ajay");
		set1.add("vijay");
		//set1.add(104);
		
		System.out.println("size of Treeset: "+ set1.size());
		System.out.println("treeset objects: "+ set1);
		for(String ts:set1) {
			System.out.println(ts);
		}
	
		
		/*
		Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer 
		(java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
*/
	}

}
