package com.Arrays;

public class MultiDimensionalArrayExample {
	
	public static void main(String[] args) {
			//Multi Dimensional array 
		//Syntax: datatype arrayname[][]=new datatype[][];
		
		String array1[][]=new String[2][2];
		array1[0][0]="Manual Testing";
		array1[0][1]="Venkat Sir";
		array1[1][0]="Selenium";
		array1[1][1]="Srini";
		
		/*
		System.out.println(array1[0][0]);
		System.out.println(array1[0][1]);
		System.out.println(array1[1][0]);
		System.out.println(array1[1][1]);
		*/
		
		for(int rowindex=0;rowindex<=1;rowindex++)
		{
			for(int rowofcellindex=0; rowofcellindex<=1; rowofcellindex++)
			{
				System.out.println(array1[rowindex][rowofcellindex]);
			}
		}
		System.out.println("************************************");
		
		for(int rowindex=0; rowindex<array1.length;rowindex++)
		{
			for(int rowofcellindex=0;rowofcellindex<array1.length;rowofcellindex++)
				System.out.println(array1[rowindex][rowofcellindex]);
		}
	}
}
