public class FactorialTrailingZeros {

    public int trailingZeroes(int n) {
        
        int length = (int)(Math.log10(n)+1);
        
        int sum =0;
        int power;
        
        for(int i=0;i<=length+2;i++){
            
            power = (int) Math.pow(5,i+1);
            sum = sum + n / power;
        }
        
        return sum;
    }

}
