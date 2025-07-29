import java.util.Scanner;

abstract class Emp{

    static Scanner sc=new Scanner(System.in);
    abstract void accept();
    abstract void display();
}

class Manager extends Emp{
    private int mId;
    private String mName;
    private long phno;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    public void accept(){
        System.out.println("Enter the details of the manager");
        System.out.print("Enter Id: ");
        setmId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Name: ");
        setmName(sc.nextLine());
        System.out.print("Enter phNo: ");
        setPhno(sc.nextLong());
    }

    public void display(){
        System.out.println("Details of the manager");
        System.out.println("Id: " + getmId());
        System.out.println("Name: " + getmName());
        System.out.println("PhNo: " + getPhno());
    }
}

class Worker extends Emp{
    private String wName;
    private int wId;

    public int getwId(){
        return wId;
    }
    public void setwId(int wId){
        this.wId = wId;
    }
    public String getwName(){
        return  wName;
    }

    public void setwName(String wName){
        this.wName= wName;
    }

    public void accept(){
        System.out.println("Enter the details of the worker");
        System.out.print("Enter the Id: ");
        wId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Name: ");
        wName = sc.nextLine();
    }

    public void display(){
        System.out.println("Details of the worker");

        System.out.println("Id: " + wId);
        System.out.println("wName: " + wName);
    }
}
public class Employee {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Worker w1 = new Worker();


        m1.accept();
        w1.accept();
        m1.display();
        w1.display();
    }
}
