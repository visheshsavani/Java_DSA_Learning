import java.util.Scanner;
class primeno {
    private int[] arr = new int[4];

    public void getArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void getPrime(){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) System.out.printf("%d is a prime number in a array\n", arr[i]);
            else {
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) break;
                    else if(j==(arr[i]-1))System.out.printf("%d is a prime number in a array\n", arr[i]);
                }
            }
        }
    }
}
public class prime_encapsulate {
    public static void main(String[] args) {
        int[]arr1 = new int[4];
        Scanner data =new Scanner(System.in);
        primeno obj1 = new primeno();
        for(int i=0;i<arr1.length;i++){
            System.out.println("Enter the value of "+i+" element of an array");
            arr1[i]= data.nextInt();
        }
        obj1.setArr(arr1);
        obj1.getPrime();
    }
}
