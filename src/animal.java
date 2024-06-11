import java.util.*;
class Mammal{
    int No_of_legs;
    String category;
}
class Dog extends Mammal{
    String Name;
    int age;
    String breed;
    public int calculateLifeExpectancy(int lifeexpectancy){
        return lifeexpectancy;
    }
    public void popularBreed(String c){
        breed=c;
        System.out.println("The popular breed is "+breed);
    }
}
class Labrador extends Dog{
    String Colour;
    int Weight;
    int avgweight=32;
    int lifeexpectancy1=12;
    public String speak(){
        return "WOOF";
    }
    public int calculateAvgWeight(){
        return avgweight;
    }
}
class German_Shepherd extends Dog{
    int Height;
    int Lifespan;
    int avgheight=25;
    int lifeexpectancy2=11;
    public String speak(){
        return "GRUNT";
    }
    public int calculateAvgHeight(){
        return avgheight;
    }
}
public class animal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rounds to decide the popular breed");
        int a = sc.nextInt();
        int b;
        int forlabrador=0;
        int forgerman=0;
        for(int i=0;i<a;i++){
            System.out.println("Choose from below");
            System.out.println("Enter 1. Labrador Dog");
            System.out.println("Enter 2. German Shepherd Dog");
            b=sc.nextInt();
            if(b==1) forlabrador+=1;
            else  forgerman+=1;
        }
        String c;
        if(forlabrador>forgerman) c="Labrador Dog";
        else if (forlabrador<forgerman) c="German Shepherd Dog";
        else c="Both are equally popular";
        Dog obj2 = new Dog();
        obj2.popularBreed(c);
        Labrador obj = new Labrador();
        System.out.print("Labrador Dog has a bark sound of ");
        System.out.println(obj.speak());
        System.out.print("Labrador Dog has average weight of ");
        System.out.println(obj.calculateAvgWeight());
        German_Shepherd obj1 = new German_Shepherd();
        System.out.print("German Shepherd Dog has a bark sound of ");
        System.out.println(obj1.speak());
        System.out.print("German Shepherd Dog has average height of ");
        System.out.println(obj1.calculateAvgHeight());
        System.out.print("Labrador Dog has a life expectancy of ");
        System.out.println(obj2.calculateLifeExpectancy(obj.lifeexpectancy1));
        System.out.print("German Shepherd Dog has a life expectancy of ");
        System.out.println(obj2.calculateLifeExpectancy(obj1.lifeexpectancy2));
    }
}

