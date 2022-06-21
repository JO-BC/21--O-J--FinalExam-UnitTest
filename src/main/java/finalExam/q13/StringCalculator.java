package finalExam.q13;

public class StringCalculator 
{
	public static int add(final String numbers) {
	      int returnValue = 0;
	      String[] numbersArray = numbers.split(",|\n"); 
	      for (String number : numbersArray) {
	    	  // If number is negative, throw exception
	    	  if (Integer.parseInt(number) < 0) {
		        	 throw new IllegalArgumentException();
		         }
	    	  if (!number.trim().isEmpty()) {
	    		  if (Integer.parseInt(number) >= 1000) {
	    			  returnValue += 0;
	    		  } else {
	    			  returnValue += Integer.parseInt(number.trim());
	    		  }
	          }
	      }
	      return returnValue;
	   }
}
