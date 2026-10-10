import java.util.Scanner;
public class TernaryOperator {
 
    public  static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        // Using Ternary Opertaor

        System.out.print("Enter The Number:");
        int Number=sc.nextInt();

        String  OddEven = (Number%2==0) ? "EVEN" : "ODD";
        System.out.println(OddEven);

        sc.close();
    }
}

