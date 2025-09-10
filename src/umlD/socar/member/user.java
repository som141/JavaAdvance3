package umlD.socar.member;

import umlD.socar.Payment;

public class user {

    private String userId;
    private String password;
    private String username;
    private Payment userPayment;

    private user(String userId, String password, String username) {
        this.userId = userId;
        this.password = password;
        this.username = username;
    }
    public static user of(String userId,String password,String username) {
        return new user(userId,password,username);
    }

    public static user guestUser(){
        return new user("guest","guest","게스트");
    }
    public void attachPayment(Payment payment){
        this.userPayment=payment;
    }
    public Payment getUserPayment() {
        return userPayment;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

}
