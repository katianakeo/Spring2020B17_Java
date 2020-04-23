package day25_MethodsRecap;

public class Driver {

    public static String getDrive1(String BrowserName){
        String result = "";
        switch(BrowserName.toLowerCase()){
            case "chrome": result = "Chrome Driver";
            break;
            case "firefox" : result = "FireFox Driver";
            break;
            case "safari": result = "Safari Driver";
            break;
            case "opera": result = "Opera Driver";
            break;
            case "edge" : result = "Edge Driver";
            break;
            default: result = "Invalid Driver";
        }

        return result;
    }


    public static void main(String[] args) {
       String str = getDrive1("chrome");
        System.out.println(str);

    }

    public static String getdriver3(String browserName){

        browserName = browserName.toLowerCase();
        String result = (browserName.equals("chrome")) ? "Chrome Driver"  // if
                : (browserName.equals("firefox"))? "FirFox Driver"    // else if
                : (browserName.equals("safari")) ? "Safari Driver"   // else if
                : (browserName.equals("edge")) ? "Edge Driver"       // else if
                : (browserName.equals("Opera")) ? "Opera Driver"  // else if
                : "Invalid Driver"; // else

        return result;
    }
}
