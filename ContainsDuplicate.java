import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
	        
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        
	        if(nums.length == 0){
	            return false;
	        }
	        
	        if(nums.length == 1){
	            return false;
	        }
	        
	        for(int i=0;i<nums.length;i++){
	            if(!map.containsKey(nums[i])){
	                map.put(nums[i],1);
	            }else{
	                map.put(nums[i],map.get(nums[i])+1);
	            }
	        }
	        
	        
	        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
	            if(entry.getValue() > 1){
	                return true;
	            }
	        }
	        return false;
	        
	    }

}
