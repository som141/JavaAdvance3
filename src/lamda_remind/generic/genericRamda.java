package lamda_remind.generic;

public class genericRamda {
    public static void main(String[] args) {
        String s = "abcd";
        int i = 2;
        StringFunction sf =s1->s1.toUpperCase();
        IntegerFunction if1 = i1->i1*i1;
        System.out.println(sf.run(s));
        System.out.println(s);
        System.out.println(if1.run(i));
        System.out.println(i);
        GenericIn<Integer,Integer> Gi = T->T*T;
        System.out.println(Gi.run(i));
        GenericIn<String,String> Gs = T->T.toUpperCase();
    }
    interface IntegerFunction {
        int run(int i);
    }
    interface StringFunction {
        public String run(String s);
    }
    interface GenericIn <T,R>{
        R run(T t);

    }
}
