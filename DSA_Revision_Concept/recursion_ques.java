import java.util.*;
public class recursion_ques{
    public static void main(String []args){
        // print(5);
        // print_pattern(5);
        // System.out.println(sum_natural_num(5));
        // System.out.println(sum_digits(1342));
        // System.out.println(count_zero(100000,0));
        ArrayList<Integer> list = new ArrayList<>();
        int []arr = {1,66,4,3,11,4};
        // System.out.println(sort(arr,0));
        // System.out.println(linear_search2(arr,4,0,list));

        System.out.println(linear_search3(arr,4,0));


    }
    // How to print number in a reverse way
    static void print(int n){
        if(n == 0){
            return; 
        }
        print(n-1);
        System.out.println(n);
    }
    // how to print pattern
    static void print_pattern(int n){
        if(n == 0){
            return; 
        }
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
        print_pattern(n-1);
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
    }

    // how to calculate factorail of any number
    static int factorial(int n){
        if(n < 2){
            return 1;
        }

        return n * factorial(n-1);
    }

    // how to print sum of n natural numbers
    static int sum_natural_num(int n){
        if(n <2){
            return n;
        }

        return n + sum_natural_num(n-1);
    }

    // how to print sum of digits
    static int sum_digits(int n){
        if(n == 0){
            return 0;
        }
        int first_digit = n%10;
        return first_digit + sum_digits(n/10);
    }

    // how to print total no of zeroes in a given number
    static int count_zero(int num,int count){
        if(num == 0){
            return count;
        }
        if((num%10) == 0){
            return count_zero((num/10),count+1);
        }
        else{
             return count_zero((num/10),count);
        }
    }

    // how to check whether the array is sorted or not

    static boolean sort(int []arr,int index){
        if(index == (arr.length-1)) return true;

        return (arr[index] <= arr[index+1]) && sort(arr,index + 1);
    }

    // how to perform linear search using recursion

    static int linear_search(int []arr,int target,int index){
        if(index == arr.length) return -1;

        if(arr[index] == target) return index;
        else{
            return linear_search(arr,target,index+1);
        }
    }

//how to return muliple indexes of target through array list
     static ArrayList<Integer> linear_search2(int []arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return linear_search2(arr,target,index+1,list);
    }

    //how to return muliple indexes of target through array list without parameter of arraylist
     static ArrayList<Integer> linear_search3(int []arr,int target,int index){
       ArrayList<Integer> list = new ArrayList<>(); 
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansfrombelow = linear_search3(arr,target,index+1);
        list.addAll(ansfrombelow);
        return list;
    }
}