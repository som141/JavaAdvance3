package lamda.lamdaS;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV2 {
    private List<Integer> internalList;

    private MyStreamV2(List<Integer> internalList) {
        this.internalList = internalList;
    }

    public static MyStreamV2 of(List<Integer> internalList) {
        return new MyStreamV2(internalList);
    }
    public MyStreamV2 filter(Predicate<Integer> predicate){
        List<Integer> filteredList = new ArrayList<>();
        for(Integer integer :internalList){
            if(predicate.test(integer)){
                filteredList.add(integer);
            }
        }
        return new MyStreamV2(filteredList);
    }
    public MyStreamV2 map(Function<Integer, Integer> mapper) {
        List<Integer> mapperedList = new ArrayList<>();
        for(Integer integer :internalList){
            mapperedList.add(mapper.apply(integer));
        }
        return new MyStreamV2(mapperedList);

    }

    public List<Integer> toList() {
        return internalList;
    }


    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        MyStreamV2 stream = MyStreamV2.of(list);
        System.out.println(stream.filter(i->i%2==0).map(i->i*i).toList());
    }
}
