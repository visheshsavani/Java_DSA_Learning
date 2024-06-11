import java.util.*;
class Employee{
    private String name;
    private String id;
    private int age;
    public Employee(String a,String b,int c){
        name =a;
        id=b;
        age=c;
    }
    public void setName(String a){
        name=a;
    }
    public void setId(String b){
        id=b;
    }
    public void setAge(int c){
        age=c;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
}
class SalariedEmployee extends Employee{
    private double empSalary;
    public SalariedEmployee(String a,String b,int c,double d){
        super(a,b,c);
    }
    public void setEmpsalary(double a){
        empSalary=a;
    }
    public double getEmpsalary(){
        return empSalary;
    }
}
public class Tester{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SalariedEmployee []obj = new SalariedEmployee[6];
        for(int i=0;i<5;i++){
            System.out.println("Choose from the following");
            System.out.println("1. Permanent Employee");
            System.out.println("2. Contract Employee");
            int a=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Emloyee name");
            String b=sc.nextLine();
            System.out.println("Enter the Emloyee age");
            int d= sc.nextInt();
            System.out.println("Enter the Emloyee salary");
            double e=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the Emloyee id");
            String c=sc.nextLine();
            if(a==1){
                obj[i] = new SalariedEmployee(b,c,d,e);
                obj[i].setEmpsalary(e + 2000);
            }
            else{
                obj[i] = new SalariedEmployee(b,c,d,e);
                obj[i].setEmpsalary(e);
            }
        }
        obj[5] = new SalariedEmployee(obj[0].getName(),obj[0].getId(),obj[0].getAge(),obj[0].getEmpsalary());
        obj[5].setEmpsalary(obj[0].getEmpsalary());
        for(int i=0;i<5;i++){
            obj[5].setEmpsalary(Math.max(obj[5].getEmpsalary(),obj[i].getEmpsalary()));
        }
        System.out.println("The employee which has a highest salary is as follows");
        for (int i=0;i<5;i++){
            if(obj[5].getEmpsalary()==obj[i].getEmpsalary()){
                System.out.println("Name of the employeee is "+obj[i].getName());
                System.out.println("Id of the employeee is "+obj[i].getId());
                System.out.println("Age of the employeee is "+obj[i].getAge());
                System.out.println("Salary of the employeee is "+obj[i].getEmpsalary());

            }
        }
    }
}

