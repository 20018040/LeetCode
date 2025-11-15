class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int size = nums.length;
        if(size == 0 || size == 1) return size;
        for(int i = 0; i<size;i++){
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int largestCons = 1;
        int current = 1;
        int prev = list.get(0);
        for(int i = 1; i<list.size();i++){
            if(list.get(i) == prev +1){
                current++;
                if(current >= largestCons){
                    largestCons = current;
                }
            }
            else{
                current = 1;
            }
            prev = list.get(i);
        }
        return largestCons;
    }
}