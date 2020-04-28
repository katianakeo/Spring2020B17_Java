package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {
        String str = "123";
       int a = Integer.parseInt(str); // coverts string to primitive
        System.out.println(str + 1); //string
        System.out.println(a + 1);  // number

        byte b1 = Byte.parseByte(str); // byte 123
        System.out.println(b1);
         Integer I1 = (int) Byte.parseByte(str);


       String str2 = "10.5";
       Float f1 = Float.parseFloat(str2);
        System.out.println(f1);



      String str3 = "4798347";
      double num1 = Double.parseDouble(str3);
        System.out.println(num1);

      String result1 = "true";
      boolean b2 = Boolean.parseBoolean(result1);
        System.out.println(b2);

      String result2 = "falSE";
      boolean r2 = Boolean.parseBoolean(result2);  // not case sensitive
        System.out.println(r2);

    }

}
