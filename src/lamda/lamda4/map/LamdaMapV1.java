package lamda.lamda4.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LamdaMapV1 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");
        // 문자열을 숫자로 변환
        List<Integer> numbers = mapStringToInteger(list,s->Integer.valueOf(s));
        System.out.println("numbers = " + numbers);
        List<Integer> number2= mapStringToInteger(list,s->s.length());
        System.out.println(number2);
        // 문자열의 길이
    }
    static List<Integer> mapStringToInteger(List<String> list, Function<String,Integer> map) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            Integer value = map.apply(s);
            numbers.add(value);
        }
        return numbers;
    }

}
