import java.util.*;
public class arraylist_practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l= new ArrayList<>();
        //System.out.println("Enter the values in array");
        l.add(99);
        l.add(98);
        l.add(89);
        l.trimToSize();
        //System.out.println(l.size());
        for(Integer num : l ) {
            //System.out.println(l.size());
            System.out.println(num);
        }
    }
}
