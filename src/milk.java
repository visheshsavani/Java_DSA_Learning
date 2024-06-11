import java.util.*;
class cow{
    private String name;
    private int id;
    private long dob;
    private long dob_calv;
    private int total_milk;
    private double avg_milk;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDob() {
        return dob;
    }

    public void setDob(long dob) {
        this.dob = dob;
    }

    public long getDob_calv() {
        return dob_calv;
    }

    public void setDob_calv(long dob_calv) {
        this.dob_calv = dob_calv;
    }
    public void milk_produce(int a,int b){
        total_milk =a;
        avg_milk=a/30.0;
        System.out.println("The total milk production of this cow in a month is "+total_milk+"litre");
        System.out.println("The average milk production of this cow in a month is " + avg_milk+"litre");
        if(b==1){
            total_milk=0;
            System.out.println("The total milk production of this cow in a month is "+total_milk+"litre");
        }
    }
}
public class milk {
    public static void main(String[] args) {
int c=0;
int d;
Scanner sc = new Scanner(System.in);
for (int i=1;i<=30;i++){
    System.out.println("Enter the milk production for day "+i);
c+= sc.nextInt();
}
        System.out.println("Do you want to intialize the total milk production to 0");
        System.out.println("Press 1 for Yes");
        System.out.println("Press 0 for No");
        d= sc.nextInt();
        cow obj = new cow();
        obj.setName("Maya");
        obj.setId(100);
        obj.setDob(60499);
        obj.setDob_calv(230523);
        System.out.println("The name of the cow is "+obj.getName());
        System.out.println("The ID of the cow is "+obj.getId());
        System.out.println("The date of birth of the cow is "+obj.getDob());
        System.out.println("The date of birth of recent calf is "+obj.getDob_calv());
        obj.milk_produce(c,d);
    }
}
