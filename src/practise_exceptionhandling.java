public class practise_exceptionhandling {
    public static void addnum(int a) throws IllegalArgumentException{
        if (a==9) throw new IllegalArgumentException();
    }
    public static void main(String[] args) {
        int a=9;
        int b=0;
                try {
            int c =a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }
        try {
            addnum(a);
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }
    }
}
