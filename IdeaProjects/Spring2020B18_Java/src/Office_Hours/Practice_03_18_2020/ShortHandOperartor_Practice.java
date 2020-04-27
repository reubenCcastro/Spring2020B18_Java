package Office_Hours.Practice_03_18_2020;

public class ShortHandOperartor_Practice {
   /* HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and their meanings are listed below:
    status code:
            200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable

1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.
            Example:
            if status code = 200
    output:
    ok

        if status code = 201:
    output:
    accepted

    */
   public static void main(String[] args) {
       // +=: addition asssignment

       int a = 100;
       //  a = a + 200;
       a += 200; // a= 300

       System.out.println(a);

       a += 200 * 3;  // a = 900
       System.out.println(a);

       // -=: subtraction assignment
       //    a = a - 400;
       a -= 400;  //a =500

       System.out.println(a);

       int b = 300;
       b  -=  3 * 40;
       // b -= 120; ==> 180
       System.out.println(b);

       // *=: multiplication assignment
       int x = 5;

       //  x = x * 3; // 15
       x *= 3;  // ==> 15

       System.out.println(x);

       x *= 2+1;
       // x *= 3;  x = x * 3 ==> 45

       System.out.println(x);


       //  /=: division assignment:

       int n = 900;

       // n = n / 3;

       n /= 3; // 300

       System.out.println(n);

       n /= 3 *5; // n = n / 15  ==> 20

       System.out.println(n);

       // %=: remainder assignment
       // remainder: numerator - (denominator * Whole Number for result)

       int m = 10;
       //   m = m % 3; //1

       m %= 3; // m=1
       System.out.println(m);

       int y = 300;

       y %= 3*5;
       // y %= 15; ==> y = y%15 ==> y=0
       System.out.println(y);


       int  t = 400;
       t %= 10*2;
       // t %= 20 ==> t = t % 20; ==> t = 0

       System.out.println(t);




   }

}








