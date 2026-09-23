import  java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args){
        double a;
        double b;
        double c;

        // Hypotence c=root(a squre + b square)

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The A:");
        a=sc.nextDouble();

        System.out.print("Enter The B:");
        b=sc.nextDouble();

        c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));

        System.out.println("The Hypotence In C: "+c);

        sc.close();


    }
}
