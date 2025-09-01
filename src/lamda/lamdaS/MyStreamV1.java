package lamda.lamdaS;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV1 {
    private List<Integer> internalList;

    public MyStreamV1(List<Integer> internalList) {
        this.internalList = internalList;
    }
    public MyStreamV1 filter(Predicate<Integer> predicate){
        List<Integer> filteredList = new ArrayList<>();
        for(Integer integer :internalList){
            if(predicate.test(integer)){
                filteredList.add(integer);
            }
        }
        return new MyStreamV1(filteredList);
    }
    public MyStreamV1 map(Function<Integer, Integer> mapper) {
        List<Integer> mapperedList = new ArrayList<>();
        for(Integer integer :internalList){
            mapperedList.add(mapper.apply(integer));
        }
        return new MyStreamV1(mapperedList);

    }

    public List<Integer> toList() {
        return internalList;
    }


    public static void main(String[] args) {
        MyStreamV1 stream = new MyStreamV1(List.of(0,1,2,3,4,5,6));
        System.out.println(stream.filter(i->i%2==0).map(i->i*i).toList());
    }
}
