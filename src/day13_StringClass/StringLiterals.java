package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        // String literal
        String str = "Cat"; // String pool

        String str2 = new String("Cat"); // Java heap

        System.out.println(str +" : "+str2);
        System.out.println(str==str2);

        //String literal
        String str3 = "Cat"; // String pool

        System.out.println(str==str3);

        String str4 = new String("Cat");
        System.out.println(str2==str4);
        // false because they're both Independent

        String s1 = "Java"; // String pool, immutable
        s1 = "JavaScript"; // new object will be created in memory

        String s2 = "Java"; // no new object will be created in memory
        System.out.println(s1==s2);
             // javacript == java


    }
}
