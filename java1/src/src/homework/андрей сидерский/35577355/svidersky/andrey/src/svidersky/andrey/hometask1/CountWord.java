package svidersky.andrey.hometask1;

/**
 * Created by User on 31.03.2016.
 */
public class CountWord {

    public static int countWords(String s)
    {
        /*
          Please implement this method to return the word count in a given String.

          The words in the parameter String can be separated from each other by any nubmer
          of whitespace symbols (Character.isWhitespace()).
         */
        return s.split("\\s+").length;
    }

    public static void main(String[] args) {
       int res =  countWords("55 uhju 70 hhhh 11d22g 1");
        System.out.println("res = " + res);
    }
}
