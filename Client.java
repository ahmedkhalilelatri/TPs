public class Client {
public static void main1() {
    Program1 p = new Program1();
    System.out.println("I am main1");
    p.go();
}
public static void main2() {
    Program1 p = new Program1();
    System.out.println("I am main2");
    p.go();
}
public static void main3() {
    Program1 p = new Program1();
    System.out.println("I am main3");
    p.go();
}
}

public class Program1{
    public Program1() {}
    public void go() {
        System.out.println("I am in Program1");
    }
}
public class Program2{
    public Program2() {}
    public void go() {
        System.out.println("I am in Program2");
    }
}
public class Program3{
    public Program3(){}
    public void go() {
        System.out.println("I am in Program3");
    }
}

public class client {
    public static void main(String[] args) {
        int choice = 2;
        if (choice == 1) {
            Program1 p = new Program1();
            System.out.println("I am main1");
            p.go();
        } else if (choice == 2) {
            Program2 p = new Program2();
            System.out.println("I am main2");
            p.go();
        }else if (choice == 3) {
            Program3 p = new Program3();
            System.out.println("I am main3");
            p.go();
        }else {
            System.out.println("Invalid choice");
        }
    }
}