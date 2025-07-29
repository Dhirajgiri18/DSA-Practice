package Stack;

import java.util.Stack;

public class ValidBrackets {
    public static boolean IsValid(String str) {
        Stack<Character> st = new Stack<>();
        // char ch[] = str.toCharArray();

        // for(int i=0; i<ch.length; i++){
        // if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[' ){
        // st.push(ch[i]);
        // }
        // if((ch[i]==')' && st.peek()=='(') || (ch[i]=='}' && st.peek()=='{') ||
        // (ch[i]==']' && st.peek()=='[')){
        // st.pop();
        // }
        // }

        for (char c : str.toCharArray()) {
            if (c == '(') {
                st.push(')');
            } else if (c == '[') {
                st.push(']');
            } else if (c == '{') {
                st.push('}');
            } else if (st.isEmpty() || st.pop() != c) {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({}[])";

        boolean result = IsValid(str);
        System.out.println(result);
    }
}
