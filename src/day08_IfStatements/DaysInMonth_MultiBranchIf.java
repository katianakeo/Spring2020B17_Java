package day08_IfStatements;

public class DaysInMonth_MultiBranchIf {
    public static void main(String[] args) {
        byte months = 4;
        String result = " ";

        if(months ==1){
            result = "January has 31 days";
        }else if (months ==2){
            result = "February has 28 days";
        }else if(months==3){
            result = "March has 31 days";
        }
    }
}
