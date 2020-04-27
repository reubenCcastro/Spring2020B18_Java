package day12_JavaRecep;

public class Switch_Practice {

    public static void main(String[] args) {

        switch(3){

            case 1:
                System.out.println("Case 1");
                break;// exits switch statement

            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("invalid cae");

                System.out.println("===================================================");

                //boolean, long, float can t be used
                int statusCode = 202;
                String result = " ";

                switch (statusCode){
                    case 200:
                        result = "ok";
                      //  System.out.println("ok");
                        break;

                    case 201:
                        result = "Created";
                      //  System.out.println("Created");
                        break;

                    case 202:
                        result = "Accepted";
                       // System.out.println("Accepted");
                        break;
                    default:
                        result = "Invalid Status Code";
                       // System.out.println("Invalid");

                }
                System.out.println(result);






        }
    }


}
