import java.util.Arrays;

public class ThirdMax {
	
	    public int thirdMax(int[] nums) {
	        
	        int l = nums.length;
	        int noOfUnique =0;
	        
	        if(l==0){
	            return Integer.MIN_VALUE;
	        }
	        
	        if(l==1){
	            return nums[0];
	        }
	        if(l == 2){
	            if(nums[0]>nums[1]){
	                return nums[0];
	            }else{
	                return nums[1];
	            }
	        }
	        
	        Arrays.sort(nums);
	        
	        int i=0;
	        for(int j=1;j<l;j++){
	            if(nums[j]!=nums[i]){
	                i++;
	                nums[i]= nums[j];
	                noOfUnique++;
	            }
	        }
	        
	        //int noOfUniqueElements = l - noOfDuplicates;
	        
	        if((noOfUnique+1)==1){
	            return nums[0];
	        }
	        else if((noOfUnique+1) == 2){
	            if(nums[0]>nums[1]){
	                return nums[0];
	            }else{
	                return nums[1];
	            }
	        }else{
	            return nums[(noOfUnique+1) - 3];
	        }
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,4,6,2,3,3,3,3,6,6,6,6,6,4,4,4,4,4};
		
		ThirdMax tm = new ThirdMax();
		
		System.out.println(tm.thirdMax(nums));
		

	}

}
