public class peak_mountain {
    public static void main(String[] args) {
        int []arr = {0,14,2,9,8};
        System.out.println(check(arr));
    }
    static int check(int []arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + ((end - start) / 2);
        while (mid != end) {
            if (arr[mid + 1] > arr[mid]) {
                mid = mid + 1;
            }
            else return 1;
        }
        return -1;
    }
}
