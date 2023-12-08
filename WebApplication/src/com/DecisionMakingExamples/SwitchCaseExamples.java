package com.DecisionMakingExamples;

public class SwitchCaseExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Switch case Syntax: initialization;
		 				switch condition
		 				
		*/
		int WeekDay=5;
		switch(WeekDay)
		{
		case 1:
			System.out.println("MonDay");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("WednesDay");
			break;
			
		case 4: 
			System.out.println("ThurseDay");
			break;
			
		case 5:
			System.out.println("FriDay");
			break;
			
		case 6:
			System.out.println("SaturDay");
			break;
			
		case 7:
			System.out.println("SunDay");
			break;
			
		default:
				System.out.println("Day is not matching ");
		
		}
		
		
	}

}
