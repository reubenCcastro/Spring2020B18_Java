package day25_Methods_Recap;
/*
Warm up tasks:
	1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS// you cant pass double, float,long, boolean
				this task can be done by multibranch statement
	2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements
 */
public class Driver {

    public static void main(String[] args) {
       String str = getDriver1("firefox");// mandatory for the argument
                                        // need to sign to a variable String str =
                                        //  on the left side of method name getDriver1();
                                        // then you can print out the str
        //System.out.println(str); this is for the above
        String str2 = getDriver2("ChRome");
        System.out.println(str2);
        String str3 = getDriver3("Firefox");
        System.out.println(str3);



    }

    public static String getDriver1(String browserName) {
//Access=modifiers/Spcifier/return-Type/MethodName(parameter){
       // statement;
    String results = "";
    switch (browserName.toLowerCase()) {// put toLowerCase to make it the lower case "case".
        case "chrome":
            results = "Chrome driver";// we can also use "return" and if this is correct it exit the loop
            break;
        case "firefox":
            results = "Firefox driver";// we can also use "return" and if this is correct it exit the loop
            break;
        case "ie":
            results = "IE driver";// we can also use "return" and if this is correct it exit the loop
            break;
        case "safari":
            results = "Safari driver";// we can also use "return" and if this is correct it exit the loop
            break;
        case "edge":
            results = "Edge driver";// we can also use "return" and if this is correct it exit the loop
            break;
        case "opera":
            results = "Opera";// we can also use "return" and if this is correct it exit the loop
            break;
        default:
            results = "Invalid driver";

    }
    return results;// we dont need this if we use return


}

    public static  String getDriver2(String browserName){
        browserName = browserName.toLowerCase();// to ignore case sensitivity
        String result = "";
        if(browserName.equals("chrome")){
            result = "Chrome Driver";// we can also use return and if this is correct it exit the loop
        }else if(browserName.equals("firefox")) {
            result = "FireFox Driver";// we can also use return
        }else if(browserName.equals("safari")) {
            result = " Safari Driver";// we can also use return
        }else if(browserName.equals("edge")) {
            result = "Edge Driver";// we can also use return
        }else if(browserName.equals("opera")){
            result = "Opera Driver";// we can also use return
        }else{
            result = "Invalid Driver";// we can also use return
        }
        return result;// we dont need this if we use return
    }

    public static String getDriver3(String browserName){
        //:()?, : , ()?
        browserName = browserName.toLowerCase();
            // in ternary how would you give the statement
        String result = (browserName.equals("chrome"))? "Chrome Driver" // we can also use return and if this is correct it exit the loop
                        :(browserName.equals("firefox"))? "Firefox Driver"
                        :(browserName.equals("safari"))? "Safari Driver"
                        :(browserName.equals("edge"))? "Edge Driver"
                        :(browserName.equals("Opera"))?"Opera Driver" : "Invalid Driver" ;

        return  result;// we don't need this if we use return
    }
}
