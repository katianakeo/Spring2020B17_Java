package day21_MultiDimensionalArrays;

public class AverageNum {
    public static void main(String[] args) {
        // average = total sum/ amount of number

        int[] num = {1,2,3};
        int length = num.length; // total number of length
        int sum = 0;
        for(int i=0; i<=length-1; i++){
            int individualnum = num[i];
            sum += individualnum;
        }
        System.out.println(sum/length);

        int[] array = {10,20,30,40,50};
        int length1 = array.length;
        int sum1 =0;
        for(int i=0; i<=length1-1; i++){
            sum1 += array[i];
        }
        System.out.println(sum1/length1);


        int[] arr = {1,2,2};
        System.out.println(5/3); //gives whole num
        double len = arr.length; // make data type Double
        double sum3 =0;
        for(int i=0; i<=len-1; i++){
            sum3 += arr[i];
        }
        System.out.println(sum3/len);




    }

}
