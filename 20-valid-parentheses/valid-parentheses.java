class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c =='[' || c== '{'){
                stack.add(c);
            }
            else{
                if(stack.size() == 0) return false;
                char d =stack.remove(stack.size()-1); 
                if(d != (c-2) && d != c-1){
                    return false;
                }
            }
        }
        if(stack.size() != 0 ) return false;
        return true;
    }
}