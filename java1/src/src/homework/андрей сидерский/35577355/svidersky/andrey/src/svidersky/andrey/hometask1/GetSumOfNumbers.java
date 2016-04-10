package svidersky.andrey.hometask1;

/**
 * Created by User on 29.03.2016.
 */
public class GetSumOfNumbers
{
    public static int getSumOfNumbers(String s)
    {
        /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */
        int temp=0;
        String[] argsArray=s.split(" ");
        for(String elem:argsArray)
        {
            try
            {
                temp+=Integer.parseInt(elem);
            }
            catch (NumberFormatException e)
            {

            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int res = getSumOfNumbers("11 9 0 fff 2222  22d222");
        System.out.println("res = " + res);
    }
}
