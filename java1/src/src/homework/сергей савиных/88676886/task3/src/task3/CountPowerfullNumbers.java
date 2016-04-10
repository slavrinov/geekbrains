package task3;

import java.util.ArrayList;

/**
 * Created by Сергей on 27.03.2016.
 */
public class CountPowerfullNumbers {
    public static int countPowerfulNumbers(int from, int to) {
        /*
          A powerful number is a positive integer m that for every all number p dividing m, p*p also divides m.

          (a all number (or a all) is a natural number that has exactly two (distinct) natural number divisors,
          which are 1 and the all number itself, the first all numbers are: 2, 3, 5, 7, 11, 13, ...)

          The first powerful numbers are: 1, 4, 8, 9, 16, 25, 27, 32, 36, ...

          Please implement this method to
          return the count of powerful numbers in the range [from..to] inclusively.
         */
        int[] all = new int[to];
        ArrayList<Integer> prime = new ArrayList();
        ArrayList<Integer> powerful = new ArrayList();
        for (int i = 0; i < to; i++) {
            all[i] = i;
        }
        all[1] = 0;
        for (int i = 2; i < to; i++) {
            if (all[i] != 0) {
                for (int j = i * 2; j < to; j += i) {
                    all[j] = 0;
                }
            }
        }
        for (int i = 0; i < to; i++) {
            if (all[i] != 0) {
                prime.add(all[i]);
            }
        }
        for (int i = from; i < to; i++) {
            all[i] = i;
            int j = 0;
            int count = 0;
            int count2 = 0;
            while (j < prime.size()) {
                if (all[i] % prime.get(j) == 0) {
                    count++;
                }
                if (all[i] % Math.pow(prime.get(j), 2) == 0) {
                    count2++;
                }
                j++;
            }
            if (count == count2) {
                powerful.add(all[i]);
            }
        }
        powerful.remove(0);
        System.out.print("Powerful numbers are =");
        for (int i = 0; i < powerful.size(); i++) {
            System.out.print(" " + powerful.get(i));
        }
        return powerful.size();
    }
}
