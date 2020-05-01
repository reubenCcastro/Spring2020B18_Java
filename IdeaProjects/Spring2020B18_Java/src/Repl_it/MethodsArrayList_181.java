package Repl_it;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class MethodsArrayList_181 {

    public static void main(String[] args) {

        //combineRs(["f","o","o"],[" b","a","r"]));

    }
        public static String combineRs(String[] r1,String[] r2) {
        List list = new ArrayList(Arrays.asList(r1));
        list.addAll(Arrays.asList(r2));
        String.join("", list);
        return String.join("", list);
    }
}












