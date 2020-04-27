package Office_Hours.Practice_04_22_2020;

public class test {

        public static void main(String[] args) {
            int [] arr ={4,6,9,3,8};
            int max=    Max(arr);
            System.out.println(max);
        }
        public static int Max(int []arr){
            int max=-2147483647;
            for( int i= 0; i<arr.length; i++) {
                int num=  arr[i];
                if(num>max)  {
                    max=num;
                }
            }
            return max;
        }
}
