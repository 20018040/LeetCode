class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            int idx = binarySearch(numbers, i + 1, numbers.length - 1, complement);

            if (idx != -1) {
                // +1 for 1-indexed answer
                return new int[]{i + 1, idx + 1};
            }
        }
        return new int[]{};
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}