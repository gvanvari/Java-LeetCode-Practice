

public class MoveZeroes {

	public void moveZeroes(int[] nums) {
        
		/*int i=0;
		int j = nums.length-1;
		int k=0;*/
		
/*		while(i <= j+1){
			if(nums[k]== 0){
				for(k=0; k<nums.length-1;k++){
					nums[k]= nums[k+1];
				}
				nums[j]=0;
			}
			k=0;
			i++;
		}*/
		int j=0, t=0;
		for(int i=1;i<nums.length;i++){
			j=i-1;
			t=nums[i];
			while(nums[j]==0 && j>=0){
				nums[j+1]= nums[j];
				j--;
			}
			nums[j+1]=t;
			
		}
			

		
		for(int n:nums){
			System.out.println(n);
		}

		
    }
	
	
	public static void main(String[] args) {
	
		MoveZeroes mz = new MoveZeroes();
		
		int[] nums = {0, 1, 0, 3, 12};
		mz.moveZeroes(nums);

	}

}
