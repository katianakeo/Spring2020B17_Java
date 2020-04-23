package day14_StringClass;

public class practice {
    public static void main(String[] args) {
        String email = "katiana.keopradit@yahoo.com";
        String user = "Katiana.Keopradit@yahoo.com";
       boolean result = email.equals(user);
        System.out.println(result); // false
        boolean result2 = email.equalsIgnoreCase(user);
        System.out.println(result2); // true

        if(result2){
            System.out.println("Correct email");
        }
        else{
            System.out.println("Wrong email");
        }


        String s1 = "Cybertek School";
        boolean r1 = s1.contains("School");
        System.out.println(r1);

        // valid password must contain special character (! or _ or $)
        String password = "love123!";
        if(password.contains("$") || (password.contains("!")) || (password.contains("_"))){
            System.out.println("Password is valid");
        }
         else {
            System.out.println("Invalid");
        }


         // every website has www. in the beginning
        String web = "www.amazon.com";
         boolean r2 = (web.startsWith("www.") ) ;
         if(r2){
             System.out.println("Valid");
         }
         else{
             System.out.println("Invalid");
         }


         String email2 = "CybertekSchool@yahoo.com";
         if(email2.endsWith("@gmail.com")){
             System.out.println("Valid gmail");
         }else{
             System.out.println("Invalid gmail");
         }




    }
}
