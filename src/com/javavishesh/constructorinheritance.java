package com.javavishesh;
class employee{
    private int salary;
    private int id;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int name;
    public employee(){
        salary=5000;
    }
    public employee(int x){
        salary=x;
    }
}
public class constructorinheritance{
    public static void main(String[] args) {
        employee rohan= new employee(10000);
        System.out.println(rohan.getSalary());
    }

}
