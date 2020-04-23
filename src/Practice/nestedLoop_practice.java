package Practice;

public class nestedLoop_practice {
    public static void main(String[] args) {
        // loop inside another loop
        // repeats loop
        for(int z = 0; z<=5; z++){
            for(int i = 10; i<=50; i+=10){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for(int z = 1; z<=8; z++){
            for(int i = 1; i<7; i++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
