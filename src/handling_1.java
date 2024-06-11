import java.util.*;
class MonthError extends Exception{
    @Override
    public String getMessage() {
        return "Invalid month, Try Again!";
    }
}
class DayError extends Exception{
    public String getMessage() {
        return "Invalid Date, Try Again!";
    }

    @Override
    public String toString() {
        return "Invalid day for the corresponding month, Try Again!";
    }
}
public class handling_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month;
        String day;
        System.out.printf("Enter Date in month/day numeric notation\n");
        System.out.print(month= sc.next());
        System.out.print("/");
        System.out.println(day=sc.next());
        int a=Integer.parseInt(month);
        int b=Integer.parseInt(day);
        if (a<1 || a>12){
            try {
                throw new MonthError();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        else {
            switch (a) {
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                case 12:
                    month = "December";
                    break;
            }
        }
           if(b>31){
               try {
                   throw new DayError();
               }
               catch(Exception f){
                   System.out.println(f.getMessage());
               }
           }
           if(a==4 || a==6||a==8 ||a==10 ||a==12) {
               if (b>30){
                   try {
                       throw new DayError();
                   }
                   catch(Exception k){
                       System.out.println(k.getMessage());
                   }
               }
               else{
                   System.out.println("That is the same as");
                   System.out.println(month+" "+day);
               }
           }
            if(a==2) {
                if (b>29){
                    try {
                        throw new DayError();
                    }
                    catch(Exception j){
                        System.out.println(j);
                    }
                }

                else{
                    System.out.println("That is the same as");
                    System.out.println(month+" "+day);
                }
            }
    }
}
