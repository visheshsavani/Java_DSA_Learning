package com.javavishesh;
class rectangle{
public double length;
public double breadth;
public double area(){
    return this.length * this.breadth;
}
}
class cuboid extends rectangle {
    public double height;

    public double totalsurfacearea() {
        return this.length * this.breadth * 2 + this.length * 2 * this.height + this.breadth * 2 * this.height;
    }

    public double volume() {
        return this.length * this.breadth * this.height;
    }
}

    public class chap10_practiseset {
        public static void main(String[] args) {
            rectangle obj1 = new rectangle();
            obj1.length = 69.89;
            obj1.breadth = 3.0;
            System.out.printf("%.2f\n",obj1.area());
            cuboid obj2 = new cuboid();
            obj2.length = 5.0;
            obj2.breadth = 3.0;
            obj2.height = 2.0;
            System.out.println(obj2.totalsurfacearea());
            System.out.println(obj2.volume());
        }
    }

