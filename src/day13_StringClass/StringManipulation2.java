package day13_StringClass;

public class StringManipulation2 {
    public static void main(String[] args) {
        String str = "Cybertek School is the best";
        String schoolName = str.substring(0,8);
        // starting number index num, and end index num
        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";
        //                 0123456789...
        String first = fullName.substring(0,6);
        String last = fullName.substring(7,12);
        System.out.println(fullName);

        String name = "Katiana Keopradit";

        String first1 = name.substring(0,7);
        String last1 = name.substring(8,15+1);
        System.out.println(name);

        String email = first1+"."+last1+"@yahoo.com";

        String email1 = last1.concat(".").concat(first1);

        System.out.println(email1);
        System.out.println(email);


        String s1 = "I love Java Programming Language";
        String className = s1.substring(7);
        System.out.println(className);

        String s2 = "I like C# programming";
         s2 = s2.replace("C#", "Java");
        System.out.println(s2);

        String virus = "Covid 18";
        name = name.replace("18", "19");
        System.out.println(name);

        String r1 = "I like c# because c# is fun";
        r1 = r1.replaceFirst("c#", "Java");
        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow", "Today");





    }
}
