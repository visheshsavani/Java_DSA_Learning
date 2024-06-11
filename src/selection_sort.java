import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int []arr = {1,4,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int last =  arr.length - i -1;
            int maxIndex = max(arr,0,last);
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }
    static int max(int []arr,int start ,int end){
        int max= start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
