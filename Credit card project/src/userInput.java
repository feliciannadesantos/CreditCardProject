import java.util.Scanner;
public class userInput
	{
		static Scanner userStringInput = new Scanner(System.in);
		
		public static void UserInput()
		{
			
			System.out.println("Would you like to enter a card number?");
			String inputOne = "yes";
			String choice = userStringInput.next();
			if(choice == inputOne) {
				System.out.println("Enter number");
			}		//figure out what is wrong w this.
			
			
			
		
		}
      
      
	}
