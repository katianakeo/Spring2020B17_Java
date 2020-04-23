package day13_StringClass;

public class StringManip {
    public static void main(String[] args) {
        String str = "I like to learn Java. I love to watch movies";
        int a1 = str.indexOf("J");
        System.out.println(a1);
        // returns index num of the first character

        int a3 = str.indexOf(" I")+1;
        // it counts the space so have to add 1.
        System.out.println(a3);

        String str2 = "I like Java, and I like reading";
        int i1 = str2.lastIndexOf("I");
        int i2 = str2.lastIndexOf("l");
        // the last "I" that was used.
        // the last "l" that was used
        System.out.println(i1);
        System.out.println(i2);

        String z = "I like c#, c# is cool";
        //          0123456789
        int z1 = z.indexOf("c#,")-2;
        // index num of first c
        int z2 = z.lastIndexOf("c");
        System.out.println(z2);


    }
}
