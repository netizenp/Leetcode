package easy;

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class FirstBadVersion_278 {
	
	boolean isBadVersion(int version) {
		return false;
	}
	
	public int firstBadVersion(int n) {
        long low = 1, high = n;
        long mid = (low + high) / 2, ans = 1;
        while(low <= high){
            System.out.println("Low: " + low + ", mid: " + mid + ", high: " + high);
            if(isBadVersion((int) mid)){
                ans = mid;
                high = mid - 1;
                mid = (low + high)/2;
            }
            else {
                low = mid + 1;
                mid = (low + high)/2;
            }
        }
        return (int) ans;
    }
}
