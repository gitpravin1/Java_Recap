
class bike{
    String type= "Bike";
    String name="Harly Davidson";
    int price= 2000000;
    void display(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(type);
    }
}

public class J10_vehical extends bike{
    String color="Black-Red";
     void display(){
         System.out.println(name);
         System.out.println(price);
         System.out.println(color);
     }
    public static void main(String[] args){
        J10_vehical j=new J10_vehical();
        j.display();
    //upcasting
       bike b=new J10_vehical();
       b.display();

    }

}
