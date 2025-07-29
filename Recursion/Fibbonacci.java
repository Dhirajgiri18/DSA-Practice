package Recursion;

public class Fibbonacci {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fib(n));
    }
    static int Fib(int n){
        if(n<=1){
            return n;
        }else{
            return(Fib(n-1) + Fib(n-2));
        }
    }
}
