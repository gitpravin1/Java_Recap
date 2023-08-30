package CollectionFramework;

import java.util.LinkedHashSet;

public class CF_7LinkedHshset {
    //It follows order as we have inserted unlike HashSet.
    public static void main(String[] args){
        LinkedHashSet<String> name = new LinkedHashSet<>();
        name.add("lmn");
        name.add("jkl");
        name.add("stu");
        System.out.println(name);
        name.remove("jkl");
        System.out.println(name);




    }

}
