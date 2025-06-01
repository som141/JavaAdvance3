package lamda.lamda4.Ex;

import lamda.lamda4.filter.GenericFilter;
import lamda.lamda4.map.GenericMap;

import java.util.ArrayList;
import java.util.List;

import static functionalInterface.FilterExampleEx2.filter;
import static lamda.lamda2.MapExample.map;

public class ExNumber1 {
    static  List<Integer> direct(List<Integer> numbers){
        List<Integer> result= new ArrayList<>();
        for(int i :numbers){
            if(i%2==0){
                result.add(i*2);
            }
        }
    return result;
    }
    static List<Integer> lambda(List<Integer> numbers) {
        List<Integer> filteredList = GenericFilter.filter(numbers, n -> n % 2
                == 0);
        List<Integer> mappedList = GenericMap.map(filteredList, n -> n *
                2);
        return mappedList;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(direct(numbers));

    }
}
