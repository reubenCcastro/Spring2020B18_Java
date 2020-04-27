package day17_WhileLoops;


public class Frequency {

    public static void main(String[] args) {
        //String str = "Java is fun, Java is cool";// 2
        String str = "Cybertek School is a grEat place to study".toLowerCase();
        int count = 0;
        String word ="E".toLowerCase();

        while (str.contains("e")) {
            count++;
            str = str.replaceFirst(word,"");// after counting the first"Java, we need to remove from the string
        }
        System.out.println(count);
    }

}
