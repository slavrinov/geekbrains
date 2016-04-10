package lesson7;

import java.lang.reflect.Method;

/**
 * Created by Сергей on 06.03.2016.
 */
public class LoadNativeObject {


    public native  Object m1();

    public native  Object m2();

    public native  Object m3();


}

class loadNativeLibrary {

    public static void main(String[] args) {
        Class clazz=null;
        try {
            clazz =Class.forName("java.util.HashMap");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //clazz.getInterfaces();

       //clazz.getMethods()
        Method[] mArr = clazz.getMethods();
        for (int i = 0; i < mArr.length; i++) {
            String arg = args[i];
            Method m = (Method) mArr[i];
            System.out.println("mArr = " + m.getName());


        }

    }


}
