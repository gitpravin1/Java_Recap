//Hierarchical Inheritance
//J9_inheritance3 and J9_inheritance2 both extends Car

public class J9Inheritance3 extends Car{
    int seats=4;
    public static void main(String[] args) {
        J9Inheritance3 j = new J9Inheritance3();
        System.out.println(j.name+"\t"+j.price+"\t"+j.seats);
    }

}
