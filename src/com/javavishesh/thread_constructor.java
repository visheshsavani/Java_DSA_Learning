package com.javavishesh;
class mythrd extends Thread implements Runnable{
    public mythrd(Runnable r, String name){
super(name);
super.run();
    }

    //@Override

}
class mythrd1 implements Runnable{
    @Override
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("My name is vishesh");
        }
    }
}
public class thread_constructor {
    public static void main(String[] args) {
        mythrd1 t = new mythrd1();
        Thread t1 = new Thread(t);
        mythrd a = new mythrd(t1,"jinal");
        t1.start();
        System.out.println(a.getName());
    }
}