public class J2_datatyps {
    public static void main(String[] args)
    {
        boolean a=true;
        char b='B';         //"/u0000 to /uffff"
        byte c=111;        // -128 to 127  default=0
        short d=888;       //-32768 to 32767  default=0
        int e=888888888;   //def=0
        long f= 8888888888888888888L;  //def=0
        float g=885.85558f;    // range is unlimited  def=0.0f
        double h=88955.6585445d;  // range is unlimited  def=0.0d

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        }
}
