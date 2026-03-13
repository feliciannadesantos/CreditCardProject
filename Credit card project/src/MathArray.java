
public class MathArray
	{
	static String cardNumber = "";
	 public static void numberArray() {
		 
		 
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
    		if(currentNumber * 2 > 9) {
    			int change = 0;
    			while (currentNumber>0) {
    				int temporary = currentNumber % 10;
    				change += temporary;
    				currentNumber /= 10;
    				
    			}
    			cardNumbers[i] = change;
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
	
