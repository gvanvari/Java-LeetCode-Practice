

public class MoveZeroes {

  public void moveZeroes(int[] nums) {
        int n = nums.length;
    
        int numZeroes = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i]==0){
                numZeroes++;
            }
        }
    
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                ans.add(nums[i]);
            }
        }
    
        while (numZeroes-- >=0) {
            ans.add(0);
        }

        for (int i = 0; i < n; i++) {
            nums[i] = ans.get(i);
        }
    }

}
