public class J10_polymorphism {

    //Polymorphism can be achieved by two type
    //1.method 0verloading and 2.method overriding

    //1.Method Overloading
    int a,b,c;
    void display(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("a="+a+"b="+b);
    }

    void display(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("a="+a+"b="+b+"c="+c);
    }
    public static void main(String[] args){
        J10_polymorphism j= new J10_polymorphism();
        j.display(34,43,56);
        j.display(99,100);
    }
}
