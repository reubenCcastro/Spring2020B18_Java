package Notes;

public class CharofIndexInArray {

    public static void main(String[] args) {
        // I though this is a fun attention question :)
        String Planets[]= {"Mercury","Venus","Earth", "Mars"};
                    // index 0        1       2        3
        int x= Planets.length; // This statement is indicating the number of the elements in the Planets Array
        int y= Planets[1].length(); // this statement is indicating the number of the characters of the index 1
        System.out.println(x+""+ y);// x==4 y==(venus)==5 answer is 4 5

    }
}
