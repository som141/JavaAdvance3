package lamda.methodch;

import java.util.function.BinaryOperator;

public class ex1 {
    public static void main(String[] args){
        BinaryOperator<Integer> m1 = (a,b) ->a+b;
        System.out.println(m1.apply(1,2));
        BinaryOperator<Integer> m2 = ex1::add;
        BinaryOperator<Integer> m3 = (a,b) ->ex1.add(a,b);
        System.out.println(m2.apply(1,2));
        ex1.add(1,2);
        

    }
    static int add(int a, int b){
        return a+b;
    }
}
