package exercises;

import java.util.Scanner;

public class CountByAnthing 
{

	public static void main(String[] args)
	{
		int userInput;
		Scanner input = new Scanner(System.in);
		System.out.println("Please pick a number >>>");
		userInput = input.nextInt();
		
		for(int n = userInput; n <= (userInput * 100); n = n + userInput)
		{
			System.out.println(" "+ n);
			if(n % (userInput * 10)== 0)
			{
				System.out.println();
			}
		}

	}

}
