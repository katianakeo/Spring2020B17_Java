package day24_Methods;

public class StringReverse {
    public static void Reverse(String str){
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        Reverse("Cybertek");
        String name = reverse2("Cybertek");
        System.out.println(name);
    }

    public static String reverse2(String str){
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        return reverse;
    }

}
