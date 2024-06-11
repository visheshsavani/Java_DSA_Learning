import java.util.Arrays;

public class cycle_sort {
    public static void main(String[] args) {
        int []arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr){
        for (int i = 0; i <arr.length ; i++) {
            int j = i + 1;
            while(j!=(arr[i])) {
                    int k;
                    k = arr[i] - 1;
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
            }
        }
    }
}
