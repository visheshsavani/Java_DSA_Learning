import java.util.*;
public class string_2{
    public static void main(String args[]){
        /*The below code is to reverse the string using String builder
        in this method we have made one more duplicate string

        StringBuilder sb = new StringBuilder("Tony");
        StringBuilder sb1 = new StringBuilder(sb);
        System.out.println(sb);
        sb.delete(0,sb.length());
        for(int i = (sb1.length()-1);i>=0;i--){
            sb.append(sb1.charAt(i));
        }
        System.out.println(sb);*/

        /*the below method is optimal,because we have not made any duplicate string
        StringBuilder sb = new StringBuilder("Tony");
        for(int i =0;i<(sb.length()/2);i++){
            int front = i;
            int back = sb.length() - 1 - i;
            char frontind = sb.charAt(front);
            char backind = sb.charAt(back);
            sb.setCharAt(front,backind);
            sb.setCharAt(back,frontind);
        }
        System.out.println(sb);*/
        StringBuilder sc = new StringBuilder("vishesh");
        sc.reverse();
        String a = sc.toString();
        System.out.println(a);
    }
}