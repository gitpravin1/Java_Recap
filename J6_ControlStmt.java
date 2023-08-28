import java.util.Scanner;

public class J6_ControlStmt {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
//        System.out.println("enter a num:");
//        int a=s.nextInt();
//        System.out.println("enter b num:");
//        int b=s.nextInt();
//        System.out.println("Enter c num");
//        int c = s.nextInt();
//
//        // IF stmt
//        if(a>b)
//            System.out.println("a is greater");
//        //If else-if ladder
//        else if (a==b)
//            System.out.println("a and b are equal");
//        // If-else stmt
//         else {
//            System.out.println("b is greater or");
//        }
//
//        //Nested If
//        if(a>b)
//        {
//            if(c>a)
//                System.out.println("c is greater than a &b");
//            else
//                System.out.println("a is  greater than b");
//        }
//        else {
//            if (c>b)
//                System.out.println("c is greater than a&c");
//            else
//                System.out.println("b is greater");
//        }

     //Switch Statement
        System.out.println("Select college no");
        System.out.println("IIT------->>1"
                +"NIT------->2"
                +"COEP------->>3"
                +"SVERI------4");
        int ch=s.nextInt();
     switch(ch){
         case 1:
             System.out.println("CONGO!!!, BHAVI CEO of GOOGLE");
             break;
         case 2:
             System.out.println("congo!!,you are the genius");
             break;
         case 3:
             System.out.println("congo!!, you will be 100% placed");
             break;
         case 4:
             System.out.println("KYA ENGINEER BANEGA RE TU");
             break;
         default:
             System.out.println("Bhava tuza chukat satkar thevlay 6 vajta ye");
     }
}
}
