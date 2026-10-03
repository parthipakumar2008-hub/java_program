import java.util.Scanner;

public class StudentAdmissionElgibilty {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int age,mark,entrancemark,income;

        System.out.print("Enter The Age: ");
        age=sc.nextInt();

        System.out.print("Enter The Mark: ");
        mark=sc.nextInt();

        System.out.print("Enter The Entrancemark: ");
        entrancemark=sc.nextInt();

        System.out.print("Enter The Income: ");
        income=sc.nextInt();


        if(age>=18){
            System.out.println("Your Are AgeIs  Elgibile");
            if(mark>=60){
                System.out.println("Your Are Mark Is Elgible");
                if(entrancemark>=50){
                    System.out.println("Admission Granted");
                    if(income<=300000){
                        System.out.println("Scholarship ANd Admission");
                    }
                    else{
                        System.out.println("Admission Only");
                    }
                }
                else{
                    System.out.println("Admission Rejected ");
                }
            }
            else{
                System.out.println("You Are Age Is Not Elgible");
            }
            
        }
        else{   
            System.out.println("You Are Age Is Not Elgible");
        }
        sc.close();

    }
}
