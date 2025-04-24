package lamda.lamda2;

public class M1 {
    public static void greetMorning(String s) {
        System.out.println("=== 시작 ===");
        System.out.println(s);
        System.out.println("=== 끝 ===");
    }

    public static void main(String[] args) {
        greetMorning("안녕하세요");
    }
}
