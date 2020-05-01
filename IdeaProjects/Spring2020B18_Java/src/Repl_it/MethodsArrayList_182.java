package Repl_it;

import java.util.ArrayList;

/*
Instructions from your teacher:
The next method we will learn about is the .set() method.

The .set() ArrayList method will set the value of a particular index to be a given value.

Given the following ArrayList...
ArrayList<Integer> nums = new ArrayList<>();
nums.add(4);
nums.add(2);
nums.add(8);
nums.add(1);
nums.add(-1);
(the values of this arraylist is 4,2,8,1,-1)

The following code will set the element at the 2nd index to be 99 and the element
at the 0th index to be 100.
nums.set(2,99);
nums.set(0,100);

Notice how the way it works is:
arraylistvariable.set(index to set, new value);

On the left, write code that will take an argument of String ArrayLists called words,
and then set the 0th and 2nd indexes to be "git" and "gud" respectively.
 */
public class MethodsArrayList_182 {

    public static void test(ArrayList<String> words)
    {
        //write code here
        words.set(0,"git");
        words.set(2,"gud");
    }
}
