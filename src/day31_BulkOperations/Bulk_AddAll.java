package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_AddAll {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        // add 30, 20, 40, 50, 45, 35, 200
      /*  list1.add(30);
        list1.add(20);
        list1.add(40);
        list1.add(50);
        list1.add(45);
        list1.add(35);
        list1.add(200);

       */

       Integer[] arr1 = {30,20,40,50,45,35,200};
        list1.addAll(Arrays.asList(arr1));
        System.out.println(list1);

        String[] names = {"Murtaza", "Muhtar", "Sada"};
        System.out.println(Arrays.toString(names));

        ArrayList<String> namelist = new ArrayList<>();
        namelist.addAll(Arrays.asList(names));
        System.out.println(namelist);
        namelist.add("Osman");
        System.out.println(namelist);



        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> numlist = new ArrayList<Integer>(Arrays.asList(numbers));
        System.out.println(numlist);



    }
}
