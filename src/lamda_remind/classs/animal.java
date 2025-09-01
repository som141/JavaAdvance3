package lamda_remind.classs;

public interface animal {
    void speak();
}
class dog implements animal {
   private dog(){
   }
   public static dog of(){
       return new dog();
   }



    @Override
    public void speak() {
        System.out.println("dd");
    }

    public static void main(String[] args) {
        animal d1=dog.of();
        d1.speak();
    }
}
