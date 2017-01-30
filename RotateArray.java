import java.util.ArrayList;

public class RotateArray {

	public void rotate(int[] nums, int k) {
        int l = nums.length;
        
        int modK = k % l;
        
         ArrayList<Integer> list = new ArrayList<Integer>();
        
         for(int i=0;i<l;i++){
             list.add(i,nums[i]);
         }
            
         for(int i=l;i<2*l;i++){
        	 System.out.println("A");
             list.add(i,nums[i-l]);
         }
            
         for(int i=0;i<l;i++){
             nums[i] = list.get(i+modK+1);
         }
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		
		RotateArray ra = new RotateArray();
		ra.rotate(nums,3);
	}
	
}
