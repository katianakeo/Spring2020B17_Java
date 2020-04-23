package day22_Arrays_Loops;

public class Count_Odd_Even {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int countodd = 0;
        int counteven = 0;

        for(int each: arr){
            if(each%2==0){
                counteven++;
            }
            else{
                countodd++;
            }
          /*if(each%2==0){
              counteven++;
              continue;
          }
          countodd++;

           */
        }
        System.out.println(counteven);
        System.out.println(countodd);
    }


}
