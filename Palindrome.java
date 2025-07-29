import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no: ");
        int num = sc.nextInt();

        checkPal(num);
    }

    public static void checkPal(int num) {
        int org = num;
        int rev = 0;
        int rem;

        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (org == rev) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}