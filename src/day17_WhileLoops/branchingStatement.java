package day17_WhileLoops;

public class branchingStatement {
    // System.exit(0):
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            if(i%2!=0){
                break; // exits the loop immediately
                // only the loop
            }

        }

        for(int i =0; i<5; i++){
            System.exit(0);
        }
        // exits the ENTIRE system. anything after will not be printed


    }
}
