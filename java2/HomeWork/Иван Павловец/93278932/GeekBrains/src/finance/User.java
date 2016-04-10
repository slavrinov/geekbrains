package finance;


public class User {
    
    private String login;
    private String password;

    //<editor-fold defaultstate="collapsed" desc="getters">
    public String getLogin() {
        return login;
    }
    
    public String getPassword() {
        return password;
    }
//</editor-fold>
    
    @Override
    public int hashCode() {
        return getLogin().hashCode();
    }

    @Override
    public boolean equals(Object objUser) {
        User u = (User)objUser;
        return getLogin().equals(u.getLogin());
    }


    

}
