package day08_IfStatements;

public class equalNumbers {
    /*
    1.  write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal
     */
    public static void main(String[] args) {
        double n1 = 100.5;
        double n2 = 100.5;
        double n3 = 100.5;
        boolean n1equaln2 = n1==n2 && n1 != n3; // n1 = n2 and n1 != n3, that makes n1 = n2 only
        boolean n1equaln3 = n1==n3 && n1 != n2; // n1 = n3 and n1 != n2, that makes n1 = n3 only
        boolean n2equaln3 = n2 == n3 && n2 != n1; // only n2 = n3
        boolean allequal = n1==n2 && n1 == n3 && n2 == n3; // all of them are equal
        boolean noneofthemequal = n1 != n2 && n1 != n3 && n2 != n3; // none of them are equal
        boolean noneequal = n1equaln2 == false && n1equaln3 == false && n2equaln3 == false;
        boolean noneequal2 = !n1equaln2 && !n1equaln3 && !n2equaln3;

        if(n1equaln2){
            System.out.println(n1+" is equal to "+n2);
        }
        if(n1equaln3){
            System.out.println(n1+" is equal to "+n3);
        }
        if(n2equaln3){
            System.out.println(n2+" is equal to "+n3);
        }
        if(allequal){
            System.out.println(" all of them are equal");
        }
        if(noneofthemequal){
            System.out.println("None of them are equal");
        }




    }
}
