class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int size = nums.length;
        if(size == 0 || size == 1) return size;
        for(int i = 0; i<size;i++){
            set.add(nums[i]);
        }
        int largestCons = 1;
        for(int num : set){
            if(!set.contains(num-1)){
                int cur = num;
                int current = 1; 
                while(set.contains(cur +1)){
                    current++;
                    cur = cur +1; 
                }
                largestCons = current >largestCons? current : largestCons;
            }
        }
        
        return largestCons;
    }
}