//import java.util.HashMap;
//import java.util.Map;

public class MajorityElement {
	
   /* public int majorityElement(int[] nums) {
        
        int l = nums.length;
        int ans=0;
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int maxValue = 0;
        
        if(l==1){
            return nums[0];
        }
        
        for(int i=0; i<l-1;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        
       for(Map.Entry<Integer,Integer> entry: map.entrySet()){
    	   System.out.println(entry.getKey() + " " + entry.getValue());
       }
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(maxValue <= entry.getValue()){
                maxValue = entry.getValue();
                //System.out.println(maxValue);
                ans = entry.getKey();
            }
        }
        
       return ans;
        
    }*/
	
	public int majorityElement(int[] nums) {
	     
        int count =1;
        
        if(nums.length == 0){
            return -1;
        }
        
        
        
        if(nums.length == 1){
            return nums[0];
        }
        
       
        
        for(int i =0; i<nums.length; i++){
        	
            for(int j =i+1 ; j<nums.length; j++){
            	
                if(nums[i] == nums[j]){
                	
                    count++;
                   
                    if(count==nums.length/2){
                    	
                        return nums[i];
                    }
                }
            }
            count = 1;
        }
        
        return nums[0];
        
    }

	public static void main(String[] args) {
		
		MajorityElement me = new MajorityElement();
		
		int[] nums = {1,2,3,3,4};
		System.out.println(me.majorityElement(nums));
		
	}

}
