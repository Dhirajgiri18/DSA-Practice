// Remove the adjacency duplicates from  the string
package Stack;

import java.util.Stack;

public class AdjacentString {
    public static char[] Remove(String str) {
        char[] ch = str.toCharArray();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < ch.length; i++) {
            if (st.empty() || st.peek() != ch[i]) {
                st.push(ch[i]);
            } else if (ch[i] == st.peek()) {
                if (ch[i] != ch[i + 1]) {
                    st.pop();
                }
            }
        }
        char[] ch2 = new char[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ch2[i] = st.pop();
        }
        return ch2;
    }

    public static void main(String[] args) {
        String str = "gAabbcchkkkl";
        str = str.toLowerCase();

        char[] s = Remove(str);
        System.out.println(s);
    }
}
