package task3;

/**
 * Created by Сергей on 27.03.2016.
 */
public class GetSumOfNumbers {


    public static int getSumOfNumbers(String s) {
        /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */
        String[] parsed = s.split(" ");
        int sum = 0;
        for (int i = 0; i < parsed.length; i++) {
            try {
                sum += Integer.valueOf(parsed[i]);
            } catch (Exception e) {
            }
        }
        return sum;
    }


}


