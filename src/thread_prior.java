import java.util.*;
class thread1 extends Thread{

    public thread1(String name){
        super(name);
    }
    int i=0;

    public void run() {
        while(i<50) {
            System.out.println("Hi My name is " + getName());
            i++;
        }
        }
}
public class thread_prior {
    public static void main(String[] args) {
        thread1 t1 = new thread1("vishesh");
        thread1 t2 = new thread1("rohan");
        thread1 t3 = new thread1("aviraj");
        thread1 t4 = new thread1("satyam");
        thread1 t5 = new thread1("tabish");
        t1.setPriority(Thread.MAX_PRIORITY);
        //t4.setPriority(Thread.NORM_PRIORITY);
        //t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
