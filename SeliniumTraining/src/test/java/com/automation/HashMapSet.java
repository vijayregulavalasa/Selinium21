package com.automation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<>();
		map.put("TestScriptName", "TC_01");
		map.put("UserName", "Vijay");
		map.put("Password", "XXX");
		
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.get("UserName"));
		map.replace("UserName", "Ajay");
		System.out.println(map.get("UserName"));
		map.remove("Password");
		
		Set<String> ks=map.keySet();
		
		for(String i:ks) {
			System.out.println(i);
		}
		
		
		Collection<String> vs=map.values();
		for(String v:vs) {
		System.out.println(v);
		map.clear();
		
		System.out.println(map.size());
		
		Map<String, String> treemap=new TreeMap();
		System.out.println(treemap.isEmpty());
		System.out.println(treemap.size());
		treemap.put("street", "Kondapur");
		treemap.put("state", "Andhrapradesh");
		treemap.put("Country", "India");
		
		System.out.println("treemap size: "+ treemap.size());
		System.out.println(treemap.get("state"));
	}
	}

}
