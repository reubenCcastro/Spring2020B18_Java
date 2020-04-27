package Office_Hours.Practice_04_15_2020;

public class ForEachLoop {
    /*
    for each loop:
         for(DataType    variableName : ArrayName){
         }
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        for (int each : arr) {
            if (each == 3) {
                //continue;// will skip the number 3
                break;// will only print 1, 2, because it exits the loop
            }
            System.out.print(each + ", ");//1,2,3,4

        }


        System.out.println("====================================");
            int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

            for(int each1 :arr2){
                if(each1% 2 ==0){
                    System.out.print(each1+", ");
                }


        }

    }
}
