package day23_Methods;


public class Methods_WithParameter2ReverseString {

    /*
    3. Create a function that can reverse any string
    "Muhtar"===>rathuM, "Cybertex"===>ketrebyC
     */
    public static void main(String[] args) {
        String names = "Reuben";
        ReverseString(names);

        String names2 = "Cybertek School";
        ReverseString(names2);
    }
    public static void ReverseString(String str){

        for(int i= str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));

        }
        System.out.println();
    }


}
