import java.util.Scanner;
class SubString{

    public static void main(String[] args){

        String email ="parthipakumar2008@gmail.com";
        String name=email.substring(0,17);
        String domain=email.substring(18,27);

        System.out.println("Name: "+name);
        System.out.println("Domain: "+domain);

                //   Or

        String names=email.substring(0,email.indexOf("@"));
        String domains=email.substring(email.indexOf("@")+1);

        System.out.println("Names: "+names);
        System.out.println("Domains: "+domains);

               //  or

        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter The User Email: ");
        String useremail=sc.nextLine();
        if(useremail.contains("@")){  // Check Pannu Eruka Ellayanu
            String username=useremail.substring(0,useremail.indexOf("@"));
            String userdomain=useremail.substring(useremail.indexOf("@")+1);

            System.out.println("Useremail: "+useremail);
            System.out.println("Username: "+username);
            System.out.println("Userdomain:"+userdomain);
        }
        else{
            System.out.println("Email Is In Vaild");
        }

        
    }
}
              