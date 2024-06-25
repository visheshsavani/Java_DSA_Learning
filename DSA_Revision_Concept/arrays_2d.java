import java.util.*;
public class arrays_2d{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns");
        int rows = sc.nextInt();
        System.out.println();
        int columns = sc.nextInt();
        int [][]arr = new int [rows][columns];
        for(int i =0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter your target value");
        int target = sc.nextInt();
        for(int i =0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(arr[i][j]==target){
                    System.out.println("Target element found out at index : "+i+" "+j);
                    return;
                }
            }
        }
    }
}