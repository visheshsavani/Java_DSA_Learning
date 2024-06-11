public class binary_search_recursion {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binary_search(arr,0,0,(arr.length-1)));
    }
    static boolean binary_search(int []arr,int target,int start,int end){
        if(start > end) return false;
        int mid = start + ((end - start)/2);
        if(target == arr[mid]){
            return true;
        } else if (target < arr[mid]) {
            end = mid -1;
        }else{
            start = mid +1;
        }
        return binary_search(arr,target,start,end);
    }
}
