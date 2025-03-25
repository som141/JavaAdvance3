package lamda;
//변하지 않는 부분과 변하는 부분을 분리해야한다.
public class EX0ReMain {
//    value parameterization(값을 외부에서 받아 처리)
    public static void hello(String stirng) {
        System.out.println("프로그램 시작");
        System.out.println(stirng);     
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args) {

        hello("hello java");
        hello("hello spring");
    }
}
