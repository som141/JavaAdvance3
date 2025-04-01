package lamda.EX;

import lamda.Produce;

import java.util.Random;
//익명 클래스를 활용
public class Ex1ReMain2 {
    public static void hello(Produce produce) {
        long startNs = System.nanoTime();
        //코드 조각 시작
        produce.run();
        //코드 조각 종료
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }
    public static void main(String[] args) {
        Produce sum =new Produce() {
            @Override
            public void run() {
                for(int i=0;i<3;i++){
                    System.out.println(i);
                }
            }
        };
        Produce dice = new Produce() {

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println(randomValue);
            }
        };
        hello(sum);
        hello(dice);
    }
}