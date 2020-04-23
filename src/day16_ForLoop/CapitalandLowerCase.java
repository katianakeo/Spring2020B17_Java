package day16_ForLoop;

public class CapitalandLowerCase {
    public static void main(String[] args) {
        String Cap = ""; // A-Z
        String Low = ""; // a-z

        for(char ch = 'A'; ch<='Z'; ch++){
            Cap += ch;
        }
        System.out.println(Cap);
        for(char ch = 'a'; ch<='z'; ch++){
            Low += ch;
        }
        System.out.println(Low);


        // both length is 26
        String result = "";
        for(int i=0; i<= Cap.length()-1; i++){
            result += Cap.charAt(i)+""+Low.charAt(i)+" ";

        }
        System.out.println(result);


        // second solution
        int a = 97;
        int A = 65;
        String result1 ="";
        for(int i =0; i<=26; i++){
            char ch1 = (char)(A+i);
            // 0+65
          char ch2 = (char)(a+i);
          // 0+97
            result1 += ch1+""+ch2+" ";
        }
        System.out.println(result1);
    }
}
