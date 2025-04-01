package lamda.lamda;

import lamda.Produce;

public class lamdaMain {

    public static void main(String[] args) {
        Produce produce= new Produce() {
            @Override
            public void run() {
                System.out.println("익명 클래스");
            }
        };
        System.out.println("class.class = "+produce.getClass());
        System.out.println("class Instance = "+produce);
        Produce produce2 = ()->{
            System.out.println("lamda expression");
        };
        System.out.println("class.class = "+produce2.getClass());
        System.out.println("class Instance = "+produce2);
    }
}
