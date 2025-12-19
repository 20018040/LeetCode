class Solution {
    public int search(int[] nums, int target) {
        if(nums.length ==1){
            return nums[0] == target ? 0 : -1;
        }
        int place = nums.length/2;
        int left = 0; 
        int right = nums.length-1;
        while(left <= right){
            if(nums[place] < target){
                left = place+1;
            }
            else if(nums[place]> target){
                right = place-1;
            }
            else 
                return place;
            place = (left + right)/2;
        }
        return -1;
    }
}
// 0 1 1 > 1 1 1