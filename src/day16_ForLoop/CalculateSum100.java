package day16_ForLoop;

public class CalculateSum100 {
    public static void main(String[] args) {

        int sum = 0; // addition sum of all even numbers
        int sum1 = 0; // subraction sum of all odd numbers


        for(int i = 0; i <= 100; i++){
            if(i%2==0){ // even num
                sum+=i;
            }
            else{
                sum1+=i;
            }

        }
        System.out.println(sum);
        System.out.println(sum1);





    }
}
