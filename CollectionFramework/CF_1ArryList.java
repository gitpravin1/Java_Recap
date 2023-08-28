package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CF_1ArryList {
    public static void main (String[] args){
      List<Integer> list =new ArrayList<>();

      list.add(23);
      list.add(43);
      list.add(90);
      list.add(45);
      System.out.println(list);

      list.add(4,78);
        System.out.println(list);

      List<Integer> newlist =new ArrayList<>();
      newlist.add(1);
      newlist.add(2);
      newlist.add(3);

      list.addAll(newlist);
      System.out.println(list);

        System.out.println(list.get(4));

        list.remove(3);
        System.out.println("removed 3r dindex element"+list);

        list.remove(Integer.valueOf(23));
        System.out.println("removed 23 valued element"+list);

        list.set(4,99);
        System.out.println("set 4th index to 99"+list);


        System.out.println("does contain value 100 :"+list.contains(100));

        System.out.println("size of ArrayList: "+list.size());

//        list.clear();
//        System.out.println(list);
      Iterator<Integer> it= list.iterator();
      while(it.hasNext()){
        System.out.print(it.next());

      }

      //for iterating list we can also use the for or while loop with list.size()

    }

}
