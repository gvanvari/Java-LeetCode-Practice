import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        
	    Arrays.sort(nums1);
	    Arrays.sort(nums2);

	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i=0; i<nums1.length; i++){
		if(i==0 || (i>0 && nums1[i]!=nums1[i-1])){
		    if(Arrays.binarySearch(nums2, nums1[i])>-1){
			list.add(nums1[i]);
		    }
		}
	    }

	    int[] result = new int[list.size()];
	    int k=0;
	    for(int i: list){
		result[k++] = i;
	    }

	    return result;
       /* int[] inter = {};
        
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
        
       
        return inter;*/
    }
    

}
