class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i<temperatures.length;i++ ){
            while(!stack.isEmpty()&& temperatures[i]>temperatures[stack.peek()]){
                int place = stack.pop();
                answer[place] = i-place;
            }
            stack.push(i);
        }
        return answer;
    }
}