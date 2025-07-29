package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger{
    public static int Convert(String roman){
        if(roman == null || roman.length()==0){
            return 0;
        }

        Map<Character,Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int number = map.get(roman.charAt(roman.length()-1));   //V     5

        for(int i=roman.length()-2; i>=0; i--){
            if(map.get(roman.charAt(i)) < map.get(roman.charAt(i+1))){
                number = number - map.get(roman.charAt(i));
            }else{
                number = number + map.get(roman.charAt(i));
            }
        }
        return number; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Roman No: ");
        String roman = sc.nextLine();                       // XXIV

        int num = Convert(roman);
        System.out.println("The number is: " + num);
    }
}