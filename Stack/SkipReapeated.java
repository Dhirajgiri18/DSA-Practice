package Stack;

import java.util.Arrays;
import java.util.Stack;

public class SkipReapeated {
    public static int[] remove(int[] arr) {
        int l = arr.length;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < l; i++) {
            if (st.empty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (st.peek() == arr[i]) {
                if (i == l - 1 || arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }
        int res[] = new int[st.size()];
        int ind = st.size() - 1;
        for (int i = ind; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 10, 10, 10, 5, 5, 3, 2 };

        int res[] = remove(arr);

        System.out.print(Arrays.toString(res));
    }
}