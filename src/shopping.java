import java.util.*;
class list{
    private int []codeno=new int[100];
    public String []name= new String[100];
    private double []price=new double[100];
    public int getCodeno(int i) {
        return codeno[i];
    }
    public double getPrice(int i) {
        return price[i];
    }
    public void additem(int b,double c,int j){
        codeno[j]=b;
        price[j]=c;
    }
    public void deleteitem(int a){
        for(int i=0;i<codeno.length;i++){
            if(codeno[i]==a){
                codeno[i]=0;
                break;
            }
        }
        for(int i=0;i<codeno.length;i++){
            if(codeno[i]==0){
                name[i]="0";
                price[i]=0.0;
            }
        }
    }
}
public class shopping {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String []temp= new String[100];
 list obj = new list();
 int n;
 int b;
 double c;
        System.out.println("Enter the total no of items");
        n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of the item");
            obj.name[i]= sc.nextLine();
            temp[i]=obj.name[i];
            sc.nextLine();
            System.out.println("Enter the Code-no of the item");
            b= sc.nextInt();
            System.out.println("Enter the price of the item");
            c=sc.nextDouble();
            obj.additem(b,c,i);
        }
        System.out.println("Do you want to delete any item?");
        System.out.println("Press 1 for Yes");
        System.out.println("Press 2 for No");
        int d= sc.nextInt();
        if(d==1){
            System.out.println("Enter the code no of the item which you want to delete");
            int e= sc.nextInt();
            obj.deleteitem(e);
        }
        System.out.println("The list of the shopping item is");
        System.out.println("Code Name Price");
        for(int i=0;i<n;i++){
            System.out.printf("%d ",obj.getCodeno(i));
            System.out.print(temp[i]);
            System.out.printf(" %.2f\n",obj.getPrice(i));
        }
    }
}
