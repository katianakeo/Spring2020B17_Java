package day17_WhileLoops;

public class WhileLoopPractice3 {
    public static void main(String[] args) {
      /*  for(int i = 0; i<401; i++){
            System.out.println(i);
        }

       */
        int num = 0;
        while(num<101){
            System.out.print("*");
            num++;

        }

        System.out.println();
        // print * 3 times

        int number = 3;
        System.out.println("***");
        while(number>0){
            System.out.println("* *");
            number--;
        }
        System.out.println("***");
    }
}
