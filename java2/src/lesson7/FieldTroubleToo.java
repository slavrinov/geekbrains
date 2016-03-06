package lesson7;

import java.lang.reflect.Field;

/**
 * Created by Сергей on 06.03.2016.
 */

public class FieldTroubleToo {
    public final boolean b = true;

    public static void main(String... args) {
        FieldTroubleToo ft = new FieldTroubleToo();
        try {
            Class<?> c = ft.getClass();
            Field f = c.getDeclaredField("b");
// 	    f.setAccessible(true);  // solution
            f.setBoolean(ft, Boolean.FALSE);   // IllegalAccessException

            // production code should handle these exceptions more gracefully
        } catch (NoSuchFieldException x) {
            x.printStackTrace();
        } catch (IllegalArgumentException x) {
            x.printStackTrace();
        } catch (IllegalAccessException x) {
            x.printStackTrace();
        }
    }
}
