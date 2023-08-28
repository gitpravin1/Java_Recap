public class J4_string {
    public static void main(String[] args) {
        String s ="Pravin";
        //Does not modify string
        s.concat("Haralkar");
        System.out.println(s);

        //create the new string object
        s=s.concat("Haralkar");
        System.out.println(s);

        //Stringbuffer----------------------------------------------------
        //is a string which is moadifiable(insert, append, delete, replace) and which thread safe(by the help of )

        StringBuffer s1= new StringBuffer("Pranav");
        //Append
        s1.append("Haralkar");
        System.out.println(s1);
        //insert
        s1.insert(6,"M");
        System.out.println(s1);
        //Delete
        System.out.println(s1.delete(6,7));
        //Reverse
        System.out.println(s1.reverse());
       //-------------------------------------------------------------
       StringBuilder s2=new StringBuilder("Peter");
       // is a string which is moadifiable(insert, append, delete, replace) but not thread safe

       System.out.println(s2.append("Parker"));
       System.out.println(s2.insert(6,"S"));
       System.out.println(s2.delete(6,7));
       System.out.println(s2.reverse());
       //--------------------------------------------------------------
       //String Methods
       //1.charAt()
       String a="SpyderMan";
       System.out.println(a.charAt(3));//3+1=4 --d

        //2.compareTo()- compare lexiographically
        String b="SpyderMan";
        System.out.println(a.compareToIgnoreCase(b));

        //3.contains
        System.out.println(a.contains("Man"));

        //4.equals() compare by content of string
        System.out.println(a.equals(b));

        //5.length()
        System.out.println(a.length());

        //6.isEmpty
        System.out.println(a.isEmpty());

        //7.toUpperCase | toLowerCase
        System.out.println(a.toUpperCase());

        //8.toCharArray
        char[] ch= a.toCharArray();
        System.out.println(ch);

        //9.trim--removes leading and trailing spaces
        String x="  Hii hello";
        System.out.println(x.trim()+"hello");

        //10.split
        String y="Hii everyone how are you";
        String[] z=y.split("e");
        for(int i = 0; i<z.length; i++){
            System.out.println(z[i]);
        }




    }
}
