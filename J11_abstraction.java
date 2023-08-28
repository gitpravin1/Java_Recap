//Abstraction can be achieved by two methods
//1.Abstract Class
//2.Interface


//1 Using Abstract Class

//   An abstract class must be declared with an abstract keyword.
//   It can have abstract and non-abstract methods.
//   It cannot be instantiated.
//   It can have constructors and static methods also.
//   It can have final methods which will force the subclass not to change the body of the method.
abstract class Table {
    String type;
    String use;
    void display(){
        System.out.println(type+"-"+use);
    }
}

class studyTable extends Table {
   String type="Study table";
   String use=" toStudy";

    @Override
    void display(){
        System.out.println(type+"-"+use);
    }
}

class DinnigTable extends Table {
    String type="Dinning Table";
    String use="For Dinner";

    @Override
    void display(){
        System.out.println(type+"-"+use);
    }
}
public class J11_abstraction {
    public static void main(String[] args){
        Table t= new studyTable();
        t.display();

        Table t1= new DinnigTable();
        t1.display();
    }
}
