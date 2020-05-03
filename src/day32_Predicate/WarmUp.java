package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
        //move zeroes to the last indexes

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0,0,0,0));
        System.out.println(list);

        int count = 0;
        for(Integer each :list){
            if(each==0){
                count++;
            }
        }
        System.out.println(count);

        //{1,2,3,4,0,0,0,0,0,0,0}

        list.removeAll(Arrays.asList(0));
        for(int i=0; i <count; i++){
            list.add(0);
        }
        System.out.println(list);








    }
}
