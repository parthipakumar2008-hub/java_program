import java.util.Scanner;
class EnhancesSwitches{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        
        String day;

        System.out.print("Enter The Day: ");
        day=sc.nextLine();

        // MEthod 1: 
        switch (day){
            case "Monday" -> System.out.println("It Is A Weekday");
            case "Tuesday" -> System.out.println("It Is A Weekday");
            case "Wednesday" -> System.out.println("It Is A Weekday");
            case "Thursday" -> System.out.println("It Is A Weekday");
            case "Friday" -> System.out.println("It Is A Weekday");
            case "Saturday" -> System.out.println("It Is A Weekenday");
            case "Sunday" -> System.out.println("It Is A Weekenday");
            default -> System.out.println(day+"is not a day");
        }
        
        //Method 2:

        switch (day){
            case "Monday","Tuesday","Wednesda","Thursday","Friday"->
                System.out.println("It Is A Weekday");
            case "Saturday","Sunday"->
                System.out.println("It Is A Weekendday");
            default -> System.out.println(day+"is not a day");
        }

        sc.close();
    }
}

