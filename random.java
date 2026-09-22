import java.util.Random;

public class random {
    public static void main(String[] args){

        Random random=new Random(); // Object Create

        int number=random.nextInt(1,10);

        double number_float=random.nextDouble();

        boolean ht=random.nextBoolean();

        if(ht){
            System.out.println("Head");
        }
        else{
            System.out.println("Tail");
        }

        System.out.println("The Random Number In 1 To 10: "+number);
        System.out.println("The Random Number IN Float: "+number_float);

        

    }
}
