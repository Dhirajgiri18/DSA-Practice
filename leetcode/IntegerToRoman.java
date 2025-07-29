package leetcode;
import java.util.Scanner;

public class IntegerToRoman {
    public static String RomanNo(int num) {
        String roman = "";
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] notations = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman = roman + notations[i];
                num = num - values[i];
            }
        }
        return roman;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        String roman = RomanNo(num);
        System.out.println("Roman No: " + roman);
    }
}
