class Solution {
    public String minWindow(String s, String t) {
        int size = t.length();
        String ans = "";
        if(s.length() < size){
            return "";
        }
        if(s.equals(t)){
            return s;
        }
        
        int[] nums = new int[58];
        int left = 0;
        int right = 1;
        for(char c: t.toCharArray()){
            nums[c-'A']++;
        }
        int[] com = new int [58];

        int found = 0;
        for(char c : s.toCharArray()){
            int num = c -'A';
            if(nums[num] > 0){
                com[num]++;
                if(com[num] <= nums[num])
                    found++;
                while(found == size){
                    if(ans.isEmpty() || right-left < ans.length())
                        ans = s.substring(left,right);
                    int z = s.charAt(left) - 'A';
                    com[z]--;
                    if(com[z] < nums[z]) found--;
                    left++;
                    while(left < s.length() &&nums[s.charAt(left)-'A'] ==0 ){
                       left++;
                        
                    }

                }
            }
            else if(found == 0) left++;
            right++;
        }
        return ans;
    }
}