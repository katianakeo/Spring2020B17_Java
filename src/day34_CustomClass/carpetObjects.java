package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(10,15,30,false);
        carpets[2].customOrder(9,20,15,true);
        carpets[3].customOrder(20,18,25,false);
        carpets[2].customOrder(35,45,35,true);


        ArrayList<Carpet> persianCarpet = new ArrayList<>();
        for(Carpet each :carpets){
            if(each.isPersian){
                persianCarpet.add(each);
            }
        }
        System.out.println("there are "+persianCarpet.size()+" persian carpets");

        System.out.println(persianCarpet.get(1).calcCost());

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        regularCarpets.removeAll(persianCarpet);

    }
}
