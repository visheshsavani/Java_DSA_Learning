public class binary_search {
    public static void main(String[] args) {
        int []arr = {2,6,7,89,99};
        System.out.println(search(arr,7));
    }
    static int search(int []arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int m= 0;
        while(start <= end){
            m = start + ((end-start)/ 2);
        if (target == arr[m]) {
            return m;
        }
        else if (target > arr[m]) {
            start = m + 1;
        }
        else if (target < arr[m]) {
            end = m - 1;
        }
    }
     return -1;
    }
}
