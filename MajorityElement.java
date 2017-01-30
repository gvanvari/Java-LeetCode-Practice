//import java.util.HashMap;
//import java.util.Map;

public class MajorityElement {
	
    public int majorityElement(int[] nums) {
     
        int counter =0;
        int majority =0;
        
        if(nums.length == 0){
            return -1;
        }
        
        if(nums.length == 1){
            return nums[0];
        }
        
        for(int i =0; i<nums.length; i++){
                if(counter==0){
                    nums[majority] = nums[i];
                    counter = 1;
                }else{
                    if(nums[majority]==nums[i]){
                        counter++;
                    }else{
                        counter--;
                    }
                }
            }
        
        return nums[0];
    }

}
