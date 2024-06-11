package com.javavishesh;

import com.sun.security.jgss.GSSUtil;

interface MyCamera2 {
    void takeSnap();

    void recordVideo();

    default void greet() {
        System.out.println("Good Morning");
    }
}
    interface mywifi{
        void Onwifi();
         void offWifi();
    }
    class smartphone implements mywifi,MyCamera2{
        @Override
        public void takeSnap() {
            System.out.println("Taking a picture during video");
        }

        @Override
        public void recordVideo() {
            System.out.println("Recording a video using googel camera");
        }

        @Override
        public void Onwifi() {
            System.out.println("On the Wifi");
        }

        @Override
        public void offWifi() {
            System.out.println("Off the wifi");
        }
    }

public class polymorphism_using_interface {
    public static void main(String[] args) {
smartphone vivo = new smartphone();
vivo.Onwifi();
vivo.offWifi();
    }
}
