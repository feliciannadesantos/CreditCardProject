import java.util.Scanner;
import java.io.File;
public class userInput
	{
		static Scanner userStringInput = new Scanner(System.in);
		
		public static String UserInput(){
			
			System.out.println("Enter 1 for manual input or 2 for textfile.");
			String choice = userStringInput.next();
			
			if(choice.equals("1")) {
				System.out.println("Enter card number");
				return userStringInput.next();
			}
			if(choice.equals("2"));{
				try {
					Scanner fileScan = new Scanner(new File("CCnumbers.txt"));
					String numbers = fileScan.next();
					fileScan.close();
					return numbers;
				}catch (Exception e) {
					System.out.println("No file");
				}
			}
			
				return "none";
			}		
		
		}
	
      
	
