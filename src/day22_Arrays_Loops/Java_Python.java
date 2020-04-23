package day22_Arrays_Loops;

public class Java_Python {
    public static void main(String[] args) {
        String sentence = "I like java and javascript. python too.";
        int countJava = 0;
        int countPython = 0;
        String[] split = sentence.split(" "); // ["I", "like", "java", "and", "javascript"]
        for(String each : split ){
            if(each.contains("java")){
                countJava++;
            }
            if(each.contains("python")){
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);
    }
}
