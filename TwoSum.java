import java.util.HashMap;

public class TwoSum {
	  public int[] twoSum(int[] nums, int target) {
	        
	        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	        int difference;
	        int[] returnIndex = new int[2];
	        
	        for(int i=0; i<nums.length; i++){
	            
	            difference = target - nums[i];
	            
	            if(!map.containsKey(difference)){
	                map.put(nums[i],i);
	            }else{
	                 returnIndex[0] = map.get(difference);
	                 returnIndex[1] = i;
	                 break;
	            }
	        }
	        return returnIndex;
	    }
}
