package stream;

// 사용자 정의 예외 (Checked Exception)
public class t1 extends Exception {
    private int errorCode; // 추가 필드 (예외 원인 코드)

    public t1() {
        super("내가 만든 예외 t1 발생!");
        this.errorCode = 0;
    }

    public t1(String message) {
        super(message);
        this.errorCode = 0;
    }

    public t1(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    // 사용자 정의 메서드
    public int getErrorCode() {
        return errorCode;
    }

    public String getDetailedMessage() {
        return "[t1 예외] 코드: " + errorCode + ", 메시지: " + getMessage();
    }
}
