package stream;

import java.util.NoSuchElementException;
import java.util.Optional;

public class optional {
    public static void main(String[] args) {
        Optional<Integer> i1 = Optional.of(10);
        if(i1.isPresent()) {
            System.out.println(i1.get());
        }
        Optional<Integer> i2 = Optional.ofNullable(null);
        System.out.println(i2);
        try{
        throw new t1("오류임 ㅇㅇ");}
        catch (t1 e1){
            System.out.println(e1.getMessage());
        }
    }
}
