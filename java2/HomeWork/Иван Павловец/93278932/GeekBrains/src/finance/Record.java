package finance;

import java.util.Date;


public class Record {

    private String description;
    private boolean accountState;
    private Date dateAccountState;
    private double sum;

    //<editor-fold defaultstate="collapsed" desc="getters">
    public String getDescription() {
        return description;
    }
    
    public boolean isAccountState() {
        return accountState;
    }
    
    public Date getDateAccountState() {
        return dateAccountState;
    }
    
    public double getSum() {
        return sum;
    }
//</editor-fold>
    
    @Override
    public int hashCode() {
        return getDescription().hashCode();
    }

    @Override
    public boolean equals(Object objRec) {
        Record rec = (Record)objRec;
        return getDescription().equals(rec.getDescription());
    }
    
}
