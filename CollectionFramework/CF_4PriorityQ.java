package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CF_4PriorityQ {
    public static void main(String[] args) {

        //by default PQ implement minhip otherwise for maxhip as follows
        PriorityQueue<Integer> num = new PriorityQueue<>(Comparator.reverseOrder());
        num.offer(99);
        num.offer(48);
        num.offer(86);
        num.offer(55);
        System.out.println(num);

        num.poll();
        System.out.println(num);


    }
}
