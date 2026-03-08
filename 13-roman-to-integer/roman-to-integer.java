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
        for(int i = 0; i<s.length()-1;i++){
            char c = s.charAt(i);
            int num = value.get(c);
            if(num< value.get(s.charAt(i+1))){
                num = num *-1;
            }
            answer = answer + num;
        }
        answer = answer + value.get(s.charAt(s.length()-1));
        return answer;
    }
}