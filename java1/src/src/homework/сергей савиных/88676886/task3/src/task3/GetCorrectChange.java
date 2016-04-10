package task3;

/**
 * Created by Сергей on 27.03.2016.
 */
public class GetCorrectChange {

    public static Change getCorrectChange(int cents) {
/*
Please implement this method to
take cents as a parameter
and return an equal amount in dollars and coins using the minimum number of
coins possible.
For example: 164 cents = 1 dollar, 2 quarters, 1 dime and 4 cents.
Return null if the parameter is negative.
     */
        if (cents > 0) {
            int dl = cents / 100;
            int qt = (cents - dl * 100) / 25;
            int dm = (cents - dl * 100 - qt * 25) / 10;
            int nk = (cents - dl * 100 - qt * 25 - dm * 10) / 5;
            int ct = cents - dl * 100 - qt * 25 - dm * 10 - nk * 5;
            Change change = new Change(dl, qt, dm, nk, ct);
            return change;
        } else {
            return null;
        }
    }


    // Please do not change this class
    static class Change {
        private final int _dollars;
        private final int _quarters; //25 cents
        private final int _dimes; // 10 cents
        private final int _nickels; // 5 cents
        private final int _cents; // 1 cent


        public Change(int dollars, int quarters, int dimes, int nickels, int cents) {
            _dollars = dollars;
            _quarters = quarters;
            _dimes = dimes;
            _nickels = nickels;
            _cents = cents;
        }


        public int getDollars() {
            return _dollars;
        }


        public int getQuarters() {
            return _quarters;
        }


        public int getDimes() {
            return _dimes;
        }

        public int getNickels() {
            return  _nickels;
        }

        public int getCents() {
            return  _cents;
        }
    }
}