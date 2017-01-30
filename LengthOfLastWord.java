
public class LengthOfLastWord {
      public int lengthOfLastWord(String s) {
	        
	    	String trimString = s.trim();
	        
	        String[] splitString = trimString.split(" ");
	         
	         if(trimString.length()==0){
	             return 0;
	         }
	         
	         return splitString[splitString.length-1].length();
	    }
}
