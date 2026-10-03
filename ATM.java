import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int balance,withdrawamount,pin,enterpin,accoundstatus,dailylimtused;

        System.out.print("Enter The Balance: ");
        balance=sc.nextInt();

        System.out.print("Enter The Withdraw Amound: ");
        withdrawamount=sc.nextInt();

        System.out.print("Enter The Pin: ");
        pin=sc.nextInt();

        System.out.print("Enter The Enter Pin: ");
        enterpin=sc.nextInt();

        System.out.print("Enter The Accound Status: ");
        accoundstatus=sc.nextInt();

        System.out.print("Enter The Daily Limit Usage: ");
        dailylimtused=sc.nextInt();

        if(accoundstatus==1){
            if(pin==enterpin){
                if(withdrawamount>0){
                    if(dailylimtused+withdrawamount<=50000){
                        if(withdrawamount<=balance){
                            if(withdrawamount>=10000){
                                if(balance-withdrawamount>=10000){
                                System.out.println("Large Transaction Approved");
                                }
                                else{
                                    System.out.println("Transaction Approved");
                                }
                            }
                            else{
                                 System.out.println("Transaction Approved");
                            }
                        }
                        else{
                            System.out.println("Insufficient Balance");
                        }
                    }
                    else{
                        System.out.println("Daily Limit Exceeded");
                    }
                }
                else{
                    System.out.println("Invalid Amound");
                }
            }
            else{
                System.out.println("Invalid Pin");
            }
        }
        else{
            System.out.println("Accound Block");
        }

        sc.close();

    }
}