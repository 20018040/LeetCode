class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
int left = 0;
int maxFreq = 0;
int result = 0;

for (int right = 0; right < s.length(); right++) {
    int idx = s.charAt(right) - 'A';
    count[idx]++;
    maxFreq = Math.max(maxFreq, count[idx]);
    int length = (right - left + 1);
    while (length - maxFreq > k) {
        count[s.charAt(left) - 'A']--;
        left++;
        length --;
    }

    result = Math.max(result, length);
}
        return result;
    }
}