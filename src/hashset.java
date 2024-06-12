import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        //How to add elements in hashset
        set.add(5);
        set.add(3);
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(6);
        //How to print hash set and size
        System.out.println(set);
        System.out.println("Size of set : "+set.size());

        //search
        if(set.contains(5)) System.out.println("element is there in set");
        if(!set.contains(9)) System.out.println("element is not there in set");

        //Deletion
        set.remove(2);
        System.out.println(set);

        //How to make use of Iterator in hash set
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+", ");
        }
    }
}
