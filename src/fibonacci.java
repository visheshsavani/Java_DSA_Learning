public class fibonacci {
    public static void main(String[] args) {
       fibo_series(5);
    }
    static int fibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    static void fibo_series(int n){
        if(n==0){
            System.out.printf("%d ",n);
            return;}
        fibo_series(n-1);
        System.out.printf("%d ",fibonacci(n));
    }
}
