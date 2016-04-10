/**
 * Created by Сергей on 22.01.2016.
 */
public class Ex5 {
    class B { /* ... */
    }

    ;

    class C { /* ... */
    }

    interface A { /* ... */
    }


    // Скомпилируется ли код?
    //1
    //class D <T extends A & F > { /* ... */ }
    //2
     class F<T extends B & A>  extends C { /* ... */ }  // compile-time error

    public static void main(String[] args) {


    }
}
