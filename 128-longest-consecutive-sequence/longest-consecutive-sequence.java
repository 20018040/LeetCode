class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        int size = nums.length;
        if(size == 0 || size == 1) return size;
        for(int i = 0; i<size;i++){
            set.add(nums[i]);
        }
        int largestCons = 1;
        int current = 1;
        int prev = set.pollFirst();
        size = set.size();
        for(int i = 0; i<size;i++){
            int cur = set.pollFirst();
            if(cur == prev +1){
                current++;
                if(current >= largestCons){
                    largestCons = current;
                }
            }
            else{
                current = 1;
            }
            prev = cur;
        }
        return largestCons;
    }
}