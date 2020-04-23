package day06_Shorthnd_LogicalOperators.Repl;

public class it {public static void main(String[] args) {
    int vehicleYear = 1996;

    //WRITE YOUR CODE HERE:
    if(vehicleYear==1996){
        System.out.println("Enter vehicle's year:");
    }
    if(vehicleYear>=1995 && vehicleYear<=1998){
        System.out.println("Your vehicle needs to be recalled!");
    }
    if(vehicleYear>=2001 && vehicleYear<=2002){
        System.out.println("Your vehicle needs to be recalled!");
    }
    if(vehicleYear>=2004 && vehicleYear<=2006){
        System.out.println("Your vehicle needs to be recalled!");
    } if(vehicleYear>=2015 && vehicleYear<=2017){
        System.out.println("Your vehicle needs to be recalled!");
    }
    else {
        System.out.println("Your vehicle is fine, enjoy!");
    }
}
}

