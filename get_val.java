import java.util.Scanner;

public class get_val {

    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE A:");
        int a=sc.nextInt();

        System.out.print("ENTER THE B:");
        int b=sc.nextInt();

        int c=a+b;

        System.out.println("The a and b is add: "+c);

        sc.close();
    }
    
}
