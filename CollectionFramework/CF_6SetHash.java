package CollectionFramework;

import java.util.HashSet;

public class CF_6SetHash {
    // It is case-sensitive
    //elements enter in random order
    //no repetitive element is allowed
    public static void main(String[] args){
        HashSet<String> nm= new HashSet<>();
        nm.add("abc");
        nm.add("xyz");
        nm.add("pqr");

        System.out.println(nm);
        nm.remove("xyz");
        System.out.println(nm);
    }
}
