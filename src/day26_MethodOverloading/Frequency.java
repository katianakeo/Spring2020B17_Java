package day26_MethodOverloading;

public class Frequency {
    public static void main(String[] args) {
        String str = "ABABAA";
        char ch = 'A';
        char[] arr = str.toCharArray(); //[A, A, A]
        int count = 0;
        for(char each : arr){
            if(each == 'A'){
                count++;
            }

        }
        System.out.println(count);

        String str2 = "A";
    }

    public static int frequency(String str, char ch){
        char[] arr = str.toCharArray(); //[A, A, A]
        int count = 0;
        for(char each : arr){
            if(each == 'A'){
                count++;
            }

        }
        return count;

    }
}
