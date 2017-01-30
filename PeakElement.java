
public class PeakElement {
	
	    public int findPeakElement(int[] nums) {
	        
	        // this solution finds global peak, in notes solution for local peak
	        int position = 0;
	        int max = nums[0];
	        
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]>max ){
	                max = nums[i];
	                position = i;
	            }
	        }
	        return position;
	        
	       
	    }

}
