import java.util.*;
public class q1_bitmanipulation{
    public static void main(String args[]){
        /*This program shows how to check whether give number is of power of 2*/
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your number");
        for(int i=1;i<101;i++){
          int  n = i;
        if((((n-1) & n)==0)&& n >0){
            System.out.println(n);
        }
        }
    }
}