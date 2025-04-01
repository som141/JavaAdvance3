package lamda.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class lamda2 {
    public static void main(String[] args) {
        Comparator<Integer> comparable=(a, b)->{
            System.out.println(a+b);
            return a.compareTo(b);
        };


        comparable.compare(1,2);
    }
}
