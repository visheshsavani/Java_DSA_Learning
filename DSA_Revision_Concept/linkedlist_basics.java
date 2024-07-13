import java.util.*;
public class linkedlist_basics{
    public static void main(String args[]){
    LinkedList<String> list = new LinkedList<String>();
    list.addFirst("a");
    list.addFirst("is");
    list.addFirst("This");
    list.addLast("list");
    // System.out.println(list);

    //By default in java .remove function remove the starting element
    //.add function add element in last position
    // list.removeFirst();
    // list.removeLast();
    list.remove(2);
    list.add("car");
    // System.out.println(list);
    // System.out.println(list.size());

    // LinkedList<Integer> list1 = new LinkedList<Integer>();
    // int []arr = {1,5,7,3,8,2,3};
    // for(int i=0;i<arr.length;i++){
    //     list1.add(arr[i]);
    // }

    // search(list1,55);

    // LinkedList<Integer> list1 = new LinkedList<Integer>();
    // for(int i=1;i<=50;i++){
    //     list1.add(i);
    // }

    // for(int i =0;i<list1.size();i++){
    //    list1.removeIf(value -> value > 25);
    //     }
    // System.out.println(list1);

    Collections.reverse(list);
    System.out.println(list);
    }
    static void search(LinkedList<Integer> list,int value){
        for(int i =0;i<list.size();i++){
            if(list.get(i)==value){
            System.out.println("The "+value+" is present at index "+i);
            }
        }
        System.out.println("The "+value+" is not present in linkedlist");
    }
}