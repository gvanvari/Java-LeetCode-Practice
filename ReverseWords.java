
public class ReverseWords {

	    public String reverseWords(String s) {
	        
	        String trimmedString = s.trim();
	        
	        if(trimmedString.length()==0){
	            return "";
	        }
	        
	        if(trimmedString.length()==1){
	            return trimmedString;
	        }
	        
	        String[] words = trimmedString.split("\\s+");
	        
	        String newString = "";
	        
	        for(int i=words.length-1;i>=0;i--){
	            
	            newString = newString + words[i]+ " ";
	            
	            
	            /*if(i!=0){
	                newString = newString + " ";
	            }*/
	        }
	        
	        return newString.trim();
	        
	        
	    }
}
