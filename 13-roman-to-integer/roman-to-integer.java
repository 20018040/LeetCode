class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        HashMap<Character, Integer> value = new HashMap<>();
        value.put('I',1);
        value.put('V',5);
        value.put('X',10);
        value.put('L',50);
        value.put('C',100);
        value.put('D',500);
        value.put('M',1000);
        for(int i = s.length()-1; i>=0;i--){
            char c = s.charAt(i);
            int num = value.get(c);
            if(num*3< answer){
                answer = answer - num;
            }
            else 
                answer = answer +num;
        }
        return answer;
    }
}