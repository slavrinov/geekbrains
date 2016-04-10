package task3;

/**
 * Created by Сергей on 27.03.2016.
 */
public class CountWord {

    public static int countWords(String s) {
        /*
          Please implement this method to return the word count in a given String.

          The words in the parameter String can be separated from each other by any nubmer
          of whitespace symbols (Character.isWhitespace()).
         */
        int count = 0;
        String[] parsed = s.trim().replaceAll(" ", "1").split("\\d");
        for (int i = 0; i < parsed.length; i++) {
            if (!parsed[i].isEmpty()) {
                count++;
            }
        }
        return count;
    }
}

