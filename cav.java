import java.util.Scanner;

public class cav {
    public static void main(String[] args){

        double radius;
        double circumference;
        double area;
        double volume;
 
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The Radius: ");
        radius=sc.nextDouble();

        //Circumference=2*pi*radius

        circumference=2*Math.PI*radius;

        // Area= pi*pow2

        area=Math.PI*Math.pow(radius, 2);

        //Volume=4/3*pi*pow3

        volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);

        System.out.println("The Circumference is :"+circumference+"cm");
        System.out.println("The Area is: "+area+"cm");
        System.out.println("The Voulume is: "+volume+"cm");

        sc.close();;
    }
    
        
    }

