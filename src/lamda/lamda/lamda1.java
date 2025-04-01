package lamda.lamda;

import lamda.Produce;

public class lamda1 {
    Produce produce=new Produce() {
        @Override
        public void run() {
            System.out.println("익명 클래스");
        }
    };

    public static void main(String[] args) {
        Produce produce=new Produce() {
            @Override
            public void run() {
                System.out.println("익명 클래스");
            }
        };
        produce.run();
        Produce produce1=()->{
            System.out.println("람다식");
        };
        produce1.run();
    }

}
