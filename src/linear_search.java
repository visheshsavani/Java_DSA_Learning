public class linear_search {
    public static void main(String[] args) {
     int []arr1 = {2,34,5,79,-2,76};
     int a = 7;
        System.out.println("The "+a+" is present at index "+search(arr1,a,1,4));
    }
    static int search(int []arr,int target,int start , int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
