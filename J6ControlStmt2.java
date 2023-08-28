public class J6ControlStmt2 {
    public static void main(String[] args){

      // 1.FOR--loop
        for(int i=1;i<11;i++){
            int temp=5*i;
            if(i==5)   // will skip 25
                continue;
            System.out.println(temp);
        }
        System.out.println("----------------------------------------");

      // 2.FOR-EACH Loop----(specially designed to traverse the array or collections)
        String[] names= {"Radha","krishna","Ram","Sita"};
        for (String name:names) {
            System.out.println(name);
        }
        System.out.println("----------------------------------------");

        // 3.WHILE Loop
        int i=1;
        while(i<11)
        {
           System.out.println(5*i);
           i++;
        }
        System.out.println("----------------------------------------");

        // 4.DO-WHILE LOOP --(execute at least once regardless of condition)
        int j=1;
       do{
           System.out.println(5*j);
           j++;
       }while(j<11);


    }
}
