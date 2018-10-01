package exercises;

import java.util.Scanner;

public class EvenEntryLoop2 
{

	public static void main(String[] args) 
	{
		int numChoice = 0;
		Scanner input = new Scanner(System.in);
		
		while(numChoice != 999)
		{
			System.out.println("Please pick a number >>>");
			numChoice = input.nextInt();
			
			if(numChoice % 2 ==0)
			{
				System.out.println("Good Job!");
			}
			else 
			{
				System.out.println("Error!");
			}
		}
	}
}
