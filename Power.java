import java.util.HashMap;

public class Power {
	
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(n<0){
            if(n == Integer.MIN_VALUE){
                ++n;
                n= -n;
                x= 1/x;
                return 1.0/ x * x * myPow( x*x, n/2 );
            }
                
            n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
	
	/*	Time limit exceed
	 * public double myPow(double x, int n){
		
		double ans ;
		
		if(n==0){
			return 1;
		}else if(n>0){
			if(n%2==0){
				return myPow(x,n/2) * myPow(x,n/2);
			}else{
				return x * myPow(x,n-1);
			}
		}else{
			ans = myPow(x,-n);
			return 1/ans;
		}
			
	}*/
	
	/*Time limit exceed
	public double myPow(double x, int n){
		HashMap<Integer,Double> map = new HashMap<Integer,Double>();
		double ans ;
		
		if(map.containsKey(n)){
		    return map.get(n);
		}
		
		if(n==0){
			map.put(0,1.0);
			return map.get(0);
		}else if(n>0){
			if(n%2==0){
				map.put(n,myPow(x,n/2) * myPow(x,n/2));
				return map.get(n);
			}else{
				map.put(n,x * myPow(x,n/2) * myPow(x,n/2));
					return map.get(n);
			}
		}else{
			ans = myPow(x,-n);
			map.put(n, 1/ans);
			return map.get(n);
		}
	}*/
	

	
	public static void main(String[] args) {
		
		Power power = new Power();
		System.out.println(power.myPow(3,2));
		

	}
}
