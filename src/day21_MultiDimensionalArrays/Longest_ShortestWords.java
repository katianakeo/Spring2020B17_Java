package day21_MultiDimensionalArrays;

public class Longest_ShortestWords {
    public static void main(String[] args) {
        String[] names = {"Jack", "Oscar", "Katiana", "Taylor"};
        int maxName = names[0].length();
        String longest = "";
        for(int i =1; i<=names.length-1; i++){
            if(names[i].length()>maxName){
                maxName = names[i].length();
                longest = names[i];
            }
        }
        System.out.println(longest);
    }
}
