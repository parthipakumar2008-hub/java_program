import java.util.Scanner;;
public class BankLoanEligibility {
    public static void main(String[] args){
        int age,salary_check,credit_score_check,experience_check,Loan;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The Age: ");
        age=sc.nextInt();

        System.out.print("Enter The Salary: ");
        salary_check=sc.nextInt();

        System.out.print("Enter The Credit Score: ");
        credit_score_check=sc.nextInt();

        System.out.print("Enter The Experience: ");
        experience_check=sc.nextInt();

        System.out.print("Enter The Existing Loan: ");
        Loan=sc.nextInt();

        if(age>=21){
            if(salary_check>=25000){
                if(credit_score_check>=700){
                    if (experience_check>=2){
                        if(Loan>0){
                            System.out.println("Loan Approved With Condition");
                        }
                        else{
                            System.out.println("Loan Approved");
                        }

                    }
                    else{
                        System.out.println("Experience Is Low");
                    }
                }
                else{
                    System.out.println("Credit Score Too Low");
                }
            }
            else{
                System.out.println("Salary Not Elgibile");
            }
        }
        else{
            System.out.println("Age Not Elgible");
        }











        sc.close();
    }
}
