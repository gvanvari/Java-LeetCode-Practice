
public class StrStr {

    public int strStr(String haystack, String needle) {
        
        int hl = haystack.length();
        int nl= needle.length();
        
        if(nl == 0){
        	return 0;
        }
        
        if(hl < nl){
            return -1;
        }
        
        if(haystack.contains(needle)){
            for(int i=0;i<hl;i++){ 
            	if(haystack.charAt(i)==needle.charAt(0)){	
                    if(needle.compareTo(haystack.substring(i,nl+i))== 0){ //
                        return i;
                    }
                }   	 
            }
        }
        
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrStr sr = new StrStr();
		System.out.println(sr.strStr("", "chu"));
		
	}

}
