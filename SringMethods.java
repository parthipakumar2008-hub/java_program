public class SringMethods {
    
    public static void main(String[] args){

        String name="parthipakumar s";
        int length =name.length();
        char letter=name.charAt(5);
        int index=name.indexOf("i");
        int lastindex=name.lastIndexOf("i");
        String upper=name.toUpperCase();
        String lower=name.toLowerCase();
        name=name.trim();

        name=name.replace("p", "b");
        System.out.println("Name:"+name+" Length: "+length);
        System.out.println("Name:"+name+" Char: "+letter);
        System.out.println("Name:"+name+" Index: "+index);
        System.out.println("Name "+name+"  Last Index: "+lastindex);
        System.out.println("Name "+name+"  Upper Case: "+upper);
        System.out.println("Name "+name+"  Lower Case: "+lower);
        System.out.println("Name "+name+"  Trim: "+name);
        System.out.println("Name "+name+"  Replace: "+name);

        String name2="";
        String  pass="parthi8";
         
        if(name2.isEmpty()){
            System.out.println("The String Is Empty");
        }
        else{
            System.out.println("The String Is Available:"+name2);
        }

        if(name2.contains(" ")){
            System.out.println("Your Name Contain A Space");
        }
        else{
            System.out.println("Your Name Does'N Conatain A Space");
        }
        
        if(pass.equals("parthi8")){
            System.out.println("The Pass Is Equal");
        }
        else{
            System.out.println("The Pass Is Not Equal");
        }

        if(pass.equalsIgnoreCase("PArthi8")){
            System.out.println("The Pass Is Equal ");
        }
        else{
            System.out.println("The Pass Is Not Equal ");
        }
    }
}
