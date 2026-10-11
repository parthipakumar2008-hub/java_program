import java.util.Scanner;
public class TemperatureConverter {
    
    public static void main(String[] args){

        double temp;
        double newtemp;
        String unit;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Temperature:");
        temp=sc.nextDouble();

        System.out.print("Covert To Celsius To Fahreenheits? (C or F)");
        unit=sc.next().toUpperCase();

        //Using Ternary Operator
        newtemp=(unit.equals("C")) ? (temp-32)*5/9 : (temp*5/9)+32;

        System.out.printf("%.1f%s",newtemp,unit);

        sc.close();

    }
}
