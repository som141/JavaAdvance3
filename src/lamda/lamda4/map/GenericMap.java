package lamda.lamda4.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GenericMap {
    public static void main(String[] args) {
        var list = List.of("1", "12", "123", "1234");
        // 문자열을 숫자로 변환
        var numbers = map(list, s->Integer.valueOf(s));
        System.out.println("numbers = " + numbers);
        var number2= map(list, s->s.toUpperCase());
        System.out.println("number2"+number2);
        // 문자열의 길이
    }
    public static <T,R> List<R> map(List<T> list, Function<T,R> map) {
        List<R> r = new ArrayList<>();
        for (T t: list) {
            R value = map.apply(t);
            r.add(value);
        }
        return r;
    }

}
