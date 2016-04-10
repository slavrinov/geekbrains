package j2l1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortLengthDemo {
    
    
    
    public static void main(String[] args) {
        new SortLengthDemo().test();
    }
    
    public class LengthComparator implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            return (str2.length()-str1.length());
        }
        
    }
        
    public void test(){
        List<String> s = new ArrayList<String>();
        s.add("aaa");
        s.add("b2131231255ZX");
        s.add("cd");
        s.add("casdasd");
        s.add("x");
        
        
        LengthComparator lc = new LengthComparator();
        
        System.out.println(s);
        Collections.sort(s, lc);
        System.out.println(s);
    }
}
