package day23_Methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class methods {
    /*
    Access-modifer specifier return-type methodName(){
                    statements;
            }

     */
    public static void main(String[] args) {
        System.out.println("Hello Cybertek");
                printHello5times();
        System.out.println("Hello Batch 18");
        printHello5times();
        System.out.println("Hello Saim");
        printevennumber();
        printoddnumber();
    }

    public static void printHello5times(){
        for(int i=0; i<5; i++){
            System.out.println("Hello World");
        }

    }

    public static void printevennumber(){
        for(int i=0; i<101; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void printoddnumber(){
        for(int i=0; i<101; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
