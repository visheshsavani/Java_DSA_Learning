import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //insertion
        map.put("India",120);
        map.put("China",180);
        map.put("Russia",30);
        map.put("USA",60);

        //print
        System.out.println(map);

        //search
        if(map.containsKey("Indonesia")) System.out.println("key is not present");

        System.out.println(map.get("India")); // .get gives the corresponding key value of key
        //if key doesn't then null is printed
        System.out.println(map.get("Indonesia"));
        //the below is one way to iterate
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" "+e.getValue());
            System.out.println();
        }
        // the below is another way to iterate
        System.out.println("This is another way to print");
        Set<String> keys = map.keySet();
        for (String key:keys){
            System.out.println(key+" "+map.get(key));
        }
    }
}
