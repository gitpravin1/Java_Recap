package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class CF_3Queue_LL {
    public static void main(String[] args) {
        Queue<Integer> roll = new LinkedList<>();
        roll.offer(34);
        roll.offer(45);
        roll.offer(65);

        System.out.println(roll);

        System.out.println(roll.poll());
        System.out.println(roll.peek());


        LinkedList<Integer> no= new LinkedList<>();
        no.offer(45);
        no.offer(63);
        no.offer(33);
        System.out.println(no);
        System.out.println(no.peek());


    }

}
