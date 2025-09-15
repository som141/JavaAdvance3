package stream;

import java.util.List;

public class flatMap {
    public static void main(String[] args) {
        List<Integer>l1=List.of(1,2,3,4);
        List<Integer>l2=List.of(1,2,3,4);
        List<Integer>l3=List.of(1,2,3,4);

        List<List>l4=List.of(l1,l2,l3);

        l4.stream().flatMap(x->x.stream()).forEach(System.out::println);
    }
}
