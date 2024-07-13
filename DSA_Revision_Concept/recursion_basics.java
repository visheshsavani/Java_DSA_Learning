import java.util.*;

public class recursion_basics{
    public static void main(String []args){
        int []arr = {1,2,3};
        sum_triangle(arr);
    }

    //sum of triangle question
    static void sum_triangle(int []arr){
        if(arr.length < 1 ){
            return;
        }

        int []temp = new int[arr.length -1];
        for(int i =0;i<(arr.length-1);i++){
            temp[i] = arr[i] + arr[i+1];
        }

        sum_triangle(temp);
        System.out.println(Arrays.toString(arr));

    }
}