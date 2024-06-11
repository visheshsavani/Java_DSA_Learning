import java.util.Scanner;
public class firstprogram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c;
        int a;
        System.out.println("Enter the value of c ");
        c=sc.nextInt();
        System.out.println("Enter the value of c ");
        a=sc.nextInt();
        System.out.println("The sum of a and b is "+(a+c));
        for(int k=1;k!=6;k++){
            System.out.println("The value of c is "+k);
        }
    }
}
