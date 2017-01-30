
public class RemoveDuplicates {
	
	public int removeDuplicates(int[] nums){
		
		int i=0;
		for(int j=1; j<nums.length;j++){
			if(nums[i]!=nums[j]){
				i++;
				nums[i] = nums[j];
			}
		}
		
		return i+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1,2};
		RemoveDuplicates rd = new RemoveDuplicates();
		rd.removeDuplicates(nums);
		
	}

}
