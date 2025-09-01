package lamda.lamdaS;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV3<T> {
    private List<T> internalList;

    private MyStreamV3(List<T> internalList) {
        this.internalList = internalList;
    }

    public static <T>MyStreamV3<T> of(List<T> internalList) {
        return new MyStreamV3(internalList);
    }
    public MyStreamV3<T> filter(Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for(T integer :internalList){
            if(predicate.test(integer)){
                filteredList.add(integer);
            }
        }
        return new MyStreamV3(filteredList);
    }
    public <R>MyStreamV3<R> map(Function<T, R> mapper) {
        List<R> mapperedList = new ArrayList<>();
        for(T integer :internalList){
            mapperedList.add(mapper.apply(integer));
        }
        return new MyStreamV3(mapperedList);

    }

    public List<T> toList() {
        return internalList;
    }

    public void foreach(Consumer<T> action) {
        for(T element:internalList) {
            internalList.forEach(action);
        }
        }


    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        MyStreamV3<Integer> stream = MyStreamV3.of(list);
        stream.filter(i->i%2==0).map(i->i*i).toList().forEach(i->System.out.println(i));
    }
}
