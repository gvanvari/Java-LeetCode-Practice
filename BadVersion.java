public class BadVersion {  
	public int firstBadVersion(int n) {
        int l=1;
        int h= n;
        int m=0;
        
        if(isBadVersion(1)){
            return 1;
        }
        
        while(l<=h){
            m = l + (h-l)/2;
            
            if(isBadVersion(m)){
                if(isBadVersion(m-1)){
                     h = m-1;
                }else{
                    return m;
                }
               
            }else{
                l = m+1;
            }
        }
        
        return m;
    }
}

/*
public class BadVersion {

	public boolean isBadVersion(int n){
		int version = 4;
		
		if(n==version){
			return false;
		}else{
			return true;
		}
	}
	       
	    public int firstBadVersion(int n) {
	        if(n==2){
	            return 1;
	        }
	        if(!isBadVersion(n-1)){
	            return (n-1);
	        }
	        return firstBadVersion(n-1);
	     }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BadVersion bv = new BadVersion();
		System.out.println(bv.firstBadVersion(10));
	}

}*/
