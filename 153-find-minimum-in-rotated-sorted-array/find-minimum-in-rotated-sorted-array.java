class Solution {
    public int findMin(int[] nums) {
        int left = 0 ;
        int right = nums.length-1;
        if (right == 0){
            return nums[0];
        }
        int answer = Integer.MAX_VALUE;
        while(left <= right){
            int middle = (left+ right)/2;
            if(nums[middle]<answer){
                answer = nums[middle];
            }
            if(nums[middle] > nums[right]){
                left = middle +1;
            }
            else if(nums[middle] < nums[left] ){
                right = middle -1; 
            }
            else return Math.min(nums[left],answer);
        }
        return answer; 
    }
}