import java.util.Scanner;

public class J5_printScan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();

        int age;
        System.out.println("enter age");
        age=sc.nextInt();
        System.out.println("hii "+name+" your age is"+age);
    }
}
