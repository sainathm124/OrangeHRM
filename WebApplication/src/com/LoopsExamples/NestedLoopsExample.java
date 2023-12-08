package com.LoopsExamples;

public class NestedLoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=3;i++)//Outer Loop
		{
			for(int j=1;j<=2;j++)//Inner Loop
			{
				System.out.println(i+ " WebDriver");
				
			}
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
		
		for(int i=1; i<=3; i++)
		{
			for(int j=1;j<=2; j++)
			{
				System.out.println(i);
			}
		}
		System.out.println("***************************");
		for(int i=1;i<=3;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.println(j);
			}
		}
		System.out.println(" ******************** ");
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<i;j++) 
			{
			System.out.print(i +"  ");       
			}
		}
		System.out.println(" ******************** ");
		
		for(int i=5;i>=0;i--)
		{
			for(int j=i;j>0;j--)
			{
			System.out.println(j+ i+" ");
			}
		}
System.out.println(" ********************** ");
		
		
		for(int a=1;a<=2;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.println("  *  ");
			}
		}
		for(int i=5;i>=0;i--)
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.println("*");
			}
		}
		for(int i=5;i>0;i--)
		{
			for(int j=i;j>i;j--)
			{
				System.out.println("*");
			}
		}
	}
}
