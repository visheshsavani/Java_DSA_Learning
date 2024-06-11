import java.util.*;
public class linear_search_in2d {
    public static void main(String[] args) {
        int [][]arr = {
                {2,5,3},
                {23,52,38},
                {48,15,1},
        };
        int []arr1= search(arr,5);
        System.out.println(Arrays.toString(arr1));
    }
    static int [] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
