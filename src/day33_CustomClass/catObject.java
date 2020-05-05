package day33_CustomClass;

public class catObject {
    public static void main(String[] args) {
        cat cat1 = new cat();
        cat1.setCatInfo("Siemes", "White", 7, "Love");
        System.out.println(cat1);

        cat cat2 = new cat();
        cat2.setCatInfo("Persian", "Gray", 1, "Duffy");
        System.out.println(cat2);

    }
}
