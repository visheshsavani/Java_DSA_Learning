import java.util.*;

public class lowercase {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char k;
        k = sc.next().trim().charAt(0);
        if(k>=65 && k<=90){
            System.out.println("The given character is the upper case "+k);
        }
        else{
            System.out.println("The given character is the lower case "+k);
        }

        int a,b;
        a = 0;
        b = 1;
        for (int i = 2 ;i<8;i++){
            int temp =b;
            b = b +a;
            a= temp;
        }
        System.out.println(b);

        int c = 23597;
        int ans=0;

        while(c>0){
            int temp = c%10;
            ans = (ans * 10)+ temp;
            c = c/10;
        }
        System.out.println(ans);

        int n =30;
       int  count = 0;
        while (n!=0){
            int x = n%2;
            if(x==0){
                count++;
            }
            n--;
        }
        System.out.println(count);

         */
        int n = 2019;
        if ((n % 4) == 0) {
            System.out.println("The given year is a leap");
        } else {
            System.out.println("The given year is not a leap");
        }
    }
}
