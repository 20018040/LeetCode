class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = 0;
        int left = 0;
        int right = matrix.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (target < matrix[mid][0]) {
                right = mid - 1;
            } else if (target > matrix[mid][matrix[0].length - 1]) {
                left = mid + 1;
            } else {
                row = mid;
                break;
            }
        }
        
        if(row != 0 && matrix[row][0] > target)
         row--;
         left = 0;
        // if (row ==2) return true;
        right = matrix[row].length-1;
        while(left<= right){
            column = (left+right)/2;
            if(matrix[row][column] < target){
                left = column +1 ;
            }
            else if(matrix[row][column] > target){
                right = column -1 ;
            }
            else return true;
        }
        return false;
    }
}