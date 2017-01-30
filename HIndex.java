
public class HIndex {

	    public int hIndex(int[] citations) {
			int l = citations.length;
			int count =0;
			int h=0;
			for(int i=0;i<l;i++){
				for(int j=i+1;j<l;j++){
					if(citations[j]>citations[i]){
						count++;
						if(count > citations[i]){
							//also have to check for the preceding papers are lesser in number than citations[i]
							if(count > i){
								h=citations[i];
								count =0;
								break;
							}
							
						}
						
					}
				}
			}	
			return count;
	    }
	    
	    int[] selectionSort(int[] arr){
	    	int smallest, i, j, temp;
	    	for(i=0; i<arr.length-1; i++){
	    		smallest = i;						//smallest = arr[i];
	    		for(j=i+1; j<arr.length;j++){
	    			if(arr[smallest] > arr[j]){           //(arr[i] > arr[j])
	    				smallest = j; 				//smallest = arr[j];
	    			}
	    		}
	    		
	    		temp = arr[smallest];
	    		arr[smallest] = arr[i];  		//arr[j] = arr[i];
	    		arr[i] = temp; 		           //arr[i] = smallest;
	    	}
	    	
	    	return arr;
	    }	
	    	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,1,2,2};
		
		HIndex hI= new HIndex();
		
		int[] arr1 = hI.selectionSort(arr);
		System.out.println(hI.hIndex(arr1));

	}

}
