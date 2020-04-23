package Practice;

public class WhileLoop_Practice {
    public static void main(String[] args) {
        /*
        while(Condition){
              statement;
        }
        repeated if statement
         */

        for(int i =0; i<5; i++){
            System.out.println("Hello World");
        }

        int z = 0;
        while(z<5){
            System.out.println("Hello Cybertek" + z);
            z++;
        }

        int num = 0;
        while(num<101){
            if(num%15==0){
                System.out.print(num+" ");

            }
            num++;
        }
    }
}
