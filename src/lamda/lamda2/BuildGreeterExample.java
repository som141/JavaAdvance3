package lamda.lamda2;

public class BuildGreeterExample {
    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting) {
        // 코드 작성
        return s -> s+greeting; // 적절한 람다 반환
    }
    public static void main(String[] args) {
        StringFunction s1=buildGreeter("hello");

        System.out.println(s1.apply("영주"));
    }
}