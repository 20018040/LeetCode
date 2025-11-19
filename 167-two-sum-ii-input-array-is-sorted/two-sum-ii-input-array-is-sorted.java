class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> list = new HashMap();
        for(int i = 0 ; i<numbers.length;i++){
            int num = numbers[i];
            if(list.containsKey(target-num)){
                return new int[]{list.get(target-num)+1,i+1};
            }
            list.put(num,i);
        }

        return new int[]{};
    }
}