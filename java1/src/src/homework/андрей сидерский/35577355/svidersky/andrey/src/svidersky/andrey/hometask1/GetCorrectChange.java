package svidersky.andrey.hometask1;

/**
 * Created by User on 01.04.2016.
 */
public class GetCorrectChange
{

    @Override
    public String toString()
    {
       // String s = GetCorrectChange.getCorrectChange().get_dollars()
     //   int k = this.Change.
        return "test";
    }

    static class Change
    {
        private final int _dollars;
        private final int _quarters;
        private final int _dimes;
        private final int _nickels;
        private final int _cents;

        public int get_dollars()
        {
            return _dollars;
        }
        public int get_quarters()
        {
            return _quarters;
        }
        public int get_dimes()
        {
            return _dimes;
        }

        public int get_nickels()
        {
            return _nickels;
        }



        public int get_cents()
        {
            return _cents;
        }



        public Change(int dollars, int quarters, int dimes, int nickels, int cents)
        {
             _dollars=dollars;
            _quarters=quarters;
            _dimes=dimes;
            _nickels=nickels;
            _cents=cents;
        }
    }

   public static Change getCorrectChange(int cents)
   {
       if (cents<0)
           return null;
      int tmpDollars=cents/100;
      int tmpQuaters=cents%100/25;
      int tmpDimes=cents%100%25/10;
       int tmpNickels=cents%100%25%10/5;
       int tmpCents=cents%100%25%10%5;

       return new Change(tmpDollars,tmpQuaters,tmpDimes,tmpNickels,tmpCents);
   }


}
