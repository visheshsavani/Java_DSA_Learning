public class maxinarray {
    public static void main(String[] args) {
        int [] arr = {2,6,3,889,4,90};
        System.out.println("The maximum element in the array is "+ max_arr(arr));
    }
    static int max_arr(int []a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
}
