class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] freq = new int[128]; // ASCII safe
        int required = 0;

        // Build frequency map for t
        for (char c : t.toCharArray()) {
            if (freq[c] == 0) required++; // count unique chars
            freq[c]++;
        }

        int left = 0, right = 0;
        int formed = required;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char r = s.charAt(right);
            freq[r]--;

            if (freq[r] == 0) {
                formed--; // one unique requirement satisfied
            }

            // Try shrinking window
            while (formed == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char l = s.charAt(left);
                freq[l]++;

                if (freq[l] > 0) {
                    formed++; // requirement broken
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE
            ? ""
            : s.substring(start, start + minLen);
    }
}
