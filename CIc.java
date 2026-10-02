import java.util.Scanner;

public class CIc {

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        //principle ,rate , timecompunt , years ,amount

        System.out.print("Enter The Principle: ");
        double principle=sc.nextDouble();

        System.out.print("Enter The Rate: ");
        double rate=sc.nextDouble()/100;

        System.out.print("Enter The Timecomponut: ");
        int timecompunt=sc.nextInt();

        System.out.print("Enter The Years:");
        int years=sc.nextInt();

        double amount=principle*Math.pow(1+rate/timecompunt, timecompunt*years);

        System.out.printf("The Amount After %d is %.2f",years,amount);

        

        sc.close();
    }
    
}
