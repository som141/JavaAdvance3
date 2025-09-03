package stream;

import java.util.Comparator;
import java.util.List;

public class IntermediateOperationMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 7, 9, 10);
        //1. filter
        System.out.println("1. filter = 짝수만 선택");
        list.stream().filter(x->x%2==0).forEach(n-> System.out.print(n+" "));
        //2. map
        System.out.println();
        System.out.println("2. map =제곱");
        list.stream().map(n->n*n).forEach(n-> System.out.print(n+" "));
        //3. distinct
        System.out.println();
        System.out.println("3. distinct = 중복제거");
        list.stream().distinct().forEach(n-> System.out.print(n+" "));
        //4.sorted(기본 정렬)
        System.out.println();
        System.out.println("4. sorted = 기본정렬");
        list.stream().sorted().forEach(n-> System.out.print(n+" "));

        //5. sorted(커스텀)
        System.out.println();
        System.out.println("5. sorted= 커스텀");
        list.stream().sorted(Comparator.reverseOrder()).forEach(n-> System.out.print(n+" "));

        //6.peek(동작 확인용)
        System.out.println();
        list.stream().peek(n-> System.out.print("before"+n+" "))
                .map(n->n*n)
                .peek(n-> System.out.print("after"+n+" "))
                .limit(5)
                .forEach(n-> System.out.print("최종값"+n+" "));
    }
}
