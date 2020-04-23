package day05_Unary_ShorthandOperators;

public class PostPre_Practice {
    public static void main(String[] args) {
        int a = 50;
        a = --a + a++ + a-- + a++;
        // 49 + 49 + 50 + 49
        System.out.println(a);

        int a1 = 50;
        a = --a + a++ + a-- + a++;
        //  49 + 49 + 50 + 49 = 197

        System.out.println(a);  // 197
        System.out.println(++a); //198
        System.out.println(a); // 199


        int a2 = 1;
        a = -a-- + a++ / -a-- * --a;
        // a = -a-- = -1
        // now 0
        // + a++ = 0 (after will be 1 since it's post)
        // -1 + 0 / -1 * -1
        // -1 + 0 * -1
        // -1





    }
}
