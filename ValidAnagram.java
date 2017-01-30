import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> mapS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapT = new HashMap<Character, Integer>();
        
        if(s.length()!=t.length()){
            return false;
        }
        
        if(s.length() == 0 && t.length()== 0){
            return true;
        }
        
        for(int i=0;i< s.length();i++){
            if(!mapS.containsKey(s.charAt(i))){
                mapS.put(s.charAt(i), 1);
            }
            else{
                mapS.put(s.charAt(i), mapS.get(s.charAt(i))+1);
            }
        }
        
        for(int i=0;i< t.length();i++){
            if(!mapT.containsKey(t.charAt(i))){
                mapT.put(t.charAt(i), 1);
            }
            else{
                mapT.put(t.charAt(i), mapT.get(t.charAt(i))+1);
            }
        }
        if((mapS.entrySet()).equals(mapT.entrySet())){
            return true;
        }else{
            return false;
        } 
        
    }
}
