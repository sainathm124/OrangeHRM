package com.Arrays;

public class SingleDimensionalArrayExample {

	public static void main(String[] args) {
		
		//Single Dimentional Array
		//datatype arrayName[]=new datatype[size];
		 int array1[]=new int[3];
		 
		 array1[0]=10;
		 array1[1]=20;
		 array1[2]=30; 
		 array1[3]=40;
		 
		 array1[1]=50;
		 /*
		 System.out.println(array1[0]);
		 System.out.println(array1[1]);
		 System.out.println(array1[2]);
		// System.out.println(array1[3]);
		*/
		 
		 for(int index=0; index<=2; index++)
		 {
			 System.out.println("Value of Index: "+array1[index]);
		 }
		 
		 
		
	}
}
