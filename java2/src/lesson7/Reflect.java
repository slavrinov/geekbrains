package lesson7;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *
 */
class Test implements Serializable, Cloneable {
    public final int field =10;
    protected final String strprv ="PRIVATE STRING";
    public final String str ="PROTECTED STRING";
    public final String str2 ="PUBLIC STRING";


    private Test(Object obj, Object obj2) {

    }


    public Test() {

    }

    public Test(Object field) { }

    @Deprecated
    protected static void method(String[] params) { }


    public void foo() {
        System.out.println("FOO");
    }

    @Override
    public String toString() {
        return "Test{" +
                "field=" + field +
                '}';
    }
}

public class Reflect {
    public static void main(String[] args) throws Exception {
        Class clazz = Test.class;
        Test test = (Test) clazz.newInstance();

        //clazz.getConstructors();


        Method method = clazz.getMethod("foo");
        System.out.println(method.toString());
        method.invoke(test);

        Field field0 = clazz.getDeclaredField("field");
        field0.setAccessible(true);
        field0.set(test, 100);
        System.out.println(test);


        // выводим название пакета
        Package p = clazz.getPackage();
        System.out.println("package " + p.getName() + ";");

        // начинаем декларацию класса с модификаторов
        int modifiers = clazz.getModifiers();
        System.out.print(getModifiers(modifiers));
        // выводим название класса
        System.out.print("class " + clazz.getSimpleName() + " ");

        // выводим название родительского класса
        System.out.print("extends " + clazz.getSuperclass().getSimpleName() + " ");

        // выводим интерфейсы, которые реализует класс
        Class[] interfaces = clazz.getInterfaces();
        for (int i = 0, size = interfaces.length; i < size; i++) {
            System.out.print(i == 0 ? "implements " : ", ");
            System.out.print(interfaces[i].getSimpleName());
        }
        System.out.println(" {");

        // выводим поля класса
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("\t" + getModifiers(field.getModifiers())
                    + getType(field.getType()) + " " + field.getName() + ";");
        }

        // выводим констукторы класса
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.print("\t" + getModifiers(c.getModifiers()) +
                    clazz.getSimpleName() + "(");
            System.out.print(getParameters(c.getParameterTypes()));
            System.out.println(") { }");
        }

        // выводим методы класса
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            // получаем аннотации
            Annotation[] annotations = m.getAnnotations();
            System.out.print("\t");
            for (Annotation a : annotations)
                System.out.print("@" + a.annotationType().getSimpleName() + " ");
            System.out.println();

            System.out.print("\t" + getModifiers(m.getModifiers()) +
                    getType(m.getReturnType()) + " " + m.getName() + "(");
            System.out.print(getParameters(m.getParameterTypes()));
            System.out.println(") { }");
        }

        System.out.println("}");
    }

    static String getModifiers(int m) {
        String modifiers = "";
        if (Modifier.isPublic(m)) modifiers += "public ";
        if (Modifier.isProtected(m)) modifiers += "protected ";
        if (Modifier.isPrivate(m)) modifiers += "private ";
        if (Modifier.isStatic(m)) modifiers += "static ";
        if (Modifier.isAbstract(m)) modifiers += "abstract ";

        return modifiers;
    }

    static String getType(Class clazz) {
        String type = clazz.isArray()
                ? clazz.getComponentType().getSimpleName()
                : clazz.getSimpleName();
        if (clazz.isArray()) type += "[]";
        return type;
    }

    static String getParameters(Class[] params) {
        String p = "";
        for (int i = 0, size = params.length; i < size; i++) {
            if (i > 0) p += ", ";
            p += getType(params[i]) + " param" + i;
        }
        return p;
    }
}
