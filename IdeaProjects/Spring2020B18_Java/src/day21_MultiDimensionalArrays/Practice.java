package day21_MultiDimensionalArrays;

public class Practice {

    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars"};
        int x = planets.length;
        int y = planets[1].length();

        System.out.println(x + "" + y);


        System.out.println("=======================");


        int arr[] = {1, 2, 3, 4};
        int j = 0;
        do {
            System.out.println(arr[j] + " ");
            j++;
        } while (j < arr.length - 1);


        System.out.println("=====================");

        int wd = 0; // -1+1+2+2-1 = 3
        String[] days = {"sun", "mon", "wed", "sat"};


        for (int i = 0; i < days.length; i++) {

            switch (days[i]) {
                case "sat":
                case "sun":
                    wd -= 1;
                    break;

                case "mon":
                    wd++;

                case "wed":
                    wd += 2;
            }
        }


            System.out.println(wd);

            int[] num1 = new int[3];  //[0, 0, 0]; size: 3
            int[] num2 = {1, 2, 3, 4, 5};  // size : 5
            num1 = num2;  // num1 = {1, 2, 3, 4, 5};


            //System.out.println(Arrays.toString(num1));


        }
        }


