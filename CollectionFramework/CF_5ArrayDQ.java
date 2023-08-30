package CollectionFramework;

import java.util.ArrayDeque;

public class CF_5ArrayDQ {
    public static void main(String[] args){
//        ArrayDqueue is special DS on which we can perform opretions on both ends.

        ArrayDeque<Integer> num =new ArrayDeque<>();
        num.offer(45);
        num.offerFirst(63);
        num.offerLast(99);
        num.offer(66);

        System.out.println(num);


        System.out.println(num.poll());
        System.out.println(num);

        System.out.println(num.pollLast());
        System.out.println(num);

        System.out.println(num.pollFirst());
        System.out.println(num);

    }
}
