import java.util.Arrays;

public class problem {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    static int[] twoSum(int[] nums, int target) {
        int k = 0;
        int[] b = new int[2];
        for (int i = 0; i < nums.length; i++) {
            k = nums[i];
            int j = i + 1;
            while (j < nums.length) {
                int a = k + nums[j];
                if (a == target) {
                    b[0] = i;
                    b[1] = j;
                }
                j++;
            }
        }
        return b;
    }
}
