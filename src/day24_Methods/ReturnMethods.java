package day24_Methods;

public class ReturnMethods {
    public static void maxNum(int a, int b){
        if(a>=b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        maxNum(10,20);
        int result = addition(10,20);
        System.out.println(result);
        int result2 = result + 200;
    }

    public static int addition(int a, int b){

        return a+b;
    }


}
