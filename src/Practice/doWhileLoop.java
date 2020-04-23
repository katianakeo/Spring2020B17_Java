package Practice;

public class doWhileLoop {
    public static void main(String[] args) {
        /*
        do{
             statement;

        }while(condition);

        executes statement then checks the condition
        - if condition is true, it loops back
        - if false, it stops the loop
         */


        int i = 0;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<101);

        System.out.println();  // breaks loop

        // print numbers %3 0-100
        int num = 0;
        do{
            if(num%3==0){
                System.out.print(num+" ");
            }
            num++;
        }while(num<101);
    }

}
