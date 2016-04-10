package lesson5;


import java.io.Closeable;
import java.util.logging.Logger;

/**
 * Created by dmirty on 20/08/14.
 */
public class Util {
    static Logger log = Logger.getLogger("Util.class");
    static void closeResource(Closeable resource) {
        if (resource != null) {
            try {
                resource.close();
            } catch (Exception e) {
                log.info("Failed to close resource correctly");
            }
        }
    }
}
