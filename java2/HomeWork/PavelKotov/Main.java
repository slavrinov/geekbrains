package HomeWork.PavelKotov;


import dbService.DBException;
import dbService.DBService;
import dbService.dataSets.UsersDataSet;

public class Main {
    public static void main(String[] args) {
        DBService dbService = new DBService();
        dbService.printConnectInfo();
        try {
            long userId = dbService.addUser("new user");
            System.out.println("Added user id: " + userId);

            UsersDataSet dataSet = dbService.getUser(userId);
            System.out.println("User data set: " + dataSet);

            dbService.cleanUp();
        } catch (DBException e) {
            e.printStackTrace();
        }
    }
}
