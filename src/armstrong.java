import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the three digit number");
       //int a = sc.nextInt();
        //boolean x = armstrong(a);
        //System.out.println(x);
      for (int i = 99;i<10000;i++){
            if(armstrong(i)) {
                System.out.println(i);
            }
     }
    }
    static boolean armstrong(int n){
        int a;
        int sum=0;
        int k =n;
        int j=n;
        int i=0;
        while(j>0){
                i++;
            j= j/10;
        }
        //System.out.println(i);
        while(n>0){
            a= n%10;
            n = n/10;
            sum += Math.pow(a,i);
        }
        if(sum == k){
            return true;
        }
        else{
            return false;
        }
    }
}
