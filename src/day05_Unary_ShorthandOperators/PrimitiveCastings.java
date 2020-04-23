package day05_Unary_ShorthandOperators;

public class PrimitiveCastings {
    public static void main(String[] args) {

        int Inum = 100;
        byte Bnum = (byte)Inum;

        short Snum = (short)Inum;

        double Dnum = 5.5;
        float Fnum = (int)Dnum;
        System.out.println(Fnum);

        double D1 = 10.5;
        long L1 = (int)D1;
        System.out.println(L1);

        char ch2 = 23456;
        double dbl1 = ch2;
        System.out.println(dbl1);

        int z1 = 10;
        double t1b = z1;




    }


}
