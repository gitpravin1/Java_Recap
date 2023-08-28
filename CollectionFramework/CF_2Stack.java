package CollectionFramework;

import java.util.Stack;

public class CF_2Stack {
    public static void main(String[] args){
        Stack<String> animal =new Stack<>();

        animal.push("Cheeta");
        animal.push("Tiger");
        animal.push("Lion");
        System.out.println(animal);

        System.out.println(animal.pop());
        System.out.println(animal);

        System.out.println(animal.peek());

        System.out.println(animal.contains("Lion"));

        System.out.println(animal.get(0));



    }
}
