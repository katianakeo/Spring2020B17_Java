package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(8);
        list1.add(1,6);
        System.out.println(list1);

        int[] arr = {1,2,3,4};
        arr[3] =5;

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add(1,"C"); // {A,C,B}
        list2.add(1, "D");  // {A,D,C,B}

        //{A,D,E,F}
        list2.set(3, "F");
        list2.set(2,"E");
        System.out.println(list2);


        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        // 1,2,3,4

        Integer a = 1;
        list3.remove(a);
        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);
        // {10,20,30}

       // list4.remove(1);
        Integer a2 = 20;
       boolean r1 =  list4.remove(a2);
        System.out.println(list4);
        System.out.println(r1);




    }
}
