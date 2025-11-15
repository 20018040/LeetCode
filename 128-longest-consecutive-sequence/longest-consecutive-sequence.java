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
                int current = 1; 
                while(set.contains(num +1)){
                    current++;
                    num++; 
                }
                largestCons = current >largestCons? current : largestCons;
            }
        }
        
        return largestCons;
    }
}