package lamda.lamda;

import lamda.Produce;

import java.util.Comparator;

public class lamdaSimple1 {
    static Comparator<Integer> add=(Integer a,Integer b)-> a+b;//단일 표현식일 경우 {},return 생략 가능
//    만약 매개변수가 1개라면 ()도 생략 가능!.
    public static void main(String[] args) {
        System.out.println(add.compare(1,2));
    }
}
