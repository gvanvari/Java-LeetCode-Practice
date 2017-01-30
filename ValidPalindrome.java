
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        char[] charArray;
        
        int n = s.length();
        
        int flag = 0;
        
        if(n == 0){
            return true;
        }
        s = s.toLowerCase();
        charArray=s.toCharArray();
        char c1,c2;
        for(int i=0, j=n-1; i<j;){
            c1 = charArray[i];
            c2 = charArray[j];
            if(((c1>='0' && c1<='9') || (c1>='a' && c1<='z')) && ((c2>='0' && c2<='9') || (c2>='a' && c2<='z'))){
                if(c1 != c2){
                    flag =1;
                    break;
                }
                else{
                    i++;
                    j--;
                }
            }
            else if((c1>='0' && c1<='9') || (c1>='a' && c1<='z')){
                j--;
            }
            else if((c2>='0' && c2<='9') || (c2>='a' && c2<='z')){
                i++;
            }
            else{
                i++;
                j--;
            }
            
        }
        if(flag==1){
            return false;
            
        }else{
            return true;
        }
        
    }
}
