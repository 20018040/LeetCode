class Solution {

    public int trap(int[] height) {
        int n = height.length;
        if (n <= 1) return 0;

        int[] rightMaxIndex = new int[n];
        int maxIndex = n - 1;
        rightMaxIndex[n - 1] = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            if (height[i] >= height[maxIndex]) {
                maxIndex = i;
            }
            rightMaxIndex[i] = maxIndex;
        }

        int answer = 0;
        int leftPlace = 0;
        int heightL = height[leftPlace];

        for (int i = leftPlace + 1; i < n; i++) {
            int h = height[i];
            if (h >= heightL) {
                int x = i - 1;
                while (x > leftPlace) {
                    answer += heightL - height[x];
                    x--;
                }
                leftPlace = i;
                heightL = h;
            }
        }
        if(leftPlace == height.length-1) return answer;
        int tallestPlace = rightMaxIndex[leftPlace + 1];

        while (tallestPlace != leftPlace) {
            int tHeight = height[tallestPlace];
            int left = tallestPlace - 1;

            while (left > leftPlace) {
                answer += tHeight - height[left];
                left--;
            }

            leftPlace = tallestPlace;

            if (leftPlace + 1 >= n) break;
            tallestPlace = rightMaxIndex[leftPlace + 1];
        }

        return answer;
    }
}
