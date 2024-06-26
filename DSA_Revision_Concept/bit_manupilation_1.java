import java.util.*;
public class bit_manupilation_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        /*The below code show how to get the bit value at any position of any digit
        int n =5;
        int position = 2;
        int bitmask = 1<<position;
        if((bitmask & n)==0){
            System.out.println("The bit is zero");
        }
        else{
            System.out.println(bitmask & n);
            System.out.println("The bit is one");
        } */

       /*The below code show how to set a bit =1 on a given position of any digit
       int n = 5;
       int position = 1;
       int bitmask = 1<<position;
       System.out.println("The value of n before bit manupilation : "+n);
       n = (bitmask | n);
       System.out.println("The value of n after bit manupilation : "+n); */

       /*The below code show how to clear a bit =0 on a given position of any digit
       int n = 5;
       int position = 2;
       int bitmask = 1<<position;
       System.out.println("The value of n before bit manupilation : "+n);
       n = ((~bitmask) & n);
       System.out.println("The value of n after bit manupilation : "+n);*/

       /*The below code show how to update a bit = 0 or 1 on a given position of any digit depending on user*/
       System.out.println("Enter to the position with 0 or 1");
       int x = sc.nextInt();
       int n = 5;
       int position = 1;
       int bitmask = 1<<position;
       if(x==0){
        n = ((~bitmask) & n);
        System.out.println(n);
       }
       else{
        n = bitmask | n;
        System.out.println(n);
       }
    }
}