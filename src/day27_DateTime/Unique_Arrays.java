package day27_DateTime;

public class Unique_Arrays {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3};

       for(int i=0; i<arr.length; i++) {
           int count = 0;
           for(int each: arr){
               if(each==arr[i]){
                   count++;
               }
           }

           if(count==1){
               System.out.println(arr[i]);
           }
       }



        int count = 0;
        for(int each: arr){
            if(each==arr[0]){
                count++;
            }
        }

        if(count==1){
            System.out.println(arr[0]);
        }

        int[] arr2 = {70,43,67,87,54,23,3,12};
    }

    public static void uniqueElements(int[] arr){
        int count = 0;
        for(int each: arr){
            if(each==arr[0]){
                count++;
            }
        }

        if(count==1){
            System.out.println();
        }
    }




}
