import java.util.*;
class myexception extends Exception{
    int a;
    int b=0;
    boolean flag =true;
    public void exception_demonstrate(){

    }
    @Override
    public String getMessage() {
        return "Error";
    }
}
public class trycatch_prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {4,9,2,8};
        int a;
        int b=0;
        boolean flag =true;
        myexception f = new myexception();
        while (flag){
            ++b;
           if(b<=5) {
                System.out.println("Enter the array index");
                a = sc.nextInt();
                try {
                    System.out.println("The value at array index is " + arr[a]);
                    flag = false;
                } catch (Exception e) {
                    System.out.println("Exception occur, Reason is below");
                    System.out.println(e);
                }
            }
           else{ System.out.println(f.getMessage());
           break;}
        }

    }
}
