package com.javavishesh;
class use_thread implements Runnable{
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("My name is vishesh");
        }
    }
}
class use_thread1 implements Runnable{
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("My name is jinal");
        }
    }
}
class use_thread2 implements Runnable{
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("My name is bhimji");
        }
    }
}
public class threadpractise {
    public static void main(String[] args) {
use_thread a = new use_thread();
Thread a1 = new Thread(a);
        use_thread1 b = new use_thread1();
        Thread b1 = new Thread(b);
        use_thread2 c = new use_thread2();
        Thread c1 = new Thread(c);
        a1.start();
        b1.start();
        c1.start();
    }
}
