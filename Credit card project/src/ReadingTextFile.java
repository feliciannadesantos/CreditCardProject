import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingTextFile
	{
      public static void creditTextFile() throws IOException
      {
    	  Scanner creditFile = new Scanner(new File("CCnumbers.txt"));
    	  while(creditFile.hasNext()) {
    		  long cardNumbers = creditFile.nextLong();
    		  System.out.println(cardNumbers);
    		  
    	  }
      }
	}
