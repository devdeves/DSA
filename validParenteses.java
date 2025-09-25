class Solution {
    public boolean isValid(String s) {
        if(s.length() <= 1 ){ return false; }
        Stack <Character> stack = new Stack<>();
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i) );
            }else{
                if((stack.isEmpty()) || (stack.peek() == '(' && s.charAt(i) != ')' || stack.peek() == '[' && s.charAt(i) != ']' || stack.peek() == '{' && s.charAt(i) != '}' )){
                        return false;
                }
                 stack.pop();
            }
            i++;
        }

        return stack.isEmpty();

    }
}