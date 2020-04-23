package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {
        String[] wild = {"Tiger", "Lion", "Monkey"};
        String[] birds = {"Eagle", "Parrots", "Owl"};
        String[][] zoo = {wild, birds};
         String bird = zoo[1][2];
        System.out.println(bird);

        // loop depends on length of data

        for(String allBirds:zoo[1]){
            if(allBirds.equals("Owl")){
                continue;
            }
            System.out.println(allBirds);

        }

        for(String allWild:zoo[0]){
            if(allWild.equals("Lion")){
                continue;
            }
            System.out.println(allWild);
        }

    }
}
