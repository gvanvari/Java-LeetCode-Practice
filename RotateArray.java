import java.util.ArrayList;

public class RotateArray {
	// runs in 1ms
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
	// runs in 6ms
	/*
	public void rotate(int[] nums, int k) {
		int l = nums.length;

		int modK = k % l;
		 ArrayList<Integer> list = new ArrayList<Integer>();

		    for(int i=0;i<l;i++){
			list.add(i,nums[i]);
		    }

		    for(int i=l;i<2*l;i++){
			list.add(i,nums[i-l]);
		    }
		    int k1=0;
		    int n2=2*l;
		    for(int i=l-modK;i<n2 - modK;i++){
			nums[k1++] = list.get(i);
		    }
        
    	}*/
	
}
