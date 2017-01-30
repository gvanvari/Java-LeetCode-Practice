
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
    	
    	char[] arr = {'a','b',0,0} ;
    	System.out.println(arr[2]);
    	System.out.println(arr.length);
    	
    	//String trimString = s.trim();
        
        String[] splitString = s.split(",");
        
        System.out.println(splitString.length);
        System.out.println(splitString[0]);
        //System.out.println(splitString[1]);
        //System.out.println(splitString[2]);
        System.out.println(splitString[splitString.length-1].length());
        
        /*for(String c:splitString){
        	System.out.println(c);
        }
         
         if(splitString.length==0){
             return 0;
         }
         */
         //System.out.println("abcd");
        
         return 12;//splitString[splitString.length-1].length();
    }
    
    
    public static void main(String[] args){
    	LengthOfLastWord sol = new LengthOfLastWord();
    
    	sol.lengthOfLastWord("gaurav,vanvari,,,,,,,,,,,,,");
    }
}
