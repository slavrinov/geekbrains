package finance;

import java.util.ArrayList;


public class Account {
    
    private String description;
    private double balance;
    private ArrayList<Record> recordList;

    //<editor-fold defaultstate="collapsed" desc="getters">
    public String getDescription() {
        return description;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public ArrayList<Record> getRecordList() {
        return recordList;
    }
//</editor-fold>
    
    @Override
    public int hashCode() {
        return getDescription().hashCode();
    }

    @Override
    public boolean equals(Object objAccnt) {
        Account accnt = (Account)objAccnt;
        return getDescription().equals(accnt.getDescription());
    }

}
