import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        
        int[] inter = {};
        
        Set<Integer> hs1 = new HashSet<Integer>();
        Set<Integer> hs2 = new HashSet<Integer>();
        
        Iterator<Integer> iter1 = hs1.iterator();
        Iterator<Integer> iter2 = hs2.iterator();
        
        for(int i: nums1){
            hs1.add(i);
        }
        
        for(int i: nums2){
            hs2.add(i);
        }
        
        System.out.println(hs1.size());
        System.out.println(hs2.size());
        
        if(hs1.size() == 0 || hs2.size()==0){
            return inter;
        }
        
        if(hs1.size()>= hs2.size()){
            for(int i =0; i<hs1.size();i++){
                while (iter1.hasNext()) {
                    int next = (int)iter1.next();
                    System.out.println('j');
                    if(hs2.contains(next)){
                        inter[i]= next;
                    }    
                }
            }
        }else{
            for(int i =0; i<hs2.size();i++){
                while (iter2.hasNext()) {
                    int next = (int) iter2.next();
                    System.out.println(next);
                    if(hs1.contains(next)){
                        inter[i]= next;
                    }    
                }
            }
            
        }
        
       
        return inter;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,2};
		int[] nums2 = {2,2};
		
		IntersectionOfTwoArrays twoArrays = new IntersectionOfTwoArrays();
		
		int[] nums3 = twoArrays.intersection(nums1, nums2);
		

	}
}
