package day06_Shorthnd_LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean result1 = true;
        System.out.println(!result1); // false
        // ! = opposite

        boolean result2 = ! (10+15>15); // !(25>15) // 25 is greater than 15 but the ! in the front makes it false
        System.out.println(result2);

        boolean result3 = !true == !false;
                        // false == true ==> false
        System.out.println(result3);

        boolean R1 = "Corona Virus" != "end of the world" && "Toilet paper" == "cure";
                    // true                               && false ==> false

        boolean R2 = 10 > 15 && 15<13;
                    // false && false ==> false
        System.out.println(R1);
        System.out.println(R2);

        boolean R3 = 'a'=='b'-1 && 'b'+1 == 'c';
                  // 97 == 98 && 98+1 = 99 ==> true
        System.out.println(R3);

        boolean R4 = true != false || false == !true;
                  // true  || true ==> true
        boolean R5 = true != false && !false == !true;
                 // true && false ==> false
        System.out.println(R5);

        boolean r6 = !!!false;
                  // !false = true ==> !!true => !false => true
        System.out.println(r6);

        long a = 30l;
        System.out.println(a);
        long b = (short)a;
        System.out.println(b);
        long c = 90l;
        System.out.println(c);






    }
}
