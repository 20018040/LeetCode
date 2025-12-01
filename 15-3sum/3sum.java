class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,List<int[]>> sums = new HashMap<>();
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0; i< nums.length;i++){
            if(i>0 && nums[i-1] == nums[i])continue;
            int left = i+1;
            int right = nums.length -1;
            int cur = nums[i];
            while(left<right){
                int le = nums[left];
                int ri = nums[right];
                int total = le+ri;
                if(total <-cur ){
                    left++;
                }
                else if(total >-cur){
                    right--;
                }
                else{
                    answer.add(Arrays.asList(cur, le, ri));
                    left++;
                    right--;
                    while(left<right &&nums[left] == nums[left-1])
                        left++;
                }
            }
        }
        
        
        
        return answer;
    }
}
//-4 -1 -1 0 1 2 