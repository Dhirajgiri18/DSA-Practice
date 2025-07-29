package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        String s = "Source";
        String d = "Destination";
        String h = "Helper";
        int n = 2;

        TofHanoi(n, s, d, h);
    }
    static void TofHanoi(int n, String s, String d, String h){
        if(n<=0){
            return;
        }else{
            TofHanoi(n-1, s, h, d);
            System.out.println("Disc " + n + " moved from " + s + " to " + d);
            TofHanoi(n-1, h, d, s);
        }
    }
}
