package fifth.model;


import java.util.Calendar;

public class Record {

    private int id;
    private Calendar date;
    private String description;
    private int sum;



    private enum Mark {

        WITHDRAWAL,
        REPLENISHMENT

    }

}
