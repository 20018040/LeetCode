class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] comb = new int[26];
        int[] comp = new int[26];
        int i = 0;

        int size = s1.length();
        if(s2.length()<size)
            return false;
        for(; i<size;i++){
            comb[s1.charAt(i)-'a']++;
            comp[s2.charAt(i)-'a']++;
        }
        for(;i<s2.length();i++){
            if(Arrays.equals(comb,comp)){
                return true;
            }
            comp[s2.charAt(i-size)-'a']--;
            comp[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(comb,comp)){
                return true;
            }
        return false;
    }
}