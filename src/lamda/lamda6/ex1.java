package lamda.lamda6;

public class ex1 {
    private String massage="외부 클래스";
    private void   excute(){
        Runnable runnable = new Runnable() {
            private String massage = "익명";
            @Override
            public void run() {
                System.out.println("익명클래스 = "+this.massage);
            }

        };
        runnable.run();
        System.out.println("----------------------------------");
        Runnable ex2 =()-> System.out.println(this.massage);
        ex2.run();
    }

    public static void main(String[] args) {
        ex1 ex1 = new ex1();
        System.out.println(ex1.massage);
        ex1.excute();
    }
}
