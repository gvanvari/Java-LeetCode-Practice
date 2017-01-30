
public class SquareRoot {
	
	
	public int mySqrt(int x) {
		if (x == 0)
		return 0;
		int left = 1, right = x;
		while (true) {
			int mid = left + (right - left)/2;
			if (mid > x/mid) {
			    right = mid - 1;
			} else {
			    if (mid + 1 > x/(mid + 1))
			        return mid;
			    left = mid + 1;
			}
		}


	
	   /*public int mySqrt(int x) {
			    // Base Cases
			if (x == 0 || x == 1)
			return x;
			
			// Do Binary Search for floor(sqrt(x))
			int start = 1, end = x, ans=0;
			while (start <= end)
			{
			int mid = end +(end - start) / 2;
			
			// If x is a perfect square
			if (mid*mid == x)
			    return mid;
			
			// Since we need floor, we update answer when mid*mid is
			// smaller than x, and move closer to sqrt(x)
			if (mid*mid < x)
			{
			    start = mid + 1;
			    ans = mid;
			}
			else   // If mid*mid is greater than x
			    end = mid - 1;
			}
			return ans;
		}*/

}
		
}	
