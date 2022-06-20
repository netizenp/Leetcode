package medium;

/*Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:
Input: matrix = [[1,3,5,7],
				 [10,11,16,20],
				 [23,30,34,60]], target = 3
Output: true

Example 2:
Input: matrix = [[1,3,5,7],
				 [10,11,16,20],
				 [23,30,34,60]], target = 13
Output: false*/

public class SearchA2DMatrix_74 {
	public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while(i < matrix.length){
            if(target < matrix[i][j]){
                break;
            }
            else if(target > matrix[i][j]){
                i++;
            }
            else if(target == matrix[i][j]){
                return true;
            }
        }
        if(i == matrix.length){
            return false;
        }
        int left = 0, right = matrix[i].length - 1, mid = (left + right) / 2;
        while(left <= right){
            if(matrix[i][mid] == target){
               return true; 
            }
            else if(matrix[i][mid] < target){
                left = mid + 1;
                mid = (left + right) / 2;
            }
            else if(matrix[i][mid] > target){
                right = mid - 1;
                mid = (left + right) / 2;
            }
        }
        return false;
    }
}
