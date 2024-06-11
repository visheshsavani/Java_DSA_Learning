package com.javavishesh;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    public void write(){
        System.out.println("Writing using foutainpen");
    }
    public void refill(){
        System.out.println("Refill the pen");
    }
     public void changenib(){
         System.out.println("Changing the nib of pen");
     }
}
interface basicanimals{
    void sleep();
    void eat();
}
class monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Bites..");
    }
}
class human extends monkey implements basicanimals{
    @Override
    public void sleep() {
        System.out.println("Human is sleeping..");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }
    public void jump(){
        System.out.println("Human is jumping");
    }

}
 abstract class telephone{
    abstract void lift();
    abstract void disconnect();
    abstract void ring();
}
class smarttelephone extends telephone{
    public void lift(){
        System.out.println("Lifting a smarttelephone");
    }
   public void disconnect(){
        System.out.println("Disconnecting a smarttelephone");
    }
    public void ring(){
        System.out.println("Ringing a smarttelephone");
    }
}
interface smarttvremote{
    void turnonremote();
    void turnoffremote();
}
interface tvremote extends smarttvremote{
    void increasevolume();
    void decreasevolume();
}
class tv implements tvremote{
    @Override
    public void turnonremote() {
        System.out.println("Turning on the tv using remote");
    }
    public void decreasevolume(){
        System.out.println("Decreasing the volume of tv using remote");
    }

    @Override
    public void increasevolume() {
        System.out.println("Increasing the volume of tv using remote");
    }

    @Override
    public void turnoffremote() {
        System.out.println("Turning off the tv using remote");
    }
}

public class practise_set_interface {
    public static void main(String[] args) {
    tv lg = new tv();
    lg.decreasevolume();
    lg.turnonremote();
    lg.increasevolume();
    lg.turnoffremote();
    }
}
