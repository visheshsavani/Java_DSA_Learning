import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int []arr = {5,5,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr){
        int j;
        for (int i = 0; i < arr.length -1; i++) {
            j = i+1;
            while(j>0){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }
                else {
                    break;
                }
            }
        }
    }
}
