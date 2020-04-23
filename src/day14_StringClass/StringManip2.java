package day14_StringClass;

public class StringManip2 {
    public static void main(String[] args) {
        String str = "";
        boolean bool = str.isEmpty();
        System.out.println(bool);

        if(str.isEmpty()){
            System.out.println("Please print first name");
        }

        String s1 = "Cat";
        String s2 = new String("Cat");
        System.out.println(s1==s2); // false
        System.out.println(s1.equals(s2));

        String z = "Tiger";
        String y = new String("Tiger");
        String x = "Tiger";
        System.out.println(z==y); // false. different locations
        System.out.println(y==x); // false. different location
        System.out.println(z==x); // true. both String literal

        // equals method
        System.out.println(z.equals(y)); // true
        System.out.println(z.equals(x)); // true
        // only will print out false if there String is different
        String w = "Lion";
        System.out.println(z.equals(w)); // false



    }
}
