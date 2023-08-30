package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class CF_9HashMap {
    public static void main(String[] args){

        HashMap<String, Integer> stoi=new HashMap<>();
        stoi.put("pravin",3);
        stoi.put("Akashy",1);
        stoi.put("Chetan",6);
        stoi.put("Aditya",7);
        stoi.put("Ramesh",null);
        System.out.println(stoi);

        stoi.putIfAbsent("Ramesh",8);
        System.out.println(stoi);

        //1.Iterate
        for(Map.Entry<String,Integer> e: stoi.entrySet()){

            System.out.println(e);
        }
        for(Map.Entry<String,Integer> e: stoi.entrySet()){

            System.out.println(e.getKey());
        }
        for(Map.Entry<String,Integer> e: stoi.entrySet()){

            System.out.println(e.getValue());
        }

        //2.Iterate
        for(String s:stoi.keySet()){
            System.out.println(s);
        }
        System.out.println(stoi.isEmpty());
        System.out.println(stoi.containsKey("pravin"));



    }
}
