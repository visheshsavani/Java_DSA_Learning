package com.javavishesh;
class school{
   public void show(){
        System.out.println("I am method of class school");
    }
}
class division extends school {
    public void show(){
        System.out.println("I am method of class division");
    }
    public void show1(){
        System.out.println("I am second method of class division");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        /*school a= new school();
        a.show();
        division b= new division();
        b.show();*/
        school a = new division();
        a.show();
    }
}
