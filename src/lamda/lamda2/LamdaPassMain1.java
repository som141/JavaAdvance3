package lamda.lamda2;

import java.util.Comparator;
import java.util.Objects;

public class LamdaPassMain1 {
    static Comparator<Integer> add =(a,b) ->a+b;
    static Comparator<Integer> sub =(a,b) ->a-b;

    public static void main(String[] args) {
        System.out.println(add.compare(2,3));

        Comparator<?extends Integer> c=add;
//        System.out.println(c.compare(null,null));
    }
}
