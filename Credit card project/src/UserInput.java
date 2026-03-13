import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class UserInput
	{
		static Scanner userStringInput = new Scanner(System.in);
		
		public static String UserInput() throws IOException
		{
			
			System.out.println("Enter 1 for manual input or 2 for textfile.");
			String choice = userStringInput.nextLine();
			
			if(choice.equals("1")) {
				System.out.println("Enter card number");
				MathArray.cardNumber = userStringInput.nextLine();
			}
			else if(choice.equals("2")){
				try {
					Scanner fileScan = new Scanner(new File("CCnumbers.txt"));
					int counter = 0;
					while(fileScan.hasNext()) {
						String numbers = fileScan.nextLine();
						String[] numbersArray = numbers.split("");
						int[] numberssArray = new int[numbersArray.length];
						for(int i = 0; i < numbersArray.length; i++) {
							numberssArray[i] = Integer.parseInt(numbersArray[i]); 
						}
						int sum = 0;
				    	  for(int i = 0; i < 16; i++) {
				    		  int currentNumber = numberssArray[i];
				    		if (i % 2 == 0) {
				    			currentNumber = currentNumber * 2;
				    		if(currentNumber * 2 > 9) {
				    			int change = 0;
				    			while (currentNumber>0) {
				    				int temporary = currentNumber % 10;
				    				change += temporary;
				    				currentNumber /= 10;
				    				
				    			}
				    			numberssArray[i] = change;
				    		} 
				    	}
				    		if (numberssArray[i]%10 == 0) {
					    		  System.out.println(numberssArray);
					    		  System.out.println("This is potentially a valid card number");
					    		  counter++;
					    	  }else {
					    		  System.out.println(numberssArray);
					    		  System.out.println("This is not a potential valid card number");
					    	  }	
					} 
				    	  
				}
					System.out.println(counter);
				}
					catch (Exception e) {
					System.out.println("No file");
				}
			}
			
				return "none"; 
			}		
		
		}
	
      
	
