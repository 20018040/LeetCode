class Solution {
    public int highestPlace(int starting,int[] height){
        int highest = -1;
        int compare = 1;
        while(starting < height.length){
            if (height[starting] >= compare){
                compare = height[starting];
                highest = starting;
            }
            starting ++;
        }
        return highest;
    }
    public int trap(int[] height) {
        int hLength = height.length;
        if(hLength ==1 )
            return 0;
        int answer = 0;
        int lowest = 0;
        int i = 0;
        int leftPlace = i;
        int heightL = height[leftPlace];
        for(i= leftPlace +1; i< hLength;i++){
            int heightI = height[i];
            if(heightI >= heightL){
                int x = i-1;
                while(x>leftPlace){
                    answer += (heightL-height[x]);
                    x--;
                }
                leftPlace = i;
                heightL = heightI;                
            }
        }
        int tallestPlace = highestPlace(leftPlace+1,height);
        while(tallestPlace != -1){
            int tHeight = height[tallestPlace];
            int left = tallestPlace -1;
            while(left > leftPlace){
                answer += tHeight - height[left];
                left--;
            }
            leftPlace = tallestPlace;
            tallestPlace = highestPlace(tallestPlace+1,height);
            
        }
        return answer;
    }
}