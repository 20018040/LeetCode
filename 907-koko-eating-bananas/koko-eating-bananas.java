class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int n = piles.length;
        int answer = 0;
        if(n == h ){
            return piles[piles.length-1];
        }
        int left = 1;
        int right = piles[n-1];
        while (left<= right){
            int middle = (left+right)/2;
            long count = 0;
            for(int i = (n-1); i>=0;i--){
                if(piles[i] <= middle){
                    count += i+1;
                    break;
                }
                count += piles[i]/middle;
                if (piles[i] % middle > 0) {
                    count++;
                }
            }
            if(count >h){
                left = middle+1;
            }
            else if (count<=h){
                right = middle -1;
                answer =middle;
            }
        }
        return answer;

    }
}