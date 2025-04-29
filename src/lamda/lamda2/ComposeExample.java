package lamda.lamda2;
public class ComposeExample {
public static StringFunction compose(StringFunction f1, StringFunction f2) {
    // 코드 작성
//    return (s)->{
//        String i =f1.apply(s);
//        return f2.apply(i);
//    };
    return s -> f2.apply(f1.apply(s));//위에꺼나 이거 둘중에 하나 선택
}
public static void main(String[] args) {
    // f1: 대문자로 변환
    StringFunction toUpper = s -> s.toUpperCase();
    // f2: 앞 뒤에 "**" 붙이기
    StringFunction addDeco = s -> "**" + s + "**";
    // 합성: f1 → f2 순서로 적용하는 함수
    StringFunction composeFunc = compose(toUpper, addDeco);
    // 실행
    String result = composeFunc.apply("hello");
    System.out.println(result); // "**HELLO**"
}
}