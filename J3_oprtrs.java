public class J3_oprtrs {
    public static void main (String[] args)
    {
    //1.unary operator
        int x=2;
        System.out.println(x++); //2
        System.out.println(x);   //3
        int y=2;
        System.out.println(++y); //3

    //2.Arthematic oprtr
        int z= x*y;
        System.out.println(z);

    //3.shift op
        System.out.println(z<<3); //9*(2^3)=9*8=72
        System.out.println(z>>1);  //9/(2^1)=9/2=4.5~~4

    //4.logical & bitwise
        System.out.println(x>y && y<z); //logical AND
        System.out.println(x<y & y>z);  //bitwise AND

    }
}
