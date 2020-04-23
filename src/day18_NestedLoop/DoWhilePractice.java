package day18_NestedLoop;

public class DoWhilePractice {
    public static void main(String[] args) {
        int num = 0;
        do{
            if(num%2==0){
                System.out.print(num+" ");
            }
            num++;
        }while(num<=100);

        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);

        //break statement

        int z = 1;
        do{
            System.out.println(z);
            if(z==3){
                break;
            }
            z++;
        }while(z<=5);

        int t =1;
        do{
            if(t%2 != 0){
                t++;  // can't skip iterator
                continue;
            }
            System.out.print(t+" ");
            t++;

        }while(t<=100);
    }
}
