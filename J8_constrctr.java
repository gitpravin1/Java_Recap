import java.util.Scanner;

class Teacher{
    int id;
    String subj;
    //parameterised constructor
    Teacher(int id,String subj){
        this.id=id;
        this.subj=subj;
        display();
    }

    public Teacher() {
        int id;
        int subj;
    }

    void display(){
        System.out.println("id="+id+"\t"+"subj="+subj);
    }
}



public class J8_constrctr {
    public static void main (String[] args){
        Scanner s= new Scanner(System.in);
        //calling parameterized constr with user define values
        Teacher t1= new Teacher(43,"Math");


        //calling default constr and taking values from user
        //if we want to create a default constr within the same class no need to declare it
        Teacher t2 = new Teacher();
        System.out.println("enter sub name");
        t2.subj=s.nextLine();
        System.out.println("enter id");
        t2.id=s.nextInt();
        t2.display();



    }
}
