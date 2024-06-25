import java.util.*;
public class arrays_1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       /* int arr[] = new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your target value");
        int tar = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                System.out.println("target is found at index : "+i);
                return;
            }
        }*/
       String arr[]= new String[4];
       System.out.println("Enter your names in array");
       for(int i=0;i<arr.length;i++){
            arr[i] = sc.next();
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);    
        }
        }
}
/* This is basic of how to define and print the array elements*/