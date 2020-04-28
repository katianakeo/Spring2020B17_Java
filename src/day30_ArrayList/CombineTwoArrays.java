package day30_ArrayList;

import java.util.ArrayList;

public class CombineTwoArrays {
    public static void main(String[] args) {
        String[] arr1 = {"A","B", "C" };
        String[] arr2 = {"D","E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        for(int i =0; i< arr1.length; i++){
            String eachelement = arr1[i];
            list.add(eachelement);
        }
        for(String eachelement: arr2){
            list.add(eachelement);
        }
        System.out.println(list);
    }
}
