package Practice;

public class ForLoopClass {
    public static void main(String[] args) {
        for(int i=0; i<101; i++){
            if(i%3==0 || i%5==0){
                System.out.println(i);
            }
        }
        System.out.println();  // breaks loop

        String name = "Katiana";
        // index =     0123456
        // length =    1234567
        String result = "";
        int lastindex = name.length()-1;
        for(int i = lastindex; i>=0; i--){
            result += name.charAt(i);
        }
        System.out.println(result);
        /*
        result = result + name.substring(i, i+1)
                                            6,7 = a
                                            5,6 = n
                                            4,5 = a
                                            3,4 = i
                                            2,3 = t
                                            1,2 = a
                                            0,1 = K
         */



        if(name.equalsIgnoreCase(result)){
            System.out.println(name+" is palindrome");
        }
        else{
            System.out.println(name+" is not palindrome");
        }
    }
}
