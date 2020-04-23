package day08_IfStatements;

public class EqualNumber_MultiBranchIf {
    public static void main(String[] args) {
        double n1 = 200.5;
        double n2 = 200.5;
        double n3 = 100.5;

        boolean n1equaln2 = n1==n2 && n1 != n3;
        boolean n1equaln3 = n1==n3 && n1 != n2;
        boolean n2equaln3 = n2==n3 && n2!=n1;
        boolean allequal = n1 == n2 && n1 == n3;

        if(n1equaln2){
            System.out.println("n1 equals n2");
        }else if(n1equaln3){
            System.out.println("n1 equals n3");
        }else if(n2equaln3){
            System.out.println("n2 equals n3");
        }
    }
}
