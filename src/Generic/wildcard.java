package Generic;

import java.util.ArrayList;
import java.util.List;

public class wildcard {
    static <T extends Integer> void l(T t){
//        System.out.println(t*t); 인티저 끼리의 곱은 허용이 안됨.
        int t1=t;
        System.out.println(t);
    }
    public static void main(String[] args) {
        l(1);
        List<?> list = new ArrayList<>();
    }
}
