package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		//ArrayList
		//Syntax: List<datatype>ArrayListName=new ArrayList<>();
 /*arraylist is Dynamic Data Structure-capable of saving and datatype Valuses if created it as 
 of type Object , there no declaration of the size. As long as we assign a value into the arraylist 
 an index is created. and then the value assigned to it. 
 As long as vlaues added to the arraylist The size of the array List increases. 
 if the values are removed frm the arraylist arraylist will be decreased */
		
	//	List<datatype> arraylistname=new arraylist<>();
		List<Object> arrayList1=new ArrayList<>();
		
		arrayList1.add("String");
		arrayList1.add(10);
		arrayList1.add('A');
		arrayList1.add("Selenium");
		arrayList1.add(10.1234);
		
	  /*System.out.println(arrayList1);
		System.out.println(arrayList1.get(0));
		System.out.println(arrayList1.get(1));
		System.out.println(arrayList1.get(2));
		System.out.println(arrayList1.get(3));
		System.out.println(arrayList1.get(4));*/
		
		for(int index=0;index<arrayList1.size();index++)
		{
			System.out.println(arrayList1.get(index));
		}
	
		
		
	}
	
	
}

	