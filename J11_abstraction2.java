
//2.Interfaces
interface ColdDrink {
   void name();
}
class coke implements ColdDrink {

    @Override
    public void name() {
        System.out.println("Coca-Cola");
    }
}


public class J11_abstraction2 {
    public static void main(String[] args) {

        ColdDrink c =new coke();
        c.name();
    }


}
