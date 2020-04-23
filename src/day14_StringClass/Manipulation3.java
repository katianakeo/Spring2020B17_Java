package day14_StringClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Manipulation3 {
    public static void main(String[] args) {
        String str1 = "Cybertek";
        String str2 = "CYBERTEK";
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true, ignores case sensitivity
        System.out.println(str1==str2);

    }


}
