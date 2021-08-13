package com.automation;

public class ContructorOverloading {
	
	private int index;
	
	ContructorOverloading() {
		index=10;
		
	}
	
	ContructorOverloading(int index){
		this.index=index;
	}

	ContructorOverloading(double index){
		this.index=(int) index;
	}
	
	public void DisplayIndex() {
		System.out.println("Index is " + index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContructorOverloading cl=new ContructorOverloading();
		cl.DisplayIndex();
		ContructorOverloading cl2=new ContructorOverloading(20);
		cl2.DisplayIndex();
		ContructorOverloading cl3 =new ContructorOverloading(26.36);
		cl3.DisplayIndex();		
	}

}
