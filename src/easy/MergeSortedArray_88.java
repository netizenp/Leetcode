package easy;
import java.util.Arrays;

public class MergeSortedArray_88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while(i<m && n > 0){
            if(nums1[i] <= nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                nums1[i] = nums1[i] + nums2[j];
                nums2[j] = nums1[i] - nums2[j];
                nums1[i] = nums1[i] - nums2[j];
                Arrays.sort(nums2);
                i++;
            }
        }
        for(i=m,j=0;i<m+n && j<n;i++,j++){
            nums1[i] = nums2[j];
        }
    }
}
