package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class ScrumTeam {
    public static void main(String[] args) {
        String[] DevTeam = {"Zeynep", "Haider", "Jovid", "Muhtar"};
        String[] Testers = {"Rahman", "Aishan", "Osman","Ali"};
        String[][] scrum = {DevTeam, Testers };

       scrum [0][3] = "Jean";
        System.out.println(scrum[0][3]);
        // {"Zeynep", "Haider", "Jovid", "Jean"};

        String info = scrum[1][2];
        System.out.println(info);
         // Osman

        for(String dev :scrum[0]){
            System.out.println(dev);
        }
        for(String test : scrum[1]){
            System.out.println(test);
        }

        String[] newTesters = {"Ilham", "Barzy", "Aysin", "Asiman"};
        Testers = newTesters;
        // scrum[1] = newTesters;
        System.out.println(Arrays.toString(Testers));
    }




}
