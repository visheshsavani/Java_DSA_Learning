public class check_boolean {
    public static void main(String[] args) {
        int num=1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
