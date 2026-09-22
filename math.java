public class math {
    public static void main(String[] args){

         int result=Math.powExact(2, 4);
        System.out.println("The Power Number Is: "+result);  //The Power Number Is: 16


        double result2 =Math.abs(-5.0);
        System.out.println("The Abosulte Number is: "+result2); //The Abosulte Number is: 5.0


        double result3=Math.sqrt(9);
        System.out.println("The Square Number Is: "+result3); //The Square Number Is: 3.0


        double result4=Math.round(9.4567);
        System.out.println("The Round Number Is: "+result4); //The Round Number Is: 9.0


        double result5=Math.ceil(4.56);
        System.out.println("The Ceil Number is: "+result5); //The Ceil Number is: 5.0


        double result6=Math.floor(5.35);
        System.out.println("The Floor Number Is: "+result6); //The Floor Number Is: 5.0


        int result7=Math.max(50,21);
        System.out.println("The Maximum Number Is: "+result7); //The Maximum Number Is: 50


        int result8=Math.min(50,21);
        System.out.println("The Minimum Number Is: "+result8); //The Minimum Number Is: 21
    }
}