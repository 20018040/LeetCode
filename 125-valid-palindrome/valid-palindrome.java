class Solution {
    public boolean isPalindrome(String s) {
        // s = s.replaceAll("[^A-Za-z0-9]", "");
        // s = s.toLowerCase();
        int size = s.length();
        int left = 0;
        int right = size -1;
        while (left < right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
            }
            else if(!Character.isLetterOrDigit(r)){
                right--;
            }
            else{
                if (l >= 'A' && l <= 'Z') l += 32;
                if (r >= 'A' && r <= 'Z') r += 32;
                if (l != r) return false;
                left++;
                right--;
            }
            
        }
        return true;
    }
}