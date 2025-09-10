package stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class CreateStreamMain {
    public static void main(String[] args) {
        System.out.println("1.컬렉션으로 부터 생성");
        List<String> list = List.of("a","b","c");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        System.out.println("2.배열로부터의 생성");
        int[]array={1,2,3,4};
        Arrays.stream(array).forEach(System.out::println);

        System.out.println("3. stream.of()사용");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        integerStream.forEach(System.out::println);

        System.out.println("4. 무한스트림 생성");
//      iterate : 초기값과 다음 값을 만드는 함수를 지정
        Stream.iterate(0,n->n+2).limit(4).filter(n->n<5).forEach(System.out::println);

        System.out.println("5. generate 활용");
        Stream.generate(()-> ThreadLocalRandom.current().nextInt(1,5)).limit(5).forEach(System.out::println);

    }
}
