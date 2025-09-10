package umlD.socar;

import java.util.Optional;

public class Payment {
    private final String account_number;
    private Long balance;

    private Payment(String account_number , Long balance) {
        this.account_number = account_number;
        this.balance = balance;
    }
    static public Payment of(String account_number){
        return new Payment(account_number,null);
    }
    public void LordingBalance(String account_number,String Passward){
//        은행사 인터페이스에 맞는 규격으로 통신 실패시 예외처리
        Long money = 10000L;//원래는 여기서 잔고 반환해야함.
        this.balance = money;
    }
    public Optional<Long> getBalance(){
        return Optional.ofNullable(this.balance);
    }
    public String getAccount_number(){
        return this.account_number;
    }


}
