package functionalInterface;

import java.util.function.*;

public class TargetType {
    public static void main(String[] args) {
        Function<Integer,String> function= a->Integer.toString(a);
        Function<String,Integer> function2=s->Integer.parseInt(s);

        Function<Function,Function> function3= f1->{
          return i->function2.apply((String) f1.apply(i));
        };
        Function<Integer,Integer>f3=function3.apply(function);
        System.out.println(1234);

        Consumer<String> consumer=s-> System.out.println(s);
        consumer.accept("abc");
        Supplier<String> supplier= ()->"abc";
        System.out.println(supplier.get());
        Runnable runnable=()->{
            System.out.println("log back");
        };
        runnable.run();
        Predicate<String> predicate=(String s) -> s.length()>5;
        System.out.println(predicate.test("abcsdfsf"));

        UnaryOperator<String> unaryOperator=(String s) -> Integer.toString(s.length());
        System.out.println(unaryOperator.apply("abc"));
        BinaryOperator<Integer> binaryOperator=(a,b)->a+b;
        System.out.println(binaryOperator.apply(1,2));
    }
}
