import java.util.*;
class sort{
    private int [][]a = new int [7][3];

    int max = a[0][0];
    int min;
    public sort(int a){
        min =a;
    }

    public void set(int [][]b){
        a=b;
    }
    public void maxvalue(){
        for(int i=0;i<7;i++){
            for(int j=0;j<3;j++){
                max = Math.max(max,a[i][j]);
            }
        }
        for(int i=0;i<7;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]==max)System.out.printf("The highest temperature recorded is %d in city %d and on %d day \n",max,j+1,i+1);
            }
        }
    }
    public void minvalue(){
       System.out.println();
        for(int i=0;i<7;i++){
            for(int j=0;j<3;j++){
                min = Math.min(min,a[i][j]);
                //System.out.println(min);
            }
        }
        //System.out.println(min);
        for(int i=0;i<7;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]==min)System.out.printf("The lowest temperature recorded is %d in city %d and on %d day \n",min,j+1,i+1);
            }
        }
    }


}
public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]temperature = new int[7][3];
        for(int i=0;i<7;i++){
            for(int j=0;j<3;j++){
                System.out.printf("Enter the temperature for city %d on %d day\n",j+1,i+1);
                temperature[i][j]=sc.nextInt();
            }
        }
        sort obj = new sort(temperature[0][0]);
        obj.set(temperature);
        obj.maxvalue();
        obj.minvalue();
    }
}
