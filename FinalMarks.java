import java.util.Scanner;

class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    // public int getrollNo(){
    //     return rollNo;
    // }
    // public void setrollNo(int rollNo){
    //     this.rollNo = rollNo;
    // }
    // public String getName(){
    //     return name;
    // }
    // public void setName(String name){
    //     this.name = name;
    // }
}

class Marks extends Student{
    int javaTh;
    int javaPrac;
    int totalMarks;

    public Marks(int rollNo, String name, int javaTh, int javaPrac){
        super(rollNo, name);
        this.javaTh= javaTh;
        this.javaPrac = javaPrac;
        this.totalMarks= javaTh + javaPrac;
    }
    // public int getJavaTh() {
    //     return javaTh;
    // }

    // public void setJavaTh(int javaTh) {
    //     this.javaTh = javaTh;
    // }

    // public int getJavaPrac() {
    //     return javaPrac;
    // }

    // public void setJavaPrac(int javaPrac) {
    //     this.javaPrac = javaPrac;
    // }
}

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter theory marks: ");
        int javaTh = sc.nextInt();

        System.out.print("Enter practical marks: ");
        int javaPrac = sc.nextInt();

        Marks m1 = new Marks(rollNo, name, javaTh, javaPrac);
        
        System.out.println("Total marks: " + m1.totalMarks);

        sc.close();

    }
}
