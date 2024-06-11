public class leet_code_problem2 {
    public static void main(String[] args) {
        int [][]arr = {
                {1,2,3},{3,2,1},{3,20,1},{3,2,8}
        };
        System.out.println(maximum_wealth(arr));
    }
    static int maximum_wealth(int[][] accounts){
        int wealth=0;
        int temp =0;
        for (int i = 0; i <accounts.length ; i++) {
            temp =0;
            for (int j = 0; j <accounts[i].length ; j++) {
                temp += accounts[i][j];
            }
            if(wealth < temp){
                wealth = temp;
            }
        }
        return wealth;
    }
}
