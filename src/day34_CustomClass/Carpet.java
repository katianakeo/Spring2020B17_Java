package day34_CustomClass;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calcCost(){
        double total = (width+length) * unitPrice;
        if(isPersian){
            return total+200;
        }
        else{
            return total;
        }
    }

    public void customOrder(double carpetWidth, double carpetLength, double carpetUnitPrice, boolean carpetPersian) {
        width = carpetWidth;
        length = carpetLength;
        unitPrice = carpetUnitPrice;
        isPersian = carpetPersian;
    }

    public String toString(){
        return "Width: "+width+
                "\nLength: "+length+
                "\nUnit price: "+unitPrice+
                "\nCost: "+calcCost();
    }
}
