/**
 * Created by Сергей on 22.01.2016.
 */
public class Ex5 {
    interface B { /* ... */
    }

    ;

    interface C { /* ... */
    }

    class A { /* ... */
    }

    // Скомпилируется ли код?
    //1
    //class D <T extends A & B & C> { /* ... */ }
    //2
    // class F <T extends B & A & C> { /* ... */ }  // compile-time error
}
