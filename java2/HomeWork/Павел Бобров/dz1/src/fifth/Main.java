package fifth;


//import fifth.model.DateComparator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Collections;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


        AnchorPane authorization;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("view/authorization.fxml"));
        authorization = loader.load();
        primaryStage.setTitle("Финансовый менеджер");
        primaryStage.setScene(new Scene(authorization));
        primaryStage.show();

    }


    public static void main(String[] args)  {

        launch(args);

    /*    Calendar currentTime; //= Calendar.getInstance();
        ArrayList<Calendar> date = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            currentTime = Calendar.getInstance();
            currentTime.getTime().toString();
            date.add(currentTime);
        }

        System.out.println(date);
        Collections.sort(date, new DateComparator());
        System.out.println(date);*/

    }
}
