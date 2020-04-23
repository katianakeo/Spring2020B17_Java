package day15_ForLoop;

public class reverse {
    public static void main(String[] args) {
        /*
        write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt method
         */
        String str = "Java";
        String r1 = str.substring(1)+str.substring(0,1);
        System.out.println(r1);

        String str1 = "Hello World";
        str1.trim();
        int z = str1.indexOf("");
        System.out.println(z);


    }
}
