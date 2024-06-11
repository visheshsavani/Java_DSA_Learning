import java.util.Arrays;

public class leetcode_problem {
    public static void main(String[] args) {
        int []arr= {1,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(missing_val(arr)));
    }
   /* static void sort(int []arr){
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
    */
    static void sort(int []arr){
        int i =0;
        while(i<arr.length){
            int correct = i - 1;
            if(arr[i] != correct && arr[i]<arr.length){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct]= temp;
            }
            else{
                i++;
            }
        }
    }
    static int[] missing_val(int[]arr){
        int []a= new int[10];
        for (int i = 0; i < arr.length; i++) {
            int correct = i +1;
            if(arr[i]!=correct){
                a[i] = correct;
            }
        }
        return a;
    }
}
