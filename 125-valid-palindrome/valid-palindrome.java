class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        s = s.toLowerCase();
        int size = s.length();
        if(size ==1)return true;
        for(int i = 0; i<size/2;i++){
            if(s.charAt(i) != s.charAt(size-i-1)){
                return false;
            }
        }
        return true;
    }
}