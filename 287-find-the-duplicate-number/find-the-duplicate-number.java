class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> lists = new HashSet<>();
        for(int i = 0; i< nums.length;i++){
            if(lists.contains(nums[i])){
                return nums[i];
            }
            lists.add(nums[i]);
        }
        return 1;
    }
}