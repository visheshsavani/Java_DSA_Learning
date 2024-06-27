import java.util.*;
public class bit_conversion{
    public static void main(String args[]){
        int a = 99;
        String b = deci_to_bin(a);
        int c = bin_to_deci(b);
        System.out.println(c);
    }
    /* The below code convert the decimal into its equivalent binary number*/
    static String deci_to_bin(int x){
        String res = "";
        while(x!=0){
            if(x%2 == 1) res +="1";
            else res +="0";
            x = x/2;
        }
        // the below are imp lines
        StringBuilder sb = new StringBuilder(res);
        sb.reverse();
        res = sb.toString();
        return res;
    }
    /* The below code convert the binary num into its equivalent decimal number*/
    static int bin_to_deci(String x){
        int size = x.length();
        int sum = 0;
        int pow = 1;
        for(int i =size -1;i>-1;i--){
            if(x.charAt(i) == '1') sum += pow;
            pow = pow * 2;
        }
        return sum;
    }
}