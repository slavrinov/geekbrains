package lesson7;

/**
 * Created by Сергей on 06.03.2016.
 */

public class ClassTrouble {
    public static void main(String... args) {
        try {
            Class<?> c = Class.forName("Cls");
            c.newInstance();  // InstantiationException

            // production code should handle these exceptions more gracefully
        } catch (InstantiationException x) {
            x.printStackTrace();
        } catch (IllegalAccessException x) {
            x.printStackTrace();
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        }
    }
}
