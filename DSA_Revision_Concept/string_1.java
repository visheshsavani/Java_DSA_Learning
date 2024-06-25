import java.util.*;
public class string_1{
    public static void main(String args[]){
        /* The below code show to take a sentence as input and how to concatenate*/
        Scanner sc = new Scanner(System.in);
        //String s5 = sc.nextLine();
        String s1 = "vishesh";
        String s2 = "savani";
        String s3 = s1+" "+s2;
        System.out.println(s3);
        /*Using charAt we can traverse the string character by character*/
        for(int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i)+" ");
        }
        System.out.println();
        /*Using compareTo we can compare the string1 character to string 2 character*/
        if(s1.compareTo(s2)==0){
            System.out.println("The strings are equal");
        }
        else{
            System.out.println("The strings are not equal and the value of compareTo function is "+s1.compareTo(s2));
        }
        /*Using .substring function we can get the substring of the given string*/
        String s = s1.substring(0,4);
        System.out.println(s);
    }
}