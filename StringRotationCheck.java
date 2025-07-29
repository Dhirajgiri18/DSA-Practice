public class StringRotationCheck {
    public static void main(String[] args) {
        String s1 = "decode";
        String s2 = "odec";

        System.out.println(CheckRotation(s1,s2));
        int rotateChar = 2;
        System.out.println(LeftRotate(s1, rotateChar));
        System.out.println(RightRotate(s1, rotateChar));
    }
    static String LeftRotate(String s1, int r) {
        String rotatedString = s1.substring(r) + s1.substring(0,r);
        return rotatedString;
    }
    static String RightRotate(String s1, int r){    //decode
        int p = s1.length()-r;
        String rotatedString = s1.substring(p) + s1.substring(0, p);
                                //de                // deco
        return rotatedString;
    }
    static boolean CheckRotation(String s1, String s2){
        String concat = s1+s1;
        if(concat.contains(s2)){
            return true;
        }
        return false;
    }


}
