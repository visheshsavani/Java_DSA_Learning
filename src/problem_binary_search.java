import java.util.Arrays;

public class problem_binary_search {
    public static void main(String[] args) {
        int []arr = {5,7,7,7,8,10};
        int []k = search(arr,6);
        System.out.println(Arrays.toString(k));
    }
    static int [] search(int []arr, int target) {
        int []result = {0,0};
        int start = 0;
        int end = arr.length - 1;
        int m= 0;
        while(start <= end){
            m = start + ((end-start)/ 2);
            if (target == arr[m]) {
                while (true) {
                    m--;
                    if (arr[m] != target) {
                        result[0] = m+1;
                        break;
                    }
                }
                while (true) {
                    m++;
                    if (arr[m] != target) {
                        result[1] = m-1;
                        break;
                    }
                }
                return result;
            }
            else if (target > arr[m]) {
                start = m + 1;
            }
            else if (target < arr[m]) {
                end = m - 1;
            }
        }
        result[0] = -1;
        result[1] = -1;
        return result;
    }
}

