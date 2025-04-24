package lamda.lamda2;

import java.util.Comparator;

public class LamdaPassMain2 {
     static Comparator<Integer> c(String s){
        switch (s){
            case "add":
                return (a,b)->a+b;
                case "sub":
                    return (a,b)->a-b;
        }
        return null;
    }
    public static void main(String[] args) {
        Comparator<Integer> s=c("add");

        System.out.println(s.compare(1,2));
     }
}
