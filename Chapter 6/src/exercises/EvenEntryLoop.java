package exercises;
import java.util.Scanner;
public class EvenEntryLoop 
{

	public static void main(String[] args) 
	{
		int numChoice;
		Scanner input = new Scanner(System.in);
		do 
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
		}while(numChoice != 999);
	}

}
