import java.util.*;
public class togglebit{
    public static void main(String args[]){
        /* The below code show how to toggle bit of any decimal */
        int n = 8;
        int position = 3;
        int bitmask = 1<<position;
        
        /*if((bitmask & n)==0){
            n = (bitmask | n);
        }
        else{
            n = ( ~bitmask & n);
        }*/

       // we can use xor operator to solve this one step
       n = bitmask ^ n;
        System.out.println(n);
    }
}