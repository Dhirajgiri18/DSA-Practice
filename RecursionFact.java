public class RecursionFact {
    static boolean recursion(int num) {
        int sum = 0, temp = num;
        boolean check = false;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (temp == sum) {
            check = true;
        }
        return check;
    }

    public static void main(String[] args) {
        int num = 6;

        boolean result = recursion(num);
        System.out.println("perfect num = " + result);

    }
}
