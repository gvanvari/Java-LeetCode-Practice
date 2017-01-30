public class IsPerfectSquare {
	
	public boolean isPerfectSquare(int num) {
        int low = 1, high = num;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low =  mid + 1;
            } else {
                high =  mid - 1;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPerfectSquare sq = new IsPerfectSquare();
		System.out.println(sq.isPerfectSquare(5));

	}

}
