package day22_ArraysCont;
/*
3. write a program that can return the number of appearances of "java"
 and "python"
         anywhere in the sentence
                    (it's similar to the task 97 in repl.it, But this time you MUST use arrays
                    and for each loop)

                    split is earier for this task
 */
public class Java_Python {

    public static void main(String[] args) {
        String sentence = " I like java and javascript and python and python";
        sentence = sentence.toLowerCase();
        int countJava = 0;// 2
        int countPython = 0;//2
        String[] words = sentence.split(" ");// [I, like, java, and,
        // javascript]it a string so we to make it a string on the left side of
        // the sentence
        for (String each : words) {//(variable that represent each element :date structure)
            if (each.contains("java")) {
                countJava++;
            }
            if (each.contains("python")) {
                countPython++;

            }
        }

        System.out.println(countJava);
        System.out.println(countPython);
        System.out.println(countJava == countPython);

        }
    }

