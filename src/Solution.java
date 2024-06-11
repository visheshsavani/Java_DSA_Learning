import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int temp[] = new int[2];
        for(int i=0;i<temp.length;i++){
            temp[i] = sc.nextInt();
        }
        int n = temp[0];
        int k = temp[1];
        int arr[] = new int[n];
        int p=0;
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                arr[p]= sc.nextInt();
                p++;
            }
            if(p==arr.length) break;
        }
        int count=0;
        for(int j=0;j<k;j++){
            int max=arr[0];
            for(int a = 0;a<n;a++){
                if(arr[a]> max){
                    max = arr[a];
                }
            }
            for(int a = 0;a<n;a++){
                if(arr[a]== max){
                    arr[a] = max/2;
                }
            }
            count += max;
        }
        System.out.println(count);
    }
}
