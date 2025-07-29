public class SizeOfString {
    public static void main(String[] args) {
        String str = "Dhiraj Giri";
        int length = str.length();

        String[] arr = str.split(" ");
        for (String s : arr) {
            System.out.println(s + " - " + s.length());
        }

        System.out.println(str.length());

        // Scanner sc = new Scanner(str);

        // while (sc.hasNext()) {
        // String word = sc.next();
        // System.out.println(word + " - " + word.length());
        // }
        // System.out.println(length);
    }
}
