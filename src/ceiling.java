public class ceiling {
    public static void main(String[] args) {
        //int []arr = {2,5,6,8,9,14};
        //System.out.println(ceiling_no(arr,10));
        char []arr = {'c','f','j'};
        System.out.println(search2(arr,'r'));
    }
    static int search(int []arr,int target){
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
    static char search2(char []arr,char target){
        int start = 0;
        int end = arr.length - 1;
        int m= 0;
        while(start < end){
            m = start + ((end-start)/ 2);
            if (target == arr[m]) {
                return arr[m];
            }
            else if (target > arr[m]) {
                start = m + 1;
            }
            else if (target < arr[m]) {
                end = m - 1;
            }
        }
        if(target > start){
            return arr[0];
        }
        return arr[start];
    }
    static int ceiling_no(int []arr,int target) {
        if (search(arr, target) == -1) {
            while (true) {
                int k = search(arr, target++);
                if(k != -1) {
                    return arr[k];
                }
            }
        }
        return arr[search(arr,target)];
    }
}
