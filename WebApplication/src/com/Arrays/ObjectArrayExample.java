package com.Arrays;

public class ObjectArrayExample {

	public static void main(String[] args) {
	//syntax for Object Array
	//Multidimenctional array is capable of storing different datatype values
	//Object arrayName[][]=new object[size][size]
	
		Object array1[]	=new Object[4];
		array1[0]=10;
		array1[1]="webDriver";
		array1[2]='A';
		array1[3]=10.12345;
		/*
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		*/
		
		for(int index=0;index<array1.length;index++)
		{
			System.out.println(array1[index]);
		}
		System.out.println(" ***************** For Each Loop ********************* ");
	
		// Syntax of "For Each Loop"
		/*
		 for(datatype arrayindex:arrayname)
		 {
		till the index of the array is existing the loop will iterate
		System.out.println(index); 
		}	 
		 */
		for(Object arrayindex:array1)
		{
			System.out.println(arrayindex);
		}
	
	
	}
	

}
