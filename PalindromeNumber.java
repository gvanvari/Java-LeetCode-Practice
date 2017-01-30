import java.util.ArrayList;

public class PalindromeNumber {
    
    public boolean isPalindrome(int x) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(x <0){
            return false;
        }
        
        while(x > 0){
            list.add(x % 10);
            x /= 10;
        }
        
        if(list.size() == 1){
            return true;
        }
        
        for(int i=0, j=list.size()-1; i<j; i++, j--){
            if(!list.get(i).equals(list.get(j))){
                return false;
            }
        }
        
        return true;

    }
}

