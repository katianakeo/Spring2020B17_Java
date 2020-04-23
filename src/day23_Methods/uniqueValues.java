package day23_Methods;

public class uniqueValues {
    public static void main(String[] args) {
        String arr[] = {"A","A","B", "C", "C"};
        for(String unique :arr){
            if(unique.equals("B")){
                System.out.println(unique);
            }
            else{
                continue;
            }
        }

        //frequency of A
        int countA = 0;
        for(String each : arr) {
            if (each.equals("A")) {
                countA++;
            }

        }
        if(countA==1){
            System.out.println("A");
        }
        System.out.println(countA);


        System.out.println("Nested Loop");
        //nested loop
        for(String each2 :arr){

            int count = 0;
            for(String each : arr) {
                if (each.equals(each2)) {
                    count++;
                }
            }
            if(count==1){
                System.out.println(each2);
            }
        }


        System.out.println("For Loop and for each");
        // for loop
        String arr2[] = {"A","A","B"};

        for(String each :arr2){
            int count1 = 0;
            for(int i =0; i<arr2.length; i++){
                if(arr[i].equals(each)){
                    count1++;
                }
            }
            if(count1==1){
                System.out.println(each);
            }
        }

    }
}
