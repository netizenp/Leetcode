package easy;

public class SearchInsertPosition_35 {
	public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid = (low + high) / 2;
        while(low <= high){
            if(nums[mid] == target){
                return mid;
            }
            else if(target <  nums[mid]){
                high = mid - 1;
                mid = (low + high) / 2;
            }
            else if(target > nums[mid]){
                low = mid + 1;
                mid = (low + high) / 2;
            }
        }
        return low;
    }
}
