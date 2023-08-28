 class Student {
    int id;
    String name;

    void display() {
        System.out.println("id=" + id + "\t" + "name=" + name);
    }
 }
public class J7_object {
    int n1;
    int n2;
    void display(){
        System.out.println(n1+"\t"+n2);
    }
    public static void main(String[] args){

        //Object of class Student s1 is created
        Student s1 = new Student();
        s1.id=3;
        s1.name="Cathlin";
        s1.display();

        //Object of class Student s2 is created
        Student s2 = new Student();
        s2.id=34;
        s2.name="Pravin";
        s2.display();

        J7_object o=new J7_object();
        o.n1=3;
        o.n2=4;
        o.display();

    }
}
