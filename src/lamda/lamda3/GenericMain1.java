package lamda.lamda3;

public class GenericMain1 {
    public static void main(String[] args) {
        StringFunction upperCase = string -> string.toUpperCase();
        NumberFunction numberFunction= i->i*i;
        System.out.println(numberFunction.apply(44));
        String s= "이상현 씨발";
        System.out.println(upperCase.apply(s));
    }

    @FunctionalInterface
    interface StringFunction{
        String apply(String s);
    }

    @FunctionalInterface
    interface NumberFunction{
        Integer apply(Integer i);
    }
}
