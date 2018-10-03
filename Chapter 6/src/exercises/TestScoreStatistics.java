package exercises;

import java.util.Scanner;

public class TestScoreStatistics 
{

	public static void main(String[] args) 
	{
		int high = 0;
		int low = 100;
		int avg = 0;
		int count = 0;
		int total = 0;
		int userChoice;
		
		Scanner input = new Scanner(System.in);
		
		
		 do
		{
			System.out.println("Enter a Score. To quit enter 999.");
		userChoice = input.nextInt();
			 if(userChoice > high && userChoice <= 100)
				{
				high = userChoice;
				count = count + 1;
				}
			else if(userChoice < low)
				{
				low = userChoice;
				count = count + 1;
				}
			else if(userChoice > 100 || userChoice < 0)
				{
				System.out.println("Numbers are out of range");
				}
			total = total + userChoice;
			avg = total / count;
		
		}while(userChoice != 999);
		
		 System.out.println("Average of the scores is "+ avg);
		 System.out.println("The lowest score was "+ low);
		 System.out.println("The highest score was "+ high);
		 System.out.println("The amount of scores entered was "+ count);
	} 
} 
