package lamda.lamda4.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterMainV1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //짝수만 거르기
        List<Integer> evenNumbers= filterEvenNumber(numbers);
        System.out.println(evenNumbers);
        List<Integer> filter2=filter1(numbers,i->i%2==0);
        System.out.println(filter2);git
        //홀수만 거르기
        numbers.stream().filter(i->i%2==1).forEach(i->System.out.print(i+", "));
        System.out.println(numbers.stream().filter(i->i%2==1).map(i->Integer.toString(i)).collect(Collectors.joining(", ")));

    }
    private static List<Integer> filter1(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer>filtered = new ArrayList<Integer>();
        for(Integer i : numbers) {
            if(predicate.test(i)){filtered.add(i);}
        }
        return filtered;
    }
    private static List<Integer> filterEvenNumber(List<Integer> b) {
        List<Integer>filtered = new ArrayList<Integer>();
        for(Integer i : b){
            if(i%2==0){filtered.add(i);}
        }
        return filtered;
    }
}
