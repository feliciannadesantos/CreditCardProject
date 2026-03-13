
public class mathArray
	{
	 public static void numberArray() {
		 String cardNumber = userInput.UserInput();
		 
		 if(cardNumber.length() == 16) {
			 int[] cardNumbers = new int[16];
			 for(int i = 0; i < 16; i++) {
				 cardNumbers[i] = Character.getNumericValue(cardNumber.charAt(i));
				 
			 }
			 checkMath(cardNumbers);
		 }    	  
	 }
      public static void checkMath(int[] cardNumbers) {
    	  int sum = 0;
    	  for(int i = 0; i < 16; i++) {
    		  int currentNumber = cardNumbers[i];
    		if (i % 2 == 0) {
    			currentNumber = currentNumber * 2;
    		if(currentNumber> 9) {
    			currentNumber -= 9;
    		}
    		}
    		sum += currentNumber;
    	  }
    	  if(sum % 10 == 0) {
    		  System.out.println("This is a potentially valid card number.");
    	  } else {
    		  System.out.println("This isn't a valid card number.");
    	  }
      
	 }
	 
	 }
	
