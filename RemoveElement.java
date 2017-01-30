
public class RemoveElement {
	
		/*public int removeElement(int[] nums, int val) {
		    int i = 0;
		    int n = nums.length;
		    while (i < n) {
		        if (nums[i] == val) {
		            nums[i] = nums[n - 1];
		            // reduce array size by one
		            n--;
		        } else {
		            i++;
		        }
		    }
		    return n;
		}*/
	
	// buggy
	
	public int removeElement(int[] nums, int val){
		int i=0;
		int l= nums.length;
		for(int j=1; j<l;j++){
			if(nums[j]!=nums[i]){
				i++;
				nums[i] = nums[j];
				
			}
		}
		return i;
	}
		
	public static void main(String[] args) {
		
		int[] nums = {3,2,2,3};
		RemoveElement re = new RemoveElement();
		re.removeElement(nums, 3);
		System.out.println(nums);
	}

}
