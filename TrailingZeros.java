
public class TrailingZeros {

    public int trailingZeroes(int n) {
        
        int length = (int)(Math.log10(n)+1);
        
        System.out.println(length);
        
        int sum =0;
        int power;
        
        for(int i=0;i<=length;i++){
            
            power = (int) Math.pow(5,i+1);
            sum = sum + n / power;
        }
        
        return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrailingZeros tz = new TrailingZeros();
		System.out.println(tz.trailingZeroes(1808548329));
	}

}
