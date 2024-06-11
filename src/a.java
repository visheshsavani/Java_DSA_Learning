import java.util.Scanner;

class b{
    public String []a = new String[100];
}
public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String []c = new String[100];
        b d=new b();
        for(int i=0;i<3;i++){
          d.a[i] =sc.nextLine();
        }
        String s = d.a[0];
        System.out.println(s);
    }
}
