import java.util.*;
public class arraylist_basics{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(42);
        list.add(14);

        System.out.println(list);

        // how to remove
        list.remove(2);

        //how to add element on a particular index
        list.add(2,9);
        
        //how to get element
        int ele = list.get(3);
        System.out.println(ele);
        System.out.println("Printing using for each loop");
        for(int element : list){
            System.out.println(element); // eg of for each loop
        }

        // how to sort any list data structure using collections classs
        Collections.sort(list);
        System.out.println(list);
    }
}