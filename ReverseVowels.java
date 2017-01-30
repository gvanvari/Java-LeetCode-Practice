
public class ReverseVowels {
    public String reverseVowels(String s) {
        
        char[] charArray = s.toCharArray();
        int i,j;
        int n = s.length();
        
        for(i= n-1, j=0; i>j;){
            
            char temp;
            char temp_i = (Character.toLowerCase(charArray[i]));
            char temp_j = (Character.toLowerCase(charArray[j]));
            if((temp_i == 'a' || temp_i == 'e' || temp_i == 'i' || temp_i == 'o' || temp_i == 'u' ) &&
                (temp_j == 'a' || temp_j == 'e' || temp_j == 'i' || temp_j == 'o' || temp_j == 'u')){
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                    i--;
                    j++;
                }
            else if(temp_i == 'a' || temp_i == 'e' || temp_i == 'i' || temp_i == 'o' || temp_i == 'u') {
                    j++;
                }
            else if(temp_j == 'a' || temp_j == 'e' || temp_j == 'i' || temp_j == 'o' || temp_j == 'u') {
                    i--;
                }
            else{
                    i--;
                    j++;
                }
        }
        
        return new String(charArray);
    }

}
