import java.util.Scanner;

public class stude_mark {

    public static void  main(String[] args){

        Scanner sc=new Scanner(System.in);
         

        System.out.print("Enter The Name: ");
        String name=sc.nextLine();

        System.out.print("Enter The Age: ");
        int age=sc.nextInt();

        System.out.print("Are You A Student(True/False) ");
        boolean student=sc.nextBoolean();

        sc.close();

        //Case 1

        if (name.isEmpty()){
            System.out.println("You  Didn't Enter Your Name");
        }
        else{
            System.out.println("Hello"+" "+name);
        }

        //Case 2

        if(age>=65){
            System.out.println("You Are A Senior");
        }
        else if(age >=18){
            System.out.println("You Are An Adult");
        }
        else if(age <0){
            System.out.println("You Haven't Been  Born Yet");
        }
        else if(age==0){
            System.out.println("You Are Baby");
        }
        else{
            System.out.println("You Are A Child");
        }

        // Group 3

        if(student){
            System.out.println("You Are A Student");
        }
        else{
            System.out.println("You Are Not A Student");
        }
    }
}
