
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        
        int sum1=0;
        int sum2=0;
        
        for(char c: charArrayS){
            sum1= sum1 + c;
        }
        
        for(char c: charArrayS){
            sum2= sum2 + c;
        }
        
        return (char) (sum2-sum1);
    
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindTheDifference fd = new FindTheDifference();
		System.out.println(fd.findTheDifference("ae", "aae"));

	}

}
