public class leet_code_problem {
    public static void main(String[] args) {
        int []num = {-12,345,2,6,7896};
        System.out.println(findNumbers(num));
    }
    static int findNumbers(int[] nums){
        int count=0;
        int a=0;
        for (int i = 0; i < nums.length; i++) {
            int b = nums[i];
            while(b > 0){
                count++;
                b = b/10;
            }
            if(count%2==0){
                a++;
            }
        }
        return a;
    }
}
