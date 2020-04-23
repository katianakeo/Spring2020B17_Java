package day13_StringClass;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "Cybertek";
        //            01234567
        char ch1 = str.charAt(5);
        System.out.println(ch1== 'A');
        // false
        System.out.println(ch1=='t');
        // true

       int total = str.length();
        System.out.println(total);

        String str2 = "Total is great day";
        int indexNum = str2.length() - 1;
        // returns you total number of characters
        System.out.println(indexNum);
        // 17 is maximum number, total characters is 18

        String s1 = "Cybertek";
       s1 =  s1.concat("School"); // Cybertek School
        System.out.println(s1);

        String s2 = "Java";
        s2 = s2.concat(" is a programming language");
        System.out.println(s2);


        String s3 = "Cybertek";
        System.out.println(s3.concat(" is a great school"));
        System.out.println(s3);

        String name = "Cybertek";
          name = name.toLowerCase();
        System.out.println(name);

        String name2 = "cybertek school";
        name2 = name2.toUpperCase();
        System.out.println(name2);

        String A1 = "            today is good day   ";
        A1 = A1.trim();
        System.out.println(A1);
    }
}
