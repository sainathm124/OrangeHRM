package com.HomeWork;

public class DesembleOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--) 
			{
				System.out.print("*");
			}
			System.out.println();	/*output *****
											 ****
											 ***
											 **
											 *      */

		}
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
	
	for(int i=1;i<=4; i++)
	{
		for(int j=1;j<=i;j++)
		System.out.print(j);
		
		System.out.println();
	}
		/* Output 1 
											  12 
											  123 
											  1234   */
}
}
